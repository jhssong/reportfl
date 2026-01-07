{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/trie/AbstractBitwiseTrie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBitwiseTrie",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, V\u003e",
        "org.apache.commons.collections4.Trie\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 216,
      "comment": "\n * This class provides some basic {@link Trie} functionality and\n * utility methods for actual bitwise {@link Trie} implementations.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyAnalyzer"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The {@link KeyAnalyzer} that\u0027s being used to build the PATRICIA {@link Trie}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.AbstractBitwiseTrie(org.apache.commons.collections4.trie.KeyAnalyzer\u003c? super K\u003e)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "\n     * Constructs a new {@link Trie} using the given {@link KeyAnalyzer}.\n     *\n     * @param keyAnalyzer  the {@link KeyAnalyzer} to use\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 53,col 9)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.getKeyAnalyzer()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Returns the {@link KeyAnalyzer} that constructed the {@link Trie}.\n     * @return the {@link KeyAnalyzer} used by this {@link Trie}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.toString()",
      "begin_line": 64,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 57)",
        "(line 67,col 9)-(line 67,col 62)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.castKey(java.lang.Object)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * A utility method to cast keys. It actually doesn\u0027t cast anything. It\u0027s just fooling the compiler!\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.lengthInBits(K)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Returns the length of the given key in bits\n     *\n     * @see KeyAnalyzer#lengthInBits(Object)\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.bitsPerElement()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the number of bits per element in the key\n     *\n     * @see KeyAnalyzer#bitsPerElement()\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.isBitSet(K, int, int)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * Returns whether or not the given bit on the key is set or false if the key is null.\n     *\n     * @see KeyAnalyzer#isBitSet(Object, int, int)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.bitIndex(K, K)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Utility method for calling {@link KeyAnalyzer#bitIndex(Object, int, int, Object, int, int)}.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.compareKeys(K, K)",
      "begin_line": 127,
      "end_line": 135,
      "comment": "\n     * An utility method for calling {@link KeyAnalyzer#compare(Object, Object)}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns true if both values are either null or equal.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BasicEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 147,
      "end_line": 215,
      "comment": "\n     * A basic implementation of {@link Entry}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.BasicEntry(K)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.BasicEntry(K, V)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 27)",
        "(line 161,col 13)-(line 161,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.setKeyValue(K, V)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n         * Replaces the current key and value with the provided key \u0026amp; value.\n         ",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 27)",
        "(line 169,col 13)-(line 169,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.getKey()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.getValue()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 13)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.setValue(V)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 184,col 13)-(line 184,col 42)",
        "(line 185,col 13)-(line 185,col 31)",
        "(line 186,col 13)-(line 186,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.hashCode()",
      "begin_line": 189,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 191,col 13)-(line 192,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.equals(java.lang.Object)",
      "begin_line": 195,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 197,col 13)-(line 201,col 13)",
        "(line 203,col 13)-(line 203,col 61)",
        "(line 204,col 13)-(line 207,col 13)",
        "(line 208,col 13)-(line 208,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry.toString()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 37)"
      ]
    }
  ]
}