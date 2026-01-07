{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 1054,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 13)-(line 41,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 43,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 44)",
        "(line 46,col 13)-(line 46,col 43)",
        "(line 47,col 13)-(line 49,col 13)",
        "(line 51,col 13)-(line 51,col 44)",
        "(line 52,col 13)-(line 52,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 64,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 21)",
        "(line 71,col 13)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 44)",
        "(line 76,col 13)-(line 76,col 43)",
        "(line 77,col 13)-(line 79,col 13)",
        "(line 81,col 13)-(line 81,col 50)",
        "(line 82,col 13)-(line 82,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 94,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 100,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 13)-(line 104,col 21)",
        "(line 105,col 13)-(line 105,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 109,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 110,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 24)",
        "(line 114,col 13)-(line 114,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 118,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 119,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 28)",
        "(line 123,col 13)-(line 123,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 127,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 13)-(line 130,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 140,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 59)",
        "(line 144,col 9)-(line 144,col 60)",
        "(line 145,col 9)-(line 145,col 19)",
        "(line 146,col 9)-(line 146,col 59)",
        "(line 148,col 9)-(line 148,col 62)",
        "(line 150,col 9)-(line 150,col 62)",
        "(line 151,col 9)-(line 151,col 62)",
        "(line 152,col 9)-(line 152,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 155,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 45)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 159,col 9)-(line 159,col 125)",
        "(line 160,col 9)-(line 160,col 126)",
        "(line 161,col 9)-(line 161,col 126)",
        "(line 162,col 9)-(line 162,col 126)",
        "(line 163,col 9)-(line 163,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 166,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 46)",
        "(line 169,col 9)-(line 169,col 46)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 171,col 60)",
        "(line 172,col 9)-(line 172,col 55)",
        "(line 173,col 9)-(line 173,col 61)",
        "(line 174,col 9)-(line 174,col 65)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 56)",
        "(line 177,col 9)-(line 177,col 56)",
        "(line 178,col 9)-(line 178,col 53)",
        "(line 180,col 9)-(line 180,col 112)",
        "(line 181,col 9)-(line 181,col 119)",
        "(line 186,col 9)-(line 186,col 79)",
        "(line 187,col 9)-(line 187,col 119)",
        "(line 189,col 9)-(line 189,col 120)",
        "(line 190,col 9)-(line 190,col 120)",
        "(line 192,col 9)-(line 192,col 120)",
        "(line 193,col 9)-(line 193,col 120)",
        "(line 196,col 9)-(line 196,col 78)",
        "(line 197,col 9)-(line 197,col 78)",
        "(line 199,col 9)-(line 199,col 69)",
        "(line 200,col 9)-(line 200,col 69)",
        "(line 202,col 9)-(line 202,col 70)",
        "(line 203,col 9)-(line 203,col 70)",
        "(line 205,col 9)-(line 205,col 71)",
        "(line 206,col 9)-(line 206,col 71)",
        "(line 209,col 9)-(line 209,col 114)",
        "(line 210,col 9)-(line 210,col 114)",
        "(line 212,col 9)-(line 212,col 113)",
        "(line 213,col 9)-(line 213,col 113)",
        "(line 215,col 9)-(line 215,col 113)",
        "(line 216,col 9)-(line 216,col 113)",
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 219,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 238,
      "end_line": 279,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     * @param testTransients whether to test transient instance variables \n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 75)",
        "(line 248,col 9)-(line 248,col 77)",
        "(line 251,col 9)-(line 251,col 139)",
        "(line 254,col 9)-(line 257,col 78)",
        "(line 260,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 82)",
        "(line 265,col 9)-(line 265,col 82)",
        "(line 266,col 9)-(line 266,col 38)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 83)",
        "(line 271,col 9)-(line 271,col 83)",
        "(line 274,col 9)-(line 274,col 78)",
        "(line 275,col 9)-(line 275,col 79)",
        "(line 276,col 9)-(line 276,col 78)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 278,col 9)-(line 278,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 281,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 42)",
        "(line 284,col 9)-(line 284,col 92)",
        "(line 285,col 9)-(line 285,col 94)",
        "(line 286,col 9)-(line 286,col 93)",
        "(line 287,col 9)-(line 287,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 290,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 42)",
        "(line 293,col 9)-(line 293,col 66)",
        "(line 294,col 9)-(line 294,col 67)",
        "(line 295,col 9)-(line 295,col 19)",
        "(line 296,col 9)-(line 296,col 66)",
        "(line 298,col 9)-(line 298,col 69)",
        "(line 300,col 9)-(line 300,col 69)",
        "(line 301,col 9)-(line 301,col 69)",
        "(line 302,col 9)-(line 302,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild()",
      "begin_line": 305,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 42)",
        "(line 307,col 9)-(line 307,col 42)",
        "(line 308,col 9)-(line 308,col 63)",
        "(line 309,col 9)-(line 309,col 64)",
        "(line 310,col 9)-(line 310,col 19)",
        "(line 311,col 9)-(line 311,col 63)",
        "(line 313,col 9)-(line 313,col 66)",
        "(line 315,col 9)-(line 315,col 66)",
        "(line 316,col 9)-(line 316,col 66)",
        "(line 317,col 9)-(line 317,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 320,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 21)",
        "(line 322,col 9)-(line 322,col 21)",
        "(line 323,col 9)-(line 323,col 66)",
        "(line 324,col 9)-(line 324,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 327,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 19)",
        "(line 329,col 9)-(line 329,col 19)",
        "(line 330,col 9)-(line 330,col 66)",
        "(line 331,col 9)-(line 331,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 334,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 21)",
        "(line 336,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 337,col 66)",
        "(line 338,col 9)-(line 338,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 20)",
        "(line 343,col 9)-(line 343,col 20)",
        "(line 344,col 9)-(line 344,col 66)",
        "(line 345,col 9)-(line 345,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 348,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 20)",
        "(line 350,col 9)-(line 350,col 20)",
        "(line 351,col 9)-(line 351,col 66)",
        "(line 352,col 9)-(line 352,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 355,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 22)",
        "(line 357,col 9)-(line 357,col 22)",
        "(line 358,col 9)-(line 358,col 66)",
        "(line 359,col 9)-(line 359,col 67)",
        "(line 360,col 9)-(line 360,col 75)",
        "(line 361,col 9)-(line 361,col 82)",
        "(line 362,col 9)-(line 362,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 365,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 21)",
        "(line 367,col 9)-(line 367,col 21)",
        "(line 368,col 9)-(line 368,col 66)",
        "(line 369,col 9)-(line 369,col 67)",
        "(line 370,col 9)-(line 370,col 74)",
        "(line 371,col 9)-(line 371,col 80)",
        "(line 372,col 9)-(line 372,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 375,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 377,col 45)",
        "(line 378,col 9)-(line 378,col 38)",
        "(line 379,col 9)-(line 379,col 45)",
        "(line 380,col 9)-(line 380,col 39)",
        "(line 381,col 9)-(line 381,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 384,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 58)",
        "(line 386,col 9)-(line 386,col 45)",
        "(line 387,col 9)-(line 387,col 39)",
        "(line 388,col 9)-(line 388,col 46)",
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 393,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 26)",
        "(line 395,col 9)-(line 395,col 27)",
        "(line 396,col 9)-(line 396,col 66)",
        "(line 397,col 9)-(line 397,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 400,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 46)",
        "(line 402,col 9)-(line 402,col 36)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 404,col 9)-(line 404,col 23)",
        "(line 405,col 9)-(line 405,col 46)",
        "(line 406,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 407,col 36)",
        "(line 408,col 9)-(line 408,col 23)",
        "(line 410,col 9)-(line 410,col 70)",
        "(line 411,col 9)-(line 411,col 70)",
        "(line 412,col 9)-(line 412,col 70)",
        "(line 413,col 9)-(line 413,col 24)",
        "(line 414,col 9)-(line 414,col 71)",
        "(line 415,col 9)-(line 415,col 24)",
        "(line 416,col 9)-(line 416,col 70)",
        "(line 417,col 9)-(line 417,col 26)",
        "(line 418,col 9)-(line 418,col 71)",
        "(line 419,col 9)-(line 419,col 23)",
        "(line 420,col 9)-(line 420,col 70)",
        "(line 422,col 9)-(line 422,col 20)",
        "(line 423,col 9)-(line 423,col 71)",
        "(line 424,col 9)-(line 424,col 20)",
        "(line 425,col 9)-(line 425,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 428,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 34)",
        "(line 430,col 9)-(line 430,col 21)",
        "(line 431,col 9)-(line 431,col 21)",
        "(line 432,col 9)-(line 432,col 34)",
        "(line 433,col 9)-(line 433,col 21)",
        "(line 434,col 9)-(line 434,col 21)",
        "(line 435,col 9)-(line 435,col 70)",
        "(line 436,col 9)-(line 436,col 70)",
        "(line 437,col 9)-(line 437,col 20)",
        "(line 438,col 9)-(line 438,col 71)",
        "(line 440,col 9)-(line 440,col 20)",
        "(line 441,col 9)-(line 441,col 71)",
        "(line 442,col 9)-(line 442,col 20)",
        "(line 443,col 9)-(line 443,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 446,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 32)",
        "(line 448,col 9)-(line 448,col 20)",
        "(line 449,col 9)-(line 449,col 20)",
        "(line 450,col 9)-(line 450,col 32)",
        "(line 451,col 9)-(line 451,col 20)",
        "(line 452,col 9)-(line 452,col 20)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 464,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 20)",
        "(line 467,col 9)-(line 467,col 20)",
        "(line 468,col 9)-(line 468,col 36)",
        "(line 469,col 9)-(line 469,col 20)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 70)",
        "(line 472,col 9)-(line 472,col 70)",
        "(line 473,col 9)-(line 473,col 20)",
        "(line 474,col 9)-(line 474,col 71)",
        "(line 476,col 9)-(line 476,col 20)",
        "(line 477,col 9)-(line 477,col 71)",
        "(line 478,col 9)-(line 478,col 20)",
        "(line 479,col 9)-(line 479,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 482,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 34)",
        "(line 484,col 9)-(line 484,col 20)",
        "(line 485,col 9)-(line 485,col 20)",
        "(line 486,col 9)-(line 486,col 34)",
        "(line 487,col 9)-(line 487,col 20)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 489,col 9)-(line 489,col 70)",
        "(line 490,col 9)-(line 490,col 70)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 71)",
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 71)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 500,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 34)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 34)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 70)",
        "(line 508,col 9)-(line 508,col 70)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 71)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 71)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 518,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 38)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 70)",
        "(line 526,col 9)-(line 526,col 70)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 71)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 71)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 536,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 36)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 20)",
        "(line 540,col 9)-(line 540,col 36)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 70)",
        "(line 544,col 9)-(line 544,col 70)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 71)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 71)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 554,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 40)",
        "(line 556,col 9)-(line 556,col 23)",
        "(line 557,col 9)-(line 557,col 24)",
        "(line 558,col 9)-(line 558,col 40)",
        "(line 559,col 9)-(line 559,col 23)",
        "(line 560,col 9)-(line 560,col 24)",
        "(line 561,col 9)-(line 561,col 70)",
        "(line 562,col 9)-(line 562,col 70)",
        "(line 563,col 9)-(line 563,col 23)",
        "(line 564,col 9)-(line 564,col 71)",
        "(line 566,col 9)-(line 566,col 20)",
        "(line 567,col 9)-(line 567,col 71)",
        "(line 568,col 9)-(line 568,col 20)",
        "(line 569,col 9)-(line 569,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 572,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 41)",
        "(line 574,col 9)-(line 574,col 41)",
        "(line 575,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 74)",
        "(line 582,col 9)-(line 582,col 74)",
        "(line 583,col 9)-(line 583,col 25)",
        "(line 584,col 9)-(line 584,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 587,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 39)",
        "(line 589,col 9)-(line 589,col 39)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 74)",
        "(line 597,col 9)-(line 597,col 74)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 602,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 43)",
        "(line 604,col 9)-(line 604,col 43)",
        "(line 605,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 74)",
        "(line 612,col 9)-(line 612,col 74)",
        "(line 613,col 9)-(line 613,col 25)",
        "(line 614,col 9)-(line 614,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 617,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 41)",
        "(line 619,col 9)-(line 619,col 41)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 74)",
        "(line 627,col 9)-(line 627,col 74)",
        "(line 628,col 9)-(line 628,col 25)",
        "(line 629,col 9)-(line 629,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 632,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 41)",
        "(line 634,col 9)-(line 634,col 41)",
        "(line 635,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 74)",
        "(line 642,col 9)-(line 642,col 74)",
        "(line 643,col 9)-(line 643,col 25)",
        "(line 644,col 9)-(line 644,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 646,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 43)",
        "(line 648,col 9)-(line 648,col 43)",
        "(line 649,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 74)",
        "(line 656,col 9)-(line 656,col 74)",
        "(line 657,col 9)-(line 657,col 25)",
        "(line 658,col 9)-(line 658,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 661,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 45)",
        "(line 663,col 9)-(line 663,col 45)",
        "(line 664,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 74)",
        "(line 671,col 9)-(line 671,col 74)",
        "(line 672,col 9)-(line 672,col 25)",
        "(line 673,col 9)-(line 673,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 676,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 47)",
        "(line 678,col 9)-(line 678,col 47)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 74)",
        "(line 686,col 9)-(line 686,col 74)",
        "(line 687,col 9)-(line 687,col 29)",
        "(line 688,col 9)-(line 688,col 75)",
        "(line 691,col 9)-(line 691,col 53)",
        "(line 692,col 9)-(line 692,col 75)",
        "(line 693,col 9)-(line 693,col 75)",
        "(line 694,col 9)-(line 694,col 75)",
        "(line 695,col 9)-(line 695,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 698,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 40)",
        "(line 700,col 9)-(line 700,col 40)",
        "(line 701,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 74)",
        "(line 710,col 9)-(line 710,col 74)",
        "(line 711,col 9)-(line 711,col 25)",
        "(line 712,col 9)-(line 712,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 715,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 40)",
        "(line 717,col 9)-(line 717,col 40)",
        "(line 718,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 726,col 74)",
        "(line 727,col 9)-(line 727,col 74)",
        "(line 728,col 9)-(line 728,col 36)",
        "(line 729,col 9)-(line 729,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 732,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 48)",
        "(line 734,col 9)-(line 734,col 38)",
        "(line 735,col 9)-(line 735,col 38)",
        "(line 736,col 9)-(line 736,col 48)",
        "(line 737,col 9)-(line 737,col 38)",
        "(line 738,col 9)-(line 738,col 38)",
        "(line 739,col 9)-(line 739,col 29)",
        "(line 740,col 9)-(line 740,col 29)",
        "(line 741,col 9)-(line 741,col 70)",
        "(line 742,col 9)-(line 742,col 72)",
        "(line 743,col 9)-(line 743,col 70)",
        "(line 744,col 9)-(line 744,col 72)",
        "(line 745,col 9)-(line 745,col 26)",
        "(line 746,col 9)-(line 746,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 749,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 36)",
        "(line 751,col 9)-(line 751,col 23)",
        "(line 752,col 9)-(line 752,col 23)",
        "(line 753,col 9)-(line 753,col 36)",
        "(line 754,col 9)-(line 754,col 23)",
        "(line 755,col 9)-(line 755,col 23)",
        "(line 756,col 9)-(line 756,col 29)",
        "(line 757,col 9)-(line 757,col 29)",
        "(line 758,col 9)-(line 758,col 70)",
        "(line 759,col 9)-(line 759,col 72)",
        "(line 760,col 9)-(line 760,col 70)",
        "(line 761,col 9)-(line 761,col 72)",
        "(line 762,col 9)-(line 762,col 22)",
        "(line 763,col 9)-(line 763,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 766,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 34)",
        "(line 768,col 9)-(line 768,col 22)",
        "(line 769,col 9)-(line 769,col 22)",
        "(line 770,col 9)-(line 770,col 34)",
        "(line 771,col 9)-(line 771,col 22)",
        "(line 772,col 9)-(line 772,col 22)",
        "(line 773,col 9)-(line 773,col 29)",
        "(line 774,col 9)-(line 774,col 29)",
        "(line 775,col 9)-(line 775,col 70)",
        "(line 776,col 9)-(line 776,col 72)",
        "(line 777,col 9)-(line 777,col 70)",
        "(line 778,col 9)-(line 778,col 72)",
        "(line 779,col 9)-(line 779,col 22)",
        "(line 780,col 9)-(line 780,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 783,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 38)",
        "(line 785,col 9)-(line 785,col 22)",
        "(line 786,col 9)-(line 786,col 22)",
        "(line 787,col 9)-(line 787,col 38)",
        "(line 788,col 9)-(line 788,col 22)",
        "(line 789,col 9)-(line 789,col 22)",
        "(line 790,col 9)-(line 790,col 29)",
        "(line 791,col 9)-(line 791,col 29)",
        "(line 792,col 9)-(line 792,col 70)",
        "(line 793,col 9)-(line 793,col 72)",
        "(line 794,col 9)-(line 794,col 70)",
        "(line 795,col 9)-(line 795,col 72)",
        "(line 796,col 9)-(line 796,col 22)",
        "(line 797,col 9)-(line 797,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 800,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 36)",
        "(line 802,col 9)-(line 802,col 22)",
        "(line 803,col 9)-(line 803,col 22)",
        "(line 804,col 9)-(line 804,col 36)",
        "(line 805,col 9)-(line 805,col 22)",
        "(line 806,col 9)-(line 806,col 22)",
        "(line 807,col 9)-(line 807,col 29)",
        "(line 808,col 9)-(line 808,col 29)",
        "(line 809,col 9)-(line 809,col 70)",
        "(line 810,col 9)-(line 810,col 72)",
        "(line 811,col 9)-(line 811,col 70)",
        "(line 812,col 9)-(line 812,col 72)",
        "(line 813,col 9)-(line 813,col 22)",
        "(line 814,col 9)-(line 814,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 817,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 36)",
        "(line 819,col 9)-(line 819,col 22)",
        "(line 820,col 9)-(line 820,col 22)",
        "(line 821,col 9)-(line 821,col 36)",
        "(line 822,col 9)-(line 822,col 22)",
        "(line 823,col 9)-(line 823,col 22)",
        "(line 824,col 9)-(line 824,col 29)",
        "(line 825,col 9)-(line 825,col 29)",
        "(line 826,col 9)-(line 826,col 70)",
        "(line 827,col 9)-(line 827,col 72)",
        "(line 828,col 9)-(line 828,col 70)",
        "(line 829,col 9)-(line 829,col 72)",
        "(line 830,col 9)-(line 830,col 22)",
        "(line 831,col 9)-(line 831,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 834,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 40)",
        "(line 836,col 9)-(line 836,col 22)",
        "(line 837,col 9)-(line 837,col 22)",
        "(line 838,col 9)-(line 838,col 40)",
        "(line 839,col 9)-(line 839,col 22)",
        "(line 840,col 9)-(line 840,col 22)",
        "(line 841,col 9)-(line 841,col 29)",
        "(line 842,col 9)-(line 842,col 29)",
        "(line 843,col 9)-(line 843,col 70)",
        "(line 844,col 9)-(line 844,col 72)",
        "(line 845,col 9)-(line 845,col 70)",
        "(line 846,col 9)-(line 846,col 72)",
        "(line 847,col 9)-(line 847,col 22)",
        "(line 848,col 9)-(line 848,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 851,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 38)",
        "(line 853,col 9)-(line 853,col 22)",
        "(line 854,col 9)-(line 854,col 22)",
        "(line 855,col 9)-(line 855,col 38)",
        "(line 856,col 9)-(line 856,col 22)",
        "(line 857,col 9)-(line 857,col 22)",
        "(line 858,col 9)-(line 858,col 29)",
        "(line 859,col 9)-(line 859,col 29)",
        "(line 860,col 9)-(line 860,col 70)",
        "(line 861,col 9)-(line 861,col 72)",
        "(line 862,col 9)-(line 862,col 70)",
        "(line 863,col 9)-(line 863,col 72)",
        "(line 864,col 9)-(line 864,col 22)",
        "(line 865,col 9)-(line 865,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 868,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 42)",
        "(line 870,col 9)-(line 870,col 25)",
        "(line 871,col 9)-(line 871,col 26)",
        "(line 872,col 9)-(line 872,col 42)",
        "(line 873,col 9)-(line 873,col 25)",
        "(line 874,col 9)-(line 874,col 26)",
        "(line 875,col 9)-(line 875,col 29)",
        "(line 876,col 9)-(line 876,col 29)",
        "(line 877,col 9)-(line 877,col 70)",
        "(line 878,col 9)-(line 878,col 72)",
        "(line 879,col 9)-(line 879,col 70)",
        "(line 880,col 9)-(line 880,col 72)",
        "(line 881,col 9)-(line 881,col 25)",
        "(line 882,col 9)-(line 882,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 885,
      "end_line": 906,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 888,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 889,col 13)-(line 889,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 892,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 894,col 13)-(line 895,col 28)",
        "(line 896,col 13)-(line 897,col 61)",
        "(line 898,col 13)-(line 899,col 61)",
        "(line 900,col 13)-(line 900,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 13)-(line 904,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 908,
      "end_line": 929,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 909,
      "end_line": 909,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 911,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 912,col 13)-(line 912,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 915,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 917,col 13)-(line 918,col 28)",
        "(line 919,col 13)-(line 920,col 61)",
        "(line 921,col 13)-(line 922,col 61)",
        "(line 923,col 13)-(line 923,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 927,col 13)-(line 927,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 936,
      "end_line": 954,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 57)",
        "(line 941,col 9)-(line 941,col 40)",
        "(line 942,col 9)-(line 942,col 40)",
        "(line 943,col 9)-(line 943,col 40)",
        "(line 944,col 9)-(line 944,col 40)",
        "(line 946,col 9)-(line 946,col 38)",
        "(line 947,col 9)-(line 947,col 38)",
        "(line 948,col 9)-(line 948,col 38)",
        "(line 949,col 9)-(line 949,col 38)",
        "(line 950,col 9)-(line 950,col 64)",
        "(line 951,col 9)-(line 951,col 64)",
        "(line 952,col 9)-(line 952,col 64)",
        "(line 953,col 9)-(line 953,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 959,
      "end_line": 966,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 76)",
        "(line 961,col 9)-(line 961,col 86)",
        "(line 965,col 9)-(line 965,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 968,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 84)",
        "(line 970,col 9)-(line 970,col 84)",
        "(line 973,col 9)-(line 973,col 60)",
        "(line 976,col 9)-(line 976,col 77)",
        "(line 977,col 9)-(line 977,col 77)",
        "(line 978,col 9)-(line 978,col 82)",
        "(line 981,col 9)-(line 981,col 82)",
        "(line 982,col 9)-(line 982,col 84)",
        "(line 985,col 9)-(line 985,col 90)",
        "(line 988,col 9)-(line 988,col 97)",
        "(line 989,col 9)-(line 989,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 992,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 993,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 995,
      "end_line": 996,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 997,
      "end_line": 998,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 1000,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 43)",
        "(line 1002,col 13)-(line 1002,col 43)",
        "(line 1003,col 13)-(line 1003,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences()",
      "begin_line": 1011,
      "end_line": 1033,
      "comment": "\n     * Test cyclical object references which cause a StackOverflowException if\n     * not handled properly. s. LANG-606\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 63)",
        "(line 1013,col 9)-(line 1013,col 60)",
        "(line 1014,col 9)-(line 1014,col 37)",
        "(line 1015,col 9)-(line 1015,col 37)",
        "(line 1017,col 9)-(line 1017,col 63)",
        "(line 1018,col 9)-(line 1018,col 60)",
        "(line 1019,col 9)-(line 1019,col 37)",
        "(line 1020,col 9)-(line 1020,col 37)",
        "(line 1022,col 9)-(line 1022,col 63)",
        "(line 1023,col 9)-(line 1023,col 60)",
        "(line 1024,col 9)-(line 1024,col 37)",
        "(line 1025,col 9)-(line 1025,col 37)",
        "(line 1027,col 9)-(line 1027,col 34)",
        "(line 1028,col 9)-(line 1028,col 48)",
        "(line 1029,col 9)-(line 1029,col 35)",
        "(line 1030,col 9)-(line 1030,col 48)",
        "(line 1031,col 9)-(line 1031,col 35)",
        "(line 1032,col 9)-(line 1032,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectReference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1035,
      "end_line": 1053,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 1036,
      "end_line": 1037,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1038,
      "end_line": 1039,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.TestObjectReference(int)",
      "begin_line": 1041,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 13)-(line 1042,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.setObjectReference(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 13)-(line 1046,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.equals(java.lang.Object)",
      "begin_line": 1049,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 13)-(line 1051,col 61)"
      ]
    }
  ]
}