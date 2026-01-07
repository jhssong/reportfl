{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/map/Flat3Map.java",
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
      "end_line": 1249,
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
      "end_line": 167,
      "comment": "\n     * Gets the value mapped to the key specified.\n     *\n     * @param key  the key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.size()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * Gets the size of the map.\n     *\n     * @return the size\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.isEmpty()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Checks whether the map is currently empty.\n     *\n     * @return true if the map is currently size zero\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.containsKey(java.lang.Object)",
      "begin_line": 197,
      "end_line": 236,
      "comment": "\n     * Checks whether the map contains the specified key.\n     *\n     * @param key  the key to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.containsValue(java.lang.Object)",
      "begin_line": 244,
      "end_line": 280,
      "comment": "\n     * Checks whether the map contains the specified value.\n     *\n     * @param value  the value to search for\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.put(K, V)",
      "begin_line": 290,
      "end_line": 366,
      "comment": "\n     * Puts a key-value mapping into this map.\n     *\n     * @param key  the key to add\n     * @param value  the value to add\n     * @return the value previously mapped to this key, null if none\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 340,col 9)",
        "(line 343,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 15)",
        "(line 365,col 9)-(line 365,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 374,
      "end_line": 391,
      "comment": "\n     * Puts all the values from the specified map into this map.\n     *\n     * @param map  the map to add\n     * @throws NullPointerException if the map is null\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.convertToMap()",
      "begin_line": 396,
      "end_line": 415,
      "comment": "\n     * Converts the flat map data to a map.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 42)",
        "(line 398,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 17)",
        "(line 412,col 9)-(line 412,col 34)",
        "(line 413,col 9)-(line 413,col 34)",
        "(line 414,col 9)-(line 414,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.createDelegateMap()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Create an instance of the map used for storage when in delegation mode.\n     * \u003cp\u003e\n     * This can be overridden by subclasses to provide a different map implementation.\n     * Not every AbstractHashedMap is suitable, identity and reference based maps\n     * would be poor choices.\n     *\n     * @return a new AbstractHashedMap or subclass\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.remove(java.lang.Object)",
      "begin_line": 437,
      "end_line": 579,
      "comment": "\n     * Removes the specified mapping from this map.\n     *\n     * @param key  the mapping to remove\n     * @return the value mapped to the removed key, null if key not in map\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.clear()",
      "begin_line": 585,
      "end_line": 595,
      "comment": "\n     * Clears the map, resetting the size to zero and nullifying references\n     * to avoid garbage collection issues.\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.mapIterator()",
      "begin_line": 609,
      "end_line": 617,
      "comment": "\n     * Gets an iterator over the map.\n     * Changes made to the iterator affect this map.\n     * \u003cp\u003e\n     * A MapIterator returns the keys in the map. It also provides convenient\n     * methods to get the key and value, and set the value.\n     * It avoids the need to create an entrySet/keySet/values object.\n     * It also avoids creating the Map Entry object.\n     *\n     * @return the map iterator\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 47)"
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
      "begin_line": 622,
      "end_line": 717,
      "comment": "\n     * FlatMapIterator\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canRemove"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.FlatMapIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 20)",
        "(line 629,col 13)-(line 629,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.hasNext()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.next()",
      "begin_line": 636,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 637,col 13)-(line 639,col 13)",
        "(line 640,col 13)-(line 640,col 29)",
        "(line 641,col 13)-(line 641,col 24)",
        "(line 642,col 13)-(line 642,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.remove()",
      "begin_line": 645,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 646,col 13)-(line 648,col 13)",
        "(line 649,col 13)-(line 649,col 36)",
        "(line 650,col 13)-(line 650,col 24)",
        "(line 651,col 13)-(line 651,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.getKey()",
      "begin_line": 654,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 655,col 13)-(line 657,col 13)",
        "(line 658,col 13)-(line 665,col 13)",
        "(line 666,col 13)-(line 666,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.getValue()",
      "begin_line": 669,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 670,col 13)-(line 672,col 13)",
        "(line 673,col 13)-(line 680,col 13)",
        "(line 681,col 13)-(line 681,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.setValue(V)",
      "begin_line": 684,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 685,col 13)-(line 687,col 13)",
        "(line 688,col 13)-(line 688,col 37)",
        "(line 689,col 13)-(line 701,col 13)",
        "(line 702,col 13)-(line 702,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.reset()",
      "begin_line": 705,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 706,col 13)-(line 706,col 26)",
        "(line 707,col 13)-(line 707,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapIterator.toString()",
      "begin_line": 710,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 712,col 13)-(line 714,col 13)",
        "(line 715,col 13)-(line 715,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.entrySet()",
      "begin_line": 729,
      "end_line": 734,
      "comment": "\n     * Gets the entrySet view of the map.\n     * Changes made to the view affect this map.\n     * \u003cp\u003e\n     * NOTE: from 4.0, the returned Map Entry will be an independent object and will\n     * not change anymore as the iterator progresses. To avoid this additional object\n     * creation and simply iterate through the entries, use {@link #mapIterator()}.\n     *\n     * @return the entrySet view\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntrySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cjava.util.Map.Entry\u003cK, V\u003e\u003e"
      ],
      "begin_line": 739,
      "end_line": 779,
      "comment": "\n     * EntrySet\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 740,
      "end_line": 740,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.EntrySet(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 742,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 743,col 13)-(line 743,col 20)",
        "(line 744,col 13)-(line 744,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.size()",
      "begin_line": 747,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.clear()",
      "begin_line": 752,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 754,col 13)-(line 754,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.remove(java.lang.Object)",
      "begin_line": 757,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 759,col 13)-(line 761,col 13)",
        "(line 762,col 13)-(line 762,col 64)",
        "(line 763,col 13)-(line 763,col 46)",
        "(line 764,col 13)-(line 764,col 59)",
        "(line 765,col 13)-(line 765,col 31)",
        "(line 766,col 13)-(line 766,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySet.iterator()",
      "begin_line": 769,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 771,col 13)-(line 773,col 13)",
        "(line 774,col 13)-(line 776,col 13)",
        "(line 777,col 13)-(line 777,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlatMapEntry",
      "is_interface": false,
      "parent_types": [
        "java.util.Map.Entry\u003cK, V\u003e"
      ],
      "begin_line": 781,
      "end_line": 890,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 783,
      "end_line": 783,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removed"
      ],
      "begin_line": 784,
      "end_line": 784,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.FlatMapEntry(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e, int)",
      "begin_line": 786,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 787,col 13)-(line 787,col 33)",
        "(line 788,col 13)-(line 788,col 31)",
        "(line 789,col 13)-(line 789,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.setRemoved(boolean)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n         * Used by the iterator that created this entry to indicate that\n         * {@link java.util.Iterator#remove()} has been called.\n         * \u003cp\u003e\n         * As a consequence, all subsequent call to {@link #getKey()},\n         * {@link #setValue(Object)} and {@link #getValue()} will fail.\n         *\n         * @param flag\n         ",
      "child_ranges": [
        "(line 802,col 13)-(line 802,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.getKey()",
      "begin_line": 805,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 806,col 13)-(line 808,col 13)",
        "(line 809,col 13)-(line 816,col 13)",
        "(line 817,col 13)-(line 817,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.getValue()",
      "begin_line": 820,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 821,col 13)-(line 823,col 13)",
        "(line 824,col 13)-(line 831,col 13)",
        "(line 832,col 13)-(line 832,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.setValue(V)",
      "begin_line": 835,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 836,col 13)-(line 838,col 13)",
        "(line 839,col 13)-(line 839,col 37)",
        "(line 840,col 13)-(line 852,col 13)",
        "(line 853,col 13)-(line 853,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.equals(java.lang.Object)",
      "begin_line": 856,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 858,col 13)-(line 860,col 13)",
        "(line 861,col 13)-(line 863,col 13)",
        "(line 864,col 13)-(line 864,col 64)",
        "(line 865,col 13)-(line 865,col 40)",
        "(line 866,col 13)-(line 866,col 44)",
        "(line 867,col 13)-(line 868,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.hashCode()",
      "begin_line": 871,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 873,col 13)-(line 875,col 13)",
        "(line 876,col 13)-(line 876,col 40)",
        "(line 877,col 13)-(line 877,col 44)",
        "(line 878,col 13)-(line 879,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.FlatMapEntry.toString()",
      "begin_line": 882,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 884,col 13)-(line 886,col 13)",
        "(line 887,col 13)-(line 887,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryIterator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 892,
      "end_line": 926,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 893,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextIndex"
      ],
      "begin_line": 894,
      "end_line": 894,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntry"
      ],
      "begin_line": 895,
      "end_line": 895,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.EntryIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n         * Create a new Flat3Map.EntryIterator.\n         ",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.hasNext()",
      "begin_line": 904,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 905,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.nextEntry()",
      "begin_line": 908,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 909,col 13)-(line 911,col 13)",
        "(line 912,col 13)-(line 912,col 71)",
        "(line 913,col 13)-(line 913,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntryIterator.remove()",
      "begin_line": 916,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 917,col 13)-(line 919,col 13)",
        "(line 920,col 13)-(line 920,col 42)",
        "(line 921,col 13)-(line 921,col 49)",
        "(line 922,col 13)-(line 922,col 24)",
        "(line 923,col 13)-(line 923,col 32)"
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
      "begin_line": 931,
      "end_line": 939,
      "comment": "\n     * EntrySetIterator and MapEntry\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySetIterator.EntrySetIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, V\u003e)",
      "begin_line": 932,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 933,col 13)-(line 933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.EntrySetIterator.next()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 937,col 13)-(line 937,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.keySet()",
      "begin_line": 948,
      "end_line": 953,
      "comment": "\n     * Gets the keySet view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the keys, use {@link #mapIterator()}.\n     *\n     * @return the keySet view\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeySet",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cK\u003e"
      ],
      "begin_line": 958,
      "end_line": 998,
      "comment": "\n     * KeySet\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.KeySet(org.apache.commons.collections4.map.Flat3Map\u003cK, ?\u003e)",
      "begin_line": 961,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 962,col 13)-(line 962,col 20)",
        "(line 963,col 13)-(line 963,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.size()",
      "begin_line": 966,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 968,col 13)-(line 968,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.clear()",
      "begin_line": 971,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 973,col 13)-(line 973,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.contains(java.lang.Object)",
      "begin_line": 976,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 978,col 13)-(line 978,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.remove(java.lang.Object)",
      "begin_line": 981,
      "end_line": 986,
      "comment": "",
      "child_ranges": [
        "(line 983,col 13)-(line 983,col 59)",
        "(line 984,col 13)-(line 984,col 31)",
        "(line 985,col 13)-(line 985,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySet.iterator()",
      "begin_line": 988,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 990,col 13)-(line 992,col 13)",
        "(line 993,col 13)-(line 995,col 13)",
        "(line 996,col 13)-(line 996,col 49)"
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
      "begin_line": 1003,
      "end_line": 1013,
      "comment": "\n     * KeySetIterator\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySetIterator.KeySetIterator(org.apache.commons.collections4.map.Flat3Map\u003cK, ?\u003e)",
      "begin_line": 1005,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 13)-(line 1007,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.KeySetIterator.next()",
      "begin_line": 1010,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 13)-(line 1011,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.values()",
      "begin_line": 1022,
      "end_line": 1027,
      "comment": "\n     * Gets the values view of the map.\n     * Changes made to the view affect this map.\n     * To simply iterate through the values, use {@link #mapIterator()}.\n     *\n     * @return the values view\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1025,col 9)",
        "(line 1026,col 9)-(line 1026,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Values",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cV\u003e"
      ],
      "begin_line": 1032,
      "end_line": 1065,
      "comment": "\n     * Values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.Values(org.apache.commons.collections4.map.Flat3Map\u003c?, V\u003e)",
      "begin_line": 1035,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 13)-(line 1036,col 20)",
        "(line 1037,col 13)-(line 1037,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.size()",
      "begin_line": 1040,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.clear()",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 13)-(line 1047,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.contains(java.lang.Object)",
      "begin_line": 1050,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 13)-(line 1052,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.Values.iterator()",
      "begin_line": 1055,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 13)-(line 1059,col 13)",
        "(line 1060,col 13)-(line 1062,col 13)",
        "(line 1063,col 13)-(line 1063,col 49)"
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
      "begin_line": 1070,
      "end_line": 1080,
      "comment": "\n     * ValuesIterator\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.Flat3Map.ValuesIterator.ValuesIterator(org.apache.commons.collections4.map.Flat3Map\u003c?, V\u003e)",
      "begin_line": 1072,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 13)-(line 1074,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.ValuesIterator.next()",
      "begin_line": 1077,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 13)-(line 1078,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1086,
      "end_line": 1093,
      "comment": "\n     * Write the map out using a custom routine.\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 33)",
        "(line 1088,col 9)-(line 1088,col 29)",
        "(line 1089,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.readObject(java.io.ObjectInputStream)",
      "begin_line": 1098,
      "end_line": 1108,
      "comment": "\n     * Read the map in using a custom routine.\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 31)",
        "(line 1101,col 9)-(line 1101,col 39)",
        "(line 1102,col 9)-(line 1104,col 9)",
        "(line 1105,col 9)-(line 1107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.clone()",
      "begin_line": 1117,
      "end_line": 1129,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.equals(java.lang.Object)",
      "begin_line": 1137,
      "end_line": 1182,
      "comment": "\n     * Compares this map with another.\n     *\n     * @param obj  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1145,col 9)-(line 1147,col 9)",
        "(line 1148,col 9)-(line 1148,col 48)",
        "(line 1149,col 9)-(line 1151,col 9)",
        "(line 1152,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.hashCode()",
      "begin_line": 1189,
      "end_line": 1208,
      "comment": "\n     * Gets the standard Map hashCode.\n     *\n     * @return the hash code defined in the Map interface\n     ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 22)",
        "(line 1195,col 9)-(line 1206,col 9)",
        "(line 1207,col 9)-(line 1207,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.Flat3Map.toString()",
      "begin_line": 1215,
      "end_line": 1247,
      "comment": "\n     * Gets the map as a String.\n     *\n     * @return a string version of the map\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1222,col 9)",
        "(line 1223,col 9)-(line 1223,col 57)",
        "(line 1224,col 9)-(line 1224,col 24)",
        "(line 1225,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1245,col 24)",
        "(line 1246,col 9)-(line 1246,col 30)"
      ]
    }
  ]
}