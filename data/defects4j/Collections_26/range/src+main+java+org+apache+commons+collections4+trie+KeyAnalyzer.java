{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/trie/KeyAnalyzer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyAnalyzer",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cK\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 148,
      "comment": "\n * Defines the interface to analyze {@link org.apache.commons.collections4.Trie Trie} keys on a bit level.\n * {@link KeyAnalyzer}\u0027s methods return the length of the key in bits, whether or not a bit is set,\n * and bits per element in the key.\n * \u003cp\u003e\n * Additionally, a method determines if a key is a prefix of another\n * key and returns the bit index where one key is different from another\n * key (if the key and found key are equal than the return value is\n * {@link #EQUAL_BIT_KEY}).\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "NULL_BIT_KEY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returned by {@link #bitIndex(Object, int, int, Object, int, int)}\n     * if key\u0027s bits are all 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EQUAL_BIT_KEY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returned by {@link #bitIndex(Object, int, int, Object, int, int)} if key and found key are equal.\n     * This is a very very specific case and shouldn\u0027t happen on a regular basis.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OUT_OF_BOUNDS_BIT_KEY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isOutOfBoundsIndex(int)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Returns true if bitIndex is a {@link KeyAnalyzer#OUT_OF_BOUNDS_BIT_KEY}.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isEqualBitKey(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Returns true if bitIndex is a {@link KeyAnalyzer#EQUAL_BIT_KEY}.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isNullBitKey(int)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Returns true if bitIndex is a {@link KeyAnalyzer#NULL_BIT_KEY}.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isValidBitIndex(int)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns true if the given bitIndex is valid.\n     * Indices are considered valid if they\u0027re between 0 and {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.bitsPerElement()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Returns the number of bits per element in the key.\n     * This is only useful for variable-length keys, such as Strings.\n     *\n     * @return the number of bits per element\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.lengthInBits(K)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Returns the length of the Key in bits.\n     *\n     * @param key  the key\n     * @return the bit length of the key\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isBitSet(K, int, int)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Returns whether or not a bit is set.\n     *\n     * @param key  the key to check, may not be null\n     * @param bitIndex  the bit index to check\n     * @param lengthInBits  the maximum key length in bits to check\n     * @return {@code true} if the bit is set in the given key and\n     *   {@code bitIndex} \u0026lt; {@code lengthInBits}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.bitIndex(K, int, int, K, int, int)",
      "begin_line": 123,
      "end_line": 124,
      "comment": "\n     * Returns the n-th different bit between key and other. This starts the comparison in\n     * key at \u0027offsetInBits\u0027 and goes for \u0027lengthInBits\u0027 bits, and compares to the other key starting\n     * at \u0027otherOffsetInBits\u0027 and going for \u0027otherLengthInBits\u0027 bits.\n     *\n     * @param key  the key to use\n     * @param offsetInBits  the bit offset in the key\n     * @param lengthInBits  the maximum key length in bits to use\n     * @param other  the other key to use\n     * @param otherOffsetInBits  the bit offset in the other key\n     * @param otherLengthInBits  the maximum key length in bits for the other key\n     * @return the bit index where the key and other first differ\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.isPrefix(K, int, int, K)",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Determines whether or not the given prefix (from offset to length) is a prefix of the given key.\n     *\n     * @param prefix  the prefix to check\n     * @param offsetInBits  the bit offset in the key\n     * @param lengthInBits  the maximum key length in bits to use\n     * @param key  the key to check\n     * @return {@code true} if this is a valid prefix for the given key\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.KeyAnalyzer.compare(K, K)",
      "begin_line": 137,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 50)"
      ]
    }
  ]
}