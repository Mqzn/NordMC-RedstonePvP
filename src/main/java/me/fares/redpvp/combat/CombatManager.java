package me.fares.redpvp.combat;

import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class CombatManager {

	private final @NonNull Map<UUID, CombatData> combatData = new HashMap<>();

	private CombatManager () {}

	private static @Nullable CombatManager instance;
	public static CombatManager getInstance() {
		if(instance == null) {
			instance = new CombatManager();
		}
		return instance;
	}

	public @Nullable CombatData getCombatData(UUID uuid) {
		return combatData.get(uuid);
	}

	public void setInCombat(UUID attacker, UUID attacked) {
		this.combatData.put(attacker, CombatData.of(attacked, attacker));
	}

	public void removeFromCombat(UUID uuid) {

		this.combatData.remove(uuid);
		for (CombatData data : combatData.values()) {
			if(data.getAttacked().equals(uuid) || data.getAttacker().equals(uuid)) {
				this.combatData.remove(data.getAttacked());
				this.combatData.remove(data.getAttacker());
			}
		}

	}

}

