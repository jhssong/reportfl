{
  "filepath": "/tmp/Lang-39b/src/test/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 1017,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.suite()",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 65)",
        "(line 47,col 9)-(line 47,col 45)",
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.setUp()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.tearDown()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 65,
      "end_line": 66,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 70,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 72,col 13)-(line 72,col 44)",
        "(line 73,col 13)-(line 73,col 43)",
        "(line 74,col 13)-(line 76,col 13)",
        "(line 78,col 13)-(line 78,col 44)",
        "(line 79,col 13)-(line 79,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 91,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 21)",
        "(line 98,col 13)-(line 98,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 100,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 44)",
        "(line 103,col 13)-(line 103,col 43)",
        "(line 104,col 13)-(line 106,col 13)",
        "(line 108,col 13)-(line 108,col 50)",
        "(line 109,col 13)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 121,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 123,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 127,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 128,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 21)",
        "(line 132,col 13)-(line 132,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 136,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 137,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 24)",
        "(line 141,col 13)-(line 141,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 145,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 146,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 28)",
        "(line 150,col 13)-(line 150,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 154,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 167,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 42)",
        "(line 169,col 9)-(line 169,col 42)",
        "(line 170,col 9)-(line 170,col 59)",
        "(line 171,col 9)-(line 171,col 60)",
        "(line 172,col 9)-(line 172,col 19)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 175,col 9)-(line 175,col 62)",
        "(line 177,col 9)-(line 177,col 62)",
        "(line 178,col 9)-(line 178,col 62)",
        "(line 179,col 9)-(line 179,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 182,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 45)",
        "(line 184,col 9)-(line 184,col 44)",
        "(line 186,col 9)-(line 186,col 125)",
        "(line 187,col 9)-(line 187,col 126)",
        "(line 188,col 9)-(line 188,col 126)",
        "(line 189,col 9)-(line 189,col 126)",
        "(line 190,col 9)-(line 190,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 193,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 195,col 46)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 55)",
        "(line 200,col 9)-(line 200,col 61)",
        "(line 201,col 9)-(line 201,col 65)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 56)",
        "(line 204,col 9)-(line 204,col 56)",
        "(line 205,col 9)-(line 205,col 53)",
        "(line 207,col 9)-(line 207,col 112)",
        "(line 208,col 9)-(line 208,col 119)",
        "(line 213,col 9)-(line 213,col 79)",
        "(line 214,col 9)-(line 214,col 119)",
        "(line 216,col 9)-(line 216,col 120)",
        "(line 217,col 9)-(line 217,col 120)",
        "(line 219,col 9)-(line 219,col 120)",
        "(line 220,col 9)-(line 220,col 120)",
        "(line 223,col 9)-(line 223,col 78)",
        "(line 224,col 9)-(line 224,col 78)",
        "(line 226,col 9)-(line 226,col 69)",
        "(line 227,col 9)-(line 227,col 69)",
        "(line 229,col 9)-(line 229,col 70)",
        "(line 230,col 9)-(line 230,col 70)",
        "(line 232,col 9)-(line 232,col 71)",
        "(line 233,col 9)-(line 233,col 71)",
        "(line 236,col 9)-(line 236,col 114)",
        "(line 237,col 9)-(line 237,col 114)",
        "(line 239,col 9)-(line 239,col 113)",
        "(line 240,col 9)-(line 240,col 113)",
        "(line 242,col 9)-(line 242,col 113)",
        "(line 243,col 9)-(line 243,col 113)",
        "(line 245,col 9)-(line 245,col 63)",
        "(line 246,col 9)-(line 246,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 264,
      "end_line": 305,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 75)",
        "(line 274,col 9)-(line 274,col 77)",
        "(line 277,col 9)-(line 277,col 139)",
        "(line 280,col 9)-(line 283,col 78)",
        "(line 286,col 9)-(line 286,col 34)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 82)",
        "(line 291,col 9)-(line 291,col 82)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 83)",
        "(line 297,col 9)-(line 297,col 83)",
        "(line 300,col 9)-(line 300,col 78)",
        "(line 301,col 9)-(line 301,col 79)",
        "(line 302,col 9)-(line 302,col 78)",
        "(line 303,col 9)-(line 303,col 79)",
        "(line 304,col 9)-(line 304,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 307,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 42)",
        "(line 309,col 9)-(line 309,col 42)",
        "(line 310,col 9)-(line 310,col 92)",
        "(line 311,col 9)-(line 311,col 94)",
        "(line 312,col 9)-(line 312,col 93)",
        "(line 313,col 9)-(line 313,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 316,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 42)",
        "(line 318,col 9)-(line 318,col 42)",
        "(line 319,col 9)-(line 319,col 66)",
        "(line 320,col 9)-(line 320,col 67)",
        "(line 321,col 9)-(line 321,col 19)",
        "(line 322,col 9)-(line 322,col 66)",
        "(line 324,col 9)-(line 324,col 69)",
        "(line 326,col 9)-(line 326,col 69)",
        "(line 327,col 9)-(line 327,col 69)",
        "(line 328,col 9)-(line 328,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 331,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 21)",
        "(line 333,col 9)-(line 333,col 21)",
        "(line 334,col 9)-(line 334,col 66)",
        "(line 335,col 9)-(line 335,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 338,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 19)",
        "(line 340,col 9)-(line 340,col 19)",
        "(line 341,col 9)-(line 341,col 66)",
        "(line 342,col 9)-(line 342,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 345,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 21)",
        "(line 347,col 9)-(line 347,col 21)",
        "(line 348,col 9)-(line 348,col 66)",
        "(line 349,col 9)-(line 349,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 359,
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
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 22)",
        "(line 368,col 9)-(line 368,col 22)",
        "(line 369,col 9)-(line 369,col 66)",
        "(line 370,col 9)-(line 370,col 67)",
        "(line 371,col 9)-(line 371,col 75)",
        "(line 372,col 9)-(line 372,col 82)",
        "(line 373,col 9)-(line 373,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 376,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 21)",
        "(line 378,col 9)-(line 378,col 21)",
        "(line 379,col 9)-(line 379,col 66)",
        "(line 380,col 9)-(line 380,col 67)",
        "(line 381,col 9)-(line 381,col 74)",
        "(line 382,col 9)-(line 382,col 80)",
        "(line 383,col 9)-(line 383,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 386,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 388,col 45)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 390,col 9)-(line 390,col 45)",
        "(line 391,col 9)-(line 391,col 39)",
        "(line 392,col 9)-(line 392,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 395,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 58)",
        "(line 397,col 9)-(line 397,col 45)",
        "(line 398,col 9)-(line 398,col 39)",
        "(line 399,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 400,col 30)",
        "(line 401,col 9)-(line 401,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 404,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 406,col 27)",
        "(line 407,col 9)-(line 407,col 66)",
        "(line 408,col 9)-(line 408,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 411,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 46)",
        "(line 413,col 9)-(line 413,col 36)",
        "(line 414,col 9)-(line 414,col 36)",
        "(line 415,col 9)-(line 415,col 23)",
        "(line 416,col 9)-(line 416,col 46)",
        "(line 417,col 9)-(line 417,col 36)",
        "(line 418,col 9)-(line 418,col 36)",
        "(line 419,col 9)-(line 419,col 23)",
        "(line 421,col 9)-(line 421,col 70)",
        "(line 422,col 9)-(line 422,col 70)",
        "(line 423,col 9)-(line 423,col 70)",
        "(line 424,col 9)-(line 424,col 24)",
        "(line 425,col 9)-(line 425,col 71)",
        "(line 426,col 9)-(line 426,col 24)",
        "(line 427,col 9)-(line 427,col 70)",
        "(line 428,col 9)-(line 428,col 26)",
        "(line 429,col 9)-(line 429,col 71)",
        "(line 430,col 9)-(line 430,col 23)",
        "(line 431,col 9)-(line 431,col 70)",
        "(line 433,col 9)-(line 433,col 20)",
        "(line 434,col 9)-(line 434,col 71)",
        "(line 435,col 9)-(line 435,col 20)",
        "(line 436,col 9)-(line 436,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 439,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 34)",
        "(line 441,col 9)-(line 441,col 21)",
        "(line 442,col 9)-(line 442,col 21)",
        "(line 443,col 9)-(line 443,col 34)",
        "(line 444,col 9)-(line 444,col 21)",
        "(line 445,col 9)-(line 445,col 21)",
        "(line 446,col 9)-(line 446,col 70)",
        "(line 447,col 9)-(line 447,col 70)",
        "(line 448,col 9)-(line 448,col 20)",
        "(line 449,col 9)-(line 449,col 71)",
        "(line 451,col 9)-(line 451,col 20)",
        "(line 452,col 9)-(line 452,col 71)",
        "(line 453,col 9)-(line 453,col 20)",
        "(line 454,col 9)-(line 454,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 457,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 20)",
        "(line 460,col 9)-(line 460,col 20)",
        "(line 461,col 9)-(line 461,col 32)",
        "(line 462,col 9)-(line 462,col 20)",
        "(line 463,col 9)-(line 463,col 20)",
        "(line 464,col 9)-(line 464,col 70)",
        "(line 465,col 9)-(line 465,col 70)",
        "(line 466,col 9)-(line 466,col 20)",
        "(line 467,col 9)-(line 467,col 71)",
        "(line 469,col 9)-(line 469,col 20)",
        "(line 470,col 9)-(line 470,col 71)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 475,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 36)",
        "(line 477,col 9)-(line 477,col 20)",
        "(line 478,col 9)-(line 478,col 20)",
        "(line 479,col 9)-(line 479,col 36)",
        "(line 480,col 9)-(line 480,col 20)",
        "(line 481,col 9)-(line 481,col 20)",
        "(line 482,col 9)-(line 482,col 70)",
        "(line 483,col 9)-(line 483,col 70)",
        "(line 484,col 9)-(line 484,col 20)",
        "(line 485,col 9)-(line 485,col 71)",
        "(line 487,col 9)-(line 487,col 20)",
        "(line 488,col 9)-(line 488,col 71)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 490,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 493,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 34)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 34)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 500,col 9)-(line 500,col 70)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 71)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 71)",
        "(line 507,col 9)-(line 507,col 20)",
        "(line 508,col 9)-(line 508,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 511,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 34)",
        "(line 513,col 9)-(line 513,col 20)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 34)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 70)",
        "(line 519,col 9)-(line 519,col 70)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 71)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 71)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 529,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 38)",
        "(line 531,col 9)-(line 531,col 20)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 38)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 70)",
        "(line 537,col 9)-(line 537,col 70)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 71)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 71)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 547,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 36)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 36)",
        "(line 552,col 9)-(line 552,col 20)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 554,col 9)-(line 554,col 70)",
        "(line 555,col 9)-(line 555,col 70)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 71)",
        "(line 559,col 9)-(line 559,col 20)",
        "(line 560,col 9)-(line 560,col 71)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 562,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 565,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 40)",
        "(line 567,col 9)-(line 567,col 23)",
        "(line 568,col 9)-(line 568,col 24)",
        "(line 569,col 9)-(line 569,col 40)",
        "(line 570,col 9)-(line 570,col 23)",
        "(line 571,col 9)-(line 571,col 24)",
        "(line 572,col 9)-(line 572,col 70)",
        "(line 573,col 9)-(line 573,col 70)",
        "(line 574,col 9)-(line 574,col 23)",
        "(line 575,col 9)-(line 575,col 71)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 71)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 580,col 9)-(line 580,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 583,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 41)",
        "(line 585,col 9)-(line 585,col 41)",
        "(line 586,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 74)",
        "(line 593,col 9)-(line 593,col 74)",
        "(line 594,col 9)-(line 594,col 25)",
        "(line 595,col 9)-(line 595,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 598,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 39)",
        "(line 600,col 9)-(line 600,col 39)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 74)",
        "(line 608,col 9)-(line 608,col 74)",
        "(line 609,col 9)-(line 609,col 25)",
        "(line 610,col 9)-(line 610,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 613,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 43)",
        "(line 615,col 9)-(line 615,col 43)",
        "(line 616,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 74)",
        "(line 623,col 9)-(line 623,col 74)",
        "(line 624,col 9)-(line 624,col 25)",
        "(line 625,col 9)-(line 625,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 628,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 41)",
        "(line 630,col 9)-(line 630,col 41)",
        "(line 631,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 74)",
        "(line 638,col 9)-(line 638,col 74)",
        "(line 639,col 9)-(line 639,col 25)",
        "(line 640,col 9)-(line 640,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 643,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 41)",
        "(line 645,col 9)-(line 645,col 41)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 74)",
        "(line 653,col 9)-(line 653,col 74)",
        "(line 654,col 9)-(line 654,col 25)",
        "(line 655,col 9)-(line 655,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 657,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 43)",
        "(line 659,col 9)-(line 659,col 43)",
        "(line 660,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 74)",
        "(line 667,col 9)-(line 667,col 74)",
        "(line 668,col 9)-(line 668,col 25)",
        "(line 669,col 9)-(line 669,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 672,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 45)",
        "(line 674,col 9)-(line 674,col 45)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 74)",
        "(line 682,col 9)-(line 682,col 74)",
        "(line 683,col 9)-(line 683,col 25)",
        "(line 684,col 9)-(line 684,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 687,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 47)",
        "(line 689,col 9)-(line 689,col 47)",
        "(line 690,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 74)",
        "(line 697,col 9)-(line 697,col 74)",
        "(line 698,col 9)-(line 698,col 29)",
        "(line 699,col 9)-(line 699,col 75)",
        "(line 702,col 9)-(line 702,col 53)",
        "(line 703,col 9)-(line 703,col 75)",
        "(line 704,col 9)-(line 704,col 75)",
        "(line 705,col 9)-(line 705,col 75)",
        "(line 706,col 9)-(line 706,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 709,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 40)",
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 74)",
        "(line 721,col 9)-(line 721,col 74)",
        "(line 722,col 9)-(line 722,col 25)",
        "(line 723,col 9)-(line 723,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 726,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 40)",
        "(line 728,col 9)-(line 728,col 40)",
        "(line 729,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 74)",
        "(line 738,col 9)-(line 738,col 74)",
        "(line 739,col 9)-(line 739,col 36)",
        "(line 740,col 9)-(line 740,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 743,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 48)",
        "(line 745,col 9)-(line 745,col 38)",
        "(line 746,col 9)-(line 746,col 38)",
        "(line 747,col 9)-(line 747,col 48)",
        "(line 748,col 9)-(line 748,col 38)",
        "(line 749,col 9)-(line 749,col 38)",
        "(line 750,col 9)-(line 750,col 29)",
        "(line 751,col 9)-(line 751,col 29)",
        "(line 752,col 9)-(line 752,col 70)",
        "(line 753,col 9)-(line 753,col 72)",
        "(line 754,col 9)-(line 754,col 70)",
        "(line 755,col 9)-(line 755,col 72)",
        "(line 756,col 9)-(line 756,col 26)",
        "(line 757,col 9)-(line 757,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 760,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 36)",
        "(line 762,col 9)-(line 762,col 23)",
        "(line 763,col 9)-(line 763,col 23)",
        "(line 764,col 9)-(line 764,col 36)",
        "(line 765,col 9)-(line 765,col 23)",
        "(line 766,col 9)-(line 766,col 23)",
        "(line 767,col 9)-(line 767,col 29)",
        "(line 768,col 9)-(line 768,col 29)",
        "(line 769,col 9)-(line 769,col 70)",
        "(line 770,col 9)-(line 770,col 72)",
        "(line 771,col 9)-(line 771,col 70)",
        "(line 772,col 9)-(line 772,col 72)",
        "(line 773,col 9)-(line 773,col 22)",
        "(line 774,col 9)-(line 774,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 777,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 34)",
        "(line 779,col 9)-(line 779,col 22)",
        "(line 780,col 9)-(line 780,col 22)",
        "(line 781,col 9)-(line 781,col 34)",
        "(line 782,col 9)-(line 782,col 22)",
        "(line 783,col 9)-(line 783,col 22)",
        "(line 784,col 9)-(line 784,col 29)",
        "(line 785,col 9)-(line 785,col 29)",
        "(line 786,col 9)-(line 786,col 70)",
        "(line 787,col 9)-(line 787,col 72)",
        "(line 788,col 9)-(line 788,col 70)",
        "(line 789,col 9)-(line 789,col 72)",
        "(line 790,col 9)-(line 790,col 22)",
        "(line 791,col 9)-(line 791,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 794,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 38)",
        "(line 796,col 9)-(line 796,col 22)",
        "(line 797,col 9)-(line 797,col 22)",
        "(line 798,col 9)-(line 798,col 38)",
        "(line 799,col 9)-(line 799,col 22)",
        "(line 800,col 9)-(line 800,col 22)",
        "(line 801,col 9)-(line 801,col 29)",
        "(line 802,col 9)-(line 802,col 29)",
        "(line 803,col 9)-(line 803,col 70)",
        "(line 804,col 9)-(line 804,col 72)",
        "(line 805,col 9)-(line 805,col 70)",
        "(line 806,col 9)-(line 806,col 72)",
        "(line 807,col 9)-(line 807,col 22)",
        "(line 808,col 9)-(line 808,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 811,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 36)",
        "(line 813,col 9)-(line 813,col 22)",
        "(line 814,col 9)-(line 814,col 22)",
        "(line 815,col 9)-(line 815,col 36)",
        "(line 816,col 9)-(line 816,col 22)",
        "(line 817,col 9)-(line 817,col 22)",
        "(line 818,col 9)-(line 818,col 29)",
        "(line 819,col 9)-(line 819,col 29)",
        "(line 820,col 9)-(line 820,col 70)",
        "(line 821,col 9)-(line 821,col 72)",
        "(line 822,col 9)-(line 822,col 70)",
        "(line 823,col 9)-(line 823,col 72)",
        "(line 824,col 9)-(line 824,col 22)",
        "(line 825,col 9)-(line 825,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 828,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 36)",
        "(line 830,col 9)-(line 830,col 22)",
        "(line 831,col 9)-(line 831,col 22)",
        "(line 832,col 9)-(line 832,col 36)",
        "(line 833,col 9)-(line 833,col 22)",
        "(line 834,col 9)-(line 834,col 22)",
        "(line 835,col 9)-(line 835,col 29)",
        "(line 836,col 9)-(line 836,col 29)",
        "(line 837,col 9)-(line 837,col 70)",
        "(line 838,col 9)-(line 838,col 72)",
        "(line 839,col 9)-(line 839,col 70)",
        "(line 840,col 9)-(line 840,col 72)",
        "(line 841,col 9)-(line 841,col 22)",
        "(line 842,col 9)-(line 842,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 845,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 40)",
        "(line 847,col 9)-(line 847,col 22)",
        "(line 848,col 9)-(line 848,col 22)",
        "(line 849,col 9)-(line 849,col 40)",
        "(line 850,col 9)-(line 850,col 22)",
        "(line 851,col 9)-(line 851,col 22)",
        "(line 852,col 9)-(line 852,col 29)",
        "(line 853,col 9)-(line 853,col 29)",
        "(line 854,col 9)-(line 854,col 70)",
        "(line 855,col 9)-(line 855,col 72)",
        "(line 856,col 9)-(line 856,col 70)",
        "(line 857,col 9)-(line 857,col 72)",
        "(line 858,col 9)-(line 858,col 22)",
        "(line 859,col 9)-(line 859,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 862,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 38)",
        "(line 864,col 9)-(line 864,col 22)",
        "(line 865,col 9)-(line 865,col 22)",
        "(line 866,col 9)-(line 866,col 38)",
        "(line 867,col 9)-(line 867,col 22)",
        "(line 868,col 9)-(line 868,col 22)",
        "(line 869,col 9)-(line 869,col 29)",
        "(line 870,col 9)-(line 870,col 29)",
        "(line 871,col 9)-(line 871,col 70)",
        "(line 872,col 9)-(line 872,col 72)",
        "(line 873,col 9)-(line 873,col 70)",
        "(line 874,col 9)-(line 874,col 72)",
        "(line 875,col 9)-(line 875,col 22)",
        "(line 876,col 9)-(line 876,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 879,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 42)",
        "(line 881,col 9)-(line 881,col 25)",
        "(line 882,col 9)-(line 882,col 26)",
        "(line 883,col 9)-(line 883,col 42)",
        "(line 884,col 9)-(line 884,col 25)",
        "(line 885,col 9)-(line 885,col 26)",
        "(line 886,col 9)-(line 886,col 29)",
        "(line 887,col 9)-(line 887,col 29)",
        "(line 888,col 9)-(line 888,col 70)",
        "(line 889,col 9)-(line 889,col 72)",
        "(line 890,col 9)-(line 890,col 70)",
        "(line 891,col 9)-(line 891,col 72)",
        "(line 892,col 9)-(line 892,col 25)",
        "(line 893,col 9)-(line 893,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 896,
      "end_line": 917,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 899,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 900,col 13)-(line 900,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 919,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 923,col 13)-(line 923,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 926,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 928,col 13)-(line 929,col 28)",
        "(line 930,col 13)-(line 931,col 61)",
        "(line 932,col 13)-(line 933,col 61)",
        "(line 934,col 13)-(line 934,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 937,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 13)-(line 938,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 947,
      "end_line": 965,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 57)",
        "(line 949,col 9)-(line 949,col 57)",
        "(line 952,col 9)-(line 952,col 40)",
        "(line 953,col 9)-(line 953,col 40)",
        "(line 954,col 9)-(line 954,col 40)",
        "(line 955,col 9)-(line 955,col 40)",
        "(line 957,col 9)-(line 957,col 38)",
        "(line 958,col 9)-(line 958,col 38)",
        "(line 959,col 9)-(line 959,col 38)",
        "(line 960,col 9)-(line 960,col 38)",
        "(line 961,col 9)-(line 961,col 64)",
        "(line 962,col 9)-(line 962,col 64)",
        "(line 963,col 9)-(line 963,col 64)",
        "(line 964,col 9)-(line 964,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 970,
      "end_line": 977,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 76)",
        "(line 972,col 9)-(line 972,col 86)",
        "(line 976,col 9)-(line 976,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 979,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 84)",
        "(line 981,col 9)-(line 981,col 84)",
        "(line 984,col 9)-(line 984,col 60)",
        "(line 987,col 9)-(line 987,col 77)",
        "(line 988,col 9)-(line 988,col 77)",
        "(line 989,col 9)-(line 989,col 82)",
        "(line 992,col 9)-(line 992,col 82)",
        "(line 993,col 9)-(line 993,col 84)",
        "(line 996,col 9)-(line 996,col 90)",
        "(line 999,col 9)-(line 999,col 97)",
        "(line 1000,col 9)-(line 1000,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1003,
      "end_line": 1016,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1004,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 1006,
      "end_line": 1007,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 1008,
      "end_line": 1009,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 1011,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 13)-(line 1012,col 43)",
        "(line 1013,col 13)-(line 1013,col 43)",
        "(line 1014,col 13)-(line 1014,col 47)"
      ]
    }
  ]
}