{
  "filepath": "/tmp/Lang-64b/src/test/org/apache/commons/lang/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 995,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.EqualsBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.suite()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 65)",
        "(line 46,col 9)-(line 46,col 45)",
        "(line 47,col 9)-(line 47,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.setUp()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.tearDown()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 62,
      "end_line": 63,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 67,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 70,col 13)",
        "(line 71,col 13)-(line 73,col 13)",
        "(line 74,col 13)-(line 74,col 44)",
        "(line 75,col 13)-(line 75,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 13)-(line 83,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 87,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 21)",
        "(line 94,col 13)-(line 94,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 99,col 13)",
        "(line 100,col 13)-(line 102,col 13)",
        "(line 103,col 13)-(line 103,col 50)",
        "(line 104,col 13)-(line 104,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 116,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 122,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 13)-(line 125,col 21)",
        "(line 126,col 13)-(line 126,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 130,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 24)",
        "(line 134,col 13)-(line 134,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 138,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 28)",
        "(line 142,col 13)-(line 142,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 146,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 13)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 159,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 162,col 59)",
        "(line 163,col 9)-(line 163,col 60)",
        "(line 164,col 9)-(line 164,col 19)",
        "(line 165,col 9)-(line 165,col 59)",
        "(line 167,col 9)-(line 167,col 62)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 171,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 174,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 44)",
        "(line 178,col 9)-(line 178,col 125)",
        "(line 179,col 9)-(line 179,col 126)",
        "(line 180,col 9)-(line 180,col 126)",
        "(line 181,col 9)-(line 181,col 126)",
        "(line 182,col 9)-(line 182,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 185,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 46)",
        "(line 188,col 9)-(line 188,col 46)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 190,col 9)-(line 190,col 60)",
        "(line 191,col 9)-(line 191,col 55)",
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 65)",
        "(line 194,col 9)-(line 194,col 53)",
        "(line 195,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 196,col 56)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 199,col 9)-(line 199,col 112)",
        "(line 200,col 9)-(line 200,col 119)",
        "(line 205,col 9)-(line 205,col 79)",
        "(line 206,col 9)-(line 206,col 119)",
        "(line 208,col 9)-(line 208,col 120)",
        "(line 209,col 9)-(line 209,col 120)",
        "(line 211,col 9)-(line 211,col 120)",
        "(line 212,col 9)-(line 212,col 120)",
        "(line 215,col 9)-(line 215,col 78)",
        "(line 216,col 9)-(line 216,col 78)",
        "(line 218,col 9)-(line 218,col 69)",
        "(line 219,col 9)-(line 219,col 69)",
        "(line 221,col 9)-(line 221,col 70)",
        "(line 222,col 9)-(line 222,col 70)",
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 225,col 71)",
        "(line 228,col 9)-(line 228,col 114)",
        "(line 229,col 9)-(line 229,col 114)",
        "(line 231,col 9)-(line 231,col 113)",
        "(line 232,col 9)-(line 232,col 113)",
        "(line 234,col 9)-(line 234,col 113)",
        "(line 235,col 9)-(line 235,col 113)",
        "(line 237,col 9)-(line 237,col 63)",
        "(line 238,col 9)-(line 238,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 256,
      "end_line": 297,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 75)",
        "(line 266,col 9)-(line 266,col 77)",
        "(line 269,col 9)-(line 269,col 139)",
        "(line 272,col 9)-(line 275,col 78)",
        "(line 278,col 9)-(line 278,col 34)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 82)",
        "(line 283,col 9)-(line 283,col 82)",
        "(line 284,col 9)-(line 284,col 38)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 83)",
        "(line 289,col 9)-(line 289,col 83)",
        "(line 292,col 9)-(line 292,col 78)",
        "(line 293,col 9)-(line 293,col 79)",
        "(line 294,col 9)-(line 294,col 78)",
        "(line 295,col 9)-(line 295,col 79)",
        "(line 296,col 9)-(line 296,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 299,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 42)",
        "(line 302,col 9)-(line 302,col 92)",
        "(line 303,col 9)-(line 303,col 94)",
        "(line 304,col 9)-(line 304,col 93)",
        "(line 305,col 9)-(line 305,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObject()",
      "begin_line": 308,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 42)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 311,col 66)",
        "(line 312,col 9)-(line 312,col 67)",
        "(line 313,col 9)-(line 313,col 19)",
        "(line 314,col 9)-(line 314,col 66)",
        "(line 316,col 9)-(line 316,col 69)",
        "(line 318,col 9)-(line 318,col 69)",
        "(line 319,col 9)-(line 319,col 69)",
        "(line 320,col 9)-(line 320,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLong()",
      "begin_line": 323,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 21)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 66)",
        "(line 327,col 9)-(line 327,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testInt()",
      "begin_line": 330,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 19)",
        "(line 332,col 9)-(line 332,col 19)",
        "(line 333,col 9)-(line 333,col 66)",
        "(line 334,col 9)-(line 334,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShort()",
      "begin_line": 337,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 21)",
        "(line 339,col 9)-(line 339,col 21)",
        "(line 340,col 9)-(line 340,col 66)",
        "(line 341,col 9)-(line 341,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testChar()",
      "begin_line": 344,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 20)",
        "(line 346,col 9)-(line 346,col 20)",
        "(line 347,col 9)-(line 347,col 66)",
        "(line 348,col 9)-(line 348,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByte()",
      "begin_line": 351,
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 358,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 22)",
        "(line 360,col 9)-(line 360,col 22)",
        "(line 361,col 9)-(line 361,col 66)",
        "(line 362,col 9)-(line 362,col 67)",
        "(line 363,col 9)-(line 363,col 75)",
        "(line 364,col 9)-(line 364,col 82)",
        "(line 365,col 9)-(line 365,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 368,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 21)",
        "(line 370,col 9)-(line 370,col 21)",
        "(line 371,col 9)-(line 371,col 66)",
        "(line 372,col 9)-(line 372,col 67)",
        "(line 373,col 9)-(line 373,col 74)",
        "(line 374,col 9)-(line 374,col 80)",
        "(line 375,col 9)-(line 375,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 378,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 58)",
        "(line 380,col 9)-(line 380,col 45)",
        "(line 381,col 9)-(line 381,col 38)",
        "(line 382,col 9)-(line 382,col 45)",
        "(line 383,col 9)-(line 383,col 39)",
        "(line 384,col 9)-(line 384,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 387,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 26)",
        "(line 389,col 9)-(line 389,col 27)",
        "(line 390,col 9)-(line 390,col 66)",
        "(line 391,col 9)-(line 391,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 394,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 396,col 36)",
        "(line 397,col 9)-(line 397,col 36)",
        "(line 398,col 9)-(line 398,col 23)",
        "(line 399,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 400,col 36)",
        "(line 401,col 9)-(line 401,col 36)",
        "(line 402,col 9)-(line 402,col 23)",
        "(line 404,col 9)-(line 404,col 70)",
        "(line 405,col 9)-(line 405,col 70)",
        "(line 406,col 9)-(line 406,col 70)",
        "(line 407,col 9)-(line 407,col 24)",
        "(line 408,col 9)-(line 408,col 71)",
        "(line 409,col 9)-(line 409,col 24)",
        "(line 410,col 9)-(line 410,col 70)",
        "(line 411,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 412,col 71)",
        "(line 413,col 9)-(line 413,col 23)",
        "(line 414,col 9)-(line 414,col 70)",
        "(line 416,col 9)-(line 416,col 20)",
        "(line 417,col 9)-(line 417,col 71)",
        "(line 418,col 9)-(line 418,col 20)",
        "(line 419,col 9)-(line 419,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 422,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 34)",
        "(line 424,col 9)-(line 424,col 21)",
        "(line 425,col 9)-(line 425,col 21)",
        "(line 426,col 9)-(line 426,col 34)",
        "(line 427,col 9)-(line 427,col 21)",
        "(line 428,col 9)-(line 428,col 21)",
        "(line 429,col 9)-(line 429,col 70)",
        "(line 430,col 9)-(line 430,col 70)",
        "(line 431,col 9)-(line 431,col 20)",
        "(line 432,col 9)-(line 432,col 71)",
        "(line 434,col 9)-(line 434,col 20)",
        "(line 435,col 9)-(line 435,col 71)",
        "(line 436,col 9)-(line 436,col 20)",
        "(line 437,col 9)-(line 437,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 440,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 32)",
        "(line 442,col 9)-(line 442,col 20)",
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 32)",
        "(line 445,col 9)-(line 445,col 20)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 447,col 70)",
        "(line 448,col 9)-(line 448,col 70)",
        "(line 449,col 9)-(line 449,col 20)",
        "(line 450,col 9)-(line 450,col 71)",
        "(line 452,col 9)-(line 452,col 20)",
        "(line 453,col 9)-(line 453,col 71)",
        "(line 454,col 9)-(line 454,col 20)",
        "(line 455,col 9)-(line 455,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 458,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 36)",
        "(line 460,col 9)-(line 460,col 20)",
        "(line 461,col 9)-(line 461,col 20)",
        "(line 462,col 9)-(line 462,col 36)",
        "(line 463,col 9)-(line 463,col 20)",
        "(line 464,col 9)-(line 464,col 20)",
        "(line 465,col 9)-(line 465,col 70)",
        "(line 466,col 9)-(line 466,col 70)",
        "(line 467,col 9)-(line 467,col 20)",
        "(line 468,col 9)-(line 468,col 71)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 71)",
        "(line 472,col 9)-(line 472,col 20)",
        "(line 473,col 9)-(line 473,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 476,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 34)",
        "(line 478,col 9)-(line 478,col 20)",
        "(line 479,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 480,col 34)",
        "(line 481,col 9)-(line 481,col 20)",
        "(line 482,col 9)-(line 482,col 20)",
        "(line 483,col 9)-(line 483,col 70)",
        "(line 484,col 9)-(line 484,col 70)",
        "(line 485,col 9)-(line 485,col 20)",
        "(line 486,col 9)-(line 486,col 71)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 489,col 9)-(line 489,col 71)",
        "(line 490,col 9)-(line 490,col 20)",
        "(line 491,col 9)-(line 491,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 494,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 34)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 34)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 500,col 9)-(line 500,col 20)",
        "(line 501,col 9)-(line 501,col 70)",
        "(line 502,col 9)-(line 502,col 70)",
        "(line 503,col 9)-(line 503,col 20)",
        "(line 504,col 9)-(line 504,col 71)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 71)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 512,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 38)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 38)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 70)",
        "(line 520,col 9)-(line 520,col 70)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 522,col 9)-(line 522,col 71)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 71)",
        "(line 526,col 9)-(line 526,col 20)",
        "(line 527,col 9)-(line 527,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 530,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 36)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 20)",
        "(line 534,col 9)-(line 534,col 36)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 537,col 9)-(line 537,col 70)",
        "(line 538,col 9)-(line 538,col 70)",
        "(line 539,col 9)-(line 539,col 20)",
        "(line 540,col 9)-(line 540,col 71)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 71)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 548,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 40)",
        "(line 550,col 9)-(line 550,col 23)",
        "(line 551,col 9)-(line 551,col 24)",
        "(line 552,col 9)-(line 552,col 40)",
        "(line 553,col 9)-(line 553,col 23)",
        "(line 554,col 9)-(line 554,col 24)",
        "(line 555,col 9)-(line 555,col 70)",
        "(line 556,col 9)-(line 556,col 70)",
        "(line 557,col 9)-(line 557,col 23)",
        "(line 558,col 9)-(line 558,col 71)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 71)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 563,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 566,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 41)",
        "(line 568,col 9)-(line 568,col 41)",
        "(line 569,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 74)",
        "(line 576,col 9)-(line 576,col 74)",
        "(line 577,col 9)-(line 577,col 25)",
        "(line 578,col 9)-(line 578,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 581,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 39)",
        "(line 583,col 9)-(line 583,col 39)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 74)",
        "(line 591,col 9)-(line 591,col 74)",
        "(line 592,col 9)-(line 592,col 25)",
        "(line 593,col 9)-(line 593,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 596,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 43)",
        "(line 598,col 9)-(line 598,col 43)",
        "(line 599,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 74)",
        "(line 606,col 9)-(line 606,col 74)",
        "(line 607,col 9)-(line 607,col 25)",
        "(line 608,col 9)-(line 608,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 611,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 41)",
        "(line 613,col 9)-(line 613,col 41)",
        "(line 614,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 74)",
        "(line 621,col 9)-(line 621,col 74)",
        "(line 622,col 9)-(line 622,col 25)",
        "(line 623,col 9)-(line 623,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 626,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 41)",
        "(line 628,col 9)-(line 628,col 41)",
        "(line 629,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 74)",
        "(line 636,col 9)-(line 636,col 74)",
        "(line 637,col 9)-(line 637,col 25)",
        "(line 638,col 9)-(line 638,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 640,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 43)",
        "(line 642,col 9)-(line 642,col 43)",
        "(line 643,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 74)",
        "(line 650,col 9)-(line 650,col 74)",
        "(line 651,col 9)-(line 651,col 25)",
        "(line 652,col 9)-(line 652,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 655,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 45)",
        "(line 657,col 9)-(line 657,col 45)",
        "(line 658,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 74)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 666,col 25)",
        "(line 667,col 9)-(line 667,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 670,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 47)",
        "(line 672,col 9)-(line 672,col 47)",
        "(line 673,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 74)",
        "(line 680,col 9)-(line 680,col 74)",
        "(line 681,col 9)-(line 681,col 29)",
        "(line 682,col 9)-(line 682,col 75)",
        "(line 685,col 9)-(line 685,col 53)",
        "(line 686,col 9)-(line 686,col 75)",
        "(line 687,col 9)-(line 687,col 75)",
        "(line 688,col 9)-(line 688,col 75)",
        "(line 689,col 9)-(line 689,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 692,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 40)",
        "(line 694,col 9)-(line 694,col 40)",
        "(line 695,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 74)",
        "(line 704,col 9)-(line 704,col 74)",
        "(line 705,col 9)-(line 705,col 25)",
        "(line 706,col 9)-(line 706,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 709,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 40)",
        "(line 711,col 9)-(line 711,col 40)",
        "(line 712,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 74)",
        "(line 721,col 9)-(line 721,col 74)",
        "(line 722,col 9)-(line 722,col 36)",
        "(line 723,col 9)-(line 723,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 726,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 48)",
        "(line 728,col 9)-(line 728,col 38)",
        "(line 729,col 9)-(line 729,col 38)",
        "(line 730,col 9)-(line 730,col 48)",
        "(line 731,col 9)-(line 731,col 38)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 733,col 9)-(line 733,col 29)",
        "(line 734,col 9)-(line 734,col 29)",
        "(line 735,col 9)-(line 735,col 70)",
        "(line 736,col 9)-(line 736,col 72)",
        "(line 737,col 9)-(line 737,col 70)",
        "(line 738,col 9)-(line 738,col 72)",
        "(line 739,col 9)-(line 739,col 26)",
        "(line 740,col 9)-(line 740,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 743,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 36)",
        "(line 745,col 9)-(line 745,col 23)",
        "(line 746,col 9)-(line 746,col 23)",
        "(line 747,col 9)-(line 747,col 36)",
        "(line 748,col 9)-(line 748,col 23)",
        "(line 749,col 9)-(line 749,col 23)",
        "(line 750,col 9)-(line 750,col 29)",
        "(line 751,col 9)-(line 751,col 29)",
        "(line 752,col 9)-(line 752,col 70)",
        "(line 753,col 9)-(line 753,col 72)",
        "(line 754,col 9)-(line 754,col 70)",
        "(line 755,col 9)-(line 755,col 72)",
        "(line 756,col 9)-(line 756,col 22)",
        "(line 757,col 9)-(line 757,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 760,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 34)",
        "(line 762,col 9)-(line 762,col 22)",
        "(line 763,col 9)-(line 763,col 22)",
        "(line 764,col 9)-(line 764,col 34)",
        "(line 765,col 9)-(line 765,col 22)",
        "(line 766,col 9)-(line 766,col 22)",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 777,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 38)",
        "(line 779,col 9)-(line 779,col 22)",
        "(line 780,col 9)-(line 780,col 22)",
        "(line 781,col 9)-(line 781,col 38)",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 794,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 36)",
        "(line 796,col 9)-(line 796,col 22)",
        "(line 797,col 9)-(line 797,col 22)",
        "(line 798,col 9)-(line 798,col 36)",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 828,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 40)",
        "(line 830,col 9)-(line 830,col 22)",
        "(line 831,col 9)-(line 831,col 22)",
        "(line 832,col 9)-(line 832,col 40)",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 845,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 38)",
        "(line 847,col 9)-(line 847,col 22)",
        "(line 848,col 9)-(line 848,col 22)",
        "(line 849,col 9)-(line 849,col 38)",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 862,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 42)",
        "(line 864,col 9)-(line 864,col 25)",
        "(line 865,col 9)-(line 865,col 26)",
        "(line 866,col 9)-(line 866,col 42)",
        "(line 867,col 9)-(line 867,col 25)",
        "(line 868,col 9)-(line 868,col 26)",
        "(line 869,col 9)-(line 869,col 29)",
        "(line 870,col 9)-(line 870,col 29)",
        "(line 871,col 9)-(line 871,col 70)",
        "(line 872,col 9)-(line 872,col 72)",
        "(line 873,col 9)-(line 873,col 70)",
        "(line 874,col 9)-(line 874,col 72)",
        "(line 875,col 9)-(line 875,col 25)",
        "(line 876,col 9)-(line 876,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 879,
      "end_line": 899,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 882,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 883,col 13)-(line 883,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 886,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 887,col 13)-(line 888,col 28)",
        "(line 889,col 13)-(line 890,col 61)",
        "(line 891,col 13)-(line 892,col 61)",
        "(line 893,col 13)-(line 893,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 896,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 897,col 13)-(line 897,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 901,
      "end_line": 921,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 902,
      "end_line": 902,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 904,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 905,col 13)-(line 905,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 908,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 909,col 13)-(line 910,col 28)",
        "(line 911,col 13)-(line 912,col 61)",
        "(line 913,col 13)-(line 914,col 61)",
        "(line 915,col 13)-(line 915,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 918,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 919,col 13)-(line 919,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 928,
      "end_line": 946,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 57)",
        "(line 930,col 9)-(line 930,col 57)",
        "(line 933,col 9)-(line 933,col 40)",
        "(line 934,col 9)-(line 934,col 40)",
        "(line 935,col 9)-(line 935,col 40)",
        "(line 936,col 9)-(line 936,col 40)",
        "(line 938,col 9)-(line 938,col 38)",
        "(line 939,col 9)-(line 939,col 38)",
        "(line 940,col 9)-(line 940,col 38)",
        "(line 941,col 9)-(line 941,col 38)",
        "(line 942,col 9)-(line 942,col 64)",
        "(line 943,col 9)-(line 943,col 64)",
        "(line 944,col 9)-(line 944,col 64)",
        "(line 945,col 9)-(line 945,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 951,
      "end_line": 958,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 76)",
        "(line 953,col 9)-(line 953,col 86)",
        "(line 957,col 9)-(line 957,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 960,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 84)",
        "(line 962,col 9)-(line 962,col 84)",
        "(line 965,col 9)-(line 965,col 60)",
        "(line 968,col 9)-(line 968,col 77)",
        "(line 969,col 9)-(line 969,col 77)",
        "(line 970,col 9)-(line 970,col 82)",
        "(line 973,col 9)-(line 973,col 82)",
        "(line 974,col 9)-(line 974,col 84)",
        "(line 977,col 9)-(line 977,col 90)",
        "(line 980,col 9)-(line 980,col 97)",
        "(line 981,col 9)-(line 981,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 984,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 989,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 990,col 13)-(line 990,col 43)",
        "(line 991,col 13)-(line 991,col 43)",
        "(line 992,col 13)-(line 992,col 47)"
      ]
    }
  ]
}