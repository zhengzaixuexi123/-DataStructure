package org.example.hash_table;

public class simple_hash {
    /* 加法哈希 */
    int addHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = (hash + (int) c) % MODULUS;
        }
        return (int) hash;
    }

    /* 乘法哈希 */
    int mulHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = (31 * hash + (int) c) % MODULUS;
        }
        return (int) hash;
    }

    /* 异或哈希 */
    int xorHash(String key) {
        int hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash ^= (int) c;
        }
        //按位与运算
        return hash & MODULUS;
    }

    /* 旋转哈希 */
    int rotHash(String key) {
        long hash = 0;
        final int MODULUS = 1000000007;
        for (char c : key.toCharArray()) {
            hash = ((hash << 4) ^ (hash >> 28) ^ (int) c) % MODULUS;
        }
        return (int) hash;
    }
}
