{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/map/StaticBucketMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StaticBucketMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractIterableMap\u003cK, V\u003e"
      ],
      "begin_line": 96,
      "end_line": 718,
      "comment": "\n * A StaticBucketMap is an efficient, thread-safe implementation of\n * \u003ccode\u003ejava.util.Map\u003c/code\u003e that performs well in in a highly\n * thread-contentious environment.  The map supports very efficient\n * {@link #get(Object) get}, {@link #put(Object,Object) put},\n * {@link #remove(Object) remove} and {@link #containsKey(Object) containsKey}\n * operations, assuming (approximate) uniform hashing and\n * that the number of entries does not exceed the number of buckets.  If the\n * number of entries exceeds the number of buckets or if the hash codes of the\n * objects are not uniformly distributed, these operations have a worst case\n * scenario that is proportional to the number of elements in the map\n * (\u003ci\u003eO(n)\u003c/i\u003e).\u003cp\u003e\n *\n * Each bucket in the hash table has its own monitor, so two threads can\n * safely operate on the map at the same time, often without incurring any\n * monitor contention.  This means that you don\u0027t have to wrap instances\n * of this class with {@link java.util.Collections#synchronizedMap(Map)};\n * instances are already thread-safe.  Unfortunately, however, this means\n * that this map implementation behaves in ways you may find disconcerting.\n * Bulk operations, such as {@link #putAll(Map) putAll} or the\n * {@link Collection#retainAll(Collection) retainAll} operation in collection\n * views, are \u003ci\u003enot\u003c/i\u003e atomic.  If two threads are simultaneously\n * executing\n *\n * \u003cpre\u003e\n *   staticBucketMapInstance.putAll(map);\n * \u003c/pre\u003e\n *\n * and\n *\n * \u003cpre\u003e\n *   staticBucketMapInstance.entrySet().removeAll(map.entrySet());\n * \u003c/pre\u003e\n *\n * then the results are generally random.  Those two statement could cancel\n * each other out, leaving \u003ccode\u003estaticBucketMapInstance\u003c/code\u003e essentially\n * unchanged, or they could leave some random subset of \u003ccode\u003emap\u003c/code\u003e in\n * \u003ccode\u003estaticBucketMapInstance\u003c/code\u003e.\u003cp\u003e\n *\n * Also, much like an encyclopedia, the results of {@link #size()} and\n * {@link #isEmpty()} are out-of-date as soon as they are produced.\u003cp\u003e\n *\n * The iterators returned by the collection views of this class are \u003ci\u003enot\u003c/i\u003e\n * fail-fast.  They will \u003ci\u003enever\u003c/i\u003e raise a\n * {@link java.util.ConcurrentModificationException}.  Keys and values\n * added to the map after the iterator is created do not necessarily appear\n * during iteration.  Similarly, the iterator does not necessarily fail to\n * return keys and values that were removed after the iterator was created.\u003cp\u003e\n *\n * Finally, unlike {@link java.util.HashMap}-style implementations, this\n * class \u003ci\u003enever\u003c/i\u003e rehashes the map.  The number of buckets is fixed\n * at construction time and never altered.  Performance may degrade if\n * you do not allocate enough buckets upfront.\u003cp\u003e\n *\n * The {@link #atomic(Runnable)} method is provided to allow atomic iterations\n * and bulk operations; however, overuse of {@link #atomic(Runnable) atomic}\n * will basically result in a map that\u0027s slower than an ordinary synchronized\n * {@link java.util.HashMap}.\n *\n * Use this class if you do not require reliable bulk operations and\n * iterations, or if you can make your own guarantees about how bulk\n * operations will affect the map.\u003cp\u003e\n *\n * @since 3.0 (previously in main package v2.1)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BUCKETS"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The default number of buckets to use "
    },
    {
      "type": "field",
      "varNames": [
        "buckets"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The array of buckets, where the actual data is held "
    },
    {
      "type": "field",
      "varNames": [
        "locks"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The matching array of locks "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.StaticBucketMap()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Initializes the map with the default number of buckets (255).\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.StaticBucketMap(int)",
      "begin_line": 122,
      "end_line": 137,
      "comment": "\n     * Initializes the map with a specified number of buckets.  The number\n     * of buckets is never below 17, and is always an odd number (StaticBucketMap\n     * ensures this). The number of buckets is inversely proportional to the\n     * chances for thread contention.  The fewer buckets, the more chances for\n     * thread contention.  The more buckets the fewer chances for thread\n     * contention.\n     *\n     * @param numBuckets  the number of buckets for this map\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 134,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.getHash(java.lang.Object)",
      "begin_line": 153,
      "end_line": 166,
      "comment": "\n     * Determine the exact hash entry for the key.  The hash algorithm\n     * is rather simplistic, but it does the job:\n     *\n     * \u003cpre\u003e\n     *   He \u003d |Hk mod n|\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\n     *   He is the entry\u0027s hashCode, Hk is the key\u0027s hashCode, and n is\n     *   the number of buckets.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 30)",
        "(line 159,col 9)-(line 159,col 30)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 162,col 9)-(line 162,col 30)",
        "(line 163,col 9)-(line 163,col 30)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 165,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.size()",
      "begin_line": 174,
      "end_line": 183,
      "comment": "\n     * Gets the current size of the map.\n     * The value is computed fresh each time the method is called.\n     *\n     * @return the current size\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 20)",
        "(line 177,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.isEmpty()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Checks if the size is currently zero.\n     *\n     * @return true if empty\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.get(java.lang.Object)",
      "begin_line": 200,
      "end_line": 215,
      "comment": "\n     * Gets the value associated with the key.\n     *\n     * @param key  the key to retrieve\n     * @return the associated value\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 38)",
        "(line 203,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.containsKey(java.lang.Object)",
      "begin_line": 223,
      "end_line": 238,
      "comment": "\n     * Checks if the map contains the specified key.\n     *\n     * @param key  the key to check\n     * @return true if found\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)",
        "(line 226,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.containsValue(java.lang.Object)",
      "begin_line": 246,
      "end_line": 261,
      "comment": "\n     * Checks if the map contains the specified value.\n     *\n     * @param value  the value to check\n     * @return true if found\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.put(K, V)",
      "begin_line": 271,
      "end_line": 308,
      "comment": "\n     * Puts a new key value mapping into the map.\n     *\n     * @param key  the key to use\n     * @param value  the value to use\n     * @return the previous mapping for the key\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 38)",
        "(line 274,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.remove(java.lang.Object)",
      "begin_line": 316,
      "end_line": 342,
      "comment": "\n     * Removes the specified key from the map.\n     *\n     * @param key  the key to remove\n     * @return the previous value at this key\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 38)",
        "(line 319,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.keySet()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Gets the key set.\n     *\n     * @return the key set\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.values()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Gets the values.\n     *\n     * @return the values\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.entrySet()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Gets the entry set.\n     *\n     * @return the entry set\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 379,
      "end_line": 383,
      "comment": "\n     * Puts all the entries from the specified map into this map.\n     * This operation is \u003cb\u003enot atomic\u003c/b\u003e and may have undesired effects.\n     *\n     * @param map  the map of entries to add\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.clear()",
      "begin_line": 388,
      "end_line": 396,
      "comment": "\n     * Clears the map of all entries.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.equals(java.lang.Object)",
      "begin_line": 404,
      "end_line": 414,
      "comment": "\n     * Compares this map to another, as per the Map specification.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 48)",
        "(line 413,col 9)-(line 413,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.hashCode()",
      "begin_line": 421,
      "end_line": 436,
      "comment": "\n     * Gets the hash code, as per the Map specification.\n     *\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 25)",
        "(line 425,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Node",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e",
        "org.apache.commons.collections4.KeyValue\u003cK, V\u003e"
      ],
      "begin_line": 442,
      "end_line": 481,
      "comment": "\n     * The Map.Entry for the StaticBucketMap.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.getKey()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 448,col 13)-(line 448,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.getValue()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.hashCode()",
      "begin_line": 455,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 457,col 13)-(line 458,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.equals(java.lang.Object)",
      "begin_line": 461,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 465,col 13)",
        "(line 466,col 13)-(line 468,col 13)",
        "(line 470,col 13)-(line 470,col 61)",
        "(line 471,col 13)-(line 473,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Node.setValue(V)",
      "begin_line": 476,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 35)",
        "(line 478,col 13)-(line 478,col 24)",
        "(line 479,col 13)-(line 479,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Lock",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * The lock object, which also includes a count of the nodes in this lock.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BaseIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 491,
      "end_line": 531,
      "comment": "-----------------------------------------------------------------------"
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bucket"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.hasNext()",
      "begin_line": 496,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 497,col 13)-(line 499,col 13)",
        "(line 500,col 13)-(line 512,col 13)",
        "(line 513,col 13)-(line 513,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.nextEntry()",
      "begin_line": 516,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 519,col 13)",
        "(line 520,col 13)-(line 520,col 54)",
        "(line 521,col 13)-(line 521,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator.remove()",
      "begin_line": 524,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 55)",
        "(line 529,col 13)-(line 529,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 533,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntryIterator.next()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValueIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 541,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.ValueIterator.next()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 544,col 13)-(line 544,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeyIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.StaticBucketMap.BaseIterator",
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 549,
      "end_line": 555,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeyIterator.next()",
      "begin_line": 551,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 13)-(line 552,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 557,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.size()",
      "begin_line": 559,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.clear()",
      "begin_line": 564,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.iterator()",
      "begin_line": 569,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 571,col 13)-(line 571,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.contains(java.lang.Object)",
      "begin_line": 574,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 64)",
        "(line 577,col 13)-(line 577,col 53)",
        "(line 578,col 13)-(line 584,col 13)",
        "(line 585,col 13)-(line 585,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.EntrySet.remove(java.lang.Object)",
      "begin_line": 588,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 590,col 13)-(line 592,col 13)",
        "(line 593,col 13)-(line 593,col 64)",
        "(line 594,col 13)-(line 594,col 53)",
        "(line 595,col 13)-(line 602,col 13)",
        "(line 603,col 13)-(line 603,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 608,
      "end_line": 645,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.size()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 13)-(line 612,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.clear()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 13)-(line 617,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.iterator()",
      "begin_line": 620,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 13)-(line 622,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.contains(java.lang.Object)",
      "begin_line": 625,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 627,col 13)-(line 627,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.KeySet.remove(java.lang.Object)",
      "begin_line": 630,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 632,col 13)-(line 632,col 42)",
        "(line 633,col 13)-(line 641,col 13)",
        "(line 642,col 13)-(line 642,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 648,
      "end_line": 665,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.size()",
      "begin_line": 650,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 652,col 13)-(line 652,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.clear()",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.Values.iterator()",
      "begin_line": 660,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 662,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.atomic(java.lang.Runnable)",
      "begin_line": 701,
      "end_line": 706,
      "comment": "\n     *  Prevents any operations from occurring on this map while the\n     *  given {@link Runnable} executes.  This method can be used, for\n     *  instance, to execute a bulk operation atomically:\n     *\n     *  \u003cpre\u003e\n     *    staticBucketMapInstance.atomic(new Runnable() {\n     *        public void run() {\n     *            staticBucketMapInstance.putAll(map);\n     *        }\n     *    });\n     *  \u003c/pre\u003e\n     *\n     *  It can also be used if you need a reliable iterator:\n     *\n     *  \u003cpre\u003e\n     *    staticBucketMapInstance.atomic(new Runnable() {\n     *        public void run() {\n     *            Iterator iterator \u003d staticBucketMapInstance.iterator();\n     *            while (iterator.hasNext()) {\n     *                foo(iterator.next();\n     *            }\n     *        }\n     *    });\n     *  \u003c/pre\u003e\n     *\n     *  \u003cb\u003eImplementation note:\u003c/b\u003e This method requires a lot of time\n     *  and a ton of stack space.  Essentially a recursive algorithm is used\n     *  to enter each bucket\u0027s monitor.  If you have twenty thousand buckets\n     *  in your map, then the recursive method will be invoked twenty thousand\n     *  times.  You have been warned.\n     *\n     *  @param r  the code to execute atomically\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.StaticBucketMap.atomic(java.lang.Runnable, int)",
      "begin_line": 708,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 715,col 9)"
      ]
    }
  ]
}