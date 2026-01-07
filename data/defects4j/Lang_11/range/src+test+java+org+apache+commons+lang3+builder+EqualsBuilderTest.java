{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 1109,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 39,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 42,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 44,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 44)",
        "(line 47,col 13)-(line 47,col 43)",
        "(line 48,col 13)-(line 50,col 13)",
        "(line 52,col 13)-(line 52,col 44)",
        "(line 53,col 13)-(line 53,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 65,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 21)",
        "(line 72,col 13)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 44)",
        "(line 77,col 13)-(line 77,col 43)",
        "(line 78,col 13)-(line 80,col 13)",
        "(line 82,col 13)-(line 82,col 50)",
        "(line 83,col 13)-(line 83,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 95,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 101,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 102,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 21)",
        "(line 106,col 13)-(line 106,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 110,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 24)",
        "(line 115,col 13)-(line 115,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 119,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 28)",
        "(line 124,col 13)-(line 124,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 128,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 141,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 144,col 42)",
        "(line 145,col 9)-(line 145,col 59)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 147,col 19)",
        "(line 148,col 9)-(line 148,col 59)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 152,col 9)-(line 152,col 62)",
        "(line 153,col 9)-(line 153,col 62)",
        "(line 154,col 9)-(line 154,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 157,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 44)",
        "(line 162,col 9)-(line 162,col 125)",
        "(line 163,col 9)-(line 163,col 126)",
        "(line 164,col 9)-(line 164,col 126)",
        "(line 165,col 9)-(line 165,col 126)",
        "(line 166,col 9)-(line 166,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 169,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 174,col 9)-(line 174,col 60)",
        "(line 175,col 9)-(line 175,col 55)",
        "(line 176,col 9)-(line 176,col 61)",
        "(line 177,col 9)-(line 177,col 65)",
        "(line 178,col 9)-(line 178,col 53)",
        "(line 179,col 9)-(line 179,col 56)",
        "(line 180,col 9)-(line 180,col 56)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 183,col 9)-(line 183,col 112)",
        "(line 184,col 9)-(line 184,col 119)",
        "(line 189,col 9)-(line 189,col 79)",
        "(line 190,col 9)-(line 190,col 119)",
        "(line 192,col 9)-(line 192,col 120)",
        "(line 193,col 9)-(line 193,col 120)",
        "(line 195,col 9)-(line 195,col 120)",
        "(line 196,col 9)-(line 196,col 120)",
        "(line 199,col 9)-(line 199,col 78)",
        "(line 200,col 9)-(line 200,col 78)",
        "(line 202,col 9)-(line 202,col 69)",
        "(line 203,col 9)-(line 203,col 69)",
        "(line 205,col 9)-(line 205,col 70)",
        "(line 206,col 9)-(line 206,col 70)",
        "(line 208,col 9)-(line 208,col 71)",
        "(line 209,col 9)-(line 209,col 71)",
        "(line 212,col 9)-(line 212,col 114)",
        "(line 213,col 9)-(line 213,col 114)",
        "(line 215,col 9)-(line 215,col 113)",
        "(line 216,col 9)-(line 216,col 113)",
        "(line 218,col 9)-(line 218,col 113)",
        "(line 219,col 9)-(line 219,col 113)",
        "(line 221,col 9)-(line 221,col 63)",
        "(line 222,col 9)-(line 222,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 241,
      "end_line": 282,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     * @param testTransients whether to test transient instance variables \n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 75)",
        "(line 251,col 9)-(line 251,col 77)",
        "(line 254,col 9)-(line 254,col 139)",
        "(line 257,col 9)-(line 260,col 78)",
        "(line 263,col 9)-(line 263,col 34)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 82)",
        "(line 268,col 9)-(line 268,col 82)",
        "(line 269,col 9)-(line 269,col 38)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 83)",
        "(line 274,col 9)-(line 274,col 83)",
        "(line 277,col 9)-(line 277,col 78)",
        "(line 278,col 9)-(line 278,col 79)",
        "(line 279,col 9)-(line 279,col 78)",
        "(line 280,col 9)-(line 280,col 79)",
        "(line 281,col 9)-(line 281,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 284,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 84)",
        "(line 289,col 9)-(line 289,col 86)",
        "(line 290,col 9)-(line 290,col 85)",
        "(line 291,col 9)-(line 291,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 294,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 66)",
        "(line 299,col 9)-(line 299,col 67)",
        "(line 300,col 9)-(line 300,col 19)",
        "(line 301,col 9)-(line 301,col 66)",
        "(line 303,col 9)-(line 303,col 69)",
        "(line 305,col 9)-(line 305,col 69)",
        "(line 306,col 9)-(line 306,col 69)",
        "(line 307,col 9)-(line 307,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild()",
      "begin_line": 310,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 314,col 79)",
        "(line 315,col 9)-(line 315,col 80)",
        "(line 316,col 9)-(line 316,col 19)",
        "(line 317,col 9)-(line 317,col 79)",
        "(line 319,col 9)-(line 319,col 82)",
        "(line 321,col 9)-(line 321,col 82)",
        "(line 322,col 9)-(line 322,col 82)",
        "(line 323,col 9)-(line 323,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 21)",
        "(line 329,col 9)-(line 329,col 21)",
        "(line 330,col 9)-(line 330,col 66)",
        "(line 331,col 9)-(line 331,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 334,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 19)",
        "(line 337,col 9)-(line 337,col 19)",
        "(line 338,col 9)-(line 338,col 66)",
        "(line 339,col 9)-(line 339,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 21)",
        "(line 345,col 9)-(line 345,col 21)",
        "(line 346,col 9)-(line 346,col 66)",
        "(line 347,col 9)-(line 347,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 20)",
        "(line 353,col 9)-(line 353,col 20)",
        "(line 354,col 9)-(line 354,col 66)",
        "(line 355,col 9)-(line 355,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 358,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 20)",
        "(line 361,col 9)-(line 361,col 20)",
        "(line 362,col 9)-(line 362,col 66)",
        "(line 363,col 9)-(line 363,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 366,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 22)",
        "(line 369,col 9)-(line 369,col 22)",
        "(line 370,col 9)-(line 370,col 66)",
        "(line 371,col 9)-(line 371,col 67)",
        "(line 372,col 9)-(line 372,col 75)",
        "(line 373,col 9)-(line 373,col 82)",
        "(line 374,col 9)-(line 374,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 377,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 21)",
        "(line 380,col 9)-(line 380,col 21)",
        "(line 381,col 9)-(line 381,col 66)",
        "(line 382,col 9)-(line 382,col 67)",
        "(line 383,col 9)-(line 383,col 74)",
        "(line 384,col 9)-(line 384,col 80)",
        "(line 385,col 9)-(line 385,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 388,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 58)",
        "(line 391,col 9)-(line 391,col 45)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 393,col 9)-(line 393,col 45)",
        "(line 394,col 9)-(line 394,col 39)",
        "(line 395,col 9)-(line 395,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 398,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 58)",
        "(line 401,col 9)-(line 401,col 45)",
        "(line 402,col 9)-(line 402,col 39)",
        "(line 403,col 9)-(line 403,col 46)",
        "(line 404,col 9)-(line 404,col 30)",
        "(line 405,col 9)-(line 405,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 408,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 411,col 27)",
        "(line 412,col 9)-(line 412,col 66)",
        "(line 413,col 9)-(line 413,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 416,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 46)",
        "(line 419,col 9)-(line 419,col 36)",
        "(line 420,col 9)-(line 420,col 36)",
        "(line 421,col 9)-(line 421,col 23)",
        "(line 422,col 9)-(line 422,col 46)",
        "(line 423,col 9)-(line 423,col 36)",
        "(line 424,col 9)-(line 424,col 36)",
        "(line 425,col 9)-(line 425,col 23)",
        "(line 427,col 9)-(line 427,col 70)",
        "(line 428,col 9)-(line 428,col 70)",
        "(line 429,col 9)-(line 429,col 70)",
        "(line 430,col 9)-(line 430,col 24)",
        "(line 431,col 9)-(line 431,col 71)",
        "(line 432,col 9)-(line 432,col 24)",
        "(line 433,col 9)-(line 433,col 70)",
        "(line 434,col 9)-(line 434,col 26)",
        "(line 435,col 9)-(line 435,col 71)",
        "(line 436,col 9)-(line 436,col 23)",
        "(line 437,col 9)-(line 437,col 70)",
        "(line 439,col 9)-(line 439,col 20)",
        "(line 440,col 9)-(line 440,col 71)",
        "(line 441,col 9)-(line 441,col 20)",
        "(line 442,col 9)-(line 442,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 445,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 34)",
        "(line 448,col 9)-(line 448,col 21)",
        "(line 449,col 9)-(line 449,col 21)",
        "(line 450,col 9)-(line 450,col 34)",
        "(line 451,col 9)-(line 451,col 21)",
        "(line 452,col 9)-(line 452,col 21)",
        "(line 453,col 9)-(line 453,col 70)",
        "(line 454,col 9)-(line 454,col 70)",
        "(line 455,col 9)-(line 455,col 20)",
        "(line 456,col 9)-(line 456,col 71)",
        "(line 458,col 9)-(line 458,col 20)",
        "(line 459,col 9)-(line 459,col 71)",
        "(line 460,col 9)-(line 460,col 20)",
        "(line 461,col 9)-(line 461,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 464,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 32)",
        "(line 467,col 9)-(line 467,col 20)",
        "(line 468,col 9)-(line 468,col 20)",
        "(line 469,col 9)-(line 469,col 32)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 70)",
        "(line 473,col 9)-(line 473,col 70)",
        "(line 474,col 9)-(line 474,col 20)",
        "(line 475,col 9)-(line 475,col 71)",
        "(line 477,col 9)-(line 477,col 20)",
        "(line 478,col 9)-(line 478,col 71)",
        "(line 479,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 480,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 483,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 20)",
        "(line 488,col 9)-(line 488,col 36)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 490,col 20)",
        "(line 491,col 9)-(line 491,col 70)",
        "(line 492,col 9)-(line 492,col 70)",
        "(line 493,col 9)-(line 493,col 20)",
        "(line 494,col 9)-(line 494,col 71)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 71)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 502,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 34)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 34)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 70)",
        "(line 511,col 9)-(line 511,col 70)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 71)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 71)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 521,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 34)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 34)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 70)",
        "(line 530,col 9)-(line 530,col 70)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 532,col 9)-(line 532,col 71)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 71)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 537,col 9)-(line 537,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 540,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 38)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 38)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 20)",
        "(line 548,col 9)-(line 548,col 70)",
        "(line 549,col 9)-(line 549,col 70)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 71)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 554,col 9)-(line 554,col 71)",
        "(line 555,col 9)-(line 555,col 20)",
        "(line 556,col 9)-(line 556,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 559,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 36)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 36)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 566,col 9)-(line 566,col 20)",
        "(line 567,col 9)-(line 567,col 70)",
        "(line 568,col 9)-(line 568,col 70)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 71)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 71)",
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 578,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 40)",
        "(line 581,col 9)-(line 581,col 23)",
        "(line 582,col 9)-(line 582,col 24)",
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 23)",
        "(line 585,col 9)-(line 585,col 24)",
        "(line 586,col 9)-(line 586,col 70)",
        "(line 587,col 9)-(line 587,col 70)",
        "(line 588,col 9)-(line 588,col 23)",
        "(line 589,col 9)-(line 589,col 71)",
        "(line 591,col 9)-(line 591,col 20)",
        "(line 592,col 9)-(line 592,col 71)",
        "(line 593,col 9)-(line 593,col 20)",
        "(line 594,col 9)-(line 594,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 597,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 41)",
        "(line 600,col 9)-(line 600,col 41)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 74)",
        "(line 608,col 9)-(line 608,col 74)",
        "(line 609,col 9)-(line 609,col 25)",
        "(line 610,col 9)-(line 610,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 613,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 39)",
        "(line 616,col 9)-(line 616,col 39)",
        "(line 617,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 74)",
        "(line 624,col 9)-(line 624,col 74)",
        "(line 625,col 9)-(line 625,col 25)",
        "(line 626,col 9)-(line 626,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 629,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 43)",
        "(line 632,col 9)-(line 632,col 43)",
        "(line 633,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 74)",
        "(line 640,col 9)-(line 640,col 74)",
        "(line 641,col 9)-(line 641,col 25)",
        "(line 642,col 9)-(line 642,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 645,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 41)",
        "(line 648,col 9)-(line 648,col 41)",
        "(line 649,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 74)",
        "(line 656,col 9)-(line 656,col 74)",
        "(line 657,col 9)-(line 657,col 25)",
        "(line 658,col 9)-(line 658,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 661,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 41)",
        "(line 664,col 9)-(line 664,col 41)",
        "(line 665,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 74)",
        "(line 672,col 9)-(line 672,col 74)",
        "(line 673,col 9)-(line 673,col 25)",
        "(line 674,col 9)-(line 674,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 677,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 43)",
        "(line 680,col 9)-(line 680,col 43)",
        "(line 681,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 74)",
        "(line 688,col 9)-(line 688,col 74)",
        "(line 689,col 9)-(line 689,col 25)",
        "(line 690,col 9)-(line 690,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 693,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 45)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 74)",
        "(line 704,col 9)-(line 704,col 74)",
        "(line 705,col 9)-(line 705,col 25)",
        "(line 706,col 9)-(line 706,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 709,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 47)",
        "(line 712,col 9)-(line 712,col 47)",
        "(line 713,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 74)",
        "(line 720,col 9)-(line 720,col 74)",
        "(line 721,col 9)-(line 721,col 29)",
        "(line 722,col 9)-(line 722,col 75)",
        "(line 725,col 9)-(line 725,col 53)",
        "(line 726,col 9)-(line 726,col 75)",
        "(line 727,col 9)-(line 727,col 75)",
        "(line 728,col 9)-(line 728,col 75)",
        "(line 729,col 9)-(line 729,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 732,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 40)",
        "(line 735,col 9)-(line 735,col 40)",
        "(line 736,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 74)",
        "(line 745,col 9)-(line 745,col 74)",
        "(line 746,col 9)-(line 746,col 25)",
        "(line 747,col 9)-(line 747,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 750,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 40)",
        "(line 753,col 9)-(line 753,col 40)",
        "(line 754,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 74)",
        "(line 763,col 9)-(line 763,col 74)",
        "(line 764,col 9)-(line 764,col 36)",
        "(line 765,col 9)-(line 765,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 768,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 48)",
        "(line 771,col 9)-(line 771,col 38)",
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 48)",
        "(line 774,col 9)-(line 774,col 38)",
        "(line 775,col 9)-(line 775,col 38)",
        "(line 776,col 9)-(line 776,col 29)",
        "(line 777,col 9)-(line 777,col 29)",
        "(line 778,col 9)-(line 778,col 70)",
        "(line 779,col 9)-(line 779,col 72)",
        "(line 780,col 9)-(line 780,col 70)",
        "(line 781,col 9)-(line 781,col 72)",
        "(line 782,col 9)-(line 782,col 26)",
        "(line 783,col 9)-(line 783,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 786,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 36)",
        "(line 789,col 9)-(line 789,col 23)",
        "(line 790,col 9)-(line 790,col 23)",
        "(line 791,col 9)-(line 791,col 36)",
        "(line 792,col 9)-(line 792,col 23)",
        "(line 793,col 9)-(line 793,col 23)",
        "(line 794,col 9)-(line 794,col 29)",
        "(line 795,col 9)-(line 795,col 29)",
        "(line 796,col 9)-(line 796,col 70)",
        "(line 797,col 9)-(line 797,col 72)",
        "(line 798,col 9)-(line 798,col 70)",
        "(line 799,col 9)-(line 799,col 72)",
        "(line 800,col 9)-(line 800,col 22)",
        "(line 801,col 9)-(line 801,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 804,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 34)",
        "(line 807,col 9)-(line 807,col 22)",
        "(line 808,col 9)-(line 808,col 22)",
        "(line 809,col 9)-(line 809,col 34)",
        "(line 810,col 9)-(line 810,col 22)",
        "(line 811,col 9)-(line 811,col 22)",
        "(line 812,col 9)-(line 812,col 29)",
        "(line 813,col 9)-(line 813,col 29)",
        "(line 814,col 9)-(line 814,col 70)",
        "(line 815,col 9)-(line 815,col 72)",
        "(line 816,col 9)-(line 816,col 70)",
        "(line 817,col 9)-(line 817,col 72)",
        "(line 818,col 9)-(line 818,col 22)",
        "(line 819,col 9)-(line 819,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 822,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 38)",
        "(line 825,col 9)-(line 825,col 22)",
        "(line 826,col 9)-(line 826,col 22)",
        "(line 827,col 9)-(line 827,col 38)",
        "(line 828,col 9)-(line 828,col 22)",
        "(line 829,col 9)-(line 829,col 22)",
        "(line 830,col 9)-(line 830,col 29)",
        "(line 831,col 9)-(line 831,col 29)",
        "(line 832,col 9)-(line 832,col 70)",
        "(line 833,col 9)-(line 833,col 72)",
        "(line 834,col 9)-(line 834,col 70)",
        "(line 835,col 9)-(line 835,col 72)",
        "(line 836,col 9)-(line 836,col 22)",
        "(line 837,col 9)-(line 837,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 840,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 36)",
        "(line 843,col 9)-(line 843,col 22)",
        "(line 844,col 9)-(line 844,col 22)",
        "(line 845,col 9)-(line 845,col 36)",
        "(line 846,col 9)-(line 846,col 22)",
        "(line 847,col 9)-(line 847,col 22)",
        "(line 848,col 9)-(line 848,col 29)",
        "(line 849,col 9)-(line 849,col 29)",
        "(line 850,col 9)-(line 850,col 70)",
        "(line 851,col 9)-(line 851,col 72)",
        "(line 852,col 9)-(line 852,col 70)",
        "(line 853,col 9)-(line 853,col 72)",
        "(line 854,col 9)-(line 854,col 22)",
        "(line 855,col 9)-(line 855,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 858,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 36)",
        "(line 861,col 9)-(line 861,col 22)",
        "(line 862,col 9)-(line 862,col 22)",
        "(line 863,col 9)-(line 863,col 36)",
        "(line 864,col 9)-(line 864,col 22)",
        "(line 865,col 9)-(line 865,col 22)",
        "(line 866,col 9)-(line 866,col 29)",
        "(line 867,col 9)-(line 867,col 29)",
        "(line 868,col 9)-(line 868,col 70)",
        "(line 869,col 9)-(line 869,col 72)",
        "(line 870,col 9)-(line 870,col 70)",
        "(line 871,col 9)-(line 871,col 72)",
        "(line 872,col 9)-(line 872,col 22)",
        "(line 873,col 9)-(line 873,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 876,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 40)",
        "(line 879,col 9)-(line 879,col 22)",
        "(line 880,col 9)-(line 880,col 22)",
        "(line 881,col 9)-(line 881,col 40)",
        "(line 882,col 9)-(line 882,col 22)",
        "(line 883,col 9)-(line 883,col 22)",
        "(line 884,col 9)-(line 884,col 29)",
        "(line 885,col 9)-(line 885,col 29)",
        "(line 886,col 9)-(line 886,col 70)",
        "(line 887,col 9)-(line 887,col 72)",
        "(line 888,col 9)-(line 888,col 70)",
        "(line 889,col 9)-(line 889,col 72)",
        "(line 890,col 9)-(line 890,col 22)",
        "(line 891,col 9)-(line 891,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 894,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 38)",
        "(line 897,col 9)-(line 897,col 22)",
        "(line 898,col 9)-(line 898,col 22)",
        "(line 899,col 9)-(line 899,col 38)",
        "(line 900,col 9)-(line 900,col 22)",
        "(line 901,col 9)-(line 901,col 22)",
        "(line 902,col 9)-(line 902,col 29)",
        "(line 903,col 9)-(line 903,col 29)",
        "(line 904,col 9)-(line 904,col 70)",
        "(line 905,col 9)-(line 905,col 72)",
        "(line 906,col 9)-(line 906,col 70)",
        "(line 907,col 9)-(line 907,col 72)",
        "(line 908,col 9)-(line 908,col 22)",
        "(line 909,col 9)-(line 909,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 912,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 42)",
        "(line 915,col 9)-(line 915,col 25)",
        "(line 916,col 9)-(line 916,col 26)",
        "(line 917,col 9)-(line 917,col 42)",
        "(line 918,col 9)-(line 918,col 25)",
        "(line 919,col 9)-(line 919,col 26)",
        "(line 920,col 9)-(line 920,col 29)",
        "(line 921,col 9)-(line 921,col 29)",
        "(line 922,col 9)-(line 922,col 70)",
        "(line 923,col 9)-(line 923,col 72)",
        "(line 924,col 9)-(line 924,col 70)",
        "(line 925,col 9)-(line 925,col 72)",
        "(line 926,col 9)-(line 926,col 25)",
        "(line 927,col 9)-(line 927,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 930,
      "end_line": 954,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 931,
      "end_line": 931,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 933,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 934,col 13)-(line 934,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 937,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 939,col 13)-(line 941,col 13)",
        "(line 942,col 13)-(line 944,col 13)",
        "(line 945,col 13)-(line 947,col 13)",
        "(line 948,col 13)-(line 948,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 951,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 952,col 13)-(line 952,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 956,
      "end_line": 980,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 959,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 960,col 13)-(line 960,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 963,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 965,col 13)-(line 967,col 13)",
        "(line 968,col 13)-(line 970,col 13)",
        "(line 971,col 13)-(line 973,col 13)",
        "(line 974,col 13)-(line 974,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 977,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 978,col 13)-(line 978,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 987,
      "end_line": 1006,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 57)",
        "(line 990,col 9)-(line 990,col 57)",
        "(line 993,col 9)-(line 993,col 40)",
        "(line 994,col 9)-(line 994,col 40)",
        "(line 995,col 9)-(line 995,col 40)",
        "(line 996,col 9)-(line 996,col 40)",
        "(line 998,col 9)-(line 998,col 38)",
        "(line 999,col 9)-(line 999,col 38)",
        "(line 1000,col 9)-(line 1000,col 38)",
        "(line 1001,col 9)-(line 1001,col 38)",
        "(line 1002,col 9)-(line 1002,col 64)",
        "(line 1003,col 9)-(line 1003,col 64)",
        "(line 1004,col 9)-(line 1004,col 64)",
        "(line 1005,col 9)-(line 1005,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 1011,
      "end_line": 1019,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 84)",
        "(line 1014,col 9)-(line 1014,col 98)",
        "(line 1018,col 9)-(line 1018,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 1021,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 84)",
        "(line 1024,col 9)-(line 1024,col 84)",
        "(line 1027,col 9)-(line 1027,col 60)",
        "(line 1030,col 9)-(line 1030,col 77)",
        "(line 1031,col 9)-(line 1031,col 77)",
        "(line 1032,col 9)-(line 1032,col 82)",
        "(line 1035,col 9)-(line 1035,col 82)",
        "(line 1036,col 9)-(line 1036,col 84)",
        "(line 1039,col 9)-(line 1039,col 90)",
        "(line 1042,col 9)-(line 1042,col 97)",
        "(line 1043,col 9)-(line 1043,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1046,
      "end_line": 1059,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1047,
      "end_line": 1048,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 1049,
      "end_line": 1050,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 1051,
      "end_line": 1052,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1055,col 43)",
        "(line 1056,col 13)-(line 1056,col 43)",
        "(line 1057,col 13)-(line 1057,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences()",
      "begin_line": 1065,
      "end_line": 1088,
      "comment": "\n     * Test cyclical object references which cause a StackOverflowException if\n     * not handled properly. s. LANG-606\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 63)",
        "(line 1068,col 9)-(line 1068,col 60)",
        "(line 1069,col 9)-(line 1069,col 37)",
        "(line 1070,col 9)-(line 1070,col 37)",
        "(line 1072,col 9)-(line 1072,col 63)",
        "(line 1073,col 9)-(line 1073,col 60)",
        "(line 1074,col 9)-(line 1074,col 37)",
        "(line 1075,col 9)-(line 1075,col 37)",
        "(line 1077,col 9)-(line 1077,col 63)",
        "(line 1078,col 9)-(line 1078,col 60)",
        "(line 1079,col 9)-(line 1079,col 37)",
        "(line 1080,col 9)-(line 1080,col 37)",
        "(line 1082,col 9)-(line 1082,col 34)",
        "(line 1083,col 9)-(line 1083,col 48)",
        "(line 1084,col 9)-(line 1084,col 35)",
        "(line 1085,col 9)-(line 1085,col 48)",
        "(line 1086,col 9)-(line 1086,col 35)",
        "(line 1087,col 9)-(line 1087,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectReference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1090,
      "end_line": 1108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 1091,
      "end_line": 1092,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1093,
      "end_line": 1094,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.TestObjectReference(int)",
      "begin_line": 1096,
      "end_line": 1098,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 13)-(line 1097,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.setObjectReference(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference)",
      "begin_line": 1100,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1101,col 13)-(line 1101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.equals(java.lang.Object)",
      "begin_line": 1104,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 13)-(line 1106,col 61)"
      ]
    }
  ]
}