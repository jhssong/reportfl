{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/trie/AbstractPatriciaTrie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPatriciaTrie",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractBitwiseTrie\u003cK, V\u003e"
      ],
      "begin_line": 44,
      "end_line": 2441,
      "comment": "\n * This class implements the base PATRICIA algorithm and everything that\n * is related to the {@link Map} interface.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The root node of the {@link Trie}. "
    },
    {
      "type": "field",
      "varNames": [
        "keySet"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Each of these fields are initialized to contain an instance of the\n     * appropriate view the first time this view is requested. The views are\n     * stateless, so there\u0027s no reason to create more than one of each.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The current size of the {@link Trie}. "
    },
    {
      "type": "field",
      "varNames": [
        "modCount"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The number of times this {@link Trie} has been modified.\n     * It\u0027s used to detect concurrent modifications and fail-fast the {@link Iterator}s.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.AbstractPatriciaTrie(org.apache.commons.collections4.trie.KeyAnalyzer\u003c? super K\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.AbstractPatriciaTrie(org.apache.commons.collections4.trie.KeyAnalyzer\u003c? super K\u003e, java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Constructs a new {@link org.apache.commons.collections4.Trie Trie} using the given\n     * {@link KeyAnalyzer} and initializes the {@link org.apache.commons.collections4.Trie Trie}\n     * with the values from the provided {@link Map}.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.clear()",
      "begin_line": 85,
      "end_line": 98,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)",
        "(line 88,col 9)-(line 88,col 27)",
        "(line 89,col 9)-(line 89,col 26)",
        "(line 91,col 9)-(line 91,col 27)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 26)",
        "(line 94,col 9)-(line 94,col 32)",
        "(line 96,col 9)-(line 96,col 17)",
        "(line 97,col 9)-(line 97,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.size()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.incrementSize()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * A helper method to increment the {@link Trie} size and the modification counter.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 15)",
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.decrementSize()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * A helper method to decrement the {@link Trie} size and increment the modification counter.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 15)",
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.incrementModCount()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * A helper method to increment the modification counter.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.put(K, V)",
      "begin_line": 128,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 51)",
        "(line 138,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 79)",
        "(line 148,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 54)",
        "(line 158,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.addEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, int)",
      "begin_line": 194,
      "end_line": 237,
      "comment": "\n     * Adds the given {@link TrieEntry} to the {@link Trie}.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 44)",
        "(line 196,col 9)-(line 196,col 36)",
        "(line 197,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.get(java.lang.Object)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 50)",
        "(line 242,col 9)-(line 242,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.getEntry(java.lang.Object)",
      "begin_line": 252,
      "end_line": 261,
      "comment": "\n     * Returns the entry associated with the specified key in the\n     * PatriciaTrieBase.  Returns null if the map contains no mapping\n     * for this key.\n     * \u003cp\u003e\n     * This may throw ClassCastException if the object is not of type K.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 51)",
        "(line 259,col 9)-(line 259,col 78)",
        "(line 260,col 9)-(line 260,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.select(K)",
      "begin_line": 282,
      "end_line": 289,
      "comment": "\n     * Returns the {@link Entry} whose key is closest in a bitwise XOR\n     * metric to the given key. This is NOT lexicographic closeness.\n     * For example, given the keys:\n     *\n     * \u003col\u003e\n     * \u003cli\u003eD \u003d 1000100\n     * \u003cli\u003eH \u003d 1001000\n     * \u003cli\u003eL \u003d 1001100\n     * \u003c/ol\u003e\n     *\n     * If the {@link Trie} contained \u0027H\u0027 and \u0027L\u0027, a lookup of \u0027D\u0027 would\n     * return \u0027L\u0027, because the XOR distance between D \u0026amp; L is smaller\n     * than the XOR distance between D \u0026amp; H.\n     *\n     * @param key  the key to use in the search\n     * @return the {@link Entry} whose key is closest in a bitwise XOR metric\n     *   to the provided key\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 51)",
        "(line 284,col 9)-(line 284,col 85)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.selectKey(K)",
      "begin_line": 310,
      "end_line": 316,
      "comment": "\n     * Returns the key that is closest in a bitwise XOR metric to the\n     * provided key. This is NOT lexicographic closeness!\n     *\n     * For example, given the keys:\n     *\n     * \u003col\u003e\n     * \u003cli\u003eD \u003d 1000100\n     * \u003cli\u003eH \u003d 1001000\n     * \u003cli\u003eL \u003d 1001100\n     * \u003c/ol\u003e\n     *\n     * If the {@link Trie} contained \u0027H\u0027 and \u0027L\u0027, a lookup of \u0027D\u0027 would\n     * return \u0027L\u0027, because the XOR distance between D \u0026amp; L is smaller\n     * than the XOR distance between D \u0026amp; H.\n     *\n     * @param key  the key to use in the search\n     * @return the key that is closest in a bitwise XOR metric to the provided key\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 50)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.selectValue(K)",
      "begin_line": 338,
      "end_line": 344,
      "comment": "\n     * Returns the value whose key is closest in a bitwise XOR metric to\n     * the provided key. This is NOT lexicographic closeness!\n     *\n     * For example, given the keys:\n     *\n     * \u003col\u003e\n     * \u003cli\u003eD \u003d 1000100\n     * \u003cli\u003eH \u003d 1001000\n     * \u003cli\u003eL \u003d 1001100\n     * \u003c/ol\u003e\n     *\n     * If the {@link Trie} contained \u0027H\u0027 and \u0027L\u0027, a lookup of \u0027D\u0027 would\n     * return \u0027L\u0027, because the XOR distance between D \u0026amp; L is smaller\n     * than the XOR distance between D \u0026amp; H.\n     *\n     * @param key  the key to use in the search\n     * @return the value whose key is closest in a bitwise XOR metric\n     * to the provided key\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 50)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.selectR(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, int, K, int, org.apache.commons.collections4.trie.AbstractPatriciaTrie.Reference\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e)",
      "begin_line": 350,
      "end_line": 375,
      "comment": "\n     * This is equivalent to the other {@link #selectR(TrieEntry, int, Object, int, Cursor, Reference)}\n     * method but without its overhead because we\u0027re selecting only one best matching Entry from the {@link Trie}.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.containsKey(java.lang.Object)",
      "begin_line": 377,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 383,col 33)",
        "(line 384,col 9)-(line 384,col 51)",
        "(line 385,col 9)-(line 385,col 79)",
        "(line 386,col 9)-(line 386,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.entrySet()",
      "begin_line": 389,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.keySet()",
      "begin_line": 397,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.values()",
      "begin_line": 405,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.remove(java.lang.Object)",
      "begin_line": 418,
      "end_line": 444,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws ClassCastException if provided key is of an incompatible type\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 33)",
        "(line 425,col 9)-(line 425,col 51)",
        "(line 426,col 9)-(line 426,col 44)",
        "(line 427,col 9)-(line 427,col 36)",
        "(line 428,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.getNearestEntryForKey(K, int)",
      "begin_line": 455,
      "end_line": 470,
      "comment": "\n     * Returns the nearest entry for a given key.  This is useful\n     * for finding knowing if a given key exists (and finding the value\n     * for it), or for inserting the key.\n     *\n     * The actual get implementation. This is very similar to\n     * selectR but with the exception that it might return the\n     * root Entry even if it\u0027s empty.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 44)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 458,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 479,
      "end_line": 490,
      "comment": "\n     * Removes a single entry from the {@link Trie}.\n     *\n     * If we found a Key (Entry h) then figure out if it\u0027s\n     * an internal (hard to remove) or external Entry (easy\n     * to remove)\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 24)",
        "(line 489,col 9)-(line 489,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeExternalEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 498,
      "end_line": 521,
      "comment": "\n     * Removes an external entry from the {@link Trie}.\n     *\n     * If it\u0027s an external Entry then just remove it.\n     * This is very easy and straight forward.\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 48)",
        "(line 506,col 9)-(line 506,col 69)",
        "(line 508,col 9)-(line 512,col 9)",
        "(line 515,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.removeInternalEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 530,
      "end_line": 603,
      "comment": "\n     * Removes an internal entry from the {@link Trie}.\n     *\n     * If it\u0027s an internal Entry then \"good luck\" with understanding\n     * this code. The Idea is essentially that Entry p takes Entry h\u0027s\n     * place in the trie which requires some re-wiring.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 535,col 9)",
        "(line 537,col 9)-(line 537,col 48)",
        "(line 540,col 9)-(line 540,col 32)",
        "(line 543,col 9)-(line 566,col 9)",
        "(line 569,col 9)-(line 586,col 9)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 592,col 26)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 609,
      "end_line": 614,
      "comment": "\n     * Returns the entry lexicographically after the given entry.\n     * If the given entry is null, returns the first node.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntryImpl(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 649,
      "end_line": 736,
      "comment": "\n     * Scans for the next node, starting at the specified point, and using \u0027previous\u0027\n     * as a hint that the last node we returned was \u0027previous\u0027 (so we know not to return\n     * it again).  If \u0027tree\u0027 is non-null, this will limit the search to the given tree.\n     *\n     * The basic premise is that each iteration can follow the following steps:\n     *\n     * 1) Scan all the way to the left.\n     *   a) If we already started from this node last time, proceed to Step 2.\n     *   b) If a valid uplink is found, use it.\n     *   c) If the result is an empty node (root not set), break the scan.\n     *   d) If we already returned the left node, break the scan.\n     *\n     * 2) Check the right.\n     *   a) If we already returned the right node, proceed to Step 3.\n     *   b) If it is a valid uplink, use it.\n     *   c) Do Step 1 from the right node.\n     *\n     * 3) Back up through the parents until we encounter find a parent\n     *    that we\u0027re not the right child of.\n     *\n     * 4) If there\u0027s no right child of that parent, the iteration is finished.\n     *    Otherwise continue to Step 5.\n     *\n     * 5) Check to see if the right child is a valid uplink.\n     *    a) If we already returned that child, proceed to Step 6.\n     *       Otherwise, use it.\n     *\n     * 6) If the right child of the parent is the parent itself, we\u0027ve\n     *    already found \u0026 returned the end of the Trie, so exit.\n     *\n     * 7) Do Step 1 on the parent\u0027s right child.\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 40)",
        "(line 657,col 9)-(line 671,col 9)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 692,col 9)-(line 700,col 9)",
        "(line 704,col 9)-(line 711,col 9)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 719,col 9)-(line 721,col 9)",
        "(line 724,col 9)-(line 727,col 9)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 735,col 9)-(line 735,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstEntry()",
      "begin_line": 744,
      "end_line": 751,
      "comment": "\n     * Returns the first entry the {@link Trie} is storing.\n     * \u003cp\u003e\n     * This is implemented by going always to the left until\n     * we encounter a valid uplink. That uplink is the first key.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 750,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.followLeft(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 756,
      "end_line": 770,
      "comment": "\n     * Goes left through the tree until it finds a valid node.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.comparator()",
      "begin_line": 774,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstKey()",
      "begin_line": 779,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lastKey()",
      "begin_line": 787,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 50)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(K)",
      "begin_line": 796,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 52)",
        "(line 802,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(K)",
      "begin_line": 809,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 52)",
        "(line 815,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 819,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.mapIterator()",
      "begin_line": 822,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.prefixMap(K)",
      "begin_line": 827,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.getPrefixMapByBits(K, int, int)",
      "begin_line": 853,
      "end_line": 866,
      "comment": "\n     * Returns a view of this {@link Trie} of all elements that are prefixed\n     * by the number of bits in the given Key.\n     * \u003cp\u003e\n     * The view that this returns is optimized to have a very efficient\n     * {@link Iterator}. The {@link SortedMap#firstKey()},\n     * {@link SortedMap#lastKey()} \u0026amp; {@link Map#size()} methods must\n     * iterate over all possible values in order to determine the results.\n     * This information is cached until the PATRICIA {@link Trie} changes.\n     * All other methods (except {@link Iterator}) must compare the given\n     * key to the prefix to ensure that it is within the range of the view.\n     * The {@link Iterator}\u0027s remove method must also relocate the subtree\n     * that contains the prefixes if the entry holding the subtree is\n     * removed or changes. Changing the subtree takes O(K) time.\n     *\n     * @param key  the key to use in the search\n     * @param offsetInBits  the prefix offset\n     * @param lengthInBits  the number of significant prefix bits\n     * @return a {@link SortedMap} view of this {@link Trie} with all elements whose\n     *   key is prefixed by the search key\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 61)",
        "(line 856,col 9)-(line 859,col 9)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 865,col 9)-(line 865,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.headMap(K)",
      "begin_line": 868,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(K, K)",
      "begin_line": 873,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.tailMap(K)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(K)",
      "begin_line": 887,
      "end_line": 934,
      "comment": "\n     * Returns an entry strictly higher than the given key,\n     * or null if no such entry exists.\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 51)",
        "(line 893,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 906,col 79)",
        "(line 907,col 9)-(line 909,col 9)",
        "(line 911,col 9)-(line 911,col 54)",
        "(line 912,col 9)-(line 930,col 9)",
        "(line 933,col 9)-(line 933,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(K)",
      "begin_line": 940,
      "end_line": 993,
      "comment": "\n     * Returns a key-value mapping associated with the least key greater\n     * than or equal to the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 51)",
        "(line 961,col 9)-(line 966,col 9)",
        "(line 968,col 9)-(line 968,col 79)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 973,col 9)-(line 973,col 54)",
        "(line 974,col 9)-(line 989,col 9)",
        "(line 992,col 9)-(line 992,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lowerEntry(K)",
      "begin_line": 999,
      "end_line": 1045,
      "comment": "\n     * Returns a key-value mapping associated with the greatest key\n     * strictly less than the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 51)",
        "(line 1019,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1023,col 79)",
        "(line 1024,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1028,col 54)",
        "(line 1029,col 9)-(line 1041,col 9)",
        "(line 1044,col 9)-(line 1044,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.floorEntry(K)",
      "begin_line": 1051,
      "end_line": 1089,
      "comment": "\n     * Returns a key-value mapping associated with the greatest key\n     * less than or equal to the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 51)",
        "(line 1057,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1064,col 79)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1069,col 9)-(line 1069,col 54)",
        "(line 1070,col 9)-(line 1085,col 9)",
        "(line 1088,col 9)-(line 1088,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.subtree(K, int, int)",
      "begin_line": 1097,
      "end_line": 1147,
      "comment": "\n     * Finds the subtree that contains the prefix.\n     *\n     * This is very similar to getR but with the difference that\n     * we stop the lookup if h.bitIndex \u003e lengthInBits.\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 44)",
        "(line 1099,col 9)-(line 1099,col 36)",
        "(line 1100,col 9)-(line 1111,col 9)",
        "(line 1114,col 9)-(line 1114,col 73)",
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1121,col 9)-(line 1121,col 63)",
        "(line 1127,col 9)-(line 1129,col 9)",
        "(line 1133,col 9)-(line 1136,col 9)",
        "(line 1139,col 9)-(line 1140,col 99)",
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1146,col 9)-(line 1146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lastEntry()",
      "begin_line": 1155,
      "end_line": 1157,
      "comment": "\n     * Returns the last entry the {@link Trie} is storing.\n     *\n     * \u003cp\u003eThis is implemented by going always to the right until\n     * we encounter a valid uplink. That uplink is the last key.\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.followRight(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1162,
      "end_line": 1174,
      "comment": "\n     * Traverses down the right path until it finds an uplink.\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1166,col 9)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1173,col 9)-(line 1173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1195,
      "end_line": 1226,
      "comment": "\n     * Returns the node lexicographically before the given node (or null if none).\n     *\n     * This follows four simple branches:\n     *  - If the uplink that returned us was a right uplink:\n     *      - If predecessor\u0027s left is a valid uplink from predecessor, return it.\n     *      - Else, follow the right path from the predecessor\u0027s left.\n     *  - If the uplink that returned us was a left uplink:\n     *      - Loop back through parents until we encounter a node where\n     *        node !\u003d node.parent.left.\n     *          - If node.parent.left is uplink from node.parent:\n     *              - If node.parent.left is not root, return it.\n     *              - If it is root \u0026 root isEmpty, return null.\n     *              - If it is root \u0026 root !isEmpty, return root.\n     *          - If node.parent.left is not uplink from node.parent:\n     *              - Follow right path for first right child from node.parent.left\n     *\n     * @param start  the start entry\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1198,col 9)",
        "(line 1200,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 49)",
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1215,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1225,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntryInSubtree(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1235,
      "end_line": 1241,
      "comment": "\n     * Returns the entry lexicographically after the given entry.\n     * If the given entry is null, returns the first node.\n     *\n     * This will traverse only within the subtree.  If the given node\n     * is not within the subtree, this will have undefined results.\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1240,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.isValidUplink(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003c?, ?\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003c?, ?\u003e)",
      "begin_line": 1246,
      "end_line": 1248,
      "comment": "\n     * Returns true if \u0027next\u0027 is a valid uplink coming from \u0027from\u0027.\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1257,
      "end_line": 1268,
      "comment": "\n     * A {@link Reference} allows us to return something through a Method\u0027s\n     * argument list. An alternative would be to an Array with a length of\n     * one (1) but that leads to compiler warnings. Computationally and memory\n     * wise there\u0027s no difference (except for the need to load the\n     * {@link Reference} Class but that happens only once).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "item"
      ],
      "begin_line": 1259,
      "end_line": 1259,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Reference.set(E)",
      "begin_line": 1261,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1262,col 13)-(line 1262,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Reference.get()",
      "begin_line": 1265,
      "end_line": 1267,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 13)-(line 1266,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrieEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry\u003cK, V\u003e"
      ],
      "begin_line": 1273,
      "end_line": 1385,
      "comment": "\n     *  A {@link Trie} is a set of {@link TrieEntry} nodes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1275,
      "end_line": 1275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitIndex"
      ],
      "begin_line": 1278,
      "end_line": 1278,
      "comment": " The index this entry is comparing. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1281,
      "end_line": 1281,
      "comment": " The parent of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 1284,
      "end_line": 1284,
      "comment": " The left child of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": " The right child of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "predecessor"
      ],
      "begin_line": 1290,
      "end_line": 1290,
      "comment": " The entry who uplinks to this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.TrieEntry(K, V, int)",
      "begin_line": 1292,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 13)-(line 1293,col 30)",
        "(line 1295,col 13)-(line 1295,col 37)",
        "(line 1297,col 13)-(line 1297,col 31)",
        "(line 1298,col 13)-(line 1298,col 29)",
        "(line 1299,col 13)-(line 1299,col 30)",
        "(line 1300,col 13)-(line 1300,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isEmpty()",
      "begin_line": 1308,
      "end_line": 1310,
      "comment": "\n         * Whether or not the entry is storing a key.\n         * Only the root can potentially be empty, all other\n         * nodes must have a key.\n         ",
      "child_ranges": [
        "(line 1309,col 13)-(line 1309,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isInternalNode()",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\n         * Neither the left nor right child is a loopback.\n         ",
      "child_ranges": [
        "(line 1316,col 13)-(line 1316,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isExternalNode()",
      "begin_line": 1322,
      "end_line": 1324,
      "comment": "\n         * Either the left or right child is a loopback.\n         ",
      "child_ranges": [
        "(line 1323,col 13)-(line 1323,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.toString()",
      "begin_line": 1326,
      "end_line": 1384,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 13)-(line 1328,col 61)",
        "(line 1330,col 13)-(line 1334,col 13)",
        "(line 1336,col 13)-(line 1336,col 95)",
        "(line 1337,col 13)-(line 1337,col 68)",
        "(line 1340,col 13)-(line 1348,col 13)",
        "(line 1349,col 13)-(line 1349,col 32)",
        "(line 1351,col 13)-(line 1359,col 13)",
        "(line 1360,col 13)-(line 1360,col 32)",
        "(line 1362,col 13)-(line 1370,col 13)",
        "(line 1371,col 13)-(line 1371,col 32)",
        "(line 1373,col 13)-(line 1380,col 13)",
        "(line 1382,col 13)-(line 1382,col 31)",
        "(line 1383,col 13)-(line 1383,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1391,
      "end_line": 1440,
      "comment": "\n     * This is a entry set view of the {@link Trie} as returned by {@link Map#entrySet()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.iterator()",
      "begin_line": 1393,
      "end_line": 1396,
      "comment": "",
      "child_ranges": [
        "(line 1395,col 13)-(line 1395,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.contains(java.lang.Object)",
      "begin_line": 1398,
      "end_line": 1406,
      "comment": "",
      "child_ranges": [
        "(line 1400,col 13)-(line 1402,col 13)",
        "(line 1404,col 13)-(line 1404,col 85)",
        "(line 1405,col 13)-(line 1405,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.remove(java.lang.Object)",
      "begin_line": 1408,
      "end_line": 1419,
      "comment": "",
      "child_ranges": [
        "(line 1410,col 13)-(line 1412,col 13)",
        "(line 1413,col 13)-(line 1415,col 13)",
        "(line 1416,col 13)-(line 1416,col 64)",
        "(line 1417,col 13)-(line 1417,col 61)",
        "(line 1418,col 13)-(line 1418,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.size()",
      "begin_line": 1421,
      "end_line": 1424,
      "comment": "",
      "child_ranges": [
        "(line 1423,col 13)-(line 1423,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.clear()",
      "begin_line": 1426,
      "end_line": 1429,
      "comment": "",
      "child_ranges": [
        "(line 1428,col 13)-(line 1428,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1434,
      "end_line": 1439,
      "comment": "\n         * An {@link Iterator} that returns {@link Entry} Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.EntryIterator.next()",
      "begin_line": 1435,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 17)-(line 1437,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 1445,
      "end_line": 1483,
      "comment": "\n     * This is a key set view of the {@link Trie} as returned by {@link Map#keySet()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.iterator()",
      "begin_line": 1447,
      "end_line": 1450,
      "comment": "",
      "child_ranges": [
        "(line 1449,col 13)-(line 1449,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.size()",
      "begin_line": 1452,
      "end_line": 1455,
      "comment": "",
      "child_ranges": [
        "(line 1454,col 13)-(line 1454,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.contains(java.lang.Object)",
      "begin_line": 1457,
      "end_line": 1460,
      "comment": "",
      "child_ranges": [
        "(line 1459,col 13)-(line 1459,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.remove(java.lang.Object)",
      "begin_line": 1462,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1464,col 13)-(line 1464,col 36)",
        "(line 1465,col 13)-(line 1465,col 48)",
        "(line 1466,col 13)-(line 1466,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.clear()",
      "begin_line": 1469,
      "end_line": 1472,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 13)-(line 1471,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cK\u003e"
      ],
      "begin_line": 1477,
      "end_line": 1482,
      "comment": "\n         * An {@link Iterator} that returns Key Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.KeyIterator.next()",
      "begin_line": 1478,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1480,col 17)-(line 1480,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 1488,
      "end_line": 1531,
      "comment": "\n     * This is a value view of the {@link Trie} as returned by {@link Map#values()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.iterator()",
      "begin_line": 1490,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1492,col 13)-(line 1492,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.size()",
      "begin_line": 1495,
      "end_line": 1498,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 13)-(line 1497,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.contains(java.lang.Object)",
      "begin_line": 1500,
      "end_line": 1503,
      "comment": "",
      "child_ranges": [
        "(line 1502,col 13)-(line 1502,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.clear()",
      "begin_line": 1505,
      "end_line": 1508,
      "comment": "",
      "child_ranges": [
        "(line 1507,col 13)-(line 1507,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.remove(java.lang.Object)",
      "begin_line": 1510,
      "end_line": 1520,
      "comment": "",
      "child_ranges": [
        "(line 1512,col 13)-(line 1518,col 13)",
        "(line 1519,col 13)-(line 1519,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cV\u003e"
      ],
      "begin_line": 1525,
      "end_line": 1530,
      "comment": "\n         * An {@link Iterator} that returns Value Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.ValueIterator.next()",
      "begin_line": 1526,
      "end_line": 1529,
      "comment": "",
      "child_ranges": [
        "(line 1528,col 17)-(line 1528,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrieIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 1536,
      "end_line": 1604,
      "comment": "\n     * An iterator for the entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1539,
      "end_line": 1539,
      "comment": " For fast-fail. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1541,
      "end_line": 1541,
      "comment": " the next node to return"
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1542,
      "end_line": 1542,
      "comment": " the current entry we\u0027re on"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.TrieIterator()",
      "begin_line": 1547,
      "end_line": 1549,
      "comment": "\n         * Starts iteration from the root.\n         ",
      "child_ranges": [
        "(line 1548,col 13)-(line 1548,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.TrieIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1554,
      "end_line": 1556,
      "comment": "\n         * Starts iteration at the given entry.\n         ",
      "child_ranges": [
        "(line 1555,col 13)-(line 1555,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.nextEntry()",
      "begin_line": 1561,
      "end_line": 1574,
      "comment": "\n         * Returns the next {@link TrieEntry}.\n         ",
      "child_ranges": [
        "(line 1562,col 13)-(line 1564,col 13)",
        "(line 1566,col 13)-(line 1566,col 42)",
        "(line 1567,col 13)-(line 1569,col 13)",
        "(line 1571,col 13)-(line 1571,col 31)",
        "(line 1572,col 13)-(line 1572,col 24)",
        "(line 1573,col 13)-(line 1573,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.findNext(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1579,
      "end_line": 1581,
      "comment": "\n         * @see PatriciaTrie#nextEntry(TrieEntry)\n         ",
      "child_ranges": [
        "(line 1580,col 13)-(line 1580,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.hasNext()",
      "begin_line": 1583,
      "end_line": 1586,
      "comment": "",
      "child_ranges": [
        "(line 1585,col 13)-(line 1585,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.remove()",
      "begin_line": 1588,
      "end_line": 1603,
      "comment": "",
      "child_ranges": [
        "(line 1590,col 13)-(line 1592,col 13)",
        "(line 1594,col 13)-(line 1596,col 13)",
        "(line 1598,col 13)-(line 1598,col 49)",
        "(line 1599,col 13)-(line 1599,col 27)",
        "(line 1600,col 13)-(line 1600,col 56)",
        "(line 1602,col 13)-(line 1602,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrieMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cK\u003e",
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e"
      ],
      "begin_line": 1609,
      "end_line": 1675,
      "comment": "\n     * An {@link OrderedMapIterator} for a {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 1611,
      "end_line": 1611,
      "comment": " the previous node to return"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.next()",
      "begin_line": 1613,
      "end_line": 1616,
      "comment": "",
      "child_ranges": [
        "(line 1615,col 13)-(line 1615,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.getKey()",
      "begin_line": 1618,
      "end_line": 1624,
      "comment": "",
      "child_ranges": [
        "(line 1620,col 13)-(line 1622,col 13)",
        "(line 1623,col 13)-(line 1623,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.getValue()",
      "begin_line": 1626,
      "end_line": 1632,
      "comment": "",
      "child_ranges": [
        "(line 1628,col 13)-(line 1630,col 13)",
        "(line 1631,col 13)-(line 1631,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.setValue(V)",
      "begin_line": 1634,
      "end_line": 1640,
      "comment": "",
      "child_ranges": [
        "(line 1636,col 13)-(line 1638,col 13)",
        "(line 1639,col 13)-(line 1639,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.hasPrevious()",
      "begin_line": 1642,
      "end_line": 1645,
      "comment": "",
      "child_ranges": [
        "(line 1644,col 13)-(line 1644,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.previous()",
      "begin_line": 1647,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1649,col 13)-(line 1649,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.nextEntry()",
      "begin_line": 1652,
      "end_line": 1657,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 13)-(line 1654,col 64)",
        "(line 1655,col 13)-(line 1655,col 33)",
        "(line 1656,col 13)-(line 1656,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.previousEntry()",
      "begin_line": 1659,
      "end_line": 1673,
      "comment": "",
      "child_ranges": [
        "(line 1660,col 13)-(line 1662,col 13)",
        "(line 1664,col 13)-(line 1664,col 46)",
        "(line 1665,col 13)-(line 1667,col 13)",
        "(line 1669,col 13)-(line 1669,col 66)",
        "(line 1670,col 13)-(line 1670,col 27)",
        "(line 1671,col 13)-(line 1671,col 24)",
        "(line 1672,col 13)-(line 1672,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RangeMap",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractMap\u003cK, V\u003e",
        "java.util.SortedMap\u003cK, V\u003e"
      ],
      "begin_line": 1680,
      "end_line": 1841,
      "comment": "\n     * A range view of the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 1684,
      "end_line": 1684,
      "comment": " The {@link #entrySet()} view. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.createEntrySet()",
      "begin_line": 1689,
      "end_line": 1689,
      "comment": "\n         * Creates and returns an {@link #entrySet()} view of the {@link RangeMap}.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.getFromKey()",
      "begin_line": 1694,
      "end_line": 1694,
      "comment": "\n         * Returns the FROM Key.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.isFromInclusive()",
      "begin_line": 1699,
      "end_line": 1699,
      "comment": "\n         * Whether or not the {@link #getFromKey()} is in the range.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.getToKey()",
      "begin_line": 1704,
      "end_line": 1704,
      "comment": "\n         * Returns the TO Key.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.isToInclusive()",
      "begin_line": 1709,
      "end_line": 1709,
      "comment": "\n         * Whether or not the {@link #getToKey()} is in the range.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.comparator()",
      "begin_line": 1711,
      "end_line": 1714,
      "comment": "",
      "child_ranges": [
        "(line 1713,col 13)-(line 1713,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.containsKey(java.lang.Object)",
      "begin_line": 1716,
      "end_line": 1723,
      "comment": "",
      "child_ranges": [
        "(line 1718,col 13)-(line 1720,col 13)",
        "(line 1722,col 13)-(line 1722,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.remove(java.lang.Object)",
      "begin_line": 1725,
      "end_line": 1732,
      "comment": "",
      "child_ranges": [
        "(line 1727,col 13)-(line 1729,col 13)",
        "(line 1731,col 13)-(line 1731,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.get(java.lang.Object)",
      "begin_line": 1734,
      "end_line": 1741,
      "comment": "",
      "child_ranges": [
        "(line 1736,col 13)-(line 1738,col 13)",
        "(line 1740,col 13)-(line 1740,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.put(K, V)",
      "begin_line": 1743,
      "end_line": 1749,
      "comment": "",
      "child_ranges": [
        "(line 1745,col 13)-(line 1747,col 13)",
        "(line 1748,col 13)-(line 1748,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.entrySet()",
      "begin_line": 1751,
      "end_line": 1757,
      "comment": "",
      "child_ranges": [
        "(line 1753,col 13)-(line 1755,col 13)",
        "(line 1756,col 13)-(line 1756,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.subMap(K, K)",
      "begin_line": 1759,
      "end_line": 1770,
      "comment": "",
      "child_ranges": [
        "(line 1761,col 13)-(line 1763,col 13)",
        "(line 1765,col 13)-(line 1767,col 13)",
        "(line 1769,col 13)-(line 1769,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.headMap(K)",
      "begin_line": 1772,
      "end_line": 1778,
      "comment": "",
      "child_ranges": [
        "(line 1774,col 13)-(line 1776,col 13)",
        "(line 1777,col 13)-(line 1777,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.tailMap(K)",
      "begin_line": 1780,
      "end_line": 1786,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 13)-(line 1784,col 13)",
        "(line 1785,col 13)-(line 1785,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inRange(K)",
      "begin_line": 1791,
      "end_line": 1796,
      "comment": "\n         * Returns true if the provided key is greater than TO and less than FROM.\n         ",
      "child_ranges": [
        "(line 1792,col 13)-(line 1792,col 43)",
        "(line 1793,col 13)-(line 1793,col 39)",
        "(line 1795,col 13)-(line 1795,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inRange2(K)",
      "begin_line": 1801,
      "end_line": 1806,
      "comment": "\n         * This form allows the high endpoint (as well as all legit keys).\n         ",
      "child_ranges": [
        "(line 1802,col 13)-(line 1802,col 43)",
        "(line 1803,col 13)-(line 1803,col 39)",
        "(line 1805,col 13)-(line 1805,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inFromRange(K, boolean)",
      "begin_line": 1811,
      "end_line": 1820,
      "comment": "\n         * Returns true if the provided key is in the FROM range of the {@link RangeMap}.\n         ",
      "child_ranges": [
        "(line 1812,col 13)-(line 1812,col 43)",
        "(line 1813,col 13)-(line 1813,col 60)",
        "(line 1815,col 13)-(line 1815,col 67)",
        "(line 1816,col 13)-(line 1818,col 13)",
        "(line 1819,col 13)-(line 1819,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inToRange(K, boolean)",
      "begin_line": 1825,
      "end_line": 1834,
      "comment": "\n         * Returns true if the provided key is in the TO range of the {@link RangeMap}.\n         ",
      "child_ranges": [
        "(line 1826,col 13)-(line 1826,col 39)",
        "(line 1827,col 13)-(line 1827,col 56)",
        "(line 1829,col 13)-(line 1829,col 65)",
        "(line 1830,col 13)-(line 1832,col 13)",
        "(line 1833,col 13)-(line 1833,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 1839,
      "end_line": 1840,
      "comment": "\n         * Creates and returns a sub-range view of the current {@link RangeMap}.\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "RangeEntryMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap"
      ],
      "begin_line": 1846,
      "end_line": 1958,
      "comment": "\n    * A {@link RangeMap} that deals with {@link Entry}s.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 1849,
      "end_line": 1849,
      "comment": " The key to start from, null if the beginning. "
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 1852,
      "end_line": 1852,
      "comment": " The key to end at, null if till the end. "
    },
    {
      "type": "field",
      "varNames": [
        "fromInclusive"
      ],
      "begin_line": 1855,
      "end_line": 1855,
      "comment": " Whether or not the \u0027from\u0027 is inclusive. "
    },
    {
      "type": "field",
      "varNames": [
        "toInclusive"
      ],
      "begin_line": 1858,
      "end_line": 1858,
      "comment": " Whether or not the \u0027to\u0027 is inclusive. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.RangeEntryMap(K, K)",
      "begin_line": 1864,
      "end_line": 1866,
      "comment": "\n        * Creates a {@link RangeEntryMap} with the fromKey included and\n        * the toKey excluded from the range.\n        ",
      "child_ranges": [
        "(line 1865,col 12)-(line 1865,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.RangeEntryMap(K, boolean, K, boolean)",
      "begin_line": 1871,
      "end_line": 1886,
      "comment": "\n        * Creates a {@link RangeEntryMap}.\n        ",
      "child_ranges": [
        "(line 1874,col 12)-(line 1876,col 12)",
        "(line 1878,col 12)-(line 1880,col 12)",
        "(line 1882,col 12)-(line 1882,col 34)",
        "(line 1883,col 12)-(line 1883,col 46)",
        "(line 1884,col 12)-(line 1884,col 30)",
        "(line 1885,col 12)-(line 1885,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.firstKey()",
      "begin_line": 1888,
      "end_line": 1906,
      "comment": "",
      "child_ranges": [
        "(line 1890,col 12)-(line 1890,col 35)",
        "(line 1891,col 12)-(line 1899,col 12)",
        "(line 1901,col 12)-(line 1901,col 57)",
        "(line 1902,col 12)-(line 1904,col 12)",
        "(line 1905,col 12)-(line 1905,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.lastKey()",
      "begin_line": 1908,
      "end_line": 1926,
      "comment": "",
      "child_ranges": [
        "(line 1910,col 12)-(line 1910,col 28)",
        "(line 1911,col 12)-(line 1919,col 12)",
        "(line 1921,col 12)-(line 1921,col 56)",
        "(line 1922,col 12)-(line 1924,col 12)",
        "(line 1925,col 12)-(line 1925,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.createEntrySet()",
      "begin_line": 1928,
      "end_line": 1931,
      "comment": "",
      "child_ranges": [
        "(line 1930,col 12)-(line 1930,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.getFromKey()",
      "begin_line": 1933,
      "end_line": 1936,
      "comment": "",
      "child_ranges": [
        "(line 1935,col 12)-(line 1935,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.getToKey()",
      "begin_line": 1938,
      "end_line": 1941,
      "comment": "",
      "child_ranges": [
        "(line 1940,col 12)-(line 1940,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.isFromInclusive()",
      "begin_line": 1943,
      "end_line": 1946,
      "comment": "",
      "child_ranges": [
        "(line 1945,col 12)-(line 1945,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.isToInclusive()",
      "begin_line": 1948,
      "end_line": 1951,
      "comment": "",
      "child_ranges": [
        "(line 1950,col 12)-(line 1950,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 1953,
      "end_line": 1957,
      "comment": "",
      "child_ranges": [
        "(line 1956,col 12)-(line 1956,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RangeEntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1963,
      "end_line": 2087,
      "comment": "\n     * A {@link Set} view of a {@link RangeMap}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 1965,
      "end_line": 1965,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 1967,
      "end_line": 1967,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1969,
      "end_line": 1969,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.RangeEntrySet(org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap)",
      "begin_line": 1974,
      "end_line": 1980,
      "comment": "\n         * Creates a {@link RangeEntrySet}.\n         ",
      "child_ranges": [
        "(line 1975,col 13)-(line 1977,col 13)",
        "(line 1979,col 13)-(line 1979,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.iterator()",
      "begin_line": 1982,
      "end_line": 2000,
      "comment": "",
      "child_ranges": [
        "(line 1984,col 13)-(line 1984,col 52)",
        "(line 1985,col 13)-(line 1985,col 48)",
        "(line 1987,col 13)-(line 1987,col 41)",
        "(line 1988,col 13)-(line 1992,col 13)",
        "(line 1994,col 13)-(line 1994,col 40)",
        "(line 1995,col 13)-(line 1997,col 13)",
        "(line 1999,col 13)-(line 1999,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.size()",
      "begin_line": 2002,
      "end_line": 2014,
      "comment": "",
      "child_ranges": [
        "(line 2004,col 13)-(line 2012,col 13)",
        "(line 2013,col 13)-(line 2013,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.isEmpty()",
      "begin_line": 2016,
      "end_line": 2019,
      "comment": "",
      "child_ranges": [
        "(line 2018,col 13)-(line 2018,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.contains(java.lang.Object)",
      "begin_line": 2021,
      "end_line": 2036,
      "comment": "",
      "child_ranges": [
        "(line 2024,col 13)-(line 2026,col 13)",
        "(line 2028,col 13)-(line 2028,col 62)",
        "(line 2029,col 13)-(line 2029,col 41)",
        "(line 2030,col 13)-(line 2032,col 13)",
        "(line 2034,col 13)-(line 2034,col 55)",
        "(line 2035,col 13)-(line 2035,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.remove(java.lang.Object)",
      "begin_line": 2038,
      "end_line": 2057,
      "comment": "",
      "child_ranges": [
        "(line 2041,col 13)-(line 2043,col 13)",
        "(line 2045,col 13)-(line 2045,col 62)",
        "(line 2046,col 13)-(line 2046,col 41)",
        "(line 2047,col 13)-(line 2049,col 13)",
        "(line 2051,col 13)-(line 2051,col 55)",
        "(line 2052,col 13)-(line 2055,col 13)",
        "(line 2056,col 13)-(line 2056,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2062,
      "end_line": 2086,
      "comment": "\n         * An {@link Iterator} for {@link RangeEntrySet}s.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "excludedKey"
      ],
      "begin_line": 2064,
      "end_line": 2064,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.EntryIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2069,
      "end_line": 2072,
      "comment": "\n             * Creates a {@link EntryIterator}.\n             ",
      "child_ranges": [
        "(line 2070,col 17)-(line 2070,col 29)",
        "(line 2071,col 17)-(line 2071,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.hasNext()",
      "begin_line": 2074,
      "end_line": 2077,
      "comment": "",
      "child_ranges": [
        "(line 2076,col 17)-(line 2076,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.next()",
      "begin_line": 2079,
      "end_line": 2085,
      "comment": "",
      "child_ranges": [
        "(line 2081,col 17)-(line 2083,col 17)",
        "(line 2084,col 17)-(line 2084,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrefixRangeMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap"
      ],
      "begin_line": 2092,
      "end_line": 2262,
      "comment": "\n     * A submap used for prefix views over the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 2094,
      "end_line": 2094,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsetInBits"
      ],
      "begin_line": 2096,
      "end_line": 2096,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthInBits"
      ],
      "begin_line": 2098,
      "end_line": 2098,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 2100,
      "end_line": 2100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 2102,
      "end_line": 2102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 2104,
      "end_line": 2104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 2106,
      "end_line": 2106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.PrefixRangeMap(K, int, int)",
      "begin_line": 2111,
      "end_line": 2115,
      "comment": "\n         * Creates a {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2112,col 13)-(line 2112,col 33)",
        "(line 2113,col 13)-(line 2113,col 45)",
        "(line 2114,col 13)-(line 2114,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.fixup()",
      "begin_line": 2123,
      "end_line": 2159,
      "comment": "\n         * This method does two things. It determines the FROM\n         * and TO range of the {@link PrefixRangeMap} and the number\n         * of elements in the range. This method must be called every\n         * time the {@link Trie} has changed.\n         ",
      "child_ranges": [
        "(line 2125,col 13)-(line 2156,col 13)",
        "(line 2158,col 13)-(line 2158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.firstKey()",
      "begin_line": 2161,
      "end_line": 2178,
      "comment": "",
      "child_ranges": [
        "(line 2163,col 13)-(line 2163,col 20)",
        "(line 2165,col 13)-(line 2165,col 36)",
        "(line 2166,col 13)-(line 2170,col 13)",
        "(line 2172,col 13)-(line 2172,col 58)",
        "(line 2173,col 13)-(line 2175,col 13)",
        "(line 2177,col 13)-(line 2177,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.lastKey()",
      "begin_line": 2180,
      "end_line": 2197,
      "comment": "",
      "child_ranges": [
        "(line 2182,col 13)-(line 2182,col 20)",
        "(line 2184,col 13)-(line 2184,col 36)",
        "(line 2185,col 13)-(line 2189,col 13)",
        "(line 2191,col 13)-(line 2191,col 57)",
        "(line 2192,col 13)-(line 2194,col 13)",
        "(line 2196,col 13)-(line 2196,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inRange(K)",
      "begin_line": 2202,
      "end_line": 2205,
      "comment": "\n         * Returns true if this {@link PrefixRangeMap}\u0027s key is a prefix of the provided key.\n         ",
      "child_ranges": [
        "(line 2204,col 13)-(line 2204,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inRange2(K)",
      "begin_line": 2210,
      "end_line": 2213,
      "comment": "\n         * Same as {@link #inRange(Object)}.\n         ",
      "child_ranges": [
        "(line 2212,col 13)-(line 2212,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inFromRange(K, boolean)",
      "begin_line": 2218,
      "end_line": 2221,
      "comment": "\n         * Returns true if the provided Key is in the FROM range of the {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2220,col 13)-(line 2220,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inToRange(K, boolean)",
      "begin_line": 2226,
      "end_line": 2229,
      "comment": "\n         * Returns true if the provided Key is in the TO range of the {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2228,col 13)-(line 2228,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.createEntrySet()",
      "begin_line": 2231,
      "end_line": 2234,
      "comment": "",
      "child_ranges": [
        "(line 2233,col 13)-(line 2233,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.getFromKey()",
      "begin_line": 2236,
      "end_line": 2239,
      "comment": "",
      "child_ranges": [
        "(line 2238,col 13)-(line 2238,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.getToKey()",
      "begin_line": 2241,
      "end_line": 2244,
      "comment": "",
      "child_ranges": [
        "(line 2243,col 13)-(line 2243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.isFromInclusive()",
      "begin_line": 2246,
      "end_line": 2249,
      "comment": "",
      "child_ranges": [
        "(line 2248,col 13)-(line 2248,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.isToInclusive()",
      "begin_line": 2251,
      "end_line": 2254,
      "comment": "",
      "child_ranges": [
        "(line 2253,col 13)-(line 2253,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 2256,
      "end_line": 2260,
      "comment": "",
      "child_ranges": [
        "(line 2259,col 13)-(line 2259,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrefixRangeEntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet"
      ],
      "begin_line": 2267,
      "end_line": 2410,
      "comment": "\n     * A prefix {@link RangeEntrySet} view of the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 2269,
      "end_line": 2269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixStart"
      ],
      "begin_line": 2271,
      "end_line": 2271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 2273,
      "end_line": 2273,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.PrefixRangeEntrySet(org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap)",
      "begin_line": 2278,
      "end_line": 2281,
      "comment": "\n         * Creates a {@link PrefixRangeEntrySet}.\n         ",
      "child_ranges": [
        "(line 2279,col 13)-(line 2279,col 28)",
        "(line 2280,col 13)-(line 2280,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.size()",
      "begin_line": 2283,
      "end_line": 2286,
      "comment": "",
      "child_ranges": [
        "(line 2285,col 13)-(line 2285,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.iterator()",
      "begin_line": 2288,
      "end_line": 2303,
      "comment": "",
      "child_ranges": [
        "(line 2290,col 13)-(line 2293,col 13)",
        "(line 2295,col 13)-(line 2302,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingletonIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2308,
      "end_line": 2342,
      "comment": "\n         * An {@link Iterator} that holds a single {@link TrieEntry}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 2310,
      "end_line": 2310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hit"
      ],
      "begin_line": 2312,
      "end_line": 2312,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.SingletonIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2314,
      "end_line": 2316,
      "comment": "",
      "child_ranges": [
        "(line 2315,col 17)-(line 2315,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.hasNext()",
      "begin_line": 2318,
      "end_line": 2321,
      "comment": "",
      "child_ranges": [
        "(line 2320,col 17)-(line 2320,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.next()",
      "begin_line": 2323,
      "end_line": 2331,
      "comment": "",
      "child_ranges": [
        "(line 2325,col 17)-(line 2327,col 17)",
        "(line 2329,col 17)-(line 2329,col 22)",
        "(line 2330,col 17)-(line 2330,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.remove()",
      "begin_line": 2333,
      "end_line": 2341,
      "comment": "",
      "child_ranges": [
        "(line 2335,col 17)-(line 2337,col 17)",
        "(line 2339,col 17)-(line 2339,col 22)",
        "(line 2340,col 17)-(line 2340,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2347,
      "end_line": 2409,
      "comment": "\n         * An {@link Iterator} for iterating over a prefix search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 2350,
      "end_line": 2350,
      "comment": " values to reset the subtree if we remove it."
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 2351,
      "end_line": 2351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthInBits"
      ],
      "begin_line": 2352,
      "end_line": 2352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastOne"
      ],
      "begin_line": 2353,
      "end_line": 2353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subtree"
      ],
      "begin_line": 2355,
      "end_line": 2355,
      "comment": " the subtree to search within"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.EntryIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, K, int, int)",
      "begin_line": 2361,
      "end_line": 2368,
      "comment": "\n             * Starts iteration at the given entry \u0026 search only\n             * within the given subtree.\n             ",
      "child_ranges": [
        "(line 2363,col 17)-(line 2363,col 36)",
        "(line 2364,col 17)-(line 2364,col 71)",
        "(line 2365,col 17)-(line 2365,col 37)",
        "(line 2366,col 17)-(line 2366,col 37)",
        "(line 2367,col 17)-(line 2367,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.next()",
      "begin_line": 2370,
      "end_line": 2377,
      "comment": "",
      "child_ranges": [
        "(line 2372,col 17)-(line 2372,col 58)",
        "(line 2373,col 17)-(line 2375,col 17)",
        "(line 2376,col 17)-(line 2376,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.findNext(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2379,
      "end_line": 2382,
      "comment": "",
      "child_ranges": [
        "(line 2381,col 17)-(line 2381,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.remove()",
      "begin_line": 2384,
      "end_line": 2408,
      "comment": "",
      "child_ranges": [
        "(line 2388,col 17)-(line 2388,col 44)",
        "(line 2389,col 17)-(line 2389,col 52)",
        "(line 2390,col 17)-(line 2392,col 17)",
        "(line 2394,col 17)-(line 2394,col 31)",
        "(line 2398,col 17)-(line 2400,col 17)",
        "(line 2405,col 17)-(line 2407,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.readObject(java.io.ObjectInputStream)",
      "begin_line": 2417,
      "end_line": 2427,
      "comment": "\n     * Reads the content of the stream.\n     ",
      "child_ranges": [
        "(line 2419,col 9)-(line 2419,col 35)",
        "(line 2420,col 9)-(line 2420,col 51)",
        "(line 2421,col 9)-(line 2421,col 36)",
        "(line 2422,col 9)-(line 2426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2432,
      "end_line": 2439,
      "comment": "\n     * Writes the content to the stream for serialization.\n     ",
      "child_ranges": [
        "(line 2433,col 9)-(line 2433,col 36)",
        "(line 2434,col 9)-(line 2434,col 37)",
        "(line 2435,col 9)-(line 2438,col 9)"
      ]
    }
  ]
}