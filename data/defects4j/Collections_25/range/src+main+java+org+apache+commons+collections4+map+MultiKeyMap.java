{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/map/MultiKeyMap.java",
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
      "end_line": 907,
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
      "begin_line": 95,
      "end_line": 103,
      "comment": "\n     * Decorates the specified map to add the MultiKeyMap API and fast query.\n     * The map must not be null and must be empty.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param map  the map to decorate, not null\n     * @return a new multi key map\n     * @throws IllegalArgumentException if the map is null or not empty\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.MultiKeyMap()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Constructs a new MultiKeyMap that decorates a \u003ccode\u003eHashedMap\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.MultiKeyMap(org.apache.commons.collections4.map.AbstractHashedMap\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Constructor that decorates the specified map and is called from\n     * {@link #multiKeyMap(AbstractHashedMap)}.\n     * The map must not be null and should be empty or only contain valid keys.\n     * This constructor performs no validation.\n     *\n     * @param map  the map to decorate\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 19)",
        "(line 123,col 9)-(line 123,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object)",
      "begin_line": 134,
      "end_line": 145,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 137,col 91)",
        "(line 138,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 46)",
        "(line 156,col 9)-(line 157,col 91)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, V)",
      "begin_line": 175,
      "end_line": 189,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 83)",
        "(line 178,col 9)-(line 178,col 94)",
        "(line 179,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 84)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object)",
      "begin_line": 199,
      "end_line": 214,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object))\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 46)",
        "(line 201,col 9)-(line 201,col 83)",
        "(line 202,col 9)-(line 202,col 94)",
        "(line 203,col 9)-(line 203,col 78)",
        "(line 204,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object)",
      "begin_line": 223,
      "end_line": 236,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 18)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 23)",
        "(line 232,col 9)-(line 232,col 23)",
        "(line 233,col 9)-(line 233,col 21)",
        "(line 234,col 9)-(line 234,col 23)",
        "(line 235,col 9)-(line 235,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object)",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 59)",
        "(line 249,col 9)-(line 252,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 264,
      "end_line": 275,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 52)",
        "(line 266,col 9)-(line 267,col 91)",
        "(line 268,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 285,
      "end_line": 296,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 52)",
        "(line 287,col 9)-(line 288,col 91)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, V)",
      "begin_line": 307,
      "end_line": 321,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 52)",
        "(line 309,col 9)-(line 309,col 83)",
        "(line 310,col 9)-(line 310,col 94)",
        "(line 311,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 90)",
        "(line 320,col 9)-(line 320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 332,
      "end_line": 347,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 52)",
        "(line 334,col 9)-(line 334,col 83)",
        "(line 335,col 9)-(line 335,col 94)",
        "(line 336,col 9)-(line 336,col 78)",
        "(line 337,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 357,
      "end_line": 373,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 18)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 23)",
        "(line 369,col 9)-(line 369,col 23)",
        "(line 370,col 9)-(line 370,col 21)",
        "(line 371,col 9)-(line 371,col 23)",
        "(line 372,col 9)-(line 372,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 384,
      "end_line": 392,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 59)",
        "(line 387,col 9)-(line 391,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 404,
      "end_line": 415,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 58)",
        "(line 406,col 9)-(line 407,col 91)",
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 426,
      "end_line": 437,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 429,col 91)",
        "(line 430,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, K, V)",
      "begin_line": 449,
      "end_line": 463,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 58)",
        "(line 451,col 9)-(line 451,col 83)",
        "(line 452,col 9)-(line 452,col 94)",
        "(line 453,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 96)",
        "(line 462,col 9)-(line 462,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 475,
      "end_line": 490,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 58)",
        "(line 477,col 9)-(line 477,col 83)",
        "(line 478,col 9)-(line 478,col 94)",
        "(line 479,col 9)-(line 479,col 78)",
        "(line 480,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 501,
      "end_line": 520,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 18)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 23)",
        "(line 516,col 9)-(line 516,col 23)",
        "(line 517,col 9)-(line 517,col 21)",
        "(line 518,col 9)-(line 518,col 23)",
        "(line 519,col 9)-(line 519,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 532,
      "end_line": 541,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 59)",
        "(line 535,col 9)-(line 540,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.get(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 554,
      "end_line": 565,
      "comment": "\n     * Gets the value mapped to the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the mapped value, null if no match\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 64)",
        "(line 556,col 9)-(line 557,col 91)",
        "(line 558,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.containsKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 577,
      "end_line": 589,
      "comment": "\n     * Checks whether the map contains the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return true if the map contains the key\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 581,col 91)",
        "(line 582,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(K, K, K, K, K, V)",
      "begin_line": 602,
      "end_line": 616,
      "comment": "\n     * Stores the value against the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @param value  the value to store\n     * @return the value previously mapped to this combined key, null if none\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 64)",
        "(line 604,col 9)-(line 604,col 83)",
        "(line 605,col 9)-(line 605,col 94)",
        "(line 606,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 102)",
        "(line 615,col 9)-(line 615,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeMultiKey(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 629,
      "end_line": 645,
      "comment": "\n     * Removes the specified multi-key from this map.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the value mapped to the removed key, null if key not in map\n     * @since 4.0 (previous name: remove(Object, Object, Object, Object, Object))\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 64)",
        "(line 632,col 9)-(line 632,col 83)",
        "(line 633,col 9)-(line 633,col 94)",
        "(line 634,col 9)-(line 634,col 78)",
        "(line 635,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.hash(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 657,
      "end_line": 679,
      "comment": "\n     * Gets the hash code for the specified multi-key.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 18)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 23)",
        "(line 675,col 9)-(line 675,col 23)",
        "(line 676,col 9)-(line 676,col 21)",
        "(line 677,col 9)-(line 677,col 23)",
        "(line 678,col 9)-(line 678,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.isEqualKey(org.apache.commons.collections4.map.AbstractHashedMap.HashEntry\u003corg.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V\u003e, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 692,
      "end_line": 702,
      "comment": "\n     * Is the key equal to the combined key.\n     *\n     * @param entry  the entry to compare to\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @param key5  the fifth key\n     * @return true if the key matches\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 59)",
        "(line 695,col 9)-(line 701,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object)",
      "begin_line": 714,
      "end_line": 726,
      "comment": "\n     * Removes all mappings where the first key is that specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has one or more keys, and the first matches that specified.\n     *\n     * @param key1  the first key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 33)",
        "(line 716,col 9)-(line 716,col 71)",
        "(line 717,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object)",
      "begin_line": 738,
      "end_line": 751,
      "comment": "\n     * Removes all mappings where the first two keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has two or more keys, and the first two match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 33)",
        "(line 740,col 9)-(line 740,col 71)",
        "(line 741,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 764,
      "end_line": 778,
      "comment": "\n     * Removes all mappings where the first three keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has three or more keys, and the first three match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 33)",
        "(line 766,col 9)-(line 766,col 71)",
        "(line 767,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.removeAll(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)",
      "begin_line": 792,
      "end_line": 807,
      "comment": "\n     * Removes all mappings where the first four keys are those specified.\n     * \u003cp\u003e\n     * This method removes all the mappings where the \u003ccode\u003eMultiKey\u003c/code\u003e\n     * has four or more keys, and the first four match those specified.\n     *\n     * @param key1  the first key\n     * @param key2  the second key\n     * @param key3  the third key\n     * @param key4  the fourth key\n     * @return true if any elements were removed\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 33)",
        "(line 794,col 9)-(line 794,col 71)",
        "(line 795,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.checkKey(org.apache.commons.collections4.keyvalue.MultiKey\u003c?\u003e)",
      "begin_line": 815,
      "end_line": 819,
      "comment": "\n     * Check to ensure that input keys are valid MultiKey objects.\n     *\n     * @param key  the key to check\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 818,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.clone()",
      "begin_line": 826,
      "end_line": 834,
      "comment": "\n     * Clones the map without cloning the keys or values.\n     *\n     * @return a shallow clone\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.put(org.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, V)",
      "begin_line": 846,
      "end_line": 850,
      "comment": "\n     * Puts the key and value into the map, where the key must be a non-null\n     * MultiKey object.\n     *\n     * @param key  the non-null MultiKey object\n     * @param value  the value to store\n     * @return the previous value for the key\n     * @throws NullPointerException if the key is null\n     * @throws ClassCastException if the key is not a MultiKey\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 22)",
        "(line 849,col 9)-(line 849,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.putAll(java.util.Map\u003c? extends org.apache.commons.collections4.keyvalue.MultiKey\u003c? extends K\u003e, ? extends V\u003e)",
      "begin_line": 860,
      "end_line": 866,
      "comment": "\n     * Copies all of the keys and values from the specified map to this map.\n     * Each key must be non-null and a MultiKey object.\n     *\n     * @param mapToCopy  to this map\n     * @throws NullPointerException if the mapToCopy or any key within is null\n     * @throws ClassCastException if any key in mapToCopy is not a MultiKey\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.mapIterator()",
      "begin_line": 869,
      "end_line": 872,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.decorated()",
      "begin_line": 877,
      "end_line": 880,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 889,
      "end_line": 892,
      "comment": "\n     * Write the map out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 33)",
        "(line 891,col 9)-(line 891,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.map.MultiKeyMap.readObject(java.io.ObjectInputStream)",
      "begin_line": 901,
      "end_line": 905,
      "comment": "\n     * Read the map in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 31)",
        "(line 904,col 9)-(line 904,col 62)"
      ]
    }
  ]
}