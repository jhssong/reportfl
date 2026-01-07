{
  "filepath": "/tmp/Lang-47b/src/test/org/apache/commons/lang/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 1005,
      "comment": "\n * Unit tests {@link org.apache.commons.lang.builder.EqualsBuilder}.\n *\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:scolebourne@joda.org\"\u003eStephen Colebourne\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Maarten Coene\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.EqualsBuilderTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.main(java.lang.String[])",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.suite()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 65)",
        "(line 48,col 9)-(line 48,col 45)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.setUp()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.tearDown()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.TestObject(int)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 69,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 44)",
        "(line 71,col 13)-(line 71,col 43)",
        "(line 72,col 13)-(line 74,col 13)",
        "(line 76,col 13)-(line 76,col 44)",
        "(line 77,col 13)-(line 77,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 89,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 21)",
        "(line 96,col 13)-(line 96,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 44)",
        "(line 100,col 13)-(line 100,col 43)",
        "(line 101,col 13)-(line 103,col 13)",
        "(line 105,col 13)-(line 105,col 50)",
        "(line 106,col 13)-(line 106,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 13)-(line 110,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 118,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 124,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 21)",
        "(line 128,col 13)-(line 128,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 132,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 24)",
        "(line 136,col 13)-(line 136,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 140,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 28)",
        "(line 144,col 13)-(line 144,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 148,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 161,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 42)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 164,col 59)",
        "(line 165,col 9)-(line 165,col 60)",
        "(line 166,col 9)-(line 166,col 19)",
        "(line 167,col 9)-(line 167,col 59)",
        "(line 169,col 9)-(line 169,col 62)",
        "(line 171,col 9)-(line 171,col 62)",
        "(line 172,col 9)-(line 172,col 62)",
        "(line 173,col 9)-(line 173,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 176,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 45)",
        "(line 178,col 9)-(line 178,col 44)",
        "(line 180,col 9)-(line 180,col 125)",
        "(line 181,col 9)-(line 181,col 126)",
        "(line 182,col 9)-(line 182,col 126)",
        "(line 183,col 9)-(line 183,col 126)",
        "(line 184,col 9)-(line 184,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 187,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 46)",
        "(line 190,col 9)-(line 190,col 46)",
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 60)",
        "(line 193,col 9)-(line 193,col 55)",
        "(line 194,col 9)-(line 194,col 61)",
        "(line 195,col 9)-(line 195,col 65)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 201,col 9)-(line 201,col 112)",
        "(line 202,col 9)-(line 202,col 119)",
        "(line 207,col 9)-(line 207,col 79)",
        "(line 208,col 9)-(line 208,col 119)",
        "(line 210,col 9)-(line 210,col 120)",
        "(line 211,col 9)-(line 211,col 120)",
        "(line 213,col 9)-(line 213,col 120)",
        "(line 214,col 9)-(line 214,col 120)",
        "(line 217,col 9)-(line 217,col 78)",
        "(line 218,col 9)-(line 218,col 78)",
        "(line 220,col 9)-(line 220,col 69)",
        "(line 221,col 9)-(line 221,col 69)",
        "(line 223,col 9)-(line 223,col 70)",
        "(line 224,col 9)-(line 224,col 70)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 227,col 71)",
        "(line 230,col 9)-(line 230,col 114)",
        "(line 231,col 9)-(line 231,col 114)",
        "(line 233,col 9)-(line 233,col 113)",
        "(line 234,col 9)-(line 234,col 113)",
        "(line 236,col 9)-(line 236,col 113)",
        "(line 237,col 9)-(line 237,col 113)",
        "(line 239,col 9)-(line 239,col 63)",
        "(line 240,col 9)-(line 240,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 258,
      "end_line": 299,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 75)",
        "(line 268,col 9)-(line 268,col 77)",
        "(line 271,col 9)-(line 271,col 139)",
        "(line 274,col 9)-(line 277,col 78)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 82)",
        "(line 285,col 9)-(line 285,col 82)",
        "(line 286,col 9)-(line 286,col 38)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 83)",
        "(line 291,col 9)-(line 291,col 83)",
        "(line 294,col 9)-(line 294,col 78)",
        "(line 295,col 9)-(line 295,col 79)",
        "(line 296,col 9)-(line 296,col 78)",
        "(line 297,col 9)-(line 297,col 79)",
        "(line 298,col 9)-(line 298,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 301,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 42)",
        "(line 303,col 9)-(line 303,col 42)",
        "(line 304,col 9)-(line 304,col 92)",
        "(line 305,col 9)-(line 305,col 94)",
        "(line 306,col 9)-(line 306,col 93)",
        "(line 307,col 9)-(line 307,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObject()",
      "begin_line": 310,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 313,col 66)",
        "(line 314,col 9)-(line 314,col 67)",
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 66)",
        "(line 318,col 9)-(line 318,col 69)",
        "(line 320,col 9)-(line 320,col 69)",
        "(line 321,col 9)-(line 321,col 69)",
        "(line 322,col 9)-(line 322,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLong()",
      "begin_line": 325,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 21)",
        "(line 327,col 9)-(line 327,col 21)",
        "(line 328,col 9)-(line 328,col 66)",
        "(line 329,col 9)-(line 329,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testInt()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 19)",
        "(line 334,col 9)-(line 334,col 19)",
        "(line 335,col 9)-(line 335,col 66)",
        "(line 336,col 9)-(line 336,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShort()",
      "begin_line": 339,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 21)",
        "(line 341,col 9)-(line 341,col 21)",
        "(line 342,col 9)-(line 342,col 66)",
        "(line 343,col 9)-(line 343,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testChar()",
      "begin_line": 346,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 20)",
        "(line 348,col 9)-(line 348,col 20)",
        "(line 349,col 9)-(line 349,col 66)",
        "(line 350,col 9)-(line 350,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByte()",
      "begin_line": 353,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 20)",
        "(line 355,col 9)-(line 355,col 20)",
        "(line 356,col 9)-(line 356,col 66)",
        "(line 357,col 9)-(line 357,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 360,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 22)",
        "(line 362,col 9)-(line 362,col 22)",
        "(line 363,col 9)-(line 363,col 66)",
        "(line 364,col 9)-(line 364,col 67)",
        "(line 365,col 9)-(line 365,col 75)",
        "(line 366,col 9)-(line 366,col 82)",
        "(line 367,col 9)-(line 367,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 370,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 21)",
        "(line 372,col 9)-(line 372,col 21)",
        "(line 373,col 9)-(line 373,col 66)",
        "(line 374,col 9)-(line 374,col 67)",
        "(line 375,col 9)-(line 375,col 74)",
        "(line 376,col 9)-(line 376,col 80)",
        "(line 377,col 9)-(line 377,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBigDecimal()",
      "begin_line": 381,
      "end_line": 386,
      "comment": " https://issues.apache.org/jira/browse/LANG-393",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 46)",
        "(line 383,col 9)-(line 383,col 47)",
        "(line 384,col 9)-(line 384,col 66)",
        "(line 385,col 9)-(line 385,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 388,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 58)",
        "(line 390,col 9)-(line 390,col 45)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 392,col 9)-(line 392,col 45)",
        "(line 393,col 9)-(line 393,col 39)",
        "(line 394,col 9)-(line 394,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBoolean()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiLongArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiIntArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiShortArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiCharArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiByteArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiFloatArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiDoubleArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMultiBooleanArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testRaggedArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testMixedArray()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
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
      "end_line": 909,
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
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 893,col 13)-(line 893,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 896,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 897,col 13)-(line 898,col 28)",
        "(line 899,col 13)-(line 900,col 61)",
        "(line 901,col 13)-(line 902,col 61)",
        "(line 903,col 13)-(line 903,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 907,col 13)-(line 907,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 911,
      "end_line": 931,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 912,
      "end_line": 912,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 918,
      "end_line": 926,
      "comment": "",
      "child_ranges": [
        "(line 919,col 13)-(line 920,col 28)",
        "(line 921,col 13)-(line 922,col 61)",
        "(line 923,col 13)-(line 924,col 61)",
        "(line 925,col 13)-(line 925,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 928,
      "end_line": 930,
      "comment": "",
      "child_ranges": [
        "(line 929,col 13)-(line 929,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 938,
      "end_line": 956,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 57)",
        "(line 940,col 9)-(line 940,col 57)",
        "(line 943,col 9)-(line 943,col 40)",
        "(line 944,col 9)-(line 944,col 40)",
        "(line 945,col 9)-(line 945,col 40)",
        "(line 946,col 9)-(line 946,col 40)",
        "(line 948,col 9)-(line 948,col 38)",
        "(line 949,col 9)-(line 949,col 38)",
        "(line 950,col 9)-(line 950,col 38)",
        "(line 951,col 9)-(line 951,col 38)",
        "(line 952,col 9)-(line 952,col 64)",
        "(line 953,col 9)-(line 953,col 64)",
        "(line 954,col 9)-(line 954,col 64)",
        "(line 955,col 9)-(line 955,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 961,
      "end_line": 968,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 76)",
        "(line 963,col 9)-(line 963,col 86)",
        "(line 967,col 9)-(line 967,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 970,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 84)",
        "(line 972,col 9)-(line 972,col 84)",
        "(line 975,col 9)-(line 975,col 60)",
        "(line 978,col 9)-(line 978,col 77)",
        "(line 979,col 9)-(line 979,col 77)",
        "(line 980,col 9)-(line 980,col 82)",
        "(line 983,col 9)-(line 983,col 82)",
        "(line 984,col 9)-(line 984,col 84)",
        "(line 987,col 9)-(line 987,col 90)",
        "(line 990,col 9)-(line 990,col 97)",
        "(line 991,col 9)-(line 991,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 994,
      "end_line": 1004,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 995,
      "end_line": 995,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 999,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 13)-(line 1000,col 43)",
        "(line 1001,col 13)-(line 1001,col 43)",
        "(line 1002,col 13)-(line 1002,col 47)"
      ]
    }
  ]
}