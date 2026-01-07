{
  "filepath": "/tmp/Collections-28b/src/test/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 53,
      "end_line": 1147,
      "comment": "\n * Abstract test class for {@link MultiValuedMap} contract and methods.\n * \u003cp\u003e\n * To use, extend this class and implement the {@link #makeObject} method and if\n * necessary override the {@link #makeFullMap()} method.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " MultiValuedHashMap created by reset(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.AbstractMultiValuedMapTest(java.lang.String)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeObject()",
      "begin_line": 65,
      "end_line": 66,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getCompatibilityVersion()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAddSupported()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eput\u003c/code\u003e and\n     * \u003ccode\u003eputAll\u003c/code\u003e operations adding new mappings.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support put adding.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isRemoveSupported()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eremove\u003c/code\u003e and\n     * \u003ccode\u003eclear\u003c/code\u003e operations.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support removal operations.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAllowNullKey()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} supports null keys.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support null keys.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isTestSerialization()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 20)"
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
      "comment": "\n     * Override to return a MultiValuedMap other than ArrayListValuedHashMap\n     * as the confirmed map.\n     *\n     * @return a MultiValuedMap that is known to be valid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)"
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
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapRemove()",
      "begin_line": 686,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 20)",
        "(line 691,col 9)-(line 691,col 56)",
        "(line 692,col 9)-(line 692,col 29)",
        "(line 693,col 9)-(line 693,col 49)",
        "(line 694,col 9)-(line 694,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIterator()",
      "begin_line": 697,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 21)",
        "(line 699,col 9)-(line 699,col 58)",
        "(line 700,col 9)-(line 700,col 37)",
        "(line 702,col 9)-(line 702,col 20)",
        "(line 703,col 9)-(line 703,col 39)",
        "(line 704,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorRemove()",
      "begin_line": 711,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 20)",
        "(line 716,col 9)-(line 716,col 57)",
        "(line 717,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorUnsupportedSet()",
      "begin_line": 724,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 20)",
        "(line 727,col 9)-(line 727,col 57)",
        "(line 728,col 9)-(line 728,col 21)",
        "(line 729,col 9)-(line 733,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEmptyMapCompatibility()",
      "begin_line": 741,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 54)",
        "(line 743,col 9)-(line 744,col 102)",
        "(line 745,col 9)-(line 745,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testFullMapCompatibility()",
      "begin_line": 748,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 49)",
        "(line 751,col 9)-(line 752,col 95)",
        "(line 753,col 9)-(line 753,col 71)",
        "(line 754,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 763,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapEntries()",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Bulk test {@link MultiValuedMap#entries()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapEntries",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cEntry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 780,
      "end_line": 848,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.TestMultiValuedMapEntries()",
      "begin_line": 781,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 782,col 13)-(line 782,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.getFullElements()",
      "begin_line": 785,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 788,col 13)-(line 788,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeObject()",
      "begin_line": 791,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 793,col 13)-(line 793,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeFullCollection()",
      "begin_line": 796,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 798,col 13)-(line 798,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isNullSupported()",
      "begin_line": 801,
      "end_line": 804,
      "comment": "",
      "child_ranges": [
        "(line 803,col 13)-(line 803,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isAddSupported()",
      "begin_line": 806,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 809,col 13)-(line 809,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isRemoveSupported()",
      "begin_line": 812,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 13)-(line 814,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isTestSerialization()",
      "begin_line": 817,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 819,col 13)-(line 819,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetFull()",
      "begin_line": 822,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 824,col 13)-(line 824,col 56)",
        "(line 825,col 13)-(line 825,col 78)",
        "(line 826,col 13)-(line 826,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetEmpty()",
      "begin_line": 829,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 831,col 13)-(line 831,col 57)",
        "(line 832,col 13)-(line 832,col 78)",
        "(line 833,col 13)-(line 833,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedCollection()",
      "begin_line": 836,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 839,col 13)-(line 839,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedFullCollection()",
      "begin_line": 842,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeySet()",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keySet()}. This method runs through all\n     * of the tests in {@link AbstractSetTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 862,
      "end_line": 903,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.TestMultiValuedMapKeySet()",
      "begin_line": 863,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 864,col 13)-(line 864,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.getFullElements()",
      "begin_line": 867,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 870,col 13)-(line 870,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeObject()",
      "begin_line": 873,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 875,col 13)-(line 875,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeFullCollection()",
      "begin_line": 878,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 880,col 13)-(line 880,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isNullSupported()",
      "begin_line": 883,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 885,col 13)-(line 885,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isAddSupported()",
      "begin_line": 888,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 890,col 13)-(line 890,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isRemoveSupported()",
      "begin_line": 893,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 895,col 13)-(line 895,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isTestSerialization()",
      "begin_line": 898,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 900,col 13)-(line 900,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapValues()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Bulk test {@link MultiValuedMap#values()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 918,
      "end_line": 984,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.TestMultiValuedMapValues()",
      "begin_line": 919,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 920,col 13)-(line 920,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.getFullElements()",
      "begin_line": 923,
      "end_line": 926,
      "comment": "",
      "child_ranges": [
        "(line 925,col 13)-(line 925,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeObject()",
      "begin_line": 928,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 930,col 13)-(line 930,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeFullCollection()",
      "begin_line": 933,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 935,col 13)-(line 935,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isNullSupported()",
      "begin_line": 938,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 940,col 13)-(line 940,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isAddSupported()",
      "begin_line": 943,
      "end_line": 946,
      "comment": "",
      "child_ranges": [
        "(line 945,col 13)-(line 945,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isRemoveSupported()",
      "begin_line": 948,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 950,col 13)-(line 950,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isTestSerialization()",
      "begin_line": 953,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 955,col 13)-(line 955,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetFull()",
      "begin_line": 958,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 960,col 13)-(line 960,col 56)",
        "(line 961,col 13)-(line 961,col 77)",
        "(line 962,col 13)-(line 962,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetEmpty()",
      "begin_line": 965,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 967,col 13)-(line 967,col 57)",
        "(line 968,col 13)-(line 968,col 77)",
        "(line 969,col 13)-(line 969,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedCollection()",
      "begin_line": 972,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 975,col 13)-(line 975,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedFullCollection()",
      "begin_line": 978,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 981,col 13)-(line 981,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeys()",
      "begin_line": 995,
      "end_line": 997,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keys()}. This method runs through all of\n     * the tests in {@link AbstractBagTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractBagTest} instance for testing the map\u0027s values\n     *         collection\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeys",
      "is_interface": false,
      "parent_types": [
        "AbstractMultiSetTest\u003cK\u003e"
      ],
      "begin_line": 999,
      "end_line": 1054,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.TestMultiValuedMapKeys()",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 13)-(line 1002,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.getFullElements()",
      "begin_line": 1005,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 13)-(line 1007,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeObject()",
      "begin_line": 1010,
      "end_line": 1013,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 13)-(line 1012,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeFullCollection()",
      "begin_line": 1015,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 13)-(line 1017,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isNullSupported()",
      "begin_line": 1020,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 13)-(line 1022,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isAddSupported()",
      "begin_line": 1025,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1027,col 13)-(line 1027,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isRemoveSupported()",
      "begin_line": 1030,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 13)-(line 1032,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isTestSerialization()",
      "begin_line": 1035,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 13)-(line 1037,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetFull()",
      "begin_line": 1040,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 56)",
        "(line 1043,col 13)-(line 1043,col 75)",
        "(line 1044,col 13)-(line 1044,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetEmpty()",
      "begin_line": 1047,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 13)-(line 1049,col 57)",
        "(line 1050,col 13)-(line 1050,col 75)",
        "(line 1051,col 13)-(line 1051,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestAsMap()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapAsMap",
      "is_interface": false,
      "parent_types": [
        "AbstractMapTest\u003cK,Collection\u003cV\u003e\u003e"
      ],
      "begin_line": 1060,
      "end_line": 1146,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.TestMultiValuedMapAsMap()",
      "begin_line": 1062,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 13)-(line 1063,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeObject()",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1068,col 13)-(line 1068,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeFullMap()",
      "begin_line": 1071,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 13)-(line 1073,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleKeys()",
      "begin_line": 1076,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1079,col 13)-(line 1079,col 77)",
        "(line 1080,col 13)-(line 1080,col 47)",
        "(line 1081,col 13)-(line 1083,col 13)",
        "(line 1084,col 13)-(line 1084,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleValues()",
      "begin_line": 1087,
      "end_line": 1098,
      "comment": "",
      "child_ranges": [
        "(line 1090,col 13)-(line 1090,col 102)",
        "(line 1091,col 13)-(line 1091,col 81)",
        "(line 1092,col 13)-(line 1092,col 55)",
        "(line 1093,col 13)-(line 1096,col 13)",
        "(line 1097,col 13)-(line 1097,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getNewSampleValues()",
      "begin_line": 1100,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1103,col 13)-(line 1103,col 102)",
        "(line 1104,col 13)-(line 1104,col 84)",
        "(line 1105,col 13)-(line 1105,col 55)",
        "(line 1106,col 13)-(line 1109,col 13)",
        "(line 1110,col 13)-(line 1110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isAllowNullKey()",
      "begin_line": 1113,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 13)-(line 1115,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutAddSupported()",
      "begin_line": 1118,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 13)-(line 1120,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutChangeSupported()",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 13)-(line 1125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isRemoveSupported()",
      "begin_line": 1128,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 13)-(line 1130,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.areEqualElementsDistinguishable()",
      "begin_line": 1133,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 13)-(line 1139,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isTestSerialization()",
      "begin_line": 1142,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 13)-(line 1144,col 25)"
      ]
    }
  ]
}