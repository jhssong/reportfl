{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/map/MultiKeyMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiKeyMap",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.map.AbstractMapDecorator\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 77,
      "end_line": 908,
      "comment": "\n * A \u003ccode\u003eMap\u003c/code\u003e implementation that uses multiple keys to map the value.\n * \u003cp\u003e\n * This class is the most efficient way to uses multiple keys to map to a value.\n * The best way to use this class is via the additional map-style methods.\n * These provide \u003ccode\u003eget\u003c/code\u003e, \u003ccode\u003econtainsKey\u003c/code\u003e, \u003ccode\u003eput\u003c/code\u003e and\n * \u003ccode\u003eremove\u003c/code\u003e for individual keys which operate without extra object creation.\n * \u003cp\u003e\n * The additional methods are the main interface of this map.\n * As such, you will not normally hold this map in a variable of type \u003ccode\u003eMap\u003c/code\u003e.\n * \u003cp\u003e\n * The normal map methods take in and return a {@link MultiKey}.\n * If you try to use \u003ccode\u003eput()\u003c/code\u003e with any other object type a\n * \u003ccode\u003eClassCastException\u003c/code\u003e is thrown. If you try to use \u003ccode\u003enull\u003c/code\u003e as\n * the key in \u003ccode\u003eput()\u003c/code\u003e a \u003ccode\u003eNullPointerException\u003c/code\u003e is thrown.\n * \u003cp\u003e\n * This map is implemented as a decorator of a \u003ccode\u003eAbstractHashedMap\u003c/code\u003e which\n * enables extra behaviour to be added easily.\n * \u003cul\u003e\n * \u003cli\u003e\u003ccode\u003eMultiKeyMap.decorate(new LinkedMap())\u003c/code\u003e creates an ordered map.\n * \u003cli\u003e\u003ccode\u003eMultiKeyMap.decorate(new LRUMap())\u003c/code\u003e creates an least recently used map.\n * \u003cli\u003e\u003ccode\u003eMultiKeyMap.decorate(new ReferenceMap())\u003c/code\u003e creates a garbage collector sensitive map.\n * \u003c/ul\u003e\n * Note that \u003ccode\u003eIdentityMap\u003c/code\u003e and \u003ccode\u003eReferenceIdentityMap\u003c/code\u003e are unsuitable\n * for use as the key comparison would work on the whole MultiKey, not the elements within.\n * \u003cp\u003e\n * As an example, consider a least recently used cache that uses a String airline code\n * and a Locale to lookup the airline\u0027s name:\n * \u003cpre\u003e\n * private MultiKeyMap cache \u003d MultiKeyMap.multiKeyMap(new LRUMap(50));\n *\n * public String getAirlineName(String code, String locale) {\n *   String name \u003d (String) cache.get(code, locale);\n *   if (name \u003d\u003d null) {\n *     name \u003d getAirlineNameFromDB(code, locale);\n *     cache.put(code, locale, name);\n *   }\n *   return name;\n * }\n * \u003c/pre\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that MultiKeyMap is not synchronized and is not thread-safe.\u003c/strong\u003e\n * If you wish to use this map from multiple threads concurrently, you must use\n * appropriate synchronization. This class may throw exceptions when accessed\n * by concurrent threads without synchronization.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Serialisation version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.multiKeyMap(org.apache.commons.collections4.map.AbstractHashedMap\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "\n     * Decorates the specified map to add the MultiKeyMap API and fast query.\n     * The map must not be null and must be empty.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, not null\n     * @return a new multi key map\n     * @throws NullPointerException if map is null\n     * @throws IllegalArgumentException if the map is not empty\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.MultiKeyMap()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Constructs a new MultiKeyMap that decorates a \u003ccode\u003eHashedMap\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.MultiKeyMap(org.apache.commons.collections4.map.AbstractHashedMap\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n     * Constructor that decorates the specified map and is called from\n     * {@link #multiKeyMap(AbstractHashedMap)}.\n     * The map must not be null and should be empty or only contain valid keys.\n     * This constructor performs no validation.\n     *\n     * @param map  the map to decorate\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 19)",
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object)",
      "begin_line": 135,
      "end_line": 146,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 138,col 91)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object)",
      "begin_line": 155,
      "end_line": 166,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 46)",
        "(line 157,col 9)-(line 158,col 91)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, V)",
      "begin_line": 176,
      "end_line": 190,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 83)",
        "(line 179,col 9)-(line 179,col 94)",
        "(line 180,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 84)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object)",
      "begin_line": 200,
      "end_line": 215,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object))\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 46)",
        "(line 202,col 9)-(line 202,col 83)",
        "(line 203,col 9)-(line 203,col 94)",
        "(line 204,col 9)-(line 204,col 78)",
        "(line 205,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object)",
      "begin_line": 224,
      "end_line": 237,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 18)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 23)",
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 234,col 21)",
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 236,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 247,
      "end_line": 254,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 59)",
        "(line 250,col 9)-(line 253,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 265,
      "end_line": 276,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 52)",
        "(line 267,col 9)-(line 268,col 91)",
        "(line 269,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 286,
      "end_line": 297,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 52)",
        "(line 288,col 9)-(line 289,col 91)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, V)",
      "begin_line": 308,
      "end_line": 322,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 310,col 83)",
        "(line 311,col 9)-(line 311,col 94)",
        "(line 312,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 90)",
        "(line 321,col 9)-(line 321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 333,
      "end_line": 348,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 52)",
        "(line 335,col 9)-(line 335,col 83)",
        "(line 336,col 9)-(line 336,col 94)",
        "(line 337,col 9)-(line 337,col 78)",
        "(line 338,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 358,
      "end_line": 374,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 18)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 23)",
        "(line 370,col 9)-(line 370,col 23)",
        "(line 371,col 9)-(line 371,col 21)",
        "(line 372,col 9)-(line 372,col 23)",
        "(line 373,col 9)-(line 373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 385,
      "end_line": 393,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 59)",
        "(line 388,col 9)-(line 392,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 405,
      "end_line": 416,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 58)",
        "(line 407,col 9)-(line 408,col 91)",
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 427,
      "end_line": 438,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 430,col 91)",
        "(line 431,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, K, V)",
      "begin_line": 450,
      "end_line": 464,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 58)",
        "(line 452,col 9)-(line 452,col 83)",
        "(line 453,col 9)-(line 453,col 94)",
        "(line 454,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 96)",
        "(line 463,col 9)-(line 463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 476,
      "end_line": 491,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 83)",
        "(line 479,col 9)-(line 479,col 94)",
        "(line 480,col 9)-(line 480,col 78)",
        "(line 481,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 502,
      "end_line": 521,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 18)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 23)",
        "(line 517,col 9)-(line 517,col 23)",
        "(line 518,col 9)-(line 518,col 21)",
        "(line 519,col 9)-(line 519,col 23)",
        "(line 520,col 9)-(line 520,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 533,
      "end_line": 542,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 59)",
        "(line 536,col 9)-(line 541,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 555,
      "end_line": 566,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 64)",
        "(line 557,col 9)-(line 558,col 91)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 578,
      "end_line": 590,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 64)",
        "(line 581,col 9)-(line 582,col 91)",
        "(line 583,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, K, K, V)",
      "begin_line": 603,
      "end_line": 617,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 64)",
        "(line 605,col 9)-(line 605,col 83)",
        "(line 606,col 9)-(line 606,col 94)",
        "(line 607,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 102)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 630,
      "end_line": 646,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 64)",
        "(line 633,col 9)-(line 633,col 83)",
        "(line 634,col 9)-(line 634,col 94)",
        "(line 635,col 9)-(line 635,col 78)",
        "(line 636,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 658,
      "end_line": 680,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 18)",
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 23)",
        "(line 676,col 9)-(line 676,col 23)",
        "(line 677,col 9)-(line 677,col 21)",
        "(line 678,col 9)-(line 678,col 23)",
        "(line 679,col 9)-(line 679,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 693,
      "end_line": 703,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 59)",
        "(line 696,col 9)-(line 702,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object)",
      "begin_line": 715,
      "end_line": 727,
      "comment": "\n     * Removes all mappings where the first key is that specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has one or more keys, and the first matches that specified.\n     *\n     * @param key1  the first key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 33)",
        "(line 717,col 9)-(line 717,col 71)",
        "(line 718,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object)",
      "begin_line": 739,
      "end_line": 752,
      "comment": "\n     * Removes all mappings where the first two keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has two or more keys, and the first two match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 33)",
        "(line 741,col 9)-(line 741,col 71)",
        "(line 742,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 765,
      "end_line": 779,
      "comment": "\n     * Removes all mappings where the first three keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has three or more keys, and the first three match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 33)",
        "(line 767,col 9)-(line 767,col 71)",
        "(line 768,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 793,
      "end_line": 808,
      "comment": "\n     * Removes all mappings where the first four keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has four or more keys, and the first four match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 33)",
        "(line 795,col 9)-(line 795,col 71)",
        "(line 796,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.checkKey(org.apache.commons.collections4.keyvalue.MultiKey\u003c?\u003e)",
      "begin_line": 816,
      "end_line": 820,
      "comment": "\n     * Check to ensure that input keys are valid MultiKey objects.\n     *\n     * @param key  the key to check\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.clone()",
      "begin_line": 827,
      "end_line": 835,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 834,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(org.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V)",
      "begin_line": 847,
      "end_line": 851,
      "comment": "\n     * Puts the key and value into the map, where the key must be a non-null\n     * MultiKey object.\n     *\n     * @param key  the non-null MultiKey object\n     * @param value  the value to store\n     * @return the previous value for the key\n     * @throws NullPointerException if the key is null\n     * @throws ClassCastException if the key is not a MultiKey\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 22)",
        "(line 850,col 9)-(line 850,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.putAll(java.util.Map\u003c? extends org.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, ? extends V\u003e)",
      "begin_line": 861,
      "end_line": 867,
      "comment": "\n     * Copies all of the keys and values from the specified map to this map.\n     * Each key must be non-null and a MultiKey object.\n     *\n     * @param mapToCopy  to this map\n     * @throws NullPointerException if the mapToCopy or any key within is null\n     * @throws ClassCastException if any key in mapToCopy is not a MultiKey\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.mapIterator()",
      "begin_line": 870,
      "end_line": 873,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.decorated()",
      "begin_line": 878,
      "end_line": 881,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 890,
      "end_line": 893,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 33)",
        "(line 892,col 9)-(line 892,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 902,
      "end_line": 906,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 31)",
        "(line 905,col 9)-(line 905,col 62)"
      ]
    }
  ]
}