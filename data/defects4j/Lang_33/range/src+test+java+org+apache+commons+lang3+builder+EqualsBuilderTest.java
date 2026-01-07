{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 994,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 42,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 13)-(line 45,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 47,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 49,col 13)-(line 49,col 44)",
        "(line 50,col 13)-(line 50,col 43)",
        "(line 51,col 13)-(line 53,col 13)",
        "(line 55,col 13)-(line 55,col 44)",
        "(line 56,col 13)-(line 56,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 68,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 21)",
        "(line 75,col 13)-(line 75,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 77,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 44)",
        "(line 80,col 13)-(line 80,col 43)",
        "(line 81,col 13)-(line 83,col 13)",
        "(line 85,col 13)-(line 85,col 50)",
        "(line 86,col 13)-(line 86,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 98,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 104,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 105,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 21)",
        "(line 109,col 13)-(line 109,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 113,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 114,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 24)",
        "(line 118,col 13)-(line 118,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 122,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 123,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 28)",
        "(line 127,col 13)-(line 127,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 131,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 144,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 42)",
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 59)",
        "(line 148,col 9)-(line 148,col 60)",
        "(line 149,col 9)-(line 149,col 19)",
        "(line 150,col 9)-(line 150,col 59)",
        "(line 152,col 9)-(line 152,col 62)",
        "(line 154,col 9)-(line 154,col 62)",
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 156,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 159,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 44)",
        "(line 163,col 9)-(line 163,col 125)",
        "(line 164,col 9)-(line 164,col 126)",
        "(line 165,col 9)-(line 165,col 126)",
        "(line 166,col 9)-(line 166,col 126)",
        "(line 167,col 9)-(line 167,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 170,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 43)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 173,col 46)",
        "(line 174,col 9)-(line 174,col 43)",
        "(line 175,col 9)-(line 175,col 60)",
        "(line 176,col 9)-(line 176,col 55)",
        "(line 177,col 9)-(line 177,col 61)",
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 56)",
        "(line 181,col 9)-(line 181,col 56)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 184,col 9)-(line 184,col 112)",
        "(line 185,col 9)-(line 185,col 119)",
        "(line 190,col 9)-(line 190,col 79)",
        "(line 191,col 9)-(line 191,col 119)",
        "(line 193,col 9)-(line 193,col 120)",
        "(line 194,col 9)-(line 194,col 120)",
        "(line 196,col 9)-(line 196,col 120)",
        "(line 197,col 9)-(line 197,col 120)",
        "(line 200,col 9)-(line 200,col 78)",
        "(line 201,col 9)-(line 201,col 78)",
        "(line 203,col 9)-(line 203,col 69)",
        "(line 204,col 9)-(line 204,col 69)",
        "(line 206,col 9)-(line 206,col 70)",
        "(line 207,col 9)-(line 207,col 70)",
        "(line 209,col 9)-(line 209,col 71)",
        "(line 210,col 9)-(line 210,col 71)",
        "(line 213,col 9)-(line 213,col 114)",
        "(line 214,col 9)-(line 214,col 114)",
        "(line 216,col 9)-(line 216,col 113)",
        "(line 217,col 9)-(line 217,col 113)",
        "(line 219,col 9)-(line 219,col 113)",
        "(line 220,col 9)-(line 220,col 113)",
        "(line 222,col 9)-(line 222,col 63)",
        "(line 223,col 9)-(line 223,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 241,
      "end_line": 282,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
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
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 92)",
        "(line 288,col 9)-(line 288,col 94)",
        "(line 289,col 9)-(line 289,col 93)",
        "(line 290,col 9)-(line 290,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 293,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 42)",
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 66)",
        "(line 297,col 9)-(line 297,col 67)",
        "(line 298,col 9)-(line 298,col 19)",
        "(line 299,col 9)-(line 299,col 66)",
        "(line 301,col 9)-(line 301,col 69)",
        "(line 303,col 9)-(line 303,col 69)",
        "(line 304,col 9)-(line 304,col 69)",
        "(line 305,col 9)-(line 305,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 308,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 21)",
        "(line 310,col 9)-(line 310,col 21)",
        "(line 311,col 9)-(line 311,col 66)",
        "(line 312,col 9)-(line 312,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 315,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 19)",
        "(line 317,col 9)-(line 317,col 19)",
        "(line 318,col 9)-(line 318,col 66)",
        "(line 319,col 9)-(line 319,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 322,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 21)",
        "(line 324,col 9)-(line 324,col 21)",
        "(line 325,col 9)-(line 325,col 66)",
        "(line 326,col 9)-(line 326,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
      "begin_line": 329,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 20)",
        "(line 331,col 9)-(line 331,col 20)",
        "(line 332,col 9)-(line 332,col 66)",
        "(line 333,col 9)-(line 333,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 336,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 20)",
        "(line 338,col 9)-(line 338,col 20)",
        "(line 339,col 9)-(line 339,col 66)",
        "(line 340,col 9)-(line 340,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 343,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 22)",
        "(line 345,col 9)-(line 345,col 22)",
        "(line 346,col 9)-(line 346,col 66)",
        "(line 347,col 9)-(line 347,col 67)",
        "(line 348,col 9)-(line 348,col 75)",
        "(line 349,col 9)-(line 349,col 82)",
        "(line 350,col 9)-(line 350,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 353,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 21)",
        "(line 355,col 9)-(line 355,col 21)",
        "(line 356,col 9)-(line 356,col 66)",
        "(line 357,col 9)-(line 357,col 67)",
        "(line 358,col 9)-(line 358,col 74)",
        "(line 359,col 9)-(line 359,col 80)",
        "(line 360,col 9)-(line 360,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 363,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 58)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 45)",
        "(line 368,col 9)-(line 368,col 39)",
        "(line 369,col 9)-(line 369,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 372,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 375,col 39)",
        "(line 376,col 9)-(line 376,col 46)",
        "(line 377,col 9)-(line 377,col 30)",
        "(line 378,col 9)-(line 378,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 381,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 26)",
        "(line 383,col 9)-(line 383,col 27)",
        "(line 384,col 9)-(line 384,col 66)",
        "(line 385,col 9)-(line 385,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 388,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 46)",
        "(line 390,col 9)-(line 390,col 36)",
        "(line 391,col 9)-(line 391,col 36)",
        "(line 392,col 9)-(line 392,col 23)",
        "(line 393,col 9)-(line 393,col 46)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 36)",
        "(line 396,col 9)-(line 396,col 23)",
        "(line 398,col 9)-(line 398,col 70)",
        "(line 399,col 9)-(line 399,col 70)",
        "(line 400,col 9)-(line 400,col 70)",
        "(line 401,col 9)-(line 401,col 24)",
        "(line 402,col 9)-(line 402,col 71)",
        "(line 403,col 9)-(line 403,col 24)",
        "(line 404,col 9)-(line 404,col 70)",
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 71)",
        "(line 407,col 9)-(line 407,col 23)",
        "(line 408,col 9)-(line 408,col 70)",
        "(line 410,col 9)-(line 410,col 20)",
        "(line 411,col 9)-(line 411,col 71)",
        "(line 412,col 9)-(line 412,col 20)",
        "(line 413,col 9)-(line 413,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 416,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 34)",
        "(line 418,col 9)-(line 418,col 21)",
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 420,col 34)",
        "(line 421,col 9)-(line 421,col 21)",
        "(line 422,col 9)-(line 422,col 21)",
        "(line 423,col 9)-(line 423,col 70)",
        "(line 424,col 9)-(line 424,col 70)",
        "(line 425,col 9)-(line 425,col 20)",
        "(line 426,col 9)-(line 426,col 71)",
        "(line 428,col 9)-(line 428,col 20)",
        "(line 429,col 9)-(line 429,col 71)",
        "(line 430,col 9)-(line 430,col 20)",
        "(line 431,col 9)-(line 431,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 434,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 32)",
        "(line 436,col 9)-(line 436,col 20)",
        "(line 437,col 9)-(line 437,col 20)",
        "(line 438,col 9)-(line 438,col 32)",
        "(line 439,col 9)-(line 439,col 20)",
        "(line 440,col 9)-(line 440,col 20)",
        "(line 441,col 9)-(line 441,col 70)",
        "(line 442,col 9)-(line 442,col 70)",
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 71)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 447,col 71)",
        "(line 448,col 9)-(line 448,col 20)",
        "(line 449,col 9)-(line 449,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 452,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 36)",
        "(line 454,col 9)-(line 454,col 20)",
        "(line 455,col 9)-(line 455,col 20)",
        "(line 456,col 9)-(line 456,col 36)",
        "(line 457,col 9)-(line 457,col 20)",
        "(line 458,col 9)-(line 458,col 20)",
        "(line 459,col 9)-(line 459,col 70)",
        "(line 460,col 9)-(line 460,col 70)",
        "(line 461,col 9)-(line 461,col 20)",
        "(line 462,col 9)-(line 462,col 71)",
        "(line 464,col 9)-(line 464,col 20)",
        "(line 465,col 9)-(line 465,col 71)",
        "(line 466,col 9)-(line 466,col 20)",
        "(line 467,col 9)-(line 467,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 470,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 34)",
        "(line 472,col 9)-(line 472,col 20)",
        "(line 473,col 9)-(line 473,col 20)",
        "(line 474,col 9)-(line 474,col 34)",
        "(line 475,col 9)-(line 475,col 20)",
        "(line 476,col 9)-(line 476,col 20)",
        "(line 477,col 9)-(line 477,col 70)",
        "(line 478,col 9)-(line 478,col 70)",
        "(line 479,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 480,col 71)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 71)",
        "(line 484,col 9)-(line 484,col 20)",
        "(line 485,col 9)-(line 485,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 488,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 34)",
        "(line 490,col 9)-(line 490,col 20)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 34)",
        "(line 493,col 9)-(line 493,col 20)",
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 70)",
        "(line 496,col 9)-(line 496,col 70)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 71)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 71)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 506,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 38)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 38)",
        "(line 511,col 9)-(line 511,col 20)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 70)",
        "(line 514,col 9)-(line 514,col 70)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 71)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 71)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 524,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 36)",
        "(line 526,col 9)-(line 526,col 20)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 36)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 70)",
        "(line 532,col 9)-(line 532,col 70)",
        "(line 533,col 9)-(line 533,col 20)",
        "(line 534,col 9)-(line 534,col 71)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 537,col 9)-(line 537,col 71)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 542,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 40)",
        "(line 544,col 9)-(line 544,col 23)",
        "(line 545,col 9)-(line 545,col 24)",
        "(line 546,col 9)-(line 546,col 40)",
        "(line 547,col 9)-(line 547,col 23)",
        "(line 548,col 9)-(line 548,col 24)",
        "(line 549,col 9)-(line 549,col 70)",
        "(line 550,col 9)-(line 550,col 70)",
        "(line 551,col 9)-(line 551,col 23)",
        "(line 552,col 9)-(line 552,col 71)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 71)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 560,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 41)",
        "(line 562,col 9)-(line 562,col 41)",
        "(line 563,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 74)",
        "(line 570,col 9)-(line 570,col 74)",
        "(line 571,col 9)-(line 571,col 25)",
        "(line 572,col 9)-(line 572,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 575,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 39)",
        "(line 577,col 9)-(line 577,col 39)",
        "(line 578,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 74)",
        "(line 585,col 9)-(line 585,col 74)",
        "(line 586,col 9)-(line 586,col 25)",
        "(line 587,col 9)-(line 587,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 590,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 43)",
        "(line 592,col 9)-(line 592,col 43)",
        "(line 593,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 74)",
        "(line 600,col 9)-(line 600,col 74)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 605,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 41)",
        "(line 607,col 9)-(line 607,col 41)",
        "(line 608,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 74)",
        "(line 615,col 9)-(line 615,col 74)",
        "(line 616,col 9)-(line 616,col 25)",
        "(line 617,col 9)-(line 617,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 620,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 41)",
        "(line 622,col 9)-(line 622,col 41)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 74)",
        "(line 630,col 9)-(line 630,col 74)",
        "(line 631,col 9)-(line 631,col 25)",
        "(line 632,col 9)-(line 632,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 634,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 43)",
        "(line 636,col 9)-(line 636,col 43)",
        "(line 637,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 74)",
        "(line 644,col 9)-(line 644,col 74)",
        "(line 645,col 9)-(line 645,col 25)",
        "(line 646,col 9)-(line 646,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 649,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 45)",
        "(line 651,col 9)-(line 651,col 45)",
        "(line 652,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 74)",
        "(line 659,col 9)-(line 659,col 74)",
        "(line 660,col 9)-(line 660,col 25)",
        "(line 661,col 9)-(line 661,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 664,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 47)",
        "(line 666,col 9)-(line 666,col 47)",
        "(line 667,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 74)",
        "(line 674,col 9)-(line 674,col 74)",
        "(line 675,col 9)-(line 675,col 29)",
        "(line 676,col 9)-(line 676,col 75)",
        "(line 679,col 9)-(line 679,col 53)",
        "(line 680,col 9)-(line 680,col 75)",
        "(line 681,col 9)-(line 681,col 75)",
        "(line 682,col 9)-(line 682,col 75)",
        "(line 683,col 9)-(line 683,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 686,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 40)",
        "(line 688,col 9)-(line 688,col 40)",
        "(line 689,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 74)",
        "(line 698,col 9)-(line 698,col 74)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 700,col 9)-(line 700,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 703,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 40)",
        "(line 705,col 9)-(line 705,col 40)",
        "(line 706,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 714,col 74)",
        "(line 715,col 9)-(line 715,col 74)",
        "(line 716,col 9)-(line 716,col 36)",
        "(line 717,col 9)-(line 717,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 720,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 48)",
        "(line 722,col 9)-(line 722,col 38)",
        "(line 723,col 9)-(line 723,col 38)",
        "(line 724,col 9)-(line 724,col 48)",
        "(line 725,col 9)-(line 725,col 38)",
        "(line 726,col 9)-(line 726,col 38)",
        "(line 727,col 9)-(line 727,col 29)",
        "(line 728,col 9)-(line 728,col 29)",
        "(line 729,col 9)-(line 729,col 70)",
        "(line 730,col 9)-(line 730,col 72)",
        "(line 731,col 9)-(line 731,col 70)",
        "(line 732,col 9)-(line 732,col 72)",
        "(line 733,col 9)-(line 733,col 26)",
        "(line 734,col 9)-(line 734,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 737,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 36)",
        "(line 739,col 9)-(line 739,col 23)",
        "(line 740,col 9)-(line 740,col 23)",
        "(line 741,col 9)-(line 741,col 36)",
        "(line 742,col 9)-(line 742,col 23)",
        "(line 743,col 9)-(line 743,col 23)",
        "(line 744,col 9)-(line 744,col 29)",
        "(line 745,col 9)-(line 745,col 29)",
        "(line 746,col 9)-(line 746,col 70)",
        "(line 747,col 9)-(line 747,col 72)",
        "(line 748,col 9)-(line 748,col 70)",
        "(line 749,col 9)-(line 749,col 72)",
        "(line 750,col 9)-(line 750,col 22)",
        "(line 751,col 9)-(line 751,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 754,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 34)",
        "(line 756,col 9)-(line 756,col 22)",
        "(line 757,col 9)-(line 757,col 22)",
        "(line 758,col 9)-(line 758,col 34)",
        "(line 759,col 9)-(line 759,col 22)",
        "(line 760,col 9)-(line 760,col 22)",
        "(line 761,col 9)-(line 761,col 29)",
        "(line 762,col 9)-(line 762,col 29)",
        "(line 763,col 9)-(line 763,col 70)",
        "(line 764,col 9)-(line 764,col 72)",
        "(line 765,col 9)-(line 765,col 70)",
        "(line 766,col 9)-(line 766,col 72)",
        "(line 767,col 9)-(line 767,col 22)",
        "(line 768,col 9)-(line 768,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 771,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 22)",
        "(line 774,col 9)-(line 774,col 22)",
        "(line 775,col 9)-(line 775,col 38)",
        "(line 776,col 9)-(line 776,col 22)",
        "(line 777,col 9)-(line 777,col 22)",
        "(line 778,col 9)-(line 778,col 29)",
        "(line 779,col 9)-(line 779,col 29)",
        "(line 780,col 9)-(line 780,col 70)",
        "(line 781,col 9)-(line 781,col 72)",
        "(line 782,col 9)-(line 782,col 70)",
        "(line 783,col 9)-(line 783,col 72)",
        "(line 784,col 9)-(line 784,col 22)",
        "(line 785,col 9)-(line 785,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 788,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 36)",
        "(line 790,col 9)-(line 790,col 22)",
        "(line 791,col 9)-(line 791,col 22)",
        "(line 792,col 9)-(line 792,col 36)",
        "(line 793,col 9)-(line 793,col 22)",
        "(line 794,col 9)-(line 794,col 22)",
        "(line 795,col 9)-(line 795,col 29)",
        "(line 796,col 9)-(line 796,col 29)",
        "(line 797,col 9)-(line 797,col 70)",
        "(line 798,col 9)-(line 798,col 72)",
        "(line 799,col 9)-(line 799,col 70)",
        "(line 800,col 9)-(line 800,col 72)",
        "(line 801,col 9)-(line 801,col 22)",
        "(line 802,col 9)-(line 802,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 805,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 36)",
        "(line 807,col 9)-(line 807,col 22)",
        "(line 808,col 9)-(line 808,col 22)",
        "(line 809,col 9)-(line 809,col 36)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 822,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 40)",
        "(line 824,col 9)-(line 824,col 22)",
        "(line 825,col 9)-(line 825,col 22)",
        "(line 826,col 9)-(line 826,col 40)",
        "(line 827,col 9)-(line 827,col 22)",
        "(line 828,col 9)-(line 828,col 22)",
        "(line 829,col 9)-(line 829,col 29)",
        "(line 830,col 9)-(line 830,col 29)",
        "(line 831,col 9)-(line 831,col 70)",
        "(line 832,col 9)-(line 832,col 72)",
        "(line 833,col 9)-(line 833,col 70)",
        "(line 834,col 9)-(line 834,col 72)",
        "(line 835,col 9)-(line 835,col 22)",
        "(line 836,col 9)-(line 836,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 839,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 38)",
        "(line 841,col 9)-(line 841,col 22)",
        "(line 842,col 9)-(line 842,col 22)",
        "(line 843,col 9)-(line 843,col 38)",
        "(line 844,col 9)-(line 844,col 22)",
        "(line 845,col 9)-(line 845,col 22)",
        "(line 846,col 9)-(line 846,col 29)",
        "(line 847,col 9)-(line 847,col 29)",
        "(line 848,col 9)-(line 848,col 70)",
        "(line 849,col 9)-(line 849,col 72)",
        "(line 850,col 9)-(line 850,col 70)",
        "(line 851,col 9)-(line 851,col 72)",
        "(line 852,col 9)-(line 852,col 22)",
        "(line 853,col 9)-(line 853,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 856,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 42)",
        "(line 858,col 9)-(line 858,col 25)",
        "(line 859,col 9)-(line 859,col 26)",
        "(line 860,col 9)-(line 860,col 42)",
        "(line 861,col 9)-(line 861,col 25)",
        "(line 862,col 9)-(line 862,col 26)",
        "(line 863,col 9)-(line 863,col 29)",
        "(line 864,col 9)-(line 864,col 29)",
        "(line 865,col 9)-(line 865,col 70)",
        "(line 866,col 9)-(line 866,col 72)",
        "(line 867,col 9)-(line 867,col 70)",
        "(line 868,col 9)-(line 868,col 72)",
        "(line 869,col 9)-(line 869,col 25)",
        "(line 870,col 9)-(line 870,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 873,
      "end_line": 894,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 876,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 877,col 13)-(line 877,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 880,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 882,col 13)-(line 883,col 28)",
        "(line 884,col 13)-(line 885,col 61)",
        "(line 886,col 13)-(line 887,col 61)",
        "(line 888,col 13)-(line 888,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 891,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 892,col 13)-(line 892,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 896,
      "end_line": 917,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 899,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 900,col 13)-(line 900,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 903,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 906,col 28)",
        "(line 907,col 13)-(line 908,col 61)",
        "(line 909,col 13)-(line 910,col 61)",
        "(line 911,col 13)-(line 911,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 924,
      "end_line": 942,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 57)",
        "(line 926,col 9)-(line 926,col 57)",
        "(line 929,col 9)-(line 929,col 40)",
        "(line 930,col 9)-(line 930,col 40)",
        "(line 931,col 9)-(line 931,col 40)",
        "(line 932,col 9)-(line 932,col 40)",
        "(line 934,col 9)-(line 934,col 38)",
        "(line 935,col 9)-(line 935,col 38)",
        "(line 936,col 9)-(line 936,col 38)",
        "(line 937,col 9)-(line 937,col 38)",
        "(line 938,col 9)-(line 938,col 64)",
        "(line 939,col 9)-(line 939,col 64)",
        "(line 940,col 9)-(line 940,col 64)",
        "(line 941,col 9)-(line 941,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 947,
      "end_line": 954,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 76)",
        "(line 949,col 9)-(line 949,col 86)",
        "(line 953,col 9)-(line 953,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 956,
      "end_line": 978,
      "comment": "",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 84)",
        "(line 958,col 9)-(line 958,col 84)",
        "(line 961,col 9)-(line 961,col 60)",
        "(line 964,col 9)-(line 964,col 77)",
        "(line 965,col 9)-(line 965,col 77)",
        "(line 966,col 9)-(line 966,col 82)",
        "(line 969,col 9)-(line 969,col 82)",
        "(line 970,col 9)-(line 970,col 84)",
        "(line 973,col 9)-(line 973,col 90)",
        "(line 976,col 9)-(line 976,col 97)",
        "(line 977,col 9)-(line 977,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 980,
      "end_line": 993,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 981,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 983,
      "end_line": 984,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 985,
      "end_line": 986,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 988,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 989,col 13)-(line 989,col 43)",
        "(line 990,col 13)-(line 990,col 43)",
        "(line 991,col 13)-(line 991,col 47)"
      ]
    }
  ]
}