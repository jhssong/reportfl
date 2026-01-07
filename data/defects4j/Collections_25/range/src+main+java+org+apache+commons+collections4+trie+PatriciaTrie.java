{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/trie/PatriciaTrie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PatriciaTrie",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie\u003cjava.lang.String, E\u003e"
      ],
      "begin_line": 57,
      "end_line": 69,
      "comment": "\n * Implementation of a PATRICIA Trie (Practical Algorithm to Retrieve Information\n * Coded in Alphanumeric).\n * \u003cp\u003e\n * A PATRICIA {@link Trie} is a compressed {@link Trie}. Instead of storing\n * all data at the edges of the {@link Trie} (and having empty internal nodes),\n * PATRICIA stores data in every node. This allows for very efficient traversal,\n * insert, delete, predecessor, successor, prefix, range, and {@link #select(Object)}\n * operations. All operations are performed at worst in O(K) time, where K\n * is the number of bits in the largest item in the tree. In practice,\n * operations actually take O(A(K)) time, where A(K) is the average number of\n * bits of all items in the tree.\n * \u003cp\u003e\n * Most importantly, PATRICIA requires very few comparisons to keys while\n * doing any operation. While performing a lookup, each comparison (at most\n * K of them, described above) will perform a single bit comparison against\n * the given key, instead of comparing the entire key to another key.\n * \u003cp\u003e\n * The {@link Trie} can return operations in lexicographical order using the\n * \u0027prefixMap\u0027, \u0027submap\u0027, or \u0027iterator\u0027 methods. The {@link Trie} can also\n * scan for items that are \u0027bitwise\u0027 (using an XOR metric) by the \u0027select\u0027 method.\n * Bitwise closeness is determined by the {@link KeyAnalyzer} returning true or\n * false for a bit being set or not in a given key.\n * \u003cp\u003e\n * This PATRICIA {@link Trie} supports both variable length \u0026 fixed length\n * keys. Some methods, such as {@link #prefixMap(Object)} are suited only\n * to variable length keys.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Radix_tree\"\u003eRadix Tree\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Tree/PATRICIA\"\u003ePATRICIA\u003c/a\u003e\n * @see \u003ca href\u003d\"http://www.imperialviolet.org/binary/critbit.pdf\"\u003eCrit-Bit Tree\u003c/a\u003e\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.PatriciaTrie.PatriciaTrie()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.PatriciaTrie.PatriciaTrie(java.util.Map\u003c? extends java.lang.String, ? extends E\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 42)"
      ]
    }
  ]
}