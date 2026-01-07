{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/trie/AbstractPatriciaTrie.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPatriciaTrie",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractBitwiseTrie\u003cK, V\u003e"
      ],
      "begin_line": 44,
      "end_line": 2406,
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
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.firstKey()",
      "begin_line": 778,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lastKey()",
      "begin_line": 785,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 50)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextKey(K)",
      "begin_line": 793,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 52)",
        "(line 798,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousKey(K)",
      "begin_line": 805,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 52)",
        "(line 810,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.mapIterator()",
      "begin_line": 817,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.prefixMap(K)",
      "begin_line": 821,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.getPrefixMapByBits(K, int, int)",
      "begin_line": 846,
      "end_line": 859,
      "comment": "\n     * Returns a view of this {@link Trie} of all elements that are prefixed\n     * by the number of bits in the given Key.\n     * \u003cp\u003e\n     * The view that this returns is optimized to have a very efficient\n     * {@link Iterator}. The {@link SortedMap#firstKey()},\n     * {@link SortedMap#lastKey()} \u0026amp; {@link Map#size()} methods must\n     * iterate over all possible values in order to determine the results.\n     * This information is cached until the PATRICIA {@link Trie} changes.\n     * All other methods (except {@link Iterator}) must compare the given\n     * key to the prefix to ensure that it is within the range of the view.\n     * The {@link Iterator}\u0027s remove method must also relocate the subtree\n     * that contains the prefixes if the entry holding the subtree is\n     * removed or changes. Changing the subtree takes O(K) time.\n     *\n     * @param key  the key to use in the search\n     * @param offsetInBits  the prefix offset\n     * @param lengthInBits  the number of significant prefix bits\n     * @return a {@link SortedMap} view of this {@link Trie} with all elements whose\n     *   key is prefixed by the search key\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 61)",
        "(line 849,col 9)-(line 852,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 858,col 9)-(line 858,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.headMap(K)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.subMap(K, K)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.tailMap(K)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.higherEntry(K)",
      "begin_line": 877,
      "end_line": 924,
      "comment": "\n     * Returns an entry strictly higher than the given key,\n     * or null if no such entry exists.\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 51)",
        "(line 883,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 896,col 79)",
        "(line 897,col 9)-(line 899,col 9)",
        "(line 901,col 9)-(line 901,col 54)",
        "(line 902,col 9)-(line 920,col 9)",
        "(line 923,col 9)-(line 923,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.ceilingEntry(K)",
      "begin_line": 930,
      "end_line": 983,
      "comment": "\n     * Returns a key-value mapping associated with the least key greater\n     * than or equal to the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 51)",
        "(line 951,col 9)-(line 956,col 9)",
        "(line 958,col 9)-(line 958,col 79)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 963,col 9)-(line 963,col 54)",
        "(line 964,col 9)-(line 979,col 9)",
        "(line 982,col 9)-(line 982,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lowerEntry(K)",
      "begin_line": 989,
      "end_line": 1035,
      "comment": "\n     * Returns a key-value mapping associated with the greatest key\n     * strictly less than the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 51)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1013,col 9)-(line 1013,col 79)",
        "(line 1014,col 9)-(line 1016,col 9)",
        "(line 1018,col 9)-(line 1018,col 54)",
        "(line 1019,col 9)-(line 1031,col 9)",
        "(line 1034,col 9)-(line 1034,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.floorEntry(K)",
      "begin_line": 1041,
      "end_line": 1079,
      "comment": "\n     * Returns a key-value mapping associated with the greatest key\n     * less than or equal to the given key, or null if there is no such key.\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 51)",
        "(line 1047,col 9)-(line 1052,col 9)",
        "(line 1054,col 9)-(line 1054,col 79)",
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1059,col 9)-(line 1059,col 54)",
        "(line 1060,col 9)-(line 1075,col 9)",
        "(line 1078,col 9)-(line 1078,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.subtree(K, int, int)",
      "begin_line": 1087,
      "end_line": 1137,
      "comment": "\n     * Finds the subtree that contains the prefix.\n     *\n     * This is very similar to getR but with the difference that\n     * we stop the lookup if h.bitIndex \u003e lengthInBits.\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 44)",
        "(line 1089,col 9)-(line 1089,col 36)",
        "(line 1090,col 9)-(line 1101,col 9)",
        "(line 1104,col 9)-(line 1104,col 73)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1111,col 9)-(line 1111,col 63)",
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1123,col 9)-(line 1126,col 9)",
        "(line 1129,col 9)-(line 1130,col 99)",
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1136,col 9)-(line 1136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.lastEntry()",
      "begin_line": 1145,
      "end_line": 1147,
      "comment": "\n     * Returns the last entry the {@link Trie} is storing.\n     *\n     * \u003cp\u003eThis is implemented by going always to the right until\n     * we encounter a valid uplink. That uplink is the last key.\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1146,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.followRight(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1152,
      "end_line": 1164,
      "comment": "\n     * Traverses down the right path until it finds an uplink.\n     ",
      "child_ranges": [
        "(line 1154,col 9)-(line 1156,col 9)",
        "(line 1159,col 9)-(line 1161,col 9)",
        "(line 1163,col 9)-(line 1163,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.previousEntry(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1185,
      "end_line": 1216,
      "comment": "\n     * Returns the node lexicographically before the given node (or null if none).\n     *\n     * This follows four simple branches:\n     *  - If the uplink that returned us was a right uplink:\n     *      - If predecessor\u0027s left is a valid uplink from predecessor, return it.\n     *      - Else, follow the right path from the predecessor\u0027s left.\n     *  - If the uplink that returned us was a left uplink:\n     *      - Loop back through parents until we encounter a node where\n     *        node !\u003d node.parent.left.\n     *          - If node.parent.left is uplink from node.parent:\n     *              - If node.parent.left is not root, return it.\n     *              - If it is root \u0026 root isEmpty, return null.\n     *              - If it is root \u0026 root !isEmpty, return root.\n     *          - If node.parent.left is not uplink from node.parent:\n     *              - Follow right path for first right child from node.parent.left\n     *\n     * @param start  the start entry\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1188,col 9)",
        "(line 1190,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1196,col 49)",
        "(line 1197,col 9)-(line 1199,col 9)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1205,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.nextEntryInSubtree(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1225,
      "end_line": 1231,
      "comment": "\n     * Returns the entry lexicographically after the given entry.\n     * If the given entry is null, returns the first node.\n     *\n     * This will traverse only within the subtree.  If the given node\n     * is not within the subtree, this will have undefined results.\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1229,col 9)",
        "(line 1230,col 9)-(line 1230,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.isValidUplink(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003c?, ?\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003c?, ?\u003e)",
      "begin_line": 1236,
      "end_line": 1238,
      "comment": "\n     * Returns true if \u0027next\u0027 is a valid uplink coming from \u0027from\u0027.\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1247,
      "end_line": 1258,
      "comment": "\n     * A {@link Reference} allows us to return something through a Method\u0027s\n     * argument list. An alternative would be to an Array with a length of\n     * one (1) but that leads to compiler warnings. Computationally and memory\n     * wise there\u0027s no difference (except for the need to load the\n     * {@link Reference} Class but that happens only once).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "item"
      ],
      "begin_line": 1249,
      "end_line": 1249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Reference.set(E)",
      "begin_line": 1251,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1252,col 13)-(line 1252,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Reference.get()",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 13)-(line 1256,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrieEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry\u003cK, V\u003e"
      ],
      "begin_line": 1263,
      "end_line": 1375,
      "comment": "\n     *  A {@link Trie} is a set of {@link TrieEntry} nodes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1265,
      "end_line": 1265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitIndex"
      ],
      "begin_line": 1268,
      "end_line": 1268,
      "comment": " The index this entry is comparing. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1271,
      "end_line": 1271,
      "comment": " The parent of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "left"
      ],
      "begin_line": 1274,
      "end_line": 1274,
      "comment": " The left child of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "right"
      ],
      "begin_line": 1277,
      "end_line": 1277,
      "comment": " The right child of this entry. "
    },
    {
      "type": "field",
      "varNames": [
        "predecessor"
      ],
      "begin_line": 1280,
      "end_line": 1280,
      "comment": " The entry who uplinks to this entry. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.TrieEntry(K, V, int)",
      "begin_line": 1282,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1283,col 13)-(line 1283,col 30)",
        "(line 1285,col 13)-(line 1285,col 37)",
        "(line 1287,col 13)-(line 1287,col 31)",
        "(line 1288,col 13)-(line 1288,col 29)",
        "(line 1289,col 13)-(line 1289,col 30)",
        "(line 1290,col 13)-(line 1290,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isEmpty()",
      "begin_line": 1298,
      "end_line": 1300,
      "comment": "\n         * Whether or not the entry is storing a key.\n         * Only the root can potentially be empty, all other\n         * nodes must have a key.\n         ",
      "child_ranges": [
        "(line 1299,col 13)-(line 1299,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isInternalNode()",
      "begin_line": 1305,
      "end_line": 1307,
      "comment": "\n         * Neither the left nor right child is a loopback.\n         ",
      "child_ranges": [
        "(line 1306,col 13)-(line 1306,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.isExternalNode()",
      "begin_line": 1312,
      "end_line": 1314,
      "comment": "\n         * Either the left or right child is a loopback.\n         ",
      "child_ranges": [
        "(line 1313,col 13)-(line 1313,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry.toString()",
      "begin_line": 1316,
      "end_line": 1374,
      "comment": "",
      "child_ranges": [
        "(line 1318,col 13)-(line 1318,col 61)",
        "(line 1320,col 13)-(line 1324,col 13)",
        "(line 1326,col 13)-(line 1326,col 95)",
        "(line 1327,col 13)-(line 1327,col 68)",
        "(line 1330,col 13)-(line 1338,col 13)",
        "(line 1339,col 13)-(line 1339,col 32)",
        "(line 1341,col 13)-(line 1349,col 13)",
        "(line 1350,col 13)-(line 1350,col 32)",
        "(line 1352,col 13)-(line 1360,col 13)",
        "(line 1361,col 13)-(line 1361,col 32)",
        "(line 1363,col 13)-(line 1370,col 13)",
        "(line 1372,col 13)-(line 1372,col 31)",
        "(line 1373,col 13)-(line 1373,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1381,
      "end_line": 1429,
      "comment": "\n     * This is a entry set view of the {@link Trie} as returned by {@link Map#entrySet()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.iterator()",
      "begin_line": 1383,
      "end_line": 1386,
      "comment": "",
      "child_ranges": [
        "(line 1385,col 13)-(line 1385,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.contains(java.lang.Object)",
      "begin_line": 1388,
      "end_line": 1396,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 13)-(line 1392,col 13)",
        "(line 1394,col 13)-(line 1394,col 85)",
        "(line 1395,col 13)-(line 1395,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.remove(java.lang.Object)",
      "begin_line": 1398,
      "end_line": 1409,
      "comment": "",
      "child_ranges": [
        "(line 1400,col 13)-(line 1402,col 13)",
        "(line 1403,col 13)-(line 1405,col 13)",
        "(line 1406,col 13)-(line 1406,col 64)",
        "(line 1407,col 13)-(line 1407,col 61)",
        "(line 1408,col 13)-(line 1408,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.size()",
      "begin_line": 1411,
      "end_line": 1414,
      "comment": "",
      "child_ranges": [
        "(line 1413,col 13)-(line 1413,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.clear()",
      "begin_line": 1416,
      "end_line": 1419,
      "comment": "",
      "child_ranges": [
        "(line 1418,col 13)-(line 1418,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1424,
      "end_line": 1428,
      "comment": "\n         * An {@link Iterator} that returns {@link Entry} Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.EntrySet.EntryIterator.next()",
      "begin_line": 1425,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1426,col 17)-(line 1426,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 1434,
      "end_line": 1471,
      "comment": "\n     * This is a key set view of the {@link Trie} as returned by {@link Map#keySet()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.iterator()",
      "begin_line": 1436,
      "end_line": 1439,
      "comment": "",
      "child_ranges": [
        "(line 1438,col 13)-(line 1438,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.size()",
      "begin_line": 1441,
      "end_line": 1444,
      "comment": "",
      "child_ranges": [
        "(line 1443,col 13)-(line 1443,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.contains(java.lang.Object)",
      "begin_line": 1446,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1448,col 13)-(line 1448,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.remove(java.lang.Object)",
      "begin_line": 1451,
      "end_line": 1456,
      "comment": "",
      "child_ranges": [
        "(line 1453,col 13)-(line 1453,col 36)",
        "(line 1454,col 13)-(line 1454,col 48)",
        "(line 1455,col 13)-(line 1455,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.clear()",
      "begin_line": 1458,
      "end_line": 1461,
      "comment": "",
      "child_ranges": [
        "(line 1460,col 13)-(line 1460,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cK\u003e"
      ],
      "begin_line": 1466,
      "end_line": 1470,
      "comment": "\n         * An {@link Iterator} that returns Key Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.KeySet.KeyIterator.next()",
      "begin_line": 1467,
      "end_line": 1469,
      "comment": "",
      "child_ranges": [
        "(line 1468,col 17)-(line 1468,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 1476,
      "end_line": 1518,
      "comment": "\n     * This is a value view of the {@link Trie} as returned by {@link Map#values()}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.iterator()",
      "begin_line": 1478,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1480,col 13)-(line 1480,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.size()",
      "begin_line": 1483,
      "end_line": 1486,
      "comment": "",
      "child_ranges": [
        "(line 1485,col 13)-(line 1485,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.contains(java.lang.Object)",
      "begin_line": 1488,
      "end_line": 1491,
      "comment": "",
      "child_ranges": [
        "(line 1490,col 13)-(line 1490,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.clear()",
      "begin_line": 1493,
      "end_line": 1496,
      "comment": "",
      "child_ranges": [
        "(line 1495,col 13)-(line 1495,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.remove(java.lang.Object)",
      "begin_line": 1498,
      "end_line": 1508,
      "comment": "",
      "child_ranges": [
        "(line 1500,col 13)-(line 1506,col 13)",
        "(line 1507,col 13)-(line 1507,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cV\u003e"
      ],
      "begin_line": 1513,
      "end_line": 1517,
      "comment": "\n         * An {@link Iterator} that returns Value Objects.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.Values.ValueIterator.next()",
      "begin_line": 1514,
      "end_line": 1516,
      "comment": "",
      "child_ranges": [
        "(line 1515,col 17)-(line 1515,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TrieIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 1523,
      "end_line": 1589,
      "comment": "\n     * An iterator for the entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1526,
      "end_line": 1526,
      "comment": " For fast-fail. "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 1528,
      "end_line": 1528,
      "comment": " the next node to return"
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 1529,
      "end_line": 1529,
      "comment": " the current entry we\u0027re on"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.TrieIterator()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\n         * Starts iteration from the root.\n         ",
      "child_ranges": [
        "(line 1535,col 13)-(line 1535,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.TrieIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1541,
      "end_line": 1543,
      "comment": "\n         * Starts iteration at the given entry.\n         ",
      "child_ranges": [
        "(line 1542,col 13)-(line 1542,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.nextEntry()",
      "begin_line": 1548,
      "end_line": 1561,
      "comment": "\n         * Returns the next {@link TrieEntry}.\n         ",
      "child_ranges": [
        "(line 1549,col 13)-(line 1551,col 13)",
        "(line 1553,col 13)-(line 1553,col 42)",
        "(line 1554,col 13)-(line 1556,col 13)",
        "(line 1558,col 13)-(line 1558,col 31)",
        "(line 1559,col 13)-(line 1559,col 24)",
        "(line 1560,col 13)-(line 1560,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.findNext(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 1566,
      "end_line": 1568,
      "comment": "\n         * @see PatriciaTrie#nextEntry(TrieEntry)\n         ",
      "child_ranges": [
        "(line 1567,col 13)-(line 1567,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.hasNext()",
      "begin_line": 1570,
      "end_line": 1572,
      "comment": "",
      "child_ranges": [
        "(line 1571,col 13)-(line 1571,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator.remove()",
      "begin_line": 1574,
      "end_line": 1588,
      "comment": "",
      "child_ranges": [
        "(line 1575,col 13)-(line 1577,col 13)",
        "(line 1579,col 13)-(line 1581,col 13)",
        "(line 1583,col 13)-(line 1583,col 49)",
        "(line 1584,col 13)-(line 1584,col 27)",
        "(line 1585,col 13)-(line 1585,col 56)",
        "(line 1587,col 13)-(line 1587,col 66)"
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
      "begin_line": 1594,
      "end_line": 1654,
      "comment": "\n     * An {@link OrderedMapIterator} for a {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "previous"
      ],
      "begin_line": 1596,
      "end_line": 1596,
      "comment": " the previous node to return"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.next()",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "",
      "child_ranges": [
        "(line 1599,col 13)-(line 1599,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.getKey()",
      "begin_line": 1602,
      "end_line": 1607,
      "comment": "",
      "child_ranges": [
        "(line 1603,col 13)-(line 1605,col 13)",
        "(line 1606,col 13)-(line 1606,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.getValue()",
      "begin_line": 1609,
      "end_line": 1614,
      "comment": "",
      "child_ranges": [
        "(line 1610,col 13)-(line 1612,col 13)",
        "(line 1613,col 13)-(line 1613,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.setValue(V)",
      "begin_line": 1616,
      "end_line": 1621,
      "comment": "",
      "child_ranges": [
        "(line 1617,col 13)-(line 1619,col 13)",
        "(line 1620,col 13)-(line 1620,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.hasPrevious()",
      "begin_line": 1623,
      "end_line": 1625,
      "comment": "",
      "child_ranges": [
        "(line 1624,col 13)-(line 1624,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.previous()",
      "begin_line": 1627,
      "end_line": 1629,
      "comment": "",
      "child_ranges": [
        "(line 1628,col 13)-(line 1628,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.nextEntry()",
      "begin_line": 1631,
      "end_line": 1636,
      "comment": "",
      "child_ranges": [
        "(line 1633,col 13)-(line 1633,col 64)",
        "(line 1634,col 13)-(line 1634,col 33)",
        "(line 1635,col 13)-(line 1635,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieMapIterator.previousEntry()",
      "begin_line": 1638,
      "end_line": 1652,
      "comment": "",
      "child_ranges": [
        "(line 1639,col 13)-(line 1641,col 13)",
        "(line 1643,col 13)-(line 1643,col 46)",
        "(line 1644,col 13)-(line 1646,col 13)",
        "(line 1648,col 13)-(line 1648,col 66)",
        "(line 1649,col 13)-(line 1649,col 27)",
        "(line 1650,col 13)-(line 1650,col 24)",
        "(line 1651,col 13)-(line 1651,col 27)"
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
      "begin_line": 1659,
      "end_line": 1816,
      "comment": "\n     * A range view of the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entrySet"
      ],
      "begin_line": 1663,
      "end_line": 1663,
      "comment": " The {@link #entrySet()} view. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.createEntrySet()",
      "begin_line": 1668,
      "end_line": 1668,
      "comment": "\n         * Creates and returns an {@link #entrySet()} view of the {@link RangeMap}.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.getFromKey()",
      "begin_line": 1673,
      "end_line": 1673,
      "comment": "\n         * Returns the FROM Key.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.isFromInclusive()",
      "begin_line": 1678,
      "end_line": 1678,
      "comment": "\n         * Whether or not the {@link #getFromKey()} is in the range.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.getToKey()",
      "begin_line": 1683,
      "end_line": 1683,
      "comment": "\n         * Returns the TO Key.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.isToInclusive()",
      "begin_line": 1688,
      "end_line": 1688,
      "comment": "\n         * Whether or not the {@link #getToKey()} is in the range.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.comparator()",
      "begin_line": 1690,
      "end_line": 1692,
      "comment": "",
      "child_ranges": [
        "(line 1691,col 13)-(line 1691,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.containsKey(java.lang.Object)",
      "begin_line": 1694,
      "end_line": 1701,
      "comment": "",
      "child_ranges": [
        "(line 1696,col 13)-(line 1698,col 13)",
        "(line 1700,col 13)-(line 1700,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.remove(java.lang.Object)",
      "begin_line": 1703,
      "end_line": 1710,
      "comment": "",
      "child_ranges": [
        "(line 1705,col 13)-(line 1707,col 13)",
        "(line 1709,col 13)-(line 1709,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.get(java.lang.Object)",
      "begin_line": 1712,
      "end_line": 1719,
      "comment": "",
      "child_ranges": [
        "(line 1714,col 13)-(line 1716,col 13)",
        "(line 1718,col 13)-(line 1718,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.put(K, V)",
      "begin_line": 1721,
      "end_line": 1727,
      "comment": "",
      "child_ranges": [
        "(line 1723,col 13)-(line 1725,col 13)",
        "(line 1726,col 13)-(line 1726,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.entrySet()",
      "begin_line": 1729,
      "end_line": 1735,
      "comment": "",
      "child_ranges": [
        "(line 1731,col 13)-(line 1733,col 13)",
        "(line 1734,col 13)-(line 1734,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.subMap(K, K)",
      "begin_line": 1737,
      "end_line": 1747,
      "comment": "",
      "child_ranges": [
        "(line 1738,col 13)-(line 1740,col 13)",
        "(line 1742,col 13)-(line 1744,col 13)",
        "(line 1746,col 13)-(line 1746,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.headMap(K)",
      "begin_line": 1749,
      "end_line": 1754,
      "comment": "",
      "child_ranges": [
        "(line 1750,col 13)-(line 1752,col 13)",
        "(line 1753,col 13)-(line 1753,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.tailMap(K)",
      "begin_line": 1756,
      "end_line": 1761,
      "comment": "",
      "child_ranges": [
        "(line 1757,col 13)-(line 1759,col 13)",
        "(line 1760,col 13)-(line 1760,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inRange(K)",
      "begin_line": 1766,
      "end_line": 1771,
      "comment": "\n         * Returns true if the provided key is greater than TO and less than FROM.\n         ",
      "child_ranges": [
        "(line 1767,col 13)-(line 1767,col 43)",
        "(line 1768,col 13)-(line 1768,col 39)",
        "(line 1770,col 13)-(line 1770,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inRange2(K)",
      "begin_line": 1776,
      "end_line": 1781,
      "comment": "\n         * This form allows the high endpoint (as well as all legit keys).\n         ",
      "child_ranges": [
        "(line 1777,col 13)-(line 1777,col 43)",
        "(line 1778,col 13)-(line 1778,col 39)",
        "(line 1780,col 13)-(line 1780,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inFromRange(K, boolean)",
      "begin_line": 1786,
      "end_line": 1795,
      "comment": "\n         * Returns true if the provided key is in the FROM range of the {@link RangeMap}.\n         ",
      "child_ranges": [
        "(line 1787,col 13)-(line 1787,col 43)",
        "(line 1788,col 13)-(line 1788,col 60)",
        "(line 1790,col 13)-(line 1790,col 67)",
        "(line 1791,col 13)-(line 1793,col 13)",
        "(line 1794,col 13)-(line 1794,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.inToRange(K, boolean)",
      "begin_line": 1800,
      "end_line": 1809,
      "comment": "\n         * Returns true if the provided key is in the TO range of the {@link RangeMap}.\n         ",
      "child_ranges": [
        "(line 1801,col 13)-(line 1801,col 39)",
        "(line 1802,col 13)-(line 1802,col 56)",
        "(line 1804,col 13)-(line 1804,col 65)",
        "(line 1805,col 13)-(line 1807,col 13)",
        "(line 1808,col 13)-(line 1808,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 1814,
      "end_line": 1815,
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
      "begin_line": 1821,
      "end_line": 1931,
      "comment": "\n    * A {@link RangeMap} that deals with {@link Entry}s.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 1824,
      "end_line": 1824,
      "comment": " The key to start from, null if the beginning. "
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 1827,
      "end_line": 1827,
      "comment": " The key to end at, null if till the end. "
    },
    {
      "type": "field",
      "varNames": [
        "fromInclusive"
      ],
      "begin_line": 1830,
      "end_line": 1830,
      "comment": " Whether or not the \u0027from\u0027 is inclusive. "
    },
    {
      "type": "field",
      "varNames": [
        "toInclusive"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": " Whether or not the \u0027to\u0027 is inclusive. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.RangeEntryMap(K, K)",
      "begin_line": 1839,
      "end_line": 1841,
      "comment": "\n        * Creates a {@link RangeEntryMap} with the fromKey included and\n        * the toKey excluded from the range.\n        ",
      "child_ranges": [
        "(line 1840,col 12)-(line 1840,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.RangeEntryMap(K, boolean, K, boolean)",
      "begin_line": 1846,
      "end_line": 1861,
      "comment": "\n        * Creates a {@link RangeEntryMap}.\n        ",
      "child_ranges": [
        "(line 1849,col 12)-(line 1851,col 12)",
        "(line 1853,col 12)-(line 1855,col 12)",
        "(line 1857,col 12)-(line 1857,col 34)",
        "(line 1858,col 12)-(line 1858,col 46)",
        "(line 1859,col 12)-(line 1859,col 30)",
        "(line 1860,col 12)-(line 1860,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.firstKey()",
      "begin_line": 1863,
      "end_line": 1880,
      "comment": "",
      "child_ranges": [
        "(line 1864,col 12)-(line 1864,col 35)",
        "(line 1865,col 12)-(line 1873,col 12)",
        "(line 1875,col 12)-(line 1875,col 57)",
        "(line 1876,col 12)-(line 1878,col 12)",
        "(line 1879,col 12)-(line 1879,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.lastKey()",
      "begin_line": 1882,
      "end_line": 1899,
      "comment": "",
      "child_ranges": [
        "(line 1883,col 12)-(line 1883,col 28)",
        "(line 1884,col 12)-(line 1892,col 12)",
        "(line 1894,col 12)-(line 1894,col 56)",
        "(line 1895,col 12)-(line 1897,col 12)",
        "(line 1898,col 12)-(line 1898,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.createEntrySet()",
      "begin_line": 1901,
      "end_line": 1904,
      "comment": "",
      "child_ranges": [
        "(line 1903,col 12)-(line 1903,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.getFromKey()",
      "begin_line": 1906,
      "end_line": 1909,
      "comment": "",
      "child_ranges": [
        "(line 1908,col 12)-(line 1908,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.getToKey()",
      "begin_line": 1911,
      "end_line": 1914,
      "comment": "",
      "child_ranges": [
        "(line 1913,col 12)-(line 1913,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.isFromInclusive()",
      "begin_line": 1916,
      "end_line": 1919,
      "comment": "",
      "child_ranges": [
        "(line 1918,col 12)-(line 1918,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.isToInclusive()",
      "begin_line": 1921,
      "end_line": 1924,
      "comment": "",
      "child_ranges": [
        "(line 1923,col 12)-(line 1923,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntryMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 1926,
      "end_line": 1930,
      "comment": "",
      "child_ranges": [
        "(line 1929,col 12)-(line 1929,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RangeEntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 1936,
      "end_line": 2059,
      "comment": "\n     * A {@link Set} view of a {@link RangeMap}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 1938,
      "end_line": 1938,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 1940,
      "end_line": 1940,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 1942,
      "end_line": 1942,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.RangeEntrySet(org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap)",
      "begin_line": 1947,
      "end_line": 1953,
      "comment": "\n         * Creates a {@link RangeEntrySet}.\n         ",
      "child_ranges": [
        "(line 1948,col 13)-(line 1950,col 13)",
        "(line 1952,col 13)-(line 1952,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.iterator()",
      "begin_line": 1955,
      "end_line": 1973,
      "comment": "",
      "child_ranges": [
        "(line 1957,col 13)-(line 1957,col 52)",
        "(line 1958,col 13)-(line 1958,col 48)",
        "(line 1960,col 13)-(line 1960,col 41)",
        "(line 1961,col 13)-(line 1965,col 13)",
        "(line 1967,col 13)-(line 1967,col 40)",
        "(line 1968,col 13)-(line 1970,col 13)",
        "(line 1972,col 13)-(line 1972,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.size()",
      "begin_line": 1975,
      "end_line": 1987,
      "comment": "",
      "child_ranges": [
        "(line 1977,col 13)-(line 1985,col 13)",
        "(line 1986,col 13)-(line 1986,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.isEmpty()",
      "begin_line": 1989,
      "end_line": 1992,
      "comment": "",
      "child_ranges": [
        "(line 1991,col 13)-(line 1991,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.contains(java.lang.Object)",
      "begin_line": 1994,
      "end_line": 2009,
      "comment": "",
      "child_ranges": [
        "(line 1997,col 13)-(line 1999,col 13)",
        "(line 2001,col 13)-(line 2001,col 62)",
        "(line 2002,col 13)-(line 2002,col 41)",
        "(line 2003,col 13)-(line 2005,col 13)",
        "(line 2007,col 13)-(line 2007,col 55)",
        "(line 2008,col 13)-(line 2008,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.remove(java.lang.Object)",
      "begin_line": 2011,
      "end_line": 2030,
      "comment": "",
      "child_ranges": [
        "(line 2014,col 13)-(line 2016,col 13)",
        "(line 2018,col 13)-(line 2018,col 62)",
        "(line 2019,col 13)-(line 2019,col 41)",
        "(line 2020,col 13)-(line 2022,col 13)",
        "(line 2024,col 13)-(line 2024,col 55)",
        "(line 2025,col 13)-(line 2028,col 13)",
        "(line 2029,col 13)-(line 2029,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2035,
      "end_line": 2058,
      "comment": "\n         * An {@link Iterator} for {@link RangeEntrySet}s.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "excludedKey"
      ],
      "begin_line": 2037,
      "end_line": 2037,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.EntryIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2042,
      "end_line": 2045,
      "comment": "\n             * Creates a {@link EntryIterator}.\n             ",
      "child_ranges": [
        "(line 2043,col 17)-(line 2043,col 29)",
        "(line 2044,col 17)-(line 2044,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.hasNext()",
      "begin_line": 2047,
      "end_line": 2050,
      "comment": "",
      "child_ranges": [
        "(line 2049,col 17)-(line 2049,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet.EntryIterator.next()",
      "begin_line": 2052,
      "end_line": 2057,
      "comment": "",
      "child_ranges": [
        "(line 2053,col 17)-(line 2055,col 17)",
        "(line 2056,col 17)-(line 2056,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrefixRangeMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap"
      ],
      "begin_line": 2064,
      "end_line": 2231,
      "comment": "\n     * A submap used for prefix views over the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 2066,
      "end_line": 2066,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsetInBits"
      ],
      "begin_line": 2068,
      "end_line": 2068,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthInBits"
      ],
      "begin_line": 2070,
      "end_line": 2070,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fromKey"
      ],
      "begin_line": 2072,
      "end_line": 2072,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toKey"
      ],
      "begin_line": 2074,
      "end_line": 2074,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 2076,
      "end_line": 2076,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 2078,
      "end_line": 2078,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.PrefixRangeMap(K, int, int)",
      "begin_line": 2083,
      "end_line": 2087,
      "comment": "\n         * Creates a {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2084,col 13)-(line 2084,col 33)",
        "(line 2085,col 13)-(line 2085,col 45)",
        "(line 2086,col 13)-(line 2086,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.fixup()",
      "begin_line": 2095,
      "end_line": 2131,
      "comment": "\n         * This method does two things. It determines the FROM\n         * and TO range of the {@link PrefixRangeMap} and the number\n         * of elements in the range. This method must be called every\n         * time the {@link Trie} has changed.\n         ",
      "child_ranges": [
        "(line 2097,col 13)-(line 2128,col 13)",
        "(line 2130,col 13)-(line 2130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.firstKey()",
      "begin_line": 2133,
      "end_line": 2149,
      "comment": "",
      "child_ranges": [
        "(line 2134,col 13)-(line 2134,col 20)",
        "(line 2136,col 13)-(line 2136,col 36)",
        "(line 2137,col 13)-(line 2141,col 13)",
        "(line 2143,col 13)-(line 2143,col 58)",
        "(line 2144,col 13)-(line 2146,col 13)",
        "(line 2148,col 13)-(line 2148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.lastKey()",
      "begin_line": 2151,
      "end_line": 2167,
      "comment": "",
      "child_ranges": [
        "(line 2152,col 13)-(line 2152,col 20)",
        "(line 2154,col 13)-(line 2154,col 36)",
        "(line 2155,col 13)-(line 2159,col 13)",
        "(line 2161,col 13)-(line 2161,col 57)",
        "(line 2162,col 13)-(line 2164,col 13)",
        "(line 2166,col 13)-(line 2166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inRange(K)",
      "begin_line": 2172,
      "end_line": 2175,
      "comment": "\n         * Returns true if this {@link PrefixRangeMap}\u0027s key is a prefix of the provided key.\n         ",
      "child_ranges": [
        "(line 2174,col 13)-(line 2174,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inRange2(K)",
      "begin_line": 2180,
      "end_line": 2183,
      "comment": "\n         * Same as {@link #inRange(Object)}.\n         ",
      "child_ranges": [
        "(line 2182,col 13)-(line 2182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inFromRange(K, boolean)",
      "begin_line": 2188,
      "end_line": 2191,
      "comment": "\n         * Returns true if the provided Key is in the FROM range of the {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2190,col 13)-(line 2190,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.inToRange(K, boolean)",
      "begin_line": 2196,
      "end_line": 2199,
      "comment": "\n         * Returns true if the provided Key is in the TO range of the {@link PrefixRangeMap}.\n         ",
      "child_ranges": [
        "(line 2198,col 13)-(line 2198,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.createEntrySet()",
      "begin_line": 2201,
      "end_line": 2204,
      "comment": "",
      "child_ranges": [
        "(line 2203,col 13)-(line 2203,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.getFromKey()",
      "begin_line": 2206,
      "end_line": 2209,
      "comment": "",
      "child_ranges": [
        "(line 2208,col 13)-(line 2208,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.getToKey()",
      "begin_line": 2211,
      "end_line": 2214,
      "comment": "",
      "child_ranges": [
        "(line 2213,col 13)-(line 2213,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.isFromInclusive()",
      "begin_line": 2216,
      "end_line": 2219,
      "comment": "",
      "child_ranges": [
        "(line 2218,col 13)-(line 2218,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.isToInclusive()",
      "begin_line": 2221,
      "end_line": 2224,
      "comment": "",
      "child_ranges": [
        "(line 2223,col 13)-(line 2223,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap.createRangeMap(K, boolean, K, boolean)",
      "begin_line": 2226,
      "end_line": 2230,
      "comment": "",
      "child_ranges": [
        "(line 2229,col 13)-(line 2229,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrefixRangeEntrySet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet"
      ],
      "begin_line": 2236,
      "end_line": 2375,
      "comment": "\n     * A prefix {@link RangeEntrySet} view of the {@link Trie}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 2238,
      "end_line": 2238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixStart"
      ],
      "begin_line": 2240,
      "end_line": 2240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedModCount"
      ],
      "begin_line": 2242,
      "end_line": 2242,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.PrefixRangeEntrySet(org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeMap)",
      "begin_line": 2247,
      "end_line": 2250,
      "comment": "\n         * Creates a {@link PrefixRangeEntrySet}.\n         ",
      "child_ranges": [
        "(line 2248,col 13)-(line 2248,col 28)",
        "(line 2249,col 13)-(line 2249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.size()",
      "begin_line": 2252,
      "end_line": 2255,
      "comment": "",
      "child_ranges": [
        "(line 2254,col 13)-(line 2254,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.iterator()",
      "begin_line": 2257,
      "end_line": 2272,
      "comment": "",
      "child_ranges": [
        "(line 2259,col 13)-(line 2262,col 13)",
        "(line 2264,col 13)-(line 2271,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingletonIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2277,
      "end_line": 2308,
      "comment": "\n         * An {@link Iterator} that holds a single {@link TrieEntry}.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 2279,
      "end_line": 2279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hit"
      ],
      "begin_line": 2281,
      "end_line": 2281,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.SingletonIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2283,
      "end_line": 2285,
      "comment": "",
      "child_ranges": [
        "(line 2284,col 17)-(line 2284,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.hasNext()",
      "begin_line": 2287,
      "end_line": 2289,
      "comment": "",
      "child_ranges": [
        "(line 2288,col 17)-(line 2288,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.next()",
      "begin_line": 2291,
      "end_line": 2298,
      "comment": "",
      "child_ranges": [
        "(line 2292,col 17)-(line 2294,col 17)",
        "(line 2296,col 17)-(line 2296,col 22)",
        "(line 2297,col 17)-(line 2297,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.SingletonIterator.remove()",
      "begin_line": 2300,
      "end_line": 2307,
      "comment": "",
      "child_ranges": [
        "(line 2301,col 17)-(line 2303,col 17)",
        "(line 2305,col 17)-(line 2305,col 22)",
        "(line 2306,col 17)-(line 2306,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 2313,
      "end_line": 2374,
      "comment": "\n         * An {@link Iterator} for iterating over a prefix search.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 2316,
      "end_line": 2316,
      "comment": " values to reset the subtree if we remove it."
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 2317,
      "end_line": 2317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthInBits"
      ],
      "begin_line": 2318,
      "end_line": 2318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastOne"
      ],
      "begin_line": 2319,
      "end_line": 2319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "subtree"
      ],
      "begin_line": 2321,
      "end_line": 2321,
      "comment": " the subtree to search within"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.EntryIterator(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e, K, int, int)",
      "begin_line": 2327,
      "end_line": 2334,
      "comment": "\n             * Starts iteration at the given entry \u0026 search only\n             * within the given subtree.\n             ",
      "child_ranges": [
        "(line 2329,col 17)-(line 2329,col 36)",
        "(line 2330,col 17)-(line 2330,col 71)",
        "(line 2331,col 17)-(line 2331,col 37)",
        "(line 2332,col 17)-(line 2332,col 37)",
        "(line 2333,col 17)-(line 2333,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.next()",
      "begin_line": 2336,
      "end_line": 2342,
      "comment": "",
      "child_ranges": [
        "(line 2337,col 17)-(line 2337,col 58)",
        "(line 2338,col 17)-(line 2340,col 17)",
        "(line 2341,col 17)-(line 2341,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.findNext(org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry\u003cK, V\u003e)",
      "begin_line": 2344,
      "end_line": 2347,
      "comment": "",
      "child_ranges": [
        "(line 2346,col 17)-(line 2346,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.PrefixRangeEntrySet.EntryIterator.remove()",
      "begin_line": 2349,
      "end_line": 2373,
      "comment": "",
      "child_ranges": [
        "(line 2353,col 17)-(line 2353,col 44)",
        "(line 2354,col 17)-(line 2354,col 52)",
        "(line 2355,col 17)-(line 2357,col 17)",
        "(line 2359,col 17)-(line 2359,col 31)",
        "(line 2363,col 17)-(line 2365,col 17)",
        "(line 2370,col 17)-(line 2372,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.readObject(java.io.ObjectInputStream)",
      "begin_line": 2382,
      "end_line": 2392,
      "comment": "\n     * Reads the content of the stream.\n     ",
      "child_ranges": [
        "(line 2384,col 9)-(line 2384,col 35)",
        "(line 2385,col 9)-(line 2385,col 51)",
        "(line 2386,col 9)-(line 2386,col 36)",
        "(line 2387,col 9)-(line 2391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.trie.AbstractPatriciaTrie.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 2397,
      "end_line": 2404,
      "comment": "\n     * Writes the content to the stream for serialization.\n     ",
      "child_ranges": [
        "(line 2398,col 9)-(line 2398,col 36)",
        "(line 2399,col 9)-(line 2399,col 37)",
        "(line 2400,col 9)-(line 2403,col 9)"
      ]
    }
  ]
}