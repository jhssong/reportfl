{
  "filepath": "/tmp/Lang-57b/src/test/org/apache/commons/lang/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 996,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.EqualsBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.suite()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.setUp()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.tearDown()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 63,
      "end_line": 64,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 68,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 71,col 13)",
        "(line 72,col 13)-(line 74,col 13)",
        "(line 75,col 13)-(line 75,col 44)",
        "(line 76,col 13)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 88,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 21)",
        "(line 95,col 13)-(line 95,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 97,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 98,col 13)-(line 100,col 13)",
        "(line 101,col 13)-(line 103,col 13)",
        "(line 104,col 13)-(line 104,col 50)",
        "(line 105,col 13)-(line 105,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 117,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 123,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 126,col 13)-(line 126,col 21)",
        "(line 127,col 13)-(line 127,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 131,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 24)",
        "(line 135,col 13)-(line 135,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 139,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 28)",
        "(line 143,col 13)-(line 143,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 147,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 160,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 59)",
        "(line 164,col 9)-(line 164,col 60)",
        "(line 165,col 9)-(line 165,col 19)",
        "(line 166,col 9)-(line 166,col 59)",
        "(line 168,col 9)-(line 168,col 62)",
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 175,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 45)",
        "(line 177,col 9)-(line 177,col 44)",
        "(line 179,col 9)-(line 179,col 125)",
        "(line 180,col 9)-(line 180,col 126)",
        "(line 181,col 9)-(line 181,col 126)",
        "(line 182,col 9)-(line 182,col 126)",
        "(line 183,col 9)-(line 183,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 186,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 43)",
        "(line 191,col 9)-(line 191,col 60)",
        "(line 192,col 9)-(line 192,col 55)",
        "(line 193,col 9)-(line 193,col 61)",
        "(line 194,col 9)-(line 194,col 65)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 56)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 200,col 9)-(line 200,col 112)",
        "(line 201,col 9)-(line 201,col 119)",
        "(line 206,col 9)-(line 206,col 79)",
        "(line 207,col 9)-(line 207,col 119)",
        "(line 209,col 9)-(line 209,col 120)",
        "(line 210,col 9)-(line 210,col 120)",
        "(line 212,col 9)-(line 212,col 120)",
        "(line 213,col 9)-(line 213,col 120)",
        "(line 216,col 9)-(line 216,col 78)",
        "(line 217,col 9)-(line 217,col 78)",
        "(line 219,col 9)-(line 219,col 69)",
        "(line 220,col 9)-(line 220,col 69)",
        "(line 222,col 9)-(line 222,col 70)",
        "(line 223,col 9)-(line 223,col 70)",
        "(line 225,col 9)-(line 225,col 71)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 229,col 9)-(line 229,col 114)",
        "(line 230,col 9)-(line 230,col 114)",
        "(line 232,col 9)-(line 232,col 113)",
        "(line 233,col 9)-(line 233,col 113)",
        "(line 235,col 9)-(line 235,col 113)",
        "(line 236,col 9)-(line 236,col 113)",
        "(line 238,col 9)-(line 238,col 63)",
        "(line 239,col 9)-(line 239,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 257,
      "end_line": 298,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 75)",
        "(line 267,col 9)-(line 267,col 77)",
        "(line 270,col 9)-(line 270,col 139)",
        "(line 273,col 9)-(line 276,col 78)",
        "(line 279,col 9)-(line 279,col 34)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 82)",
        "(line 284,col 9)-(line 284,col 82)",
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 83)",
        "(line 290,col 9)-(line 290,col 83)",
        "(line 293,col 9)-(line 293,col 78)",
        "(line 294,col 9)-(line 294,col 79)",
        "(line 295,col 9)-(line 295,col 78)",
        "(line 296,col 9)-(line 296,col 79)",
        "(line 297,col 9)-(line 297,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 300,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 42)",
        "(line 302,col 9)-(line 302,col 42)",
        "(line 303,col 9)-(line 303,col 92)",
        "(line 304,col 9)-(line 304,col 94)",
        "(line 305,col 9)-(line 305,col 93)",
        "(line 306,col 9)-(line 306,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObject()",
      "begin_line": 309,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 66)",
        "(line 313,col 9)-(line 313,col 67)",
        "(line 314,col 9)-(line 314,col 19)",
        "(line 315,col 9)-(line 315,col 66)",
        "(line 317,col 9)-(line 317,col 69)",
        "(line 319,col 9)-(line 319,col 69)",
        "(line 320,col 9)-(line 320,col 69)",
        "(line 321,col 9)-(line 321,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLong()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testInt()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShort()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testChar()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByte()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDouble()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloat()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testAccessors()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 388,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 26)",
        "(line 390,col 9)-(line 390,col 27)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 392,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 395,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 397,col 36)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 23)",
        "(line 400,col 9)-(line 400,col 46)",
        "(line 401,col 9)-(line 401,col 36)",
        "(line 402,col 9)-(line 402,col 36)",
        "(line 403,col 9)-(line 403,col 23)",
        "(line 405,col 9)-(line 405,col 70)",
        "(line 406,col 9)-(line 406,col 70)",
        "(line 407,col 9)-(line 407,col 70)",
        "(line 408,col 9)-(line 408,col 24)",
        "(line 409,col 9)-(line 409,col 71)",
        "(line 410,col 9)-(line 410,col 24)",
        "(line 411,col 9)-(line 411,col 70)",
        "(line 412,col 9)-(line 412,col 26)",
        "(line 413,col 9)-(line 413,col 71)",
        "(line 414,col 9)-(line 414,col 23)",
        "(line 415,col 9)-(line 415,col 70)",
        "(line 417,col 9)-(line 417,col 20)",
        "(line 418,col 9)-(line 418,col 71)",
        "(line 419,col 9)-(line 419,col 20)",
        "(line 420,col 9)-(line 420,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 423,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 34)",
        "(line 425,col 9)-(line 425,col 21)",
        "(line 426,col 9)-(line 426,col 21)",
        "(line 427,col 9)-(line 427,col 34)",
        "(line 428,col 9)-(line 428,col 21)",
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 70)",
        "(line 431,col 9)-(line 431,col 70)",
        "(line 432,col 9)-(line 432,col 20)",
        "(line 433,col 9)-(line 433,col 71)",
        "(line 435,col 9)-(line 435,col 20)",
        "(line 436,col 9)-(line 436,col 71)",
        "(line 437,col 9)-(line 437,col 20)",
        "(line 438,col 9)-(line 438,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 441,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 32)",
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 20)",
        "(line 445,col 9)-(line 445,col 32)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 447,col 20)",
        "(line 448,col 9)-(line 448,col 70)",
        "(line 449,col 9)-(line 449,col 70)",
        "(line 450,col 9)-(line 450,col 20)",
        "(line 451,col 9)-(line 451,col 71)",
        "(line 453,col 9)-(line 453,col 20)",
        "(line 454,col 9)-(line 454,col 71)",
        "(line 455,col 9)-(line 455,col 20)",
        "(line 456,col 9)-(line 456,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 459,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 20)",
        "(line 462,col 9)-(line 462,col 20)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 20)",
        "(line 465,col 9)-(line 465,col 20)",
        "(line 466,col 9)-(line 466,col 70)",
        "(line 467,col 9)-(line 467,col 70)",
        "(line 468,col 9)-(line 468,col 20)",
        "(line 469,col 9)-(line 469,col 71)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 71)",
        "(line 473,col 9)-(line 473,col 20)",
        "(line 474,col 9)-(line 474,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 477,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 34)",
        "(line 479,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 480,col 20)",
        "(line 481,col 9)-(line 481,col 34)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 20)",
        "(line 484,col 9)-(line 484,col 70)",
        "(line 485,col 9)-(line 485,col 70)",
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 71)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 490,col 71)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 495,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 34)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 34)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 502,col 9)-(line 502,col 70)",
        "(line 503,col 9)-(line 503,col 70)",
        "(line 504,col 9)-(line 504,col 20)",
        "(line 505,col 9)-(line 505,col 71)",
        "(line 507,col 9)-(line 507,col 20)",
        "(line 508,col 9)-(line 508,col 71)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 513,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 38)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 38)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 20)",
        "(line 520,col 9)-(line 520,col 70)",
        "(line 521,col 9)-(line 521,col 70)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 71)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 526,col 9)-(line 526,col 71)",
        "(line 527,col 9)-(line 527,col 20)",
        "(line 528,col 9)-(line 528,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 531,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 36)",
        "(line 533,col 9)-(line 533,col 20)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 36)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 537,col 9)-(line 537,col 20)",
        "(line 538,col 9)-(line 538,col 70)",
        "(line 539,col 9)-(line 539,col 70)",
        "(line 540,col 9)-(line 540,col 20)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 71)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 549,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 40)",
        "(line 551,col 9)-(line 551,col 23)",
        "(line 552,col 9)-(line 552,col 24)",
        "(line 553,col 9)-(line 553,col 40)",
        "(line 554,col 9)-(line 554,col 23)",
        "(line 555,col 9)-(line 555,col 24)",
        "(line 556,col 9)-(line 556,col 70)",
        "(line 557,col 9)-(line 557,col 70)",
        "(line 558,col 9)-(line 558,col 23)",
        "(line 559,col 9)-(line 559,col 71)",
        "(line 561,col 9)-(line 561,col 20)",
        "(line 562,col 9)-(line 562,col 71)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 567,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 41)",
        "(line 569,col 9)-(line 569,col 41)",
        "(line 570,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 74)",
        "(line 577,col 9)-(line 577,col 74)",
        "(line 578,col 9)-(line 578,col 25)",
        "(line 579,col 9)-(line 579,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 582,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 39)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 585,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 74)",
        "(line 592,col 9)-(line 592,col 74)",
        "(line 593,col 9)-(line 593,col 25)",
        "(line 594,col 9)-(line 594,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 597,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 43)",
        "(line 599,col 9)-(line 599,col 43)",
        "(line 600,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 606,col 74)",
        "(line 607,col 9)-(line 607,col 74)",
        "(line 608,col 9)-(line 608,col 25)",
        "(line 609,col 9)-(line 609,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 612,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 41)",
        "(line 614,col 9)-(line 614,col 41)",
        "(line 615,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 74)",
        "(line 622,col 9)-(line 622,col 74)",
        "(line 623,col 9)-(line 623,col 25)",
        "(line 624,col 9)-(line 624,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 627,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 41)",
        "(line 629,col 9)-(line 629,col 41)",
        "(line 630,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 74)",
        "(line 637,col 9)-(line 637,col 74)",
        "(line 638,col 9)-(line 638,col 25)",
        "(line 639,col 9)-(line 639,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 641,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 43)",
        "(line 643,col 9)-(line 643,col 43)",
        "(line 644,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 74)",
        "(line 651,col 9)-(line 651,col 74)",
        "(line 652,col 9)-(line 652,col 25)",
        "(line 653,col 9)-(line 653,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 656,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 45)",
        "(line 658,col 9)-(line 658,col 45)",
        "(line 659,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 666,col 74)",
        "(line 667,col 9)-(line 667,col 25)",
        "(line 668,col 9)-(line 668,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 671,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 47)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 74)",
        "(line 681,col 9)-(line 681,col 74)",
        "(line 682,col 9)-(line 682,col 29)",
        "(line 683,col 9)-(line 683,col 75)",
        "(line 686,col 9)-(line 686,col 53)",
        "(line 687,col 9)-(line 687,col 75)",
        "(line 688,col 9)-(line 688,col 75)",
        "(line 689,col 9)-(line 689,col 75)",
        "(line 690,col 9)-(line 690,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 693,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 40)",
        "(line 695,col 9)-(line 695,col 40)",
        "(line 696,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 74)",
        "(line 705,col 9)-(line 705,col 74)",
        "(line 706,col 9)-(line 706,col 25)",
        "(line 707,col 9)-(line 707,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 710,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 712,col 40)",
        "(line 713,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 74)",
        "(line 722,col 9)-(line 722,col 74)",
        "(line 723,col 9)-(line 723,col 36)",
        "(line 724,col 9)-(line 724,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 727,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 48)",
        "(line 729,col 9)-(line 729,col 38)",
        "(line 730,col 9)-(line 730,col 38)",
        "(line 731,col 9)-(line 731,col 48)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 733,col 9)-(line 733,col 38)",
        "(line 734,col 9)-(line 734,col 29)",
        "(line 735,col 9)-(line 735,col 29)",
        "(line 736,col 9)-(line 736,col 70)",
        "(line 737,col 9)-(line 737,col 72)",
        "(line 738,col 9)-(line 738,col 70)",
        "(line 739,col 9)-(line 739,col 72)",
        "(line 740,col 9)-(line 740,col 26)",
        "(line 741,col 9)-(line 741,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 744,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 36)",
        "(line 746,col 9)-(line 746,col 23)",
        "(line 747,col 9)-(line 747,col 23)",
        "(line 748,col 9)-(line 748,col 36)",
        "(line 749,col 9)-(line 749,col 23)",
        "(line 750,col 9)-(line 750,col 23)",
        "(line 751,col 9)-(line 751,col 29)",
        "(line 752,col 9)-(line 752,col 29)",
        "(line 753,col 9)-(line 753,col 70)",
        "(line 754,col 9)-(line 754,col 72)",
        "(line 755,col 9)-(line 755,col 70)",
        "(line 756,col 9)-(line 756,col 72)",
        "(line 757,col 9)-(line 757,col 22)",
        "(line 758,col 9)-(line 758,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 761,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 34)",
        "(line 763,col 9)-(line 763,col 22)",
        "(line 764,col 9)-(line 764,col 22)",
        "(line 765,col 9)-(line 765,col 34)",
        "(line 766,col 9)-(line 766,col 22)",
        "(line 767,col 9)-(line 767,col 22)",
        "(line 768,col 9)-(line 768,col 29)",
        "(line 769,col 9)-(line 769,col 29)",
        "(line 770,col 9)-(line 770,col 70)",
        "(line 771,col 9)-(line 771,col 72)",
        "(line 772,col 9)-(line 772,col 70)",
        "(line 773,col 9)-(line 773,col 72)",
        "(line 774,col 9)-(line 774,col 22)",
        "(line 775,col 9)-(line 775,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 778,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 38)",
        "(line 780,col 9)-(line 780,col 22)",
        "(line 781,col 9)-(line 781,col 22)",
        "(line 782,col 9)-(line 782,col 38)",
        "(line 783,col 9)-(line 783,col 22)",
        "(line 784,col 9)-(line 784,col 22)",
        "(line 785,col 9)-(line 785,col 29)",
        "(line 786,col 9)-(line 786,col 29)",
        "(line 787,col 9)-(line 787,col 70)",
        "(line 788,col 9)-(line 788,col 72)",
        "(line 789,col 9)-(line 789,col 70)",
        "(line 790,col 9)-(line 790,col 72)",
        "(line 791,col 9)-(line 791,col 22)",
        "(line 792,col 9)-(line 792,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 795,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 36)",
        "(line 797,col 9)-(line 797,col 22)",
        "(line 798,col 9)-(line 798,col 22)",
        "(line 799,col 9)-(line 799,col 36)",
        "(line 800,col 9)-(line 800,col 22)",
        "(line 801,col 9)-(line 801,col 22)",
        "(line 802,col 9)-(line 802,col 29)",
        "(line 803,col 9)-(line 803,col 29)",
        "(line 804,col 9)-(line 804,col 70)",
        "(line 805,col 9)-(line 805,col 72)",
        "(line 806,col 9)-(line 806,col 70)",
        "(line 807,col 9)-(line 807,col 72)",
        "(line 808,col 9)-(line 808,col 22)",
        "(line 809,col 9)-(line 809,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 812,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 36)",
        "(line 814,col 9)-(line 814,col 22)",
        "(line 815,col 9)-(line 815,col 22)",
        "(line 816,col 9)-(line 816,col 36)",
        "(line 817,col 9)-(line 817,col 22)",
        "(line 818,col 9)-(line 818,col 22)",
        "(line 819,col 9)-(line 819,col 29)",
        "(line 820,col 9)-(line 820,col 29)",
        "(line 821,col 9)-(line 821,col 70)",
        "(line 822,col 9)-(line 822,col 72)",
        "(line 823,col 9)-(line 823,col 70)",
        "(line 824,col 9)-(line 824,col 72)",
        "(line 825,col 9)-(line 825,col 22)",
        "(line 826,col 9)-(line 826,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 829,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 40)",
        "(line 831,col 9)-(line 831,col 22)",
        "(line 832,col 9)-(line 832,col 22)",
        "(line 833,col 9)-(line 833,col 40)",
        "(line 834,col 9)-(line 834,col 22)",
        "(line 835,col 9)-(line 835,col 22)",
        "(line 836,col 9)-(line 836,col 29)",
        "(line 837,col 9)-(line 837,col 29)",
        "(line 838,col 9)-(line 838,col 70)",
        "(line 839,col 9)-(line 839,col 72)",
        "(line 840,col 9)-(line 840,col 70)",
        "(line 841,col 9)-(line 841,col 72)",
        "(line 842,col 9)-(line 842,col 22)",
        "(line 843,col 9)-(line 843,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 846,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 38)",
        "(line 848,col 9)-(line 848,col 22)",
        "(line 849,col 9)-(line 849,col 22)",
        "(line 850,col 9)-(line 850,col 38)",
        "(line 851,col 9)-(line 851,col 22)",
        "(line 852,col 9)-(line 852,col 22)",
        "(line 853,col 9)-(line 853,col 29)",
        "(line 854,col 9)-(line 854,col 29)",
        "(line 855,col 9)-(line 855,col 70)",
        "(line 856,col 9)-(line 856,col 72)",
        "(line 857,col 9)-(line 857,col 70)",
        "(line 858,col 9)-(line 858,col 72)",
        "(line 859,col 9)-(line 859,col 22)",
        "(line 860,col 9)-(line 860,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 863,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 42)",
        "(line 865,col 9)-(line 865,col 25)",
        "(line 866,col 9)-(line 866,col 26)",
        "(line 867,col 9)-(line 867,col 42)",
        "(line 868,col 9)-(line 868,col 25)",
        "(line 869,col 9)-(line 869,col 26)",
        "(line 870,col 9)-(line 870,col 29)",
        "(line 871,col 9)-(line 871,col 29)",
        "(line 872,col 9)-(line 872,col 70)",
        "(line 873,col 9)-(line 873,col 72)",
        "(line 874,col 9)-(line 874,col 70)",
        "(line 875,col 9)-(line 875,col 72)",
        "(line 876,col 9)-(line 876,col 25)",
        "(line 877,col 9)-(line 877,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 880,
      "end_line": 900,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 881,
      "end_line": 881,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 883,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 884,col 13)-(line 884,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 887,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 888,col 13)-(line 889,col 28)",
        "(line 890,col 13)-(line 891,col 61)",
        "(line 892,col 13)-(line 893,col 61)",
        "(line 894,col 13)-(line 894,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 897,
      "end_line": 899,
      "comment": "",
      "child_ranges": [
        "(line 898,col 13)-(line 898,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 902,
      "end_line": 922,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 903,
      "end_line": 903,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 905,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 906,col 13)-(line 906,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 909,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 910,col 13)-(line 911,col 28)",
        "(line 912,col 13)-(line 913,col 61)",
        "(line 914,col 13)-(line 915,col 61)",
        "(line 916,col 13)-(line 916,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 919,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 920,col 13)-(line 920,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 929,
      "end_line": 947,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 57)",
        "(line 931,col 9)-(line 931,col 57)",
        "(line 934,col 9)-(line 934,col 40)",
        "(line 935,col 9)-(line 935,col 40)",
        "(line 936,col 9)-(line 936,col 40)",
        "(line 937,col 9)-(line 937,col 40)",
        "(line 939,col 9)-(line 939,col 38)",
        "(line 940,col 9)-(line 940,col 38)",
        "(line 941,col 9)-(line 941,col 38)",
        "(line 942,col 9)-(line 942,col 38)",
        "(line 943,col 9)-(line 943,col 64)",
        "(line 944,col 9)-(line 944,col 64)",
        "(line 945,col 9)-(line 945,col 64)",
        "(line 946,col 9)-(line 946,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 952,
      "end_line": 959,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 76)",
        "(line 954,col 9)-(line 954,col 86)",
        "(line 958,col 9)-(line 958,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 961,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 84)",
        "(line 963,col 9)-(line 963,col 84)",
        "(line 966,col 9)-(line 966,col 60)",
        "(line 969,col 9)-(line 969,col 77)",
        "(line 970,col 9)-(line 970,col 77)",
        "(line 971,col 9)-(line 971,col 82)",
        "(line 974,col 9)-(line 974,col 82)",
        "(line 975,col 9)-(line 975,col 84)",
        "(line 978,col 9)-(line 978,col 90)",
        "(line 981,col 9)-(line 981,col 97)",
        "(line 982,col 9)-(line 982,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 985,
      "end_line": 995,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 988,
      "end_line": 988,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 991,col 13)-(line 991,col 43)",
        "(line 992,col 13)-(line 992,col 43)",
        "(line 993,col 13)-(line 993,col 47)"
      ]
    }
  ]
}