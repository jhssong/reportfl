{
  "filepath": "/tmp/Collections-25b/src/test/java/org/apache/commons/collections4/multimap/AbstractMultiValuedMapTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMultiValuedMapTest",
      "is_interface": false,
      "parent_types": [
        "AbstractObjectTest"
      ],
      "begin_line": 51,
      "end_line": 1139,
      "comment": "\n * Abstract test class for {@link MultiValuedMap} contract and methods.\n * \u003cp\u003e\n * To use, extend this class and implement the {@link #makeObject} method and if\n * necessary override the {@link #makeFullMap()} method.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Map created by reset(). "
    },
    {
      "type": "field",
      "varNames": [
        "confirmed"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " MultiValuedHashMap created by reset(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.AbstractMultiValuedMapTest(java.lang.String)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeObject()",
      "begin_line": 63,
      "end_line": 64,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getCompatibilityVersion()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAddSupported()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eput\u003c/code\u003e and\n     * \u003ccode\u003eputAll\u003c/code\u003e operations adding new mappings.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support put adding.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isRemoveSupported()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} support the \u003ccode\u003eremove\u003c/code\u003e and\n     * \u003ccode\u003eclear\u003c/code\u003e operations.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support removal operations.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.isAllowNullKey()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns true if the maps produced by {@link #makeObject()} and\n     * {@link #makeFullMap()} supports null keys.\n     * \u003cp\u003e\n     * Default implementation returns true. Override if your collection class\n     * does not support null keys.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleKeys()",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Returns the set of keys in the mappings used to test the map. This method\n     * must return an array with the same length as {@link #getSampleValues()}\n     * and all array elements must be different. The default implementation\n     * constructs a set of String keys, and includes a single null key if\n     * {@link #isAllowNullKey()} returns \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 10)",
        "(line 119,col 9)-(line 119,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getSampleValues()",
      "begin_line": 128,
      "end_line": 135,
      "comment": "\n     * Returns the set of values in the mappings used to test the map. This\n     * method must return an array with the same length as\n     * {@link #getSampleKeys()}. The default implementation constructs a set of\n     * String values\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 133,col 10)",
        "(line 134,col 9)-(line 134,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeFullMap()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 54)",
        "(line 139,col 9)-(line 139,col 31)",
        "(line 140,col 9)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.addSampleMappings(org.apache.commons.collections4.MultiValuedMap\u003c? super K, ? super V\u003e)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 41)",
        "(line 145,col 9)-(line 145,col 45)",
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.makeConfirmedMap()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Override to return a MultiValuedMap other than MultiValuedHashMap as the\n     * confirmed map.\n     *\n     * @return a MultiValuedMap that is known to be valid\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getConfirmed()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.setConfirmed(org.apache.commons.collections4.MultiValuedMap\u003cK, V\u003e)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.getMap()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetEmpty()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to empty.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)",
        "(line 178,col 9)-(line 178,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.resetFull()",
      "begin_line": 184,
      "end_line": 192,
      "comment": "\n     * Resets the {@link #map} and {@link #confirmed} fields to full.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 33)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 187,col 9)-(line 187,col 38)",
        "(line 188,col 9)-(line 188,col 40)",
        "(line 189,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testNoMappingReturnsEmptyCol()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 55)",
        "(line 196,col 9)-(line 196,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMultipleValues()",
      "begin_line": 199,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 55)",
        "(line 201,col 9)-(line 201,col 43)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 203,col 9)-(line 203,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testGet()",
      "begin_line": 206,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 55)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 211,col 52)",
        "(line 212,col 9)-(line 212,col 54)",
        "(line 213,col 9)-(line 213,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAddMappingThroughGet()",
      "begin_line": 216,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 21)",
        "(line 222,col 9)-(line 222,col 51)",
        "(line 223,col 9)-(line 223,col 44)",
        "(line 224,col 9)-(line 224,col 44)",
        "(line 225,col 9)-(line 225,col 35)",
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 36)",
        "(line 228,col 9)-(line 228,col 28)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 231,col 54)",
        "(line 232,col 9)-(line 232,col 53)",
        "(line 233,col 9)-(line 233,col 45)",
        "(line 234,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGet()",
      "begin_line": 239,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 20)",
        "(line 244,col 9)-(line 244,col 50)",
        "(line 245,col 9)-(line 245,col 43)",
        "(line 246,col 9)-(line 246,col 36)",
        "(line 247,col 9)-(line 247,col 36)",
        "(line 248,col 9)-(line 248,col 26)",
        "(line 249,col 9)-(line 249,col 25)",
        "(line 250,col 9)-(line 250,col 44)",
        "(line 251,col 9)-(line 251,col 55)",
        "(line 252,col 9)-(line 252,col 54)",
        "(line 253,col 9)-(line 253,col 46)",
        "(line 254,col 9)-(line 254,col 45)",
        "(line 255,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 27)",
        "(line 258,col 9)-(line 258,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveMappingThroughGetIterator()",
      "begin_line": 261,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 266,col 50)",
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 44)",
        "(line 273,col 9)-(line 273,col 55)",
        "(line 274,col 9)-(line 274,col 54)",
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 276,col 45)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 278,col 47)",
        "(line 279,col 9)-(line 279,col 28)",
        "(line 280,col 9)-(line 280,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue()",
      "begin_line": 283,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 55)",
        "(line 285,col 9)-(line 285,col 45)",
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 45)",
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 290,col 47)",
        "(line 291,col 9)-(line 291,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeyContainsValue()",
      "begin_line": 294,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 55)",
        "(line 296,col 9)-(line 296,col 54)",
        "(line 297,col 9)-(line 297,col 53)",
        "(line 298,col 9)-(line 298,col 54)",
        "(line 299,col 9)-(line 299,col 55)",
        "(line 300,col 9)-(line 300,col 57)",
        "(line 301,col 9)-(line 301,col 58)",
        "(line 302,col 9)-(line 302,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testValues()",
      "begin_line": 305,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 55)",
        "(line 308,col 9)-(line 308,col 53)",
        "(line 309,col 9)-(line 309,col 32)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 33)",
        "(line 312,col 9)-(line 312,col 31)",
        "(line 313,col 9)-(line 313,col 33)",
        "(line 314,col 9)-(line 314,col 34)",
        "(line 315,col 9)-(line 315,col 45)",
        "(line 316,col 9)-(line 316,col 34)",
        "(line 317,col 9)-(line 317,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaValuesIterator()",
      "begin_line": 327,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 55)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 45)",
        "(line 337,col 9)-(line 337,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveViaValuesRemove()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 55)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 346,col 9)-(line 346,col 29)",
        "(line 347,col 9)-(line 347,col 28)",
        "(line 348,col 9)-(line 348,col 44)",
        "(line 349,col 9)-(line 349,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEntriesCollectionIterator()",
      "begin_line": 377,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 55)",
        "(line 379,col 9)-(line 379,col 62)",
        "(line 380,col 9)-(line 380,col 70)",
        "(line 381,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 391,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemoveAllViaEntriesIterator()",
      "begin_line": 394,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 55)",
        "(line 399,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 404,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapEquals()",
      "begin_line": 412,
      "end_line": 424,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 54)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 38)",
        "(line 420,col 9)-(line 420,col 48)",
        "(line 422,col 9)-(line 422,col 54)",
        "(line 423,col 9)-(line 423,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSizeWithPutRemove()",
      "begin_line": 426,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 54)",
        "(line 432,col 9)-(line 432,col 36)",
        "(line 433,col 9)-(line 433,col 35)",
        "(line 434,col 9)-(line 434,col 36)",
        "(line 435,col 9)-(line 435,col 35)",
        "(line 436,col 9)-(line 436,col 36)",
        "(line 437,col 9)-(line 437,col 35)",
        "(line 438,col 9)-(line 438,col 36)",
        "(line 439,col 9)-(line 439,col 35)",
        "(line 440,col 9)-(line 440,col 36)",
        "(line 441,col 9)-(line 441,col 24)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 45)",
        "(line 444,col 9)-(line 444,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeySetSize()",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 55)",
        "(line 449,col 9)-(line 449,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testSize_Key()",
      "begin_line": 452,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 55)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 456,col 9)-(line 456,col 47)",
        "(line 457,col 9)-(line 457,col 49)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 35)",
        "(line 462,col 9)-(line 462,col 45)",
        "(line 464,col 9)-(line 464,col 35)",
        "(line 465,col 9)-(line 465,col 45)",
        "(line 466,col 9)-(line 466,col 45)",
        "(line 467,col 9)-(line 467,col 35)",
        "(line 468,col 9)-(line 468,col 45)",
        "(line 469,col 9)-(line 469,col 45)",
        "(line 470,col 9)-(line 470,col 35)",
        "(line 471,col 9)-(line 471,col 45)",
        "(line 472,col 9)-(line 472,col 45)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 24)",
        "(line 478,col 9)-(line 478,col 45)",
        "(line 479,col 9)-(line 479,col 45)",
        "(line 481,col 9)-(line 481,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testContainsValue_Key()",
      "begin_line": 507,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 55)",
        "(line 510,col 9)-(line 510,col 66)",
        "(line 511,col 9)-(line 511,col 65)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 35)",
        "(line 516,col 9)-(line 516,col 63)",
        "(line 517,col 9)-(line 517,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map1()",
      "begin_line": 520,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 59)",
        "(line 526,col 9)-(line 526,col 47)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 529,col 9)-(line 529,col 55)",
        "(line 530,col 9)-(line 530,col 44)",
        "(line 531,col 9)-(line 531,col 43)",
        "(line 532,col 9)-(line 532,col 30)",
        "(line 534,col 9)-(line 534,col 46)",
        "(line 535,col 9)-(line 535,col 37)",
        "(line 536,col 9)-(line 536,col 49)",
        "(line 537,col 9)-(line 537,col 48)",
        "(line 538,col 9)-(line 538,col 58)",
        "(line 539,col 9)-(line 539,col 58)",
        "(line 540,col 9)-(line 540,col 58)",
        "(line 541,col 9)-(line 541,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_Map2()",
      "begin_line": 544,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 55)",
        "(line 550,col 9)-(line 550,col 48)",
        "(line 551,col 9)-(line 551,col 48)",
        "(line 553,col 9)-(line 553,col 55)",
        "(line 554,col 9)-(line 554,col 44)",
        "(line 555,col 9)-(line 555,col 44)",
        "(line 556,col 9)-(line 556,col 30)",
        "(line 558,col 9)-(line 558,col 46)",
        "(line 559,col 9)-(line 559,col 37)",
        "(line 560,col 9)-(line 560,col 49)",
        "(line 561,col 9)-(line 561,col 49)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 563,col 58)",
        "(line 564,col 9)-(line 564,col 58)",
        "(line 565,col 9)-(line 565,col 58)",
        "(line 566,col 9)-(line 566,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testPutAll_KeyIterable()",
      "begin_line": 569,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 54)",
        "(line 575,col 9)-(line 575,col 74)",
        "(line 577,col 9)-(line 577,col 54)",
        "(line 578,col 9)-(line 578,col 45)",
        "(line 579,col 9)-(line 579,col 62)",
        "(line 580,col 9)-(line 580,col 62)",
        "(line 581,col 9)-(line 581,col 62)",
        "(line 583,col 9)-(line 583,col 55)",
        "(line 584,col 9)-(line 584,col 45)",
        "(line 585,col 9)-(line 585,col 62)",
        "(line 586,col 9)-(line 586,col 62)",
        "(line 587,col 9)-(line 587,col 62)",
        "(line 589,col 9)-(line 589,col 69)",
        "(line 590,col 9)-(line 590,col 45)",
        "(line 591,col 9)-(line 591,col 62)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 593,col 9)-(line 593,col 62)",
        "(line 595,col 9)-(line 595,col 50)",
        "(line 596,col 9)-(line 596,col 54)",
        "(line 597,col 9)-(line 597,col 45)",
        "(line 598,col 9)-(line 598,col 62)",
        "(line 599,col 9)-(line 599,col 62)",
        "(line 600,col 9)-(line 600,col 62)",
        "(line 601,col 9)-(line 601,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testRemove_KeyItem()",
      "begin_line": 604,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 54)",
        "(line 610,col 9)-(line 610,col 35)",
        "(line 611,col 9)-(line 611,col 35)",
        "(line 612,col 9)-(line 612,col 35)",
        "(line 613,col 9)-(line 613,col 66)",
        "(line 614,col 9)-(line 614,col 66)",
        "(line 615,col 9)-(line 615,col 65)",
        "(line 616,col 9)-(line 616,col 65)",
        "(line 617,col 9)-(line 617,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBag()",
      "begin_line": 621,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 49)",
        "(line 623,col 9)-(line 623,col 35)",
        "(line 624,col 9)-(line 624,col 48)",
        "(line 625,col 9)-(line 625,col 48)",
        "(line 626,col 9)-(line 626,col 50)",
        "(line 627,col 9)-(line 627,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagIterator()",
      "begin_line": 630,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 49)",
        "(line 632,col 9)-(line 632,col 47)",
        "(line 633,col 9)-(line 633,col 47)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 41)",
        "(line 638,col 9)-(line 638,col 45)",
        "(line 639,col 9)-(line 639,col 45)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testKeysBagContainsAll()",
      "begin_line": 644,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 49)",
        "(line 647,col 9)-(line 647,col 35)",
        "(line 648,col 9)-(line 648,col 104)",
        "(line 649,col 9)-(line 649,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapGet()",
      "begin_line": 652,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 21)",
        "(line 654,col 9)-(line 654,col 56)",
        "(line 655,col 9)-(line 655,col 38)",
        "(line 656,col 9)-(line 656,col 39)",
        "(line 658,col 9)-(line 658,col 20)",
        "(line 659,col 9)-(line 659,col 34)",
        "(line 660,col 9)-(line 660,col 46)",
        "(line 661,col 9)-(line 661,col 27)",
        "(line 662,col 9)-(line 662,col 39)",
        "(line 663,col 9)-(line 663,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapPut()",
      "begin_line": 666,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 21)",
        "(line 672,col 9)-(line 672,col 56)",
        "(line 673,col 9)-(line 673,col 71)",
        "(line 674,col 9)-(line 674,col 35)",
        "(line 675,col 9)-(line 675,col 41)",
        "(line 676,col 9)-(line 676,col 48)",
        "(line 677,col 9)-(line 677,col 49)",
        "(line 678,col 9)-(line 678,col 50)",
        "(line 680,col 9)-(line 680,col 20)",
        "(line 681,col 9)-(line 681,col 34)",
        "(line 682,col 9)-(line 682,col 32)",
        "(line 683,col 9)-(line 683,col 27)",
        "(line 684,col 9)-(line 684,col 41)",
        "(line 685,col 9)-(line 685,col 50)",
        "(line 686,col 9)-(line 686,col 49)",
        "(line 687,col 9)-(line 687,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testAsMapRemove()",
      "begin_line": 690,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 20)",
        "(line 695,col 9)-(line 695,col 56)",
        "(line 696,col 9)-(line 696,col 29)",
        "(line 697,col 9)-(line 697,col 49)",
        "(line 698,col 9)-(line 698,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIterator()",
      "begin_line": 701,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 21)",
        "(line 703,col 9)-(line 703,col 58)",
        "(line 704,col 9)-(line 704,col 37)",
        "(line 706,col 9)-(line 706,col 20)",
        "(line 707,col 9)-(line 707,col 39)",
        "(line 708,col 9)-(line 712,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorRemove()",
      "begin_line": 715,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 20)",
        "(line 720,col 9)-(line 720,col 57)",
        "(line 721,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testMapIteratorUnsupportedSet()",
      "begin_line": 728,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 20)",
        "(line 731,col 9)-(line 731,col 57)",
        "(line 732,col 9)-(line 732,col 21)",
        "(line 733,col 9)-(line 737,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testEmptyMapCompatibility()",
      "begin_line": 745,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 54)",
        "(line 747,col 9)-(line 748,col 102)",
        "(line 749,col 9)-(line 749,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.testFullMapCompatibility()",
      "begin_line": 752,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 78)",
        "(line 754,col 9)-(line 755,col 101)",
        "(line 756,col 9)-(line 756,col 71)",
        "(line 757,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapEntries()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n     * Bulk test {@link MultiValuedMap#entries()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapEntries",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cEntry\u003cK,V\u003e\u003e"
      ],
      "begin_line": 782,
      "end_line": 850,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.TestMultiValuedMapEntries()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 784,col 13)-(line 784,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.getFullElements()",
      "begin_line": 787,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 790,col 13)-(line 790,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeObject()",
      "begin_line": 793,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 795,col 13)-(line 795,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeFullCollection()",
      "begin_line": 798,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 800,col 13)-(line 800,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isNullSupported()",
      "begin_line": 803,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 805,col 13)-(line 805,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isAddSupported()",
      "begin_line": 808,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isRemoveSupported()",
      "begin_line": 814,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 816,col 13)-(line 816,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.isTestSerialization()",
      "begin_line": 819,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 821,col 13)-(line 821,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetFull()",
      "begin_line": 824,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 826,col 13)-(line 826,col 56)",
        "(line 827,col 13)-(line 827,col 78)",
        "(line 828,col 13)-(line 828,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.resetEmpty()",
      "begin_line": 831,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 833,col 13)-(line 833,col 57)",
        "(line 834,col 13)-(line 834,col 78)",
        "(line 835,col 13)-(line 835,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedCollection()",
      "begin_line": 838,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 841,col 13)-(line 841,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapEntries.makeConfirmedFullCollection()",
      "begin_line": 844,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 847,col 13)-(line 847,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeySet()",
      "begin_line": 860,
      "end_line": 862,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keySet()}. This method runs through all\n     * of the tests in {@link AbstractSetTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractSetTest} instance for testing the map\u0027s key set\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeySet",
      "is_interface": false,
      "parent_types": [
        "AbstractSetTest\u003cK\u003e"
      ],
      "begin_line": 864,
      "end_line": 905,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.TestMultiValuedMapKeySet()",
      "begin_line": 865,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 866,col 13)-(line 866,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.getFullElements()",
      "begin_line": 869,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 872,col 13)-(line 872,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeObject()",
      "begin_line": 875,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 877,col 13)-(line 877,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.makeFullCollection()",
      "begin_line": 880,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 882,col 13)-(line 882,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isNullSupported()",
      "begin_line": 885,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 887,col 13)-(line 887,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isAddSupported()",
      "begin_line": 890,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isRemoveSupported()",
      "begin_line": 895,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 897,col 13)-(line 897,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeySet.isTestSerialization()",
      "begin_line": 900,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 902,col 13)-(line 902,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapValues()",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\n     * Bulk test {@link MultiValuedMap#values()}. This method runs through all\n     * of the tests in {@link AbstractCollectionTest}. After modification\n     * operations, {@link #verify()} is invoked to ensure that the map and the\n     * other collection views are still valid.\n     *\n     * @return a {@link AbstractCollectionTest} instance for testing the map\u0027s\n     *         values collection\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapValues",
      "is_interface": false,
      "parent_types": [
        "AbstractCollectionTest\u003cV\u003e"
      ],
      "begin_line": 920,
      "end_line": 986,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.TestMultiValuedMapValues()",
      "begin_line": 921,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 922,col 13)-(line 922,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.getFullElements()",
      "begin_line": 925,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 927,col 13)-(line 927,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeObject()",
      "begin_line": 930,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 932,col 13)-(line 932,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeFullCollection()",
      "begin_line": 935,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 937,col 13)-(line 937,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isNullSupported()",
      "begin_line": 940,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 942,col 13)-(line 942,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isAddSupported()",
      "begin_line": 945,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 947,col 13)-(line 947,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isRemoveSupported()",
      "begin_line": 950,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 952,col 13)-(line 952,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.isTestSerialization()",
      "begin_line": 955,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 957,col 13)-(line 957,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetFull()",
      "begin_line": 960,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 962,col 13)-(line 962,col 56)",
        "(line 963,col 13)-(line 963,col 77)",
        "(line 964,col 13)-(line 964,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.resetEmpty()",
      "begin_line": 967,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 969,col 13)-(line 969,col 57)",
        "(line 970,col 13)-(line 970,col 77)",
        "(line 971,col 13)-(line 971,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedCollection()",
      "begin_line": 974,
      "end_line": 978,
      "comment": "",
      "child_ranges": [
        "(line 977,col 13)-(line 977,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapValues.makeConfirmedFullCollection()",
      "begin_line": 980,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 983,col 13)-(line 983,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestMultiValuedMapKeys()",
      "begin_line": 997,
      "end_line": 999,
      "comment": "\n     * Bulk test {@link MultiValuedMap#keys()}. This method runs through all of\n     * the tests in {@link AbstractBagTest}. After modification operations,\n     * {@link #verify()} is invoked to ensure that the map and the other\n     * collection views are still valid.\n     *\n     * @return a {@link AbstractBagTest} instance for testing the map\u0027s values\n     *         collection\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapKeys",
      "is_interface": false,
      "parent_types": [
        "AbstractBagTest\u003cK\u003e"
      ],
      "begin_line": 1001,
      "end_line": 1058,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.TestMultiValuedMapKeys()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 13)-(line 1004,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.getFullElements()",
      "begin_line": 1007,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 13)-(line 1009,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeObject()",
      "begin_line": 1012,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 13)-(line 1014,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.makeFullCollection()",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 13)-(line 1019,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isNullSupported()",
      "begin_line": 1022,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 13)-(line 1024,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isAddSupported()",
      "begin_line": 1027,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 13)-(line 1029,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isRemoveSupported()",
      "begin_line": 1032,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 13)-(line 1034,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.isTestSerialization()",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 13)-(line 1039,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetFull()",
      "begin_line": 1042,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 13)-(line 1044,col 56)",
        "(line 1047,col 13)-(line 1047,col 107)",
        "(line 1048,col 13)-(line 1048,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapKeys.resetEmpty()",
      "begin_line": 1051,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 13)-(line 1053,col 57)",
        "(line 1054,col 13)-(line 1054,col 107)",
        "(line 1055,col 13)-(line 1055,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.bulkTestAsMap()",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestMultiValuedMapAsMap",
      "is_interface": false,
      "parent_types": [
        "AbstractMapTest\u003cK,Collection\u003cV\u003e\u003e"
      ],
      "begin_line": 1064,
      "end_line": 1138,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.TestMultiValuedMapAsMap()",
      "begin_line": 1066,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1067,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeObject()",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 13)-(line 1072,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.makeFullMap()",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 13)-(line 1077,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleKeys()",
      "begin_line": 1080,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 13)-(line 1083,col 77)",
        "(line 1084,col 13)-(line 1084,col 47)",
        "(line 1085,col 13)-(line 1087,col 13)",
        "(line 1088,col 13)-(line 1088,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getSampleValues()",
      "begin_line": 1091,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 13)-(line 1094,col 81)",
        "(line 1095,col 13)-(line 1095,col 55)",
        "(line 1096,col 13)-(line 1098,col 13)",
        "(line 1099,col 13)-(line 1099,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.getNewSampleValues()",
      "begin_line": 1102,
      "end_line": 1111,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 13)-(line 1105,col 84)",
        "(line 1106,col 13)-(line 1106,col 55)",
        "(line 1107,col 13)-(line 1109,col 13)",
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
        "(line 1120,col 13)-(line 1120,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isPutChangeSupported()",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 13)-(line 1125,col 68)"
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
      "signature": "org.apache.commons.collections4.multimap.AbstractMultiValuedMapTest.TestMultiValuedMapAsMap.isTestSerialization()",
      "begin_line": 1133,
      "end_line": 1136,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 13)-(line 1135,col 25)"
      ]
    }
  ]
}