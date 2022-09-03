package me.fares.redpvp.utils;

import java.util.*;
import org.bukkit.*;
public class Geometrics {

    public List<Location> cubeAround(final Location loc, final double cubeSize, final double distance) {
        final double cubeSizeNeg = 0.0 - cubeSize;
        final List<Location> cubeLocs = new ArrayList<Location>();
        for (double ix = cubeSizeNeg; ix < cubeSize; ix += distance) {
            for (double iy = cubeSizeNeg; iy < cubeSize; iy += distance) {
                for (double iz = cubeSizeNeg; iz < cubeSize; iz += distance) {
                    cubeLocs.add(new Location(loc.getWorld(), (int)loc.getX() + ix, (int)loc.getY() + iy, (int)loc.getZ() + iz));
                }
            }
        }
        return cubeLocs;
    }

    public boolean insideSpawn(final Location loc, final Location point1, final Location point2) {
        final int minX = Math.min(point1.getBlockX(), point2.getBlockX());
        final int minY = Math.min(point1.getBlockY(), point2.getBlockY());
        final int minZ = Math.min(point1.getBlockZ(), point2.getBlockZ());
        final int maxX = Math.max(point1.getBlockX(), point2.getBlockX());
        final int maxY = Math.max(point1.getBlockY(), point2.getBlockY());
        final int maxZ = Math.max(point1.getBlockZ(), point2.getBlockZ());
        return loc.getX() >= minX && loc.getY() >= minY && loc.getZ() >= minZ && loc.getX() <= maxX && loc.getY() <= maxY && loc.getZ() <= maxZ;
    }

    public List<Location> cubeBetweenPoints(final Location point1, final Location point2) {
        final int minX = Math.min(point1.getBlockX(), point2.getBlockX());
        final int minY = Math.min(point1.getBlockY(), point2.getBlockY());
        final int minZ = Math.min(point1.getBlockZ(), point2.getBlockZ());
        final int maxX = Math.max(point1.getBlockX(), point2.getBlockX());
        final int maxY = Math.max(point1.getBlockY(), point2.getBlockY());
        final int maxZ = Math.max(point1.getBlockZ(), point2.getBlockZ());
        final List<Location> cubeLocs = new ArrayList<Location>();
        for (int x = minX; x <= maxX; ++x) {
            for (int y = minY; y <= maxY; ++y) {
                for (int z = minZ; z <= maxZ; ++z) {
                    cubeLocs.add(new Location(point1.getWorld(), (double)x, (double)y, (double)z));
                }
            }
        }
        return cubeLocs;
    }

    public List<Location> cubeBetweenPoints(final int minX, final int minY, final int minZ, final int maxX, final int maxY, final int maxZ, final World world) {
        final List<Location> cubeLocs = new ArrayList<Location>();
        for (int x = minX; x <= maxX; ++x) {
            for (int y = minY; y <= maxY; ++y) {
                for (int z = minZ; z <= maxZ; ++z) {
                    cubeLocs.add(new Location(world, (double)x, (double)y, (double)z));
                }
            }
        }
        return cubeLocs;
    }

    public List<Location> sphereArround(final Location loc, final double radius, final boolean hollow, final double distance) {
        final List<Location> sphereList = new ArrayList<Location>();
        final double lX = loc.getX();
        final double lY = loc.getY();
        final double lZ = loc.getZ();
        for (double x = lX - radius; x <= lX + radius; x += distance) {
            for (double y = lY - radius; y <= lY + radius; y += distance) {
                for (double z = lZ - radius; z <= lZ + radius; z += distance) {
                    final double distanze = (lX - x) * (lX - x) + (lZ - z) * (lZ - z) + (lY - y) * (lY - y);
                    if (distanze < radius * radius && (!hollow || distanze >= (radius - 1.0) * (radius - 1.0))) {
                        sphereList.add(new Location(loc.getWorld(), x, y, z));
                    }
                }
            }
        }
        return sphereList;
    }
}
