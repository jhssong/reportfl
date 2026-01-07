{
  "filepath": "/tmp/Lang-24b/src/test/java/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1058,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @author Oliver Sauder\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 43,
      "end_line": 44,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 13)-(line 46,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 48,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 13)-(line 50,col 44)",
        "(line 51,col 13)-(line 51,col 43)",
        "(line 52,col 13)-(line 54,col 13)",
        "(line 56,col 13)-(line 56,col 44)",
        "(line 57,col 13)-(line 57,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 69,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 21)",
        "(line 76,col 13)-(line 76,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 44)",
        "(line 81,col 13)-(line 81,col 43)",
        "(line 82,col 13)-(line 84,col 13)",
        "(line 86,col 13)-(line 86,col 50)",
        "(line 87,col 13)-(line 87,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 99,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 105,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 21)",
        "(line 110,col 13)-(line 110,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 114,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 115,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 24)",
        "(line 119,col 13)-(line 119,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 123,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 124,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 28)",
        "(line 128,col 13)-(line 128,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 132,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 145,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 42)",
        "(line 148,col 9)-(line 148,col 59)",
        "(line 149,col 9)-(line 149,col 60)",
        "(line 150,col 9)-(line 150,col 19)",
        "(line 151,col 9)-(line 151,col 59)",
        "(line 153,col 9)-(line 153,col 62)",
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 156,col 62)",
        "(line 157,col 9)-(line 157,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 160,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 164,col 9)-(line 164,col 125)",
        "(line 165,col 9)-(line 165,col 126)",
        "(line 166,col 9)-(line 166,col 126)",
        "(line 167,col 9)-(line 167,col 126)",
        "(line 168,col 9)-(line 168,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 171,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 43)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 174,col 46)",
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 60)",
        "(line 177,col 9)-(line 177,col 55)",
        "(line 178,col 9)-(line 178,col 61)",
        "(line 179,col 9)-(line 179,col 65)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 182,col 56)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 185,col 9)-(line 185,col 112)",
        "(line 186,col 9)-(line 186,col 119)",
        "(line 191,col 9)-(line 191,col 79)",
        "(line 192,col 9)-(line 192,col 119)",
        "(line 194,col 9)-(line 194,col 120)",
        "(line 195,col 9)-(line 195,col 120)",
        "(line 197,col 9)-(line 197,col 120)",
        "(line 198,col 9)-(line 198,col 120)",
        "(line 201,col 9)-(line 201,col 78)",
        "(line 202,col 9)-(line 202,col 78)",
        "(line 204,col 9)-(line 204,col 69)",
        "(line 205,col 9)-(line 205,col 69)",
        "(line 207,col 9)-(line 207,col 70)",
        "(line 208,col 9)-(line 208,col 70)",
        "(line 210,col 9)-(line 210,col 71)",
        "(line 211,col 9)-(line 211,col 71)",
        "(line 214,col 9)-(line 214,col 114)",
        "(line 215,col 9)-(line 215,col 114)",
        "(line 217,col 9)-(line 217,col 113)",
        "(line 218,col 9)-(line 218,col 113)",
        "(line 220,col 9)-(line 220,col 113)",
        "(line 221,col 9)-(line 221,col 113)",
        "(line 223,col 9)-(line 223,col 63)",
        "(line 224,col 9)-(line 224,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 242,
      "end_line": 283,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 77)",
        "(line 255,col 9)-(line 255,col 139)",
        "(line 258,col 9)-(line 261,col 78)",
        "(line 264,col 9)-(line 264,col 34)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 82)",
        "(line 269,col 9)-(line 269,col 82)",
        "(line 270,col 9)-(line 270,col 38)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 83)",
        "(line 275,col 9)-(line 275,col 83)",
        "(line 278,col 9)-(line 278,col 78)",
        "(line 279,col 9)-(line 279,col 79)",
        "(line 280,col 9)-(line 280,col 78)",
        "(line 281,col 9)-(line 281,col 79)",
        "(line 282,col 9)-(line 282,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 285,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 288,col 92)",
        "(line 289,col 9)-(line 289,col 94)",
        "(line 290,col 9)-(line 290,col 93)",
        "(line 291,col 9)-(line 291,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 294,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 66)",
        "(line 298,col 9)-(line 298,col 67)",
        "(line 299,col 9)-(line 299,col 19)",
        "(line 300,col 9)-(line 300,col 66)",
        "(line 302,col 9)-(line 302,col 69)",
        "(line 304,col 9)-(line 304,col 69)",
        "(line 305,col 9)-(line 305,col 69)",
        "(line 306,col 9)-(line 306,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild()",
      "begin_line": 309,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 63)",
        "(line 313,col 9)-(line 313,col 64)",
        "(line 314,col 9)-(line 314,col 19)",
        "(line 315,col 9)-(line 315,col 63)",
        "(line 317,col 9)-(line 317,col 66)",
        "(line 319,col 9)-(line 319,col 66)",
        "(line 320,col 9)-(line 320,col 66)",
        "(line 321,col 9)-(line 321,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 21)",
        "(line 327,col 9)-(line 327,col 66)",
        "(line 328,col 9)-(line 328,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 331,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 19)",
        "(line 333,col 9)-(line 333,col 19)",
        "(line 334,col 9)-(line 334,col 66)",
        "(line 335,col 9)-(line 335,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 338,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 21)",
        "(line 340,col 9)-(line 340,col 21)",
        "(line 341,col 9)-(line 341,col 66)",
        "(line 342,col 9)-(line 342,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
      "begin_line": 345,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 20)",
        "(line 347,col 9)-(line 347,col 20)",
        "(line 348,col 9)-(line 348,col 66)",
        "(line 349,col 9)-(line 349,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 352,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 20)",
        "(line 354,col 9)-(line 354,col 20)",
        "(line 355,col 9)-(line 355,col 66)",
        "(line 356,col 9)-(line 356,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 359,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 22)",
        "(line 361,col 9)-(line 361,col 22)",
        "(line 362,col 9)-(line 362,col 66)",
        "(line 363,col 9)-(line 363,col 67)",
        "(line 364,col 9)-(line 364,col 75)",
        "(line 365,col 9)-(line 365,col 82)",
        "(line 366,col 9)-(line 366,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 369,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 21)",
        "(line 371,col 9)-(line 371,col 21)",
        "(line 372,col 9)-(line 372,col 66)",
        "(line 373,col 9)-(line 373,col 67)",
        "(line 374,col 9)-(line 374,col 74)",
        "(line 375,col 9)-(line 375,col 80)",
        "(line 376,col 9)-(line 376,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 379,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 58)",
        "(line 381,col 9)-(line 381,col 45)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 45)",
        "(line 384,col 9)-(line 384,col 39)",
        "(line 385,col 9)-(line 385,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 58)",
        "(line 390,col 9)-(line 390,col 45)",
        "(line 391,col 9)-(line 391,col 39)",
        "(line 392,col 9)-(line 392,col 46)",
        "(line 393,col 9)-(line 393,col 30)",
        "(line 394,col 9)-(line 394,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 397,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 26)",
        "(line 399,col 9)-(line 399,col 27)",
        "(line 400,col 9)-(line 400,col 66)",
        "(line 401,col 9)-(line 401,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 404,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 46)",
        "(line 406,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 407,col 36)",
        "(line 408,col 9)-(line 408,col 23)",
        "(line 409,col 9)-(line 409,col 46)",
        "(line 410,col 9)-(line 410,col 36)",
        "(line 411,col 9)-(line 411,col 36)",
        "(line 412,col 9)-(line 412,col 23)",
        "(line 414,col 9)-(line 414,col 70)",
        "(line 415,col 9)-(line 415,col 70)",
        "(line 416,col 9)-(line 416,col 70)",
        "(line 417,col 9)-(line 417,col 24)",
        "(line 418,col 9)-(line 418,col 71)",
        "(line 419,col 9)-(line 419,col 24)",
        "(line 420,col 9)-(line 420,col 70)",
        "(line 421,col 9)-(line 421,col 26)",
        "(line 422,col 9)-(line 422,col 71)",
        "(line 423,col 9)-(line 423,col 23)",
        "(line 424,col 9)-(line 424,col 70)",
        "(line 426,col 9)-(line 426,col 20)",
        "(line 427,col 9)-(line 427,col 71)",
        "(line 428,col 9)-(line 428,col 20)",
        "(line 429,col 9)-(line 429,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 432,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 34)",
        "(line 434,col 9)-(line 434,col 21)",
        "(line 435,col 9)-(line 435,col 21)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 437,col 21)",
        "(line 438,col 9)-(line 438,col 21)",
        "(line 439,col 9)-(line 439,col 70)",
        "(line 440,col 9)-(line 440,col 70)",
        "(line 441,col 9)-(line 441,col 20)",
        "(line 442,col 9)-(line 442,col 71)",
        "(line 444,col 9)-(line 444,col 20)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 447,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 450,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 32)",
        "(line 452,col 9)-(line 452,col 20)",
        "(line 453,col 9)-(line 453,col 20)",
        "(line 454,col 9)-(line 454,col 32)",
        "(line 455,col 9)-(line 455,col 20)",
        "(line 456,col 9)-(line 456,col 20)",
        "(line 457,col 9)-(line 457,col 70)",
        "(line 458,col 9)-(line 458,col 70)",
        "(line 459,col 9)-(line 459,col 20)",
        "(line 460,col 9)-(line 460,col 71)",
        "(line 462,col 9)-(line 462,col 20)",
        "(line 463,col 9)-(line 463,col 71)",
        "(line 464,col 9)-(line 464,col 20)",
        "(line 465,col 9)-(line 465,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 468,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 36)",
        "(line 473,col 9)-(line 473,col 20)",
        "(line 474,col 9)-(line 474,col 20)",
        "(line 475,col 9)-(line 475,col 70)",
        "(line 476,col 9)-(line 476,col 70)",
        "(line 477,col 9)-(line 477,col 20)",
        "(line 478,col 9)-(line 478,col 71)",
        "(line 480,col 9)-(line 480,col 20)",
        "(line 481,col 9)-(line 481,col 71)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 486,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 34)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 490,col 34)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 20)",
        "(line 493,col 9)-(line 493,col 70)",
        "(line 494,col 9)-(line 494,col 70)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 71)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 71)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 504,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 34)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 20)",
        "(line 508,col 9)-(line 508,col 34)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 20)",
        "(line 511,col 9)-(line 511,col 70)",
        "(line 512,col 9)-(line 512,col 70)",
        "(line 513,col 9)-(line 513,col 20)",
        "(line 514,col 9)-(line 514,col 71)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 71)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 522,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 38)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 38)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 540,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 36)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 36)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 70)",
        "(line 548,col 9)-(line 548,col 70)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 71)",
        "(line 552,col 9)-(line 552,col 20)",
        "(line 553,col 9)-(line 553,col 71)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 558,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 40)",
        "(line 560,col 9)-(line 560,col 23)",
        "(line 561,col 9)-(line 561,col 24)",
        "(line 562,col 9)-(line 562,col 40)",
        "(line 563,col 9)-(line 563,col 23)",
        "(line 564,col 9)-(line 564,col 24)",
        "(line 565,col 9)-(line 565,col 70)",
        "(line 566,col 9)-(line 566,col 70)",
        "(line 567,col 9)-(line 567,col 23)",
        "(line 568,col 9)-(line 568,col 71)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 571,col 9)-(line 571,col 71)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 576,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 41)",
        "(line 578,col 9)-(line 578,col 41)",
        "(line 579,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 74)",
        "(line 586,col 9)-(line 586,col 74)",
        "(line 587,col 9)-(line 587,col 25)",
        "(line 588,col 9)-(line 588,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 591,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 39)",
        "(line 593,col 9)-(line 593,col 39)",
        "(line 594,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 74)",
        "(line 601,col 9)-(line 601,col 74)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 603,col 9)-(line 603,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 606,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 43)",
        "(line 608,col 9)-(line 608,col 43)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 74)",
        "(line 616,col 9)-(line 616,col 74)",
        "(line 617,col 9)-(line 617,col 25)",
        "(line 618,col 9)-(line 618,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 621,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 41)",
        "(line 623,col 9)-(line 623,col 41)",
        "(line 624,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 74)",
        "(line 631,col 9)-(line 631,col 74)",
        "(line 632,col 9)-(line 632,col 25)",
        "(line 633,col 9)-(line 633,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 636,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 41)",
        "(line 638,col 9)-(line 638,col 41)",
        "(line 639,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 74)",
        "(line 646,col 9)-(line 646,col 74)",
        "(line 647,col 9)-(line 647,col 25)",
        "(line 648,col 9)-(line 648,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 650,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 43)",
        "(line 652,col 9)-(line 652,col 43)",
        "(line 653,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 74)",
        "(line 660,col 9)-(line 660,col 74)",
        "(line 661,col 9)-(line 661,col 25)",
        "(line 662,col 9)-(line 662,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 665,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 45)",
        "(line 667,col 9)-(line 667,col 45)",
        "(line 668,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 74)",
        "(line 675,col 9)-(line 675,col 74)",
        "(line 676,col 9)-(line 676,col 25)",
        "(line 677,col 9)-(line 677,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 680,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 47)",
        "(line 682,col 9)-(line 682,col 47)",
        "(line 683,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 74)",
        "(line 690,col 9)-(line 690,col 74)",
        "(line 691,col 9)-(line 691,col 29)",
        "(line 692,col 9)-(line 692,col 75)",
        "(line 695,col 9)-(line 695,col 53)",
        "(line 696,col 9)-(line 696,col 75)",
        "(line 697,col 9)-(line 697,col 75)",
        "(line 698,col 9)-(line 698,col 75)",
        "(line 699,col 9)-(line 699,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 702,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 40)",
        "(line 704,col 9)-(line 704,col 40)",
        "(line 705,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 74)",
        "(line 714,col 9)-(line 714,col 74)",
        "(line 715,col 9)-(line 715,col 25)",
        "(line 716,col 9)-(line 716,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 719,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 40)",
        "(line 721,col 9)-(line 721,col 40)",
        "(line 722,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 74)",
        "(line 731,col 9)-(line 731,col 74)",
        "(line 732,col 9)-(line 732,col 36)",
        "(line 733,col 9)-(line 733,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 736,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 48)",
        "(line 738,col 9)-(line 738,col 38)",
        "(line 739,col 9)-(line 739,col 38)",
        "(line 740,col 9)-(line 740,col 48)",
        "(line 741,col 9)-(line 741,col 38)",
        "(line 742,col 9)-(line 742,col 38)",
        "(line 743,col 9)-(line 743,col 29)",
        "(line 744,col 9)-(line 744,col 29)",
        "(line 745,col 9)-(line 745,col 70)",
        "(line 746,col 9)-(line 746,col 72)",
        "(line 747,col 9)-(line 747,col 70)",
        "(line 748,col 9)-(line 748,col 72)",
        "(line 749,col 9)-(line 749,col 26)",
        "(line 750,col 9)-(line 750,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 753,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 36)",
        "(line 755,col 9)-(line 755,col 23)",
        "(line 756,col 9)-(line 756,col 23)",
        "(line 757,col 9)-(line 757,col 36)",
        "(line 758,col 9)-(line 758,col 23)",
        "(line 759,col 9)-(line 759,col 23)",
        "(line 760,col 9)-(line 760,col 29)",
        "(line 761,col 9)-(line 761,col 29)",
        "(line 762,col 9)-(line 762,col 70)",
        "(line 763,col 9)-(line 763,col 72)",
        "(line 764,col 9)-(line 764,col 70)",
        "(line 765,col 9)-(line 765,col 72)",
        "(line 766,col 9)-(line 766,col 22)",
        "(line 767,col 9)-(line 767,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 770,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 34)",
        "(line 772,col 9)-(line 772,col 22)",
        "(line 773,col 9)-(line 773,col 22)",
        "(line 774,col 9)-(line 774,col 34)",
        "(line 775,col 9)-(line 775,col 22)",
        "(line 776,col 9)-(line 776,col 22)",
        "(line 777,col 9)-(line 777,col 29)",
        "(line 778,col 9)-(line 778,col 29)",
        "(line 779,col 9)-(line 779,col 70)",
        "(line 780,col 9)-(line 780,col 72)",
        "(line 781,col 9)-(line 781,col 70)",
        "(line 782,col 9)-(line 782,col 72)",
        "(line 783,col 9)-(line 783,col 22)",
        "(line 784,col 9)-(line 784,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 787,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 38)",
        "(line 789,col 9)-(line 789,col 22)",
        "(line 790,col 9)-(line 790,col 22)",
        "(line 791,col 9)-(line 791,col 38)",
        "(line 792,col 9)-(line 792,col 22)",
        "(line 793,col 9)-(line 793,col 22)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 804,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 36)",
        "(line 806,col 9)-(line 806,col 22)",
        "(line 807,col 9)-(line 807,col 22)",
        "(line 808,col 9)-(line 808,col 36)",
        "(line 809,col 9)-(line 809,col 22)",
        "(line 810,col 9)-(line 810,col 22)",
        "(line 811,col 9)-(line 811,col 29)",
        "(line 812,col 9)-(line 812,col 29)",
        "(line 813,col 9)-(line 813,col 70)",
        "(line 814,col 9)-(line 814,col 72)",
        "(line 815,col 9)-(line 815,col 70)",
        "(line 816,col 9)-(line 816,col 72)",
        "(line 817,col 9)-(line 817,col 22)",
        "(line 818,col 9)-(line 818,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 821,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 36)",
        "(line 823,col 9)-(line 823,col 22)",
        "(line 824,col 9)-(line 824,col 22)",
        "(line 825,col 9)-(line 825,col 36)",
        "(line 826,col 9)-(line 826,col 22)",
        "(line 827,col 9)-(line 827,col 22)",
        "(line 828,col 9)-(line 828,col 29)",
        "(line 829,col 9)-(line 829,col 29)",
        "(line 830,col 9)-(line 830,col 70)",
        "(line 831,col 9)-(line 831,col 72)",
        "(line 832,col 9)-(line 832,col 70)",
        "(line 833,col 9)-(line 833,col 72)",
        "(line 834,col 9)-(line 834,col 22)",
        "(line 835,col 9)-(line 835,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 838,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 40)",
        "(line 840,col 9)-(line 840,col 22)",
        "(line 841,col 9)-(line 841,col 22)",
        "(line 842,col 9)-(line 842,col 40)",
        "(line 843,col 9)-(line 843,col 22)",
        "(line 844,col 9)-(line 844,col 22)",
        "(line 845,col 9)-(line 845,col 29)",
        "(line 846,col 9)-(line 846,col 29)",
        "(line 847,col 9)-(line 847,col 70)",
        "(line 848,col 9)-(line 848,col 72)",
        "(line 849,col 9)-(line 849,col 70)",
        "(line 850,col 9)-(line 850,col 72)",
        "(line 851,col 9)-(line 851,col 22)",
        "(line 852,col 9)-(line 852,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 855,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 38)",
        "(line 857,col 9)-(line 857,col 22)",
        "(line 858,col 9)-(line 858,col 22)",
        "(line 859,col 9)-(line 859,col 38)",
        "(line 860,col 9)-(line 860,col 22)",
        "(line 861,col 9)-(line 861,col 22)",
        "(line 862,col 9)-(line 862,col 29)",
        "(line 863,col 9)-(line 863,col 29)",
        "(line 864,col 9)-(line 864,col 70)",
        "(line 865,col 9)-(line 865,col 72)",
        "(line 866,col 9)-(line 866,col 70)",
        "(line 867,col 9)-(line 867,col 72)",
        "(line 868,col 9)-(line 868,col 22)",
        "(line 869,col 9)-(line 869,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 872,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 42)",
        "(line 874,col 9)-(line 874,col 25)",
        "(line 875,col 9)-(line 875,col 26)",
        "(line 876,col 9)-(line 876,col 42)",
        "(line 877,col 9)-(line 877,col 25)",
        "(line 878,col 9)-(line 878,col 26)",
        "(line 879,col 9)-(line 879,col 29)",
        "(line 880,col 9)-(line 880,col 29)",
        "(line 881,col 9)-(line 881,col 70)",
        "(line 882,col 9)-(line 882,col 72)",
        "(line 883,col 9)-(line 883,col 70)",
        "(line 884,col 9)-(line 884,col 72)",
        "(line 885,col 9)-(line 885,col 25)",
        "(line 886,col 9)-(line 886,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 889,
      "end_line": 910,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 893,col 13)-(line 893,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 896,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 898,col 13)-(line 899,col 28)",
        "(line 900,col 13)-(line 901,col 61)",
        "(line 902,col 13)-(line 903,col 61)",
        "(line 904,col 13)-(line 904,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 907,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 908,col 13)-(line 908,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 912,
      "end_line": 933,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 913,
      "end_line": 913,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 915,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 916,col 13)-(line 916,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 919,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 921,col 13)-(line 922,col 28)",
        "(line 923,col 13)-(line 924,col 61)",
        "(line 925,col 13)-(line 926,col 61)",
        "(line 927,col 13)-(line 927,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 930,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 931,col 13)-(line 931,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 940,
      "end_line": 958,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 57)",
        "(line 942,col 9)-(line 942,col 57)",
        "(line 945,col 9)-(line 945,col 40)",
        "(line 946,col 9)-(line 946,col 40)",
        "(line 947,col 9)-(line 947,col 40)",
        "(line 948,col 9)-(line 948,col 40)",
        "(line 950,col 9)-(line 950,col 38)",
        "(line 951,col 9)-(line 951,col 38)",
        "(line 952,col 9)-(line 952,col 38)",
        "(line 953,col 9)-(line 953,col 38)",
        "(line 954,col 9)-(line 954,col 64)",
        "(line 955,col 9)-(line 955,col 64)",
        "(line 956,col 9)-(line 956,col 64)",
        "(line 957,col 9)-(line 957,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 963,
      "end_line": 970,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 76)",
        "(line 965,col 9)-(line 965,col 86)",
        "(line 969,col 9)-(line 969,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 972,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 84)",
        "(line 974,col 9)-(line 974,col 84)",
        "(line 977,col 9)-(line 977,col 60)",
        "(line 980,col 9)-(line 980,col 77)",
        "(line 981,col 9)-(line 981,col 77)",
        "(line 982,col 9)-(line 982,col 82)",
        "(line 985,col 9)-(line 985,col 82)",
        "(line 986,col 9)-(line 986,col 84)",
        "(line 989,col 9)-(line 989,col 90)",
        "(line 992,col 9)-(line 992,col 97)",
        "(line 993,col 9)-(line 993,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 996,
      "end_line": 1009,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 997,
      "end_line": 998,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 999,
      "end_line": 1000,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 1001,
      "end_line": 1002,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 1004,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 13)-(line 1005,col 43)",
        "(line 1006,col 13)-(line 1006,col 43)",
        "(line 1007,col 13)-(line 1007,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences()",
      "begin_line": 1015,
      "end_line": 1037,
      "comment": "\n     * Test cyclical object references which cause a StackOverflowException if\n     * not handled properly. s. LANG-606\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 63)",
        "(line 1017,col 9)-(line 1017,col 60)",
        "(line 1018,col 9)-(line 1018,col 37)",
        "(line 1019,col 9)-(line 1019,col 37)",
        "(line 1021,col 9)-(line 1021,col 63)",
        "(line 1022,col 9)-(line 1022,col 60)",
        "(line 1023,col 9)-(line 1023,col 37)",
        "(line 1024,col 9)-(line 1024,col 37)",
        "(line 1026,col 9)-(line 1026,col 63)",
        "(line 1027,col 9)-(line 1027,col 60)",
        "(line 1028,col 9)-(line 1028,col 37)",
        "(line 1029,col 9)-(line 1029,col 37)",
        "(line 1031,col 9)-(line 1031,col 34)",
        "(line 1032,col 9)-(line 1032,col 48)",
        "(line 1033,col 9)-(line 1033,col 35)",
        "(line 1034,col 9)-(line 1034,col 48)",
        "(line 1035,col 9)-(line 1035,col 35)",
        "(line 1036,col 9)-(line 1036,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectReference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1039,
      "end_line": 1057,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 1040,
      "end_line": 1041,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1042,
      "end_line": 1043,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.TestObjectReference(int)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 13)-(line 1046,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.setObjectReference(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference)",
      "begin_line": 1049,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 13)-(line 1050,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.equals(java.lang.Object)",
      "begin_line": 1053,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1055,col 61)"
      ]
    }
  ]
}