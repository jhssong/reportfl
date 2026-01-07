{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/Flat3Map.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Flat3Map",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.IterableMap\u003cK, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 73,
      "end_line": 1275,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that stores data in simple fields until\n * the size is greater than 3.\n * \u003cp\u003e\n * This map is designed for performance and can outstrip HashMap.\n * It also has good garbage collection characteristics.\n * \u003cul\u003e\n * \u003cli\u003eOptimised for operation at size 3 or less.\n * \u003cli\u003eStill works well once size 3 exceeded.\n * \u003cli\u003eGets at size 3 or less are about 0-10% faster than HashMap,\n * \u003cli\u003ePuts at size 3 or less are over 4 times faster than HashMap.\n * \u003cli\u003ePerformance 5% slower than HashMap once size 3 exceeded once.\n * \u003c/ul\u003e\n * The design uses two distinct modes of operation - flat and delegate.\n * While the map is size 3 or less, operations map straight onto fields using\n * switch statements. Once size 4 is reached, the map switches to delegate mode\n * and only switches back when cleared. In delegate mode, all operations are\n * forwarded straight to a HashMap resulting in the 5% performance loss.\n * \u003cp\u003e\n * The performance gains on puts are due to not needing to create a Map Entry\n * object. This is a large saving not only in performance but in garbage collection.\n * \u003cp\u003e\n * Whilst in flat mode this map is also easy for the garbage collector to dispatch.\n * This is because it contains no complex objects or arrays which slow the progress.\n * \u003cp\u003e\n * Do not use \u003ccode\u003eFlat3Map\u003c/code\u003e if the size is likely to grow beyond 3.\n * \u003cp\u003e\n * \u003cstrong\u003eNote that Flat3Map is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. The simplest approach is to wrap this map\n * using {@link java.util.Collections#synchronizedMap(Map)}. This class may throw\n * exceptions when accessed by concurrent threads without synchronization.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The size of the map, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "hash1"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Hash, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "hash2"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Hash, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "hash3"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Hash, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "key1"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Key, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "key2"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Key, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "key3"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Key, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "value1"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Value, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "value2"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Value, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "value3"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Value, used while in flat mode "
    },
    {
      "type": "field",
      "varNames": [
        "delegateMap"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Map, used while in delegate mode "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Flat3Map()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Constructor.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Flat3Map(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Constructor copying elements from another map.\n     *\n     * @param map  the map to copy\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.get(java.lang.Object)",
      "begin_line": 126,
      "end_line": 168,
      "comment": "\n     * Gets the value mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.size()",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n     * Gets the size of the map.\n     *\n     * @return the size\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.isEmpty()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Checks whether the map is currently empty.\n     *\n     * @return true if the map is currently size zero\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.containsKey(java.lang.Object)",
      "begin_line": 200,
      "end_line": 240,
      "comment": "\n     * Checks whether the map contains the specified key.\n     *\n     * @param key  the key to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.containsValue(java.lang.Object)",
      "begin_line": 248,
      "end_line": 285,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.put(K, V)",
      "begin_line": 295,
      "end_line": 372,
      "comment": "\n     * Puts a key-value mapping into this map.\n     *\n     * @param key  the key to add\n     * @param value  the value to add\n     * @return the value previously mapped to this key, null if none\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 346,col 9)",
        "(line 349,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 15)",
        "(line 371,col 9)-(line 371,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 380,
      "end_line": 398,
      "comment": "\n     * Puts all the values from the specified map into this map.\n     *\n     * @param map  the map to add\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 36)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.convertToMap()",
      "begin_line": 403,
      "end_line": 422,
      "comment": "\n     * Converts the flat map data to a map.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 42)",
        "(line 405,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 17)",
        "(line 419,col 9)-(line 419,col 34)",
        "(line 420,col 9)-(line 420,col 34)",
        "(line 421,col 9)-(line 421,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.createDelegateMap()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Create an instance of the map used for storage when in delegation mode.\n     * \u003cp\u003e\n     * This can be overridden by subclasses to provide a different map implementation.\n     * Not every AbstractHashedMap is suitable, identity and reference based maps\n     * would be poor choices.\n     *\n     * @return a new AbstractHashedMap or subclass\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.remove(java.lang.Object)",
      "begin_line": 444,
      "end_line": 587,
      "comment": "\n     * Removes the specified mapping from this map.\n     *\n     * @param key  the mapping to remove\n     * @return the value mapped to the removed key, null if key not in map\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.clear()",
      "begin_line": 593,
      "end_line": 604,
      "comment": "\n     * Clears the map, resetting the size to zero and nullifying references\n     * to avoid garbage collection issues.\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.mapIterator()",
      "begin_line": 618,
      "end_line": 627,
      "comment": "\n     * Gets an iterator over the map.\n     * Changes made to the iterator affect this map.\n     * \u003cp\u003e\n     * A MapIterator returns the keys in the map. It also provides convenient\n     * methods to get the key and value, and set the value.\n     * It avoids the need to create an entrySet/keySet/values object.\n     * It also avoids creating the Map Entry object.\n     *\n     * @return the map iterator\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlatMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.ResettableIterator\u003cK\u003e"
      ],
      "begin_line": 632,
      "end_line": 734,
      "comment": "\n     * FlatMapIterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 634,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 635,
      "end_line": 635,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.FlatMapIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 638,col 13)-(line 638,col 20)",
        "(line 639,col 13)-(line 639,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.hasNext()",
      "begin_line": 642,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 13)-(line 644,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.next()",
      "begin_line": 647,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 649,col 13)-(line 651,col 13)",
        "(line 652,col 13)-(line 652,col 29)",
        "(line 653,col 13)-(line 653,col 24)",
        "(line 654,col 13)-(line 654,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.remove()",
      "begin_line": 657,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 659,col 13)-(line 661,col 13)",
        "(line 662,col 13)-(line 662,col 36)",
        "(line 663,col 13)-(line 663,col 24)",
        "(line 664,col 13)-(line 664,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.getKey()",
      "begin_line": 667,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 669,col 13)-(line 671,col 13)",
        "(line 672,col 13)-(line 679,col 13)",
        "(line 680,col 13)-(line 680,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.getValue()",
      "begin_line": 683,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 685,col 13)-(line 687,col 13)",
        "(line 688,col 13)-(line 695,col 13)",
        "(line 696,col 13)-(line 696,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.setValue(V)",
      "begin_line": 699,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 701,col 13)-(line 703,col 13)",
        "(line 704,col 13)-(line 704,col 37)",
        "(line 705,col 13)-(line 717,col 13)",
        "(line 718,col 13)-(line 718,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.reset()",
      "begin_line": 721,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 723,col 13)-(line 723,col 26)",
        "(line 724,col 13)-(line 724,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.toString()",
      "begin_line": 727,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 729,col 13)-(line 731,col 13)",
        "(line 732,col 13)-(line 732,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.entrySet()",
      "begin_line": 746,
      "end_line": 752,
      "comment": "\n     * Gets the entrySet view of the map.\n     * Changes made to the view affect this map.\n     * \u003cp\u003e\n     * NOTE: from 4.0, the returned Map Entry will be an independent object and will\n     * not change anymore as the iterator progresses. To avoid this additional object\n     * creation and simply iterate through the entries, use {@link #mapIterator()}.\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 757,
      "end_line": 797,
      "comment": "\n     * EntrySet\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 758,
      "end_line": 758,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.EntrySet(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 760,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 761,col 13)-(line 761,col 20)",
        "(line 762,col 13)-(line 762,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.size()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 767,col 13)-(line 767,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.clear()",
      "begin_line": 770,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 772,col 13)-(line 772,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.remove(java.lang.Object)",
      "begin_line": 775,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 777,col 13)-(line 779,col 13)",
        "(line 780,col 13)-(line 780,col 64)",
        "(line 781,col 13)-(line 781,col 46)",
        "(line 782,col 13)-(line 782,col 59)",
        "(line 783,col 13)-(line 783,col 31)",
        "(line 784,col 13)-(line 784,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.iterator()",
      "begin_line": 787,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 789,col 13)-(line 791,col 13)",
        "(line 792,col 13)-(line 794,col 13)",
        "(line 795,col 13)-(line 795,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlatMapEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e"
      ],
      "begin_line": 799,
      "end_line": 911,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 801,
      "end_line": 801,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removed"
      ],
      "begin_line": 802,
      "end_line": 802,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.FlatMapEntry(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e, int)",
      "begin_line": 804,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 805,col 13)-(line 805,col 33)",
        "(line 806,col 13)-(line 806,col 31)",
        "(line 807,col 13)-(line 807,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.setRemoved(boolean)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n         * Used by the iterator that created this entry to indicate that\n         * {@link java.util.Iterator#remove()} has been called.\n         * \u003cp\u003e\n         * As a consequence, all subsequent call to {@link #getKey()},\n         * {@link #setValue(Object)} and {@link #getValue()} will fail.\n         *\n         * @param flag\n         ",
      "child_ranges": [
        "(line 820,col 13)-(line 820,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.getKey()",
      "begin_line": 823,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 825,col 13)-(line 827,col 13)",
        "(line 828,col 13)-(line 835,col 13)",
        "(line 836,col 13)-(line 836,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.getValue()",
      "begin_line": 839,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 841,col 13)-(line 843,col 13)",
        "(line 844,col 13)-(line 851,col 13)",
        "(line 852,col 13)-(line 852,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.setValue(V)",
      "begin_line": 855,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 857,col 13)-(line 859,col 13)",
        "(line 860,col 13)-(line 860,col 37)",
        "(line 861,col 13)-(line 873,col 13)",
        "(line 874,col 13)-(line 874,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.equals(java.lang.Object)",
      "begin_line": 877,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 879,col 13)-(line 881,col 13)",
        "(line 882,col 13)-(line 884,col 13)",
        "(line 885,col 13)-(line 885,col 64)",
        "(line 886,col 13)-(line 886,col 40)",
        "(line 887,col 13)-(line 887,col 44)",
        "(line 888,col 13)-(line 889,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.hashCode()",
      "begin_line": 892,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 894,col 13)-(line 896,col 13)",
        "(line 897,col 13)-(line 897,col 40)",
        "(line 898,col 13)-(line 898,col 44)",
        "(line 899,col 13)-(line 900,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.toString()",
      "begin_line": 903,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 907,col 13)",
        "(line 908,col 13)-(line 908,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 913,
      "end_line": 947,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 914,
      "end_line": 914,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 916,
      "end_line": 916,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.EntryIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\n         * Create a new Flat3Map.EntryIterator.\n         ",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.hasNext()",
      "begin_line": 925,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 926,col 13)-(line 926,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.nextEntry()",
      "begin_line": 929,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 930,col 13)-(line 932,col 13)",
        "(line 933,col 13)-(line 933,col 71)",
        "(line 934,col 13)-(line 934,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.remove()",
      "begin_line": 937,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 938,col 13)-(line 940,col 13)",
        "(line 941,col 13)-(line 941,col 42)",
        "(line 942,col 13)-(line 942,col 49)",
        "(line 943,col 13)-(line 943,col 24)",
        "(line 944,col 13)-(line 944,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.Flat3Map.EntryIterator\u003cK, V\u003e",
        "java.util.Iterator\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 952,
      "end_line": 961,
      "comment": "\n     * EntrySetIterator and MapEntry\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySetIterator.EntrySetIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 953,
      "end_line": 955,
      "comment": "",
      "child_ranges": [
        "(line 954,col 13)-(line 954,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySetIterator.next()",
      "begin_line": 957,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 959,col 13)-(line 959,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.keySet()",
      "begin_line": 970,
      "end_line": 976,
      "comment": "\n     * Gets the keySet view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the keys, use {@link #mapIterator()}.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 981,
      "end_line": 1021,
      "comment": "\n     * KeySet\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.KeySet(org.apache.commons.collections4.map.Flat3Map\u003cK, ?\u003e)",
      "begin_line": 984,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 985,col 13)-(line 985,col 20)",
        "(line 986,col 13)-(line 986,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.size()",
      "begin_line": 989,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 991,col 13)-(line 991,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.clear()",
      "begin_line": 994,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 996,col 13)-(line 996,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.contains(java.lang.Object)",
      "begin_line": 999,
      "end_line": 1002,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.remove(java.lang.Object)",
      "begin_line": 1004,
      "end_line": 1009,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 13)-(line 1006,col 59)",
        "(line 1007,col 13)-(line 1007,col 31)",
        "(line 1008,col 13)-(line 1008,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.iterator()",
      "begin_line": 1011,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1013,col 13)-(line 1015,col 13)",
        "(line 1016,col 13)-(line 1018,col 13)",
        "(line 1019,col 13)-(line 1019,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.Flat3Map.EntryIterator\u003cK, java.lang.Object\u003e",
        "java.util.Iterator\u003cK\u003e"
      ],
      "begin_line": 1026,
      "end_line": 1037,
      "comment": "\n     * KeySetIterator\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySetIterator.KeySetIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, ?\u003e)",
      "begin_line": 1028,
      "end_line": 1031,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 13)-(line 1030,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySetIterator.next()",
      "begin_line": 1033,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 13)-(line 1035,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.values()",
      "begin_line": 1046,
      "end_line": 1052,
      "comment": "\n     * Gets the values view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the values, use {@link #mapIterator()}.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 1057,
      "end_line": 1090,
      "comment": "\n     * Values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1058,
      "end_line": 1058,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.Values(org.apache.commons.collections4.map.Flat3Map\u003c?, V\u003e)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 13)-(line 1061,col 20)",
        "(line 1062,col 13)-(line 1062,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.size()",
      "begin_line": 1065,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1067,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.clear()",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 13)-(line 1072,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.contains(java.lang.Object)",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 13)-(line 1077,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.iterator()",
      "begin_line": 1080,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 13)-(line 1084,col 13)",
        "(line 1085,col 13)-(line 1087,col 13)",
        "(line 1088,col 13)-(line 1088,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ValuesIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.Flat3Map.EntryIterator\u003cjava.lang.Object, V\u003e",
        "java.util.Iterator\u003cV\u003e"
      ],
      "begin_line": 1095,
      "end_line": 1106,
      "comment": "\n     * ValuesIterator\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.ValuesIterator.ValuesIterator(org.apache.commons.collections4.map.Flat3Map\u003c?, V\u003e)",
      "begin_line": 1097,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 13)-(line 1099,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.ValuesIterator.next()",
      "begin_line": 1102,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 13)-(line 1104,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1112,
      "end_line": 1119,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 33)",
        "(line 1114,col 9)-(line 1114,col 29)",
        "(line 1115,col 9)-(line 1118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.readObject(java.io.ObjectInputStream)",
      "begin_line": 1124,
      "end_line": 1134,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 31)",
        "(line 1127,col 9)-(line 1127,col 39)",
        "(line 1128,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.clone()",
      "begin_line": 1143,
      "end_line": 1155,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.equals(java.lang.Object)",
      "begin_line": 1163,
      "end_line": 1208,
      "comment": "\n     * Compares this map with another.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1174,col 48)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1178,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.hashCode()",
      "begin_line": 1215,
      "end_line": 1234,
      "comment": "\n     * Gets the standard Map hashCode.\n     *\n     * @return the hash code defined in the Map interface\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1220,col 22)",
        "(line 1221,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.toString()",
      "begin_line": 1241,
      "end_line": 1273,
      "comment": "\n     * Gets the map as a String.\n     *\n     * @return a string version of the map\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1249,col 57)",
        "(line 1250,col 9)-(line 1250,col 24)",
        "(line 1251,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 24)",
        "(line 1272,col 9)-(line 1272,col 30)"
      ]
    }
  ]
}