{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 52,
      "end_line": 1161,
      "comment": "\n * Abstract test class for {@link MultiValuedMap} contract and methods.\n * \u003cp\u003e\n * To use, extend this class and implement the {@link #makeObject} method and if\n * necessary override the {@link #makeFullMap()} method.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " MultiValuedHashMap created by reset(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.AbstractMultiValuedMapTest(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeObject()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getCompatibilityVersion()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAddSupported()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eput\u003c/code\u003e and\n     * \u003ccode\u003eputAll\u003c/code\u003e operations adding new mappings.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support put adding.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isRemoveSupported()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eremove\u003c/code\u003e and\n     * \u003ccode\u003eclear\u003c/code\u003e operations.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support removal operations.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAllowNullKey()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} supports null keys.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support null keys.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isTestSerialization()",
      "begin_line": 108,
      "end_line": 111,
      "comment": " FIXME: tests ignore to fix serialization issues",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleKeys()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "\n     * Returns the set of keys in the mappings used to test the map. This method\n     * must return an array with the same length as {@link #getSampleValues()}\n     * and all array elements must be different. The default implementation\n     * constructs a set of String keys, and includes a single null key if\n     * {@link #isAllowNullKey()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 125,col 10)",
        "(line 126,col 9)-(line 126,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleValues()",
      "begin_line": 135,
      "end_line": 142,
      "comment": "\n     * Returns the set of values in the mappings used to test the map. This\n     * method must return an array with the same length as\n     * {@link #getSampleKeys()}. The default implementation constructs a set of\n     * String values\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 140,col 10)",
        "(line 141,col 9)-(line 141,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeFullMap()",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 54)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.addSampleMappings(org.apache.commons.collections4.MultiValuedMap\u003c? super K, ? super V\u003e)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 41)",
        "(line 152,col 9)-(line 152,col 45)",
        "(line 153,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeConfirmedMap()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Override to return a MultiValuedMap other than MultiValuedHashMap as the\n     * confirmed map.\n     *\n     * @return a MultiValuedMap that is known to be valid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getConfirmed()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.setConfirmed(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getMap()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetEmpty()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to empty.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetFull()",
      "begin_line": 191,
      "end_line": 199,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to full.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 33)",
        "(line 193,col 9)-(line 193,col 44)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 195,col 40)",
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testNoMappingReturnsEmptyCol()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 55)",
        "(line 204,col 9)-(line 204,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMultipleValues()",
      "begin_line": 207,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 55)",
        "(line 209,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 40)",
        "(line 212,col 9)-(line 212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testGet()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 55)",
        "(line 218,col 9)-(line 218,col 55)",
        "(line 219,col 9)-(line 219,col 54)",
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 222,col 58)",
        "(line 223,col 9)-(line 223,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAddMappingThroughGet()",
      "begin_line": 226,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 232,col 51)",
        "(line 233,col 9)-(line 233,col 48)",
        "(line 234,col 9)-(line 234,col 48)",
        "(line 235,col 9)-(line 235,col 35)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 36)",
        "(line 238,col 9)-(line 238,col 28)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 240,col 43)",
        "(line 241,col 9)-(line 241,col 54)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 45)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 246,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGet()",
      "begin_line": 249,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 20)",
        "(line 254,col 9)-(line 254,col 50)",
        "(line 255,col 9)-(line 256,col 47)",
        "(line 257,col 9)-(line 257,col 36)",
        "(line 258,col 9)-(line 258,col 36)",
        "(line 259,col 9)-(line 259,col 26)",
        "(line 260,col 9)-(line 260,col 25)",
        "(line 261,col 9)-(line 261,col 44)",
        "(line 262,col 9)-(line 262,col 55)",
        "(line 263,col 9)-(line 263,col 54)",
        "(line 264,col 9)-(line 264,col 46)",
        "(line 265,col 9)-(line 265,col 45)",
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 32)",
        "(line 268,col 9)-(line 268,col 27)",
        "(line 269,col 9)-(line 269,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGetIterator()",
      "begin_line": 272,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 50)",
        "(line 278,col 9)-(line 279,col 55)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 55)",
        "(line 286,col 9)-(line 286,col 54)",
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 288,col 45)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 290,col 47)",
        "(line 291,col 9)-(line 291,col 28)",
        "(line 292,col 9)-(line 292,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue()",
      "begin_line": 295,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 55)",
        "(line 297,col 9)-(line 297,col 45)",
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 299,col 45)",
        "(line 300,col 9)-(line 300,col 46)",
        "(line 301,col 9)-(line 301,col 46)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 303,col 9)-(line 303,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeyContainsValue()",
      "begin_line": 306,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 55)",
        "(line 308,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 309,col 53)",
        "(line 310,col 9)-(line 310,col 54)",
        "(line 311,col 9)-(line 311,col 55)",
        "(line 312,col 9)-(line 312,col 57)",
        "(line 313,col 9)-(line 313,col 58)",
        "(line 314,col 9)-(line 314,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testValues()",
      "begin_line": 317,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 55)",
        "(line 320,col 9)-(line 320,col 53)",
        "(line 321,col 9)-(line 321,col 32)",
        "(line 322,col 9)-(line 322,col 32)",
        "(line 323,col 9)-(line 323,col 33)",
        "(line 324,col 9)-(line 324,col 31)",
        "(line 325,col 9)-(line 325,col 33)",
        "(line 326,col 9)-(line 326,col 34)",
        "(line 327,col 9)-(line 327,col 45)",
        "(line 328,col 9)-(line 328,col 34)",
        "(line 329,col 9)-(line 329,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaValuesIterator()",
      "begin_line": 339,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 55)",
        "(line 345,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveViaValuesRemove()",
      "begin_line": 353,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 358,col 44)",
        "(line 359,col 9)-(line 359,col 29)",
        "(line 360,col 9)-(line 360,col 28)",
        "(line 361,col 9)-(line 361,col 44)",
        "(line 362,col 9)-(line 362,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEntriesCollectionIterator()",
      "begin_line": 390,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 55)",
        "(line 392,col 9)-(line 392,col 62)",
        "(line 393,col 9)-(line 393,col 70)",
        "(line 394,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaEntriesIterator()",
      "begin_line": 407,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 418,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapEquals()",
      "begin_line": 426,
      "end_line": 438,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 54)",
        "(line 432,col 9)-(line 432,col 49)",
        "(line 433,col 9)-(line 433,col 38)",
        "(line 434,col 9)-(line 434,col 40)",
        "(line 436,col 9)-(line 436,col 54)",
        "(line 437,col 9)-(line 437,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSizeWithPutRemove()",
      "begin_line": 440,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 54)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 35)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 35)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 35)",
        "(line 452,col 9)-(line 452,col 36)",
        "(line 453,col 9)-(line 453,col 35)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 24)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 37)",
        "(line 458,col 9)-(line 458,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeySetSize()",
      "begin_line": 461,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 55)",
        "(line 463,col 9)-(line 463,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize_Key()",
      "begin_line": 466,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 55)",
        "(line 469,col 9)-(line 469,col 51)",
        "(line 470,col 9)-(line 470,col 51)",
        "(line 471,col 9)-(line 471,col 53)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 35)",
        "(line 476,col 9)-(line 476,col 49)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 49)",
        "(line 480,col 9)-(line 480,col 49)",
        "(line 481,col 9)-(line 481,col 35)",
        "(line 482,col 9)-(line 482,col 49)",
        "(line 483,col 9)-(line 483,col 49)",
        "(line 484,col 9)-(line 484,col 35)",
        "(line 485,col 9)-(line 485,col 49)",
        "(line 486,col 9)-(line 486,col 49)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 24)",
        "(line 492,col 9)-(line 492,col 49)",
        "(line 493,col 9)-(line 493,col 37)",
        "(line 495,col 9)-(line 495,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue_Key()",
      "begin_line": 521,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 55)",
        "(line 524,col 9)-(line 524,col 62)",
        "(line 525,col 9)-(line 525,col 61)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 35)",
        "(line 530,col 9)-(line 530,col 59)",
        "(line 531,col 9)-(line 531,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map1()",
      "begin_line": 534,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 59)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 47)",
        "(line 543,col 9)-(line 543,col 55)",
        "(line 544,col 9)-(line 544,col 44)",
        "(line 545,col 9)-(line 545,col 43)",
        "(line 546,col 9)-(line 546,col 30)",
        "(line 548,col 9)-(line 548,col 46)",
        "(line 549,col 9)-(line 549,col 37)",
        "(line 550,col 9)-(line 550,col 53)",
        "(line 551,col 9)-(line 551,col 52)",
        "(line 552,col 9)-(line 552,col 58)",
        "(line 553,col 9)-(line 553,col 58)",
        "(line 554,col 9)-(line 554,col 58)",
        "(line 555,col 9)-(line 555,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map2()",
      "begin_line": 558,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 55)",
        "(line 564,col 9)-(line 564,col 48)",
        "(line 565,col 9)-(line 565,col 48)",
        "(line 567,col 9)-(line 567,col 55)",
        "(line 568,col 9)-(line 568,col 44)",
        "(line 569,col 9)-(line 569,col 44)",
        "(line 570,col 9)-(line 570,col 30)",
        "(line 572,col 9)-(line 572,col 46)",
        "(line 573,col 9)-(line 573,col 37)",
        "(line 574,col 9)-(line 574,col 53)",
        "(line 575,col 9)-(line 575,col 53)",
        "(line 576,col 9)-(line 576,col 53)",
        "(line 577,col 9)-(line 577,col 58)",
        "(line 578,col 9)-(line 578,col 58)",
        "(line 579,col 9)-(line 579,col 58)",
        "(line 580,col 9)-(line 580,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_KeyIterable()",
      "begin_line": 583,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 54)",
        "(line 589,col 9)-(line 589,col 74)",
        "(line 591,col 9)-(line 591,col 54)",
        "(line 592,col 9)-(line 592,col 49)",
        "(line 593,col 9)-(line 593,col 58)",
        "(line 594,col 9)-(line 594,col 58)",
        "(line 595,col 9)-(line 595,col 58)",
        "(line 597,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 604,col 49)",
        "(line 605,col 9)-(line 605,col 58)",
        "(line 606,col 9)-(line 606,col 58)",
        "(line 607,col 9)-(line 607,col 58)",
        "(line 609,col 9)-(line 609,col 69)",
        "(line 610,col 9)-(line 610,col 49)",
        "(line 611,col 9)-(line 611,col 58)",
        "(line 612,col 9)-(line 612,col 58)",
        "(line 613,col 9)-(line 613,col 58)",
        "(line 615,col 9)-(line 615,col 50)",
        "(line 616,col 9)-(line 616,col 54)",
        "(line 617,col 9)-(line 617,col 49)",
        "(line 618,col 9)-(line 618,col 58)",
        "(line 619,col 9)-(line 619,col 58)",
        "(line 620,col 9)-(line 620,col 58)",
        "(line 621,col 9)-(line 621,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemove_KeyItem()",
      "begin_line": 624,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 54)",
        "(line 630,col 9)-(line 630,col 35)",
        "(line 631,col 9)-(line 631,col 35)",
        "(line 632,col 9)-(line 632,col 35)",
        "(line 633,col 9)-(line 633,col 58)",
        "(line 634,col 9)-(line 634,col 58)",
        "(line 635,col 9)-(line 635,col 57)",
        "(line 636,col 9)-(line 636,col 57)",
        "(line 637,col 9)-(line 637,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysMultiSet()",
      "begin_line": 641,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 49)",
        "(line 643,col 9)-(line 643,col 45)",
        "(line 644,col 9)-(line 644,col 53)",
        "(line 645,col 9)-(line 645,col 53)",
        "(line 646,col 9)-(line 646,col 55)",
        "(line 647,col 9)-(line 647,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagIterator()",
      "begin_line": 650,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 49)",
        "(line 652,col 9)-(line 652,col 47)",
        "(line 653,col 9)-(line 653,col 47)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 41)",
        "(line 658,col 9)-(line 658,col 45)",
        "(line 659,col 9)-(line 659,col 45)",
        "(line 660,col 9)-(line 660,col 47)",
        "(line 661,col 9)-(line 661,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagContainsAll()",
      "begin_line": 664,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 49)",
        "(line 667,col 9)-(line 667,col 45)",
        "(line 668,col 9)-(line 668,col 104)",
        "(line 669,col 9)-(line 669,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapGet()",
      "begin_line": 672,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 21)",
        "(line 674,col 9)-(line 674,col 56)",
        "(line 675,col 9)-(line 675,col 38)",
        "(line 676,col 9)-(line 676,col 39)",
        "(line 678,col 9)-(line 678,col 20)",
        "(line 679,col 9)-(line 679,col 34)",
        "(line 680,col 9)-(line 680,col 46)",
        "(line 681,col 9)-(line 681,col 27)",
        "(line 682,col 9)-(line 682,col 39)",
        "(line 683,col 9)-(line 683,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapPut()",
      "begin_line": 686,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 21)",
        "(line 692,col 9)-(line 692,col 56)",
        "(line 693,col 9)-(line 693,col 71)",
        "(line 694,col 9)-(line 694,col 35)",
        "(line 695,col 9)-(line 695,col 41)",
        "(line 696,col 9)-(line 696,col 48)",
        "(line 697,col 9)-(line 697,col 49)",
        "(line 698,col 9)-(line 698,col 50)",
        "(line 700,col 9)-(line 700,col 20)",
        "(line 701,col 9)-(line 701,col 34)",
        "(line 702,col 9)-(line 702,col 32)",
        "(line 703,col 9)-(line 703,col 27)",
        "(line 704,col 9)-(line 704,col 41)",
        "(line 705,col 9)-(line 705,col 50)",
        "(line 706,col 9)-(line 706,col 49)",
        "(line 707,col 9)-(line 707,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapRemove()",
      "begin_line": 710,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 20)",
        "(line 715,col 9)-(line 715,col 56)",
        "(line 716,col 9)-(line 716,col 29)",
        "(line 717,col 9)-(line 717,col 49)",
        "(line 718,col 9)-(line 718,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIterator()",
      "begin_line": 721,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 21)",
        "(line 723,col 9)-(line 723,col 58)",
        "(line 724,col 9)-(line 724,col 37)",
        "(line 726,col 9)-(line 726,col 20)",
        "(line 727,col 9)-(line 727,col 39)",
        "(line 728,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorRemove()",
      "begin_line": 735,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 20)",
        "(line 740,col 9)-(line 740,col 57)",
        "(line 741,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorUnsupportedSet()",
      "begin_line": 748,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 20)",
        "(line 751,col 9)-(line 751,col 57)",
        "(line 752,col 9)-(line 752,col 21)",
        "(line 753,col 9)-(line 757,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.xtestEmptyMapCompatibility()",
      "begin_line": 766,
      "end_line": 771,
      "comment": " FIXME: tests ignore to fix serialization issues",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 54)",
        "(line 768,col 9)-(line 769,col 102)",
        "(line 770,col 9)-(line 770,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.xtestFullMapCompatibility()",
      "begin_line": 774,
      "end_line": 790,
      "comment": " FIXME: tests ignore to fix serialization issues",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 49)",
        "(line 777,col 9)-(line 778,col 95)",
        "(line 779,col 9)-(line 779,col 71)",
        "(line 780,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 789,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapEntries()",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\n     * Bulk test {@link MultiValuedMap#entries()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapEntries",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cEntry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 806,
      "end_line": 874,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.TestMultiValuedMapEntries()",
      "begin_line": 807,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 808,col 13)-(line 808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.getFullElements()",
      "begin_line": 811,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeObject()",
      "begin_line": 817,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 819,col 13)-(line 819,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeFullCollection()",
      "begin_line": 822,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 824,col 13)-(line 824,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isNullSupported()",
      "begin_line": 827,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 13)-(line 829,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isAddSupported()",
      "begin_line": 832,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 835,col 13)-(line 835,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isRemoveSupported()",
      "begin_line": 838,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 840,col 13)-(line 840,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isTestSerialization()",
      "begin_line": 843,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetFull()",
      "begin_line": 848,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 56)",
        "(line 851,col 13)-(line 851,col 78)",
        "(line 852,col 13)-(line 852,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetEmpty()",
      "begin_line": 855,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 857,col 13)-(line 857,col 57)",
        "(line 858,col 13)-(line 858,col 78)",
        "(line 859,col 13)-(line 859,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedCollection()",
      "begin_line": 862,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 865,col 13)-(line 865,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedFullCollection()",
      "begin_line": 868,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 871,col 13)-(line 871,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeySet()",
      "begin_line": 884,
      "end_line": 886,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keySet()}. This method runs through all\n     * of the tests in {@link AbstractSetTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 888,
      "end_line": 929,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.TestMultiValuedMapKeySet()",
      "begin_line": 889,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.getFullElements()",
      "begin_line": 893,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 896,col 13)-(line 896,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeObject()",
      "begin_line": 899,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeFullCollection()",
      "begin_line": 904,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 906,col 13)-(line 906,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isNullSupported()",
      "begin_line": 909,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 911,col 13)-(line 911,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isAddSupported()",
      "begin_line": 914,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 916,col 13)-(line 916,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isRemoveSupported()",
      "begin_line": 919,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 921,col 13)-(line 921,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isTestSerialization()",
      "begin_line": 924,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 926,col 13)-(line 926,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapValues()",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * Bulk test {@link MultiValuedMap#values()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 944,
      "end_line": 1010,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.TestMultiValuedMapValues()",
      "begin_line": 945,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.getFullElements()",
      "begin_line": 949,
      "end_line": 952,
      "comment": "",
      "child_ranges": [
        "(line 951,col 13)-(line 951,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeObject()",
      "begin_line": 954,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 956,col 13)-(line 956,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeFullCollection()",
      "begin_line": 959,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 961,col 13)-(line 961,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isNullSupported()",
      "begin_line": 964,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 966,col 13)-(line 966,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isAddSupported()",
      "begin_line": 969,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 971,col 13)-(line 971,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isRemoveSupported()",
      "begin_line": 974,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 976,col 13)-(line 976,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isTestSerialization()",
      "begin_line": 979,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 981,col 13)-(line 981,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetFull()",
      "begin_line": 984,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 986,col 13)-(line 986,col 56)",
        "(line 987,col 13)-(line 987,col 77)",
        "(line 988,col 13)-(line 988,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetEmpty()",
      "begin_line": 991,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 993,col 13)-(line 993,col 57)",
        "(line 994,col 13)-(line 994,col 77)",
        "(line 995,col 13)-(line 995,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedCollection()",
      "begin_line": 998,
      "end_line": 1002,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedFullCollection()",
      "begin_line": 1004,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 13)-(line 1007,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeys()",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keys()}. This method runs through all of\n     * the tests in {@link AbstractBagTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractBagTest} instance for testing the map\u0027s values\n     *         collection\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeys",
      "is_interface": false,
      "parent_types": [
        "AbstractMultiSetTest\u003cK\u003e"
      ],
      "begin_line": 1025,
      "end_line": 1080,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.TestMultiValuedMapKeys()",
      "begin_line": 1027,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 13)-(line 1028,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.getFullElements()",
      "begin_line": 1031,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 13)-(line 1033,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeObject()",
      "begin_line": 1036,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 13)-(line 1038,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeFullCollection()",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 13)-(line 1043,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isNullSupported()",
      "begin_line": 1046,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 13)-(line 1048,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isAddSupported()",
      "begin_line": 1051,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 13)-(line 1053,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isRemoveSupported()",
      "begin_line": 1056,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 13)-(line 1058,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isTestSerialization()",
      "begin_line": 1061,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 13)-(line 1063,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetFull()",
      "begin_line": 1066,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1068,col 13)-(line 1068,col 56)",
        "(line 1069,col 13)-(line 1069,col 75)",
        "(line 1070,col 13)-(line 1070,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetEmpty()",
      "begin_line": 1073,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 13)-(line 1075,col 57)",
        "(line 1076,col 13)-(line 1076,col 75)",
        "(line 1077,col 13)-(line 1077,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestAsMap()",
      "begin_line": 1082,
      "end_line": 1084,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapAsMap",
      "is_interface": false,
      "parent_types": [
        "AbstractMapTest\u003cK,Collection\u003cV\u003e\u003e"
      ],
      "begin_line": 1086,
      "end_line": 1160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.TestMultiValuedMapAsMap()",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 13)-(line 1089,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeObject()",
      "begin_line": 1092,
      "end_line": 1095,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 13)-(line 1094,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeFullMap()",
      "begin_line": 1097,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 13)-(line 1099,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleKeys()",
      "begin_line": 1102,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 13)-(line 1105,col 77)",
        "(line 1106,col 13)-(line 1106,col 47)",
        "(line 1107,col 13)-(line 1109,col 13)",
        "(line 1110,col 13)-(line 1110,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleValues()",
      "begin_line": 1113,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 13)-(line 1116,col 81)",
        "(line 1117,col 13)-(line 1117,col 55)",
        "(line 1118,col 13)-(line 1120,col 13)",
        "(line 1121,col 13)-(line 1121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getNewSampleValues()",
      "begin_line": 1124,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 13)-(line 1127,col 84)",
        "(line 1128,col 13)-(line 1128,col 55)",
        "(line 1129,col 13)-(line 1131,col 13)",
        "(line 1132,col 13)-(line 1132,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isAllowNullKey()",
      "begin_line": 1135,
      "end_line": 1138,
      "comment": "",
      "child_ranges": [
        "(line 1137,col 13)-(line 1137,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutAddSupported()",
      "begin_line": 1140,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 13)-(line 1142,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutChangeSupported()",
      "begin_line": 1145,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1147,col 13)-(line 1147,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isRemoveSupported()",
      "begin_line": 1150,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 13)-(line 1152,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isTestSerialization()",
      "begin_line": 1155,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 13)-(line 1157,col 25)"
      ]
    }
  ]
}