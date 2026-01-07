{
  "filepath": "/tmp/Lang-3b/src/test/java/org/apache/commons/lang3/builder/EqualsBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EqualsBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 1129,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 68,
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
        "(line 52,col 13)-(line 52,col 50)",
        "(line 53,col 13)-(line 53,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.hashCode()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.setA(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject.getA()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 70,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 21)",
        "(line 77,col 13)-(line 77,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 79,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 44)",
        "(line 82,col 13)-(line 82,col 43)",
        "(line 83,col 13)-(line 85,col 13)",
        "(line 87,col 13)-(line 87,col 56)",
        "(line 88,col 13)-(line 88,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.hashCode()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.setB(int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestSubObject.getB()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestEmptySubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 105,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestEmptySubObject.TestEmptySubObject(int)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 111,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 112,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject.TestTSubObject(int, int)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 21)",
        "(line 116,col 13)-(line 116,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject"
      ],
      "begin_line": 120,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 121,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject.TestTTSubObject(int, int, int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 13)-(line 124,col 24)",
        "(line 125,col 13)-(line 125,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTTLeafObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTSubObject"
      ],
      "begin_line": 129,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leafValue"
      ],
      "begin_line": 130,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTTLeafObject.TestTTLeafObject(int, int, int, int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 28)",
        "(line 134,col 13)-(line 134,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTSubObject2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject"
      ],
      "begin_line": 138,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.TestTSubObject2(int, int)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.getT()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestTSubObject2.setT(int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals()",
      "begin_line": 151,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 154,col 48)",
        "(line 155,col 9)-(line 155,col 59)",
        "(line 156,col 9)-(line 156,col 60)",
        "(line 157,col 9)-(line 157,col 19)",
        "(line 158,col 9)-(line 158,col 59)",
        "(line 160,col 9)-(line 160,col 62)",
        "(line 162,col 9)-(line 162,col 62)",
        "(line 163,col 9)-(line 163,col 62)",
        "(line 164,col 9)-(line 164,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals()",
      "begin_line": 167,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 45)",
        "(line 170,col 9)-(line 170,col 44)",
        "(line 172,col 9)-(line 172,col 125)",
        "(line 173,col 9)-(line 173,col 126)",
        "(line 174,col 9)-(line 174,col 126)",
        "(line 175,col 9)-(line 175,col 126)",
        "(line 176,col 9)-(line 176,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals(boolean)",
      "begin_line": 179,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 66)",
        "(line 185,col 9)-(line 185,col 61)",
        "(line 186,col 9)-(line 186,col 67)",
        "(line 187,col 9)-(line 187,col 71)",
        "(line 188,col 9)-(line 188,col 59)",
        "(line 189,col 9)-(line 189,col 62)",
        "(line 190,col 9)-(line 190,col 62)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 193,col 9)-(line 193,col 112)",
        "(line 194,col 9)-(line 194,col 119)",
        "(line 199,col 9)-(line 199,col 79)",
        "(line 200,col 9)-(line 200,col 119)",
        "(line 202,col 9)-(line 202,col 120)",
        "(line 203,col 9)-(line 203,col 120)",
        "(line 205,col 9)-(line 205,col 120)",
        "(line 206,col 9)-(line 206,col 120)",
        "(line 209,col 9)-(line 209,col 78)",
        "(line 210,col 9)-(line 210,col 78)",
        "(line 212,col 9)-(line 212,col 69)",
        "(line 213,col 9)-(line 213,col 69)",
        "(line 215,col 9)-(line 215,col 70)",
        "(line 216,col 9)-(line 216,col 70)",
        "(line 218,col 9)-(line 218,col 71)",
        "(line 219,col 9)-(line 219,col 71)",
        "(line 222,col 9)-(line 222,col 114)",
        "(line 223,col 9)-(line 223,col 114)",
        "(line 225,col 9)-(line 225,col 113)",
        "(line 226,col 9)-(line 226,col 113)",
        "(line 228,col 9)-(line 228,col 113)",
        "(line 229,col 9)-(line 229,col 113)",
        "(line 231,col 9)-(line 231,col 63)",
        "(line 232,col 9)-(line 232,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsEquivalenceRelationship(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, org.apache.commons.lang3.builder.EqualsBuilderTest.TestObject, boolean)",
      "begin_line": 251,
      "end_line": 292,
      "comment": "\n     * Equivalence relationship tests inspired by \"Effective Java\":\n     * \u003cul\u003e\n     * \u003cli\u003ereflection\u003c/li\u003e\n     * \u003cli\u003esymmetry\u003c/li\u003e\n     * \u003cli\u003etransitive\u003c/li\u003e\n     * \u003cli\u003econsistency\u003c/li\u003e\n     * \u003cli\u003enon-null reference\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @param to a TestObject\n     * @param toBis a TestObject, equal to to and toTer\n     * @param toTer Left hand side, equal to to and toBis\n     * @param to2 a different TestObject\n     * @param oToChange a TestObject that will be changed\n     * @param testTransients whether to test transient instance variables \n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 75)",
        "(line 261,col 9)-(line 261,col 77)",
        "(line 264,col 9)-(line 264,col 139)",
        "(line 267,col 9)-(line 270,col 78)",
        "(line 273,col 9)-(line 273,col 34)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 82)",
        "(line 278,col 9)-(line 278,col 82)",
        "(line 279,col 9)-(line 279,col 38)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 83)",
        "(line 284,col 9)-(line 284,col 83)",
        "(line 287,col 9)-(line 287,col 78)",
        "(line 288,col 9)-(line 288,col 79)",
        "(line 289,col 9)-(line 289,col 78)",
        "(line 290,col 9)-(line 290,col 79)",
        "(line 291,col 9)-(line 291,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper()",
      "begin_line": 294,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 48)",
        "(line 297,col 9)-(line 297,col 48)",
        "(line 298,col 9)-(line 298,col 84)",
        "(line 299,col 9)-(line 299,col 86)",
        "(line 300,col 9)-(line 300,col 85)",
        "(line 301,col 9)-(line 301,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObject()",
      "begin_line": 304,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 48)",
        "(line 307,col 9)-(line 307,col 48)",
        "(line 308,col 9)-(line 308,col 66)",
        "(line 309,col 9)-(line 309,col 67)",
        "(line 310,col 9)-(line 310,col 19)",
        "(line 311,col 9)-(line 311,col 66)",
        "(line 313,col 9)-(line 313,col 69)",
        "(line 315,col 9)-(line 315,col 69)",
        "(line 316,col 9)-(line 316,col 69)",
        "(line 317,col 9)-(line 317,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild()",
      "begin_line": 320,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 48)",
        "(line 323,col 9)-(line 323,col 48)",
        "(line 324,col 9)-(line 324,col 79)",
        "(line 325,col 9)-(line 325,col 80)",
        "(line 326,col 9)-(line 326,col 19)",
        "(line 327,col 9)-(line 327,col 79)",
        "(line 329,col 9)-(line 329,col 82)",
        "(line 331,col 9)-(line 331,col 82)",
        "(line 332,col 9)-(line 332,col 82)",
        "(line 333,col 9)-(line 333,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLong()",
      "begin_line": 336,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 27)",
        "(line 339,col 9)-(line 339,col 27)",
        "(line 340,col 9)-(line 340,col 66)",
        "(line 341,col 9)-(line 341,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testInt()",
      "begin_line": 344,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 25)",
        "(line 348,col 9)-(line 348,col 66)",
        "(line 349,col 9)-(line 349,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShort()",
      "begin_line": 352,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 27)",
        "(line 355,col 9)-(line 355,col 27)",
        "(line 356,col 9)-(line 356,col 66)",
        "(line 357,col 9)-(line 357,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testChar()",
      "begin_line": 360,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 66)",
        "(line 365,col 9)-(line 365,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByte()",
      "begin_line": 368,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 26)",
        "(line 371,col 9)-(line 371,col 26)",
        "(line 372,col 9)-(line 372,col 66)",
        "(line 373,col 9)-(line 373,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble()",
      "begin_line": 376,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 28)",
        "(line 379,col 9)-(line 379,col 28)",
        "(line 380,col 9)-(line 380,col 66)",
        "(line 381,col 9)-(line 381,col 67)",
        "(line 382,col 9)-(line 382,col 75)",
        "(line 383,col 9)-(line 383,col 82)",
        "(line 384,col 9)-(line 384,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat()",
      "begin_line": 387,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 27)",
        "(line 390,col 9)-(line 390,col 27)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 392,col 67)",
        "(line 393,col 9)-(line 393,col 74)",
        "(line 394,col 9)-(line 394,col 80)",
        "(line 395,col 9)-(line 395,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors()",
      "begin_line": 398,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 64)",
        "(line 401,col 9)-(line 401,col 45)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReset()",
      "begin_line": 408,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 64)",
        "(line 411,col 9)-(line 411,col 45)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 46)",
        "(line 414,col 9)-(line 414,col 30)",
        "(line 415,col 9)-(line 415,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean()",
      "begin_line": 418,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 32)",
        "(line 421,col 9)-(line 421,col 33)",
        "(line 422,col 9)-(line 422,col 66)",
        "(line 423,col 9)-(line 423,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray()",
      "begin_line": 426,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 46)",
        "(line 429,col 9)-(line 429,col 36)",
        "(line 430,col 9)-(line 430,col 36)",
        "(line 431,col 9)-(line 431,col 23)",
        "(line 432,col 9)-(line 432,col 46)",
        "(line 433,col 9)-(line 433,col 36)",
        "(line 434,col 9)-(line 434,col 36)",
        "(line 435,col 9)-(line 435,col 23)",
        "(line 437,col 9)-(line 437,col 70)",
        "(line 438,col 9)-(line 438,col 70)",
        "(line 439,col 9)-(line 439,col 70)",
        "(line 440,col 9)-(line 440,col 24)",
        "(line 441,col 9)-(line 441,col 71)",
        "(line 442,col 9)-(line 442,col 24)",
        "(line 443,col 9)-(line 443,col 70)",
        "(line 444,col 9)-(line 444,col 26)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 446,col 9)-(line 446,col 23)",
        "(line 447,col 9)-(line 447,col 70)",
        "(line 449,col 9)-(line 449,col 20)",
        "(line 450,col 9)-(line 450,col 71)",
        "(line 451,col 9)-(line 451,col 20)",
        "(line 452,col 9)-(line 452,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray()",
      "begin_line": 455,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 458,col 21)",
        "(line 459,col 9)-(line 459,col 21)",
        "(line 460,col 9)-(line 460,col 34)",
        "(line 461,col 9)-(line 461,col 21)",
        "(line 462,col 9)-(line 462,col 21)",
        "(line 463,col 9)-(line 463,col 70)",
        "(line 464,col 9)-(line 464,col 70)",
        "(line 465,col 9)-(line 465,col 20)",
        "(line 466,col 9)-(line 466,col 71)",
        "(line 468,col 9)-(line 468,col 20)",
        "(line 469,col 9)-(line 469,col 71)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray()",
      "begin_line": 474,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 32)",
        "(line 477,col 9)-(line 477,col 20)",
        "(line 478,col 9)-(line 478,col 20)",
        "(line 479,col 9)-(line 479,col 32)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray()",
      "begin_line": 493,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 36)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 36)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray()",
      "begin_line": 512,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 34)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 34)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray()",
      "begin_line": 531,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 34)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 34)",
        "(line 537,col 9)-(line 537,col 20)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 70)",
        "(line 540,col 9)-(line 540,col 70)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 71)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 71)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray()",
      "begin_line": 550,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 38)",
        "(line 553,col 9)-(line 553,col 20)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 555,col 38)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 20)",
        "(line 558,col 9)-(line 558,col 70)",
        "(line 559,col 9)-(line 559,col 70)",
        "(line 560,col 9)-(line 560,col 20)",
        "(line 561,col 9)-(line 561,col 71)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 71)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 566,col 9)-(line 566,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray()",
      "begin_line": 569,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 36)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 20)",
        "(line 574,col 9)-(line 574,col 36)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 577,col 9)-(line 577,col 70)",
        "(line 578,col 9)-(line 578,col 70)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 580,col 9)-(line 580,col 71)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 583,col 9)-(line 583,col 71)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 585,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray()",
      "begin_line": 588,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 40)",
        "(line 591,col 9)-(line 591,col 23)",
        "(line 592,col 9)-(line 592,col 24)",
        "(line 593,col 9)-(line 593,col 40)",
        "(line 594,col 9)-(line 594,col 23)",
        "(line 595,col 9)-(line 595,col 24)",
        "(line 596,col 9)-(line 596,col 70)",
        "(line 597,col 9)-(line 597,col 70)",
        "(line 598,col 9)-(line 598,col 23)",
        "(line 599,col 9)-(line 599,col 71)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 71)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 604,col 9)-(line 604,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray()",
      "begin_line": 607,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 47)",
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 74)",
        "(line 618,col 9)-(line 618,col 74)",
        "(line 619,col 9)-(line 619,col 25)",
        "(line 620,col 9)-(line 620,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray()",
      "begin_line": 623,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 45)",
        "(line 626,col 9)-(line 626,col 45)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 74)",
        "(line 634,col 9)-(line 634,col 74)",
        "(line 635,col 9)-(line 635,col 25)",
        "(line 636,col 9)-(line 636,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray()",
      "begin_line": 639,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 49)",
        "(line 642,col 9)-(line 642,col 49)",
        "(line 643,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 74)",
        "(line 650,col 9)-(line 650,col 74)",
        "(line 651,col 9)-(line 651,col 25)",
        "(line 652,col 9)-(line 652,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray()",
      "begin_line": 655,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 47)",
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 74)",
        "(line 666,col 9)-(line 666,col 74)",
        "(line 667,col 9)-(line 667,col 25)",
        "(line 668,col 9)-(line 668,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray()",
      "begin_line": 671,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 674,col 47)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 74)",
        "(line 682,col 9)-(line 682,col 74)",
        "(line 683,col 9)-(line 683,col 25)",
        "(line 684,col 9)-(line 684,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray()",
      "begin_line": 687,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 49)",
        "(line 690,col 9)-(line 690,col 49)",
        "(line 691,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 74)",
        "(line 698,col 9)-(line 698,col 74)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 700,col 9)-(line 700,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray()",
      "begin_line": 703,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 51)",
        "(line 706,col 9)-(line 706,col 51)",
        "(line 707,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 74)",
        "(line 714,col 9)-(line 714,col 74)",
        "(line 715,col 9)-(line 715,col 25)",
        "(line 716,col 9)-(line 716,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray()",
      "begin_line": 719,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 53)",
        "(line 722,col 9)-(line 722,col 53)",
        "(line 723,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 729,col 74)",
        "(line 730,col 9)-(line 730,col 74)",
        "(line 731,col 9)-(line 731,col 29)",
        "(line 732,col 9)-(line 732,col 75)",
        "(line 735,col 9)-(line 735,col 59)",
        "(line 736,col 9)-(line 736,col 75)",
        "(line 737,col 9)-(line 737,col 75)",
        "(line 738,col 9)-(line 738,col 75)",
        "(line 739,col 9)-(line 739,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray()",
      "begin_line": 742,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 46)",
        "(line 745,col 9)-(line 745,col 46)",
        "(line 746,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 74)",
        "(line 755,col 9)-(line 755,col 74)",
        "(line 756,col 9)-(line 756,col 25)",
        "(line 757,col 9)-(line 757,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray()",
      "begin_line": 760,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 46)",
        "(line 763,col 9)-(line 763,col 46)",
        "(line 764,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 74)",
        "(line 773,col 9)-(line 773,col 74)",
        "(line 774,col 9)-(line 774,col 36)",
        "(line 775,col 9)-(line 775,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 778,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 54)",
        "(line 781,col 9)-(line 781,col 38)",
        "(line 782,col 9)-(line 782,col 38)",
        "(line 783,col 9)-(line 783,col 54)",
        "(line 784,col 9)-(line 784,col 38)",
        "(line 785,col 9)-(line 785,col 38)",
        "(line 786,col 9)-(line 786,col 35)",
        "(line 787,col 9)-(line 787,col 35)",
        "(line 788,col 9)-(line 788,col 70)",
        "(line 789,col 9)-(line 789,col 72)",
        "(line 790,col 9)-(line 790,col 70)",
        "(line 791,col 9)-(line 791,col 72)",
        "(line 792,col 9)-(line 792,col 26)",
        "(line 793,col 9)-(line 793,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 796,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 42)",
        "(line 799,col 9)-(line 799,col 23)",
        "(line 800,col 9)-(line 800,col 23)",
        "(line 801,col 9)-(line 801,col 42)",
        "(line 802,col 9)-(line 802,col 23)",
        "(line 803,col 9)-(line 803,col 23)",
        "(line 804,col 9)-(line 804,col 35)",
        "(line 805,col 9)-(line 805,col 35)",
        "(line 806,col 9)-(line 806,col 70)",
        "(line 807,col 9)-(line 807,col 72)",
        "(line 808,col 9)-(line 808,col 70)",
        "(line 809,col 9)-(line 809,col 72)",
        "(line 810,col 9)-(line 810,col 22)",
        "(line 811,col 9)-(line 811,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 814,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 40)",
        "(line 817,col 9)-(line 817,col 22)",
        "(line 818,col 9)-(line 818,col 22)",
        "(line 819,col 9)-(line 819,col 40)",
        "(line 820,col 9)-(line 820,col 22)",
        "(line 821,col 9)-(line 821,col 22)",
        "(line 822,col 9)-(line 822,col 35)",
        "(line 823,col 9)-(line 823,col 35)",
        "(line 824,col 9)-(line 824,col 70)",
        "(line 825,col 9)-(line 825,col 72)",
        "(line 826,col 9)-(line 826,col 70)",
        "(line 827,col 9)-(line 827,col 72)",
        "(line 828,col 9)-(line 828,col 22)",
        "(line 829,col 9)-(line 829,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 832,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 44)",
        "(line 835,col 9)-(line 835,col 22)",
        "(line 836,col 9)-(line 836,col 22)",
        "(line 837,col 9)-(line 837,col 44)",
        "(line 838,col 9)-(line 838,col 22)",
        "(line 839,col 9)-(line 839,col 22)",
        "(line 840,col 9)-(line 840,col 35)",
        "(line 841,col 9)-(line 841,col 35)",
        "(line 842,col 9)-(line 842,col 70)",
        "(line 843,col 9)-(line 843,col 72)",
        "(line 844,col 9)-(line 844,col 70)",
        "(line 845,col 9)-(line 845,col 72)",
        "(line 846,col 9)-(line 846,col 22)",
        "(line 847,col 9)-(line 847,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 850,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 42)",
        "(line 853,col 9)-(line 853,col 22)",
        "(line 854,col 9)-(line 854,col 22)",
        "(line 855,col 9)-(line 855,col 42)",
        "(line 856,col 9)-(line 856,col 22)",
        "(line 857,col 9)-(line 857,col 22)",
        "(line 858,col 9)-(line 858,col 35)",
        "(line 859,col 9)-(line 859,col 35)",
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
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 868,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 42)",
        "(line 871,col 9)-(line 871,col 22)",
        "(line 872,col 9)-(line 872,col 22)",
        "(line 873,col 9)-(line 873,col 42)",
        "(line 874,col 9)-(line 874,col 22)",
        "(line 875,col 9)-(line 875,col 22)",
        "(line 876,col 9)-(line 876,col 35)",
        "(line 877,col 9)-(line 877,col 35)",
        "(line 878,col 9)-(line 878,col 70)",
        "(line 879,col 9)-(line 879,col 72)",
        "(line 880,col 9)-(line 880,col 70)",
        "(line 881,col 9)-(line 881,col 72)",
        "(line 882,col 9)-(line 882,col 22)",
        "(line 883,col 9)-(line 883,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 886,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 46)",
        "(line 889,col 9)-(line 889,col 22)",
        "(line 890,col 9)-(line 890,col 22)",
        "(line 891,col 9)-(line 891,col 46)",
        "(line 892,col 9)-(line 892,col 22)",
        "(line 893,col 9)-(line 893,col 22)",
        "(line 894,col 9)-(line 894,col 35)",
        "(line 895,col 9)-(line 895,col 35)",
        "(line 896,col 9)-(line 896,col 70)",
        "(line 897,col 9)-(line 897,col 72)",
        "(line 898,col 9)-(line 898,col 70)",
        "(line 899,col 9)-(line 899,col 72)",
        "(line 900,col 9)-(line 900,col 22)",
        "(line 901,col 9)-(line 901,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 904,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 44)",
        "(line 907,col 9)-(line 907,col 22)",
        "(line 908,col 9)-(line 908,col 22)",
        "(line 909,col 9)-(line 909,col 44)",
        "(line 910,col 9)-(line 910,col 22)",
        "(line 911,col 9)-(line 911,col 22)",
        "(line 912,col 9)-(line 912,col 35)",
        "(line 913,col 9)-(line 913,col 35)",
        "(line 914,col 9)-(line 914,col 70)",
        "(line 915,col 9)-(line 915,col 72)",
        "(line 916,col 9)-(line 916,col 70)",
        "(line 917,col 9)-(line 917,col 72)",
        "(line 918,col 9)-(line 918,col 22)",
        "(line 919,col 9)-(line 919,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 922,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 48)",
        "(line 925,col 9)-(line 925,col 25)",
        "(line 926,col 9)-(line 926,col 26)",
        "(line 927,col 9)-(line 927,col 48)",
        "(line 928,col 9)-(line 928,col 25)",
        "(line 929,col 9)-(line 929,col 26)",
        "(line 930,col 9)-(line 930,col 35)",
        "(line 931,col 9)-(line 931,col 35)",
        "(line 932,col 9)-(line 932,col 70)",
        "(line 933,col 9)-(line 933,col 72)",
        "(line 934,col 9)-(line 934,col 70)",
        "(line 935,col 9)-(line 935,col 72)",
        "(line 936,col 9)-(line 936,col 25)",
        "(line 937,col 9)-(line 937,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestACanEqualB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 940,
      "end_line": 969,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 941,
      "end_line": 941,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.TestACanEqualB(int)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 944,col 13)-(line 944,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.equals(java.lang.Object)",
      "begin_line": 947,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 949,col 13)-(line 951,col 13)",
        "(line 952,col 13)-(line 954,col 13)",
        "(line 955,col 13)-(line 957,col 13)",
        "(line 958,col 13)-(line 958,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.hashCode()",
      "begin_line": 961,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 963,col 13)-(line 963,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestACanEqualB.getA()",
      "begin_line": 966,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 967,col 13)-(line 967,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBCanEqualA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 971,
      "end_line": 1000,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.TestBCanEqualA(int)",
      "begin_line": 974,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 975,col 13)-(line 975,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.equals(java.lang.Object)",
      "begin_line": 978,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 980,col 13)-(line 982,col 13)",
        "(line 983,col 13)-(line 985,col 13)",
        "(line 986,col 13)-(line 988,col 13)",
        "(line 989,col 13)-(line 989,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.hashCode()",
      "begin_line": 992,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 994,col 13)-(line 994,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestBCanEqualA.getB()",
      "begin_line": 997,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 998,col 13)-(line 998,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses()",
      "begin_line": 1007,
      "end_line": 1026,
      "comment": "\n     * Tests two instances of classes that can be equal and that are not \"related\". The two classes are not subclasses\n     * of each other and do not share a parent aside from Object.\n     * See http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33069\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 63)",
        "(line 1010,col 9)-(line 1010,col 63)",
        "(line 1013,col 9)-(line 1013,col 40)",
        "(line 1014,col 9)-(line 1014,col 40)",
        "(line 1015,col 9)-(line 1015,col 40)",
        "(line 1016,col 9)-(line 1016,col 40)",
        "(line 1018,col 9)-(line 1018,col 38)",
        "(line 1019,col 9)-(line 1019,col 38)",
        "(line 1020,col 9)-(line 1020,col 38)",
        "(line 1021,col 9)-(line 1021,col 38)",
        "(line 1022,col 9)-(line 1022,col 64)",
        "(line 1023,col 9)-(line 1023,col 64)",
        "(line 1024,col 9)-(line 1024,col 64)",
        "(line 1025,col 9)-(line 1025,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement()",
      "begin_line": 1031,
      "end_line": 1039,
      "comment": "\n     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d33067\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 90)",
        "(line 1034,col 9)-(line 1034,col 104)",
        "(line 1038,col 9)-(line 1038,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields()",
      "begin_line": 1041,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 90)",
        "(line 1044,col 9)-(line 1044,col 90)",
        "(line 1047,col 9)-(line 1047,col 60)",
        "(line 1050,col 9)-(line 1050,col 77)",
        "(line 1051,col 9)-(line 1051,col 77)",
        "(line 1052,col 9)-(line 1052,col 82)",
        "(line 1055,col 9)-(line 1055,col 82)",
        "(line 1056,col 9)-(line 1056,col 84)",
        "(line 1059,col 9)-(line 1059,col 90)",
        "(line 1062,col 9)-(line 1062,col 97)",
        "(line 1063,col 9)-(line 1063,col 104)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectWithMultipleFields",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1066,
      "end_line": 1079,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1067,
      "end_line": 1068,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 1069,
      "end_line": 1070,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "three"
      ],
      "begin_line": 1071,
      "end_line": 1072,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectWithMultipleFields.TestObjectWithMultipleFields(int, int, int)",
      "begin_line": 1074,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 13)-(line 1075,col 43)",
        "(line 1076,col 13)-(line 1076,col 43)",
        "(line 1077,col 13)-(line 1077,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences()",
      "begin_line": 1085,
      "end_line": 1108,
      "comment": "\n     * Test cyclical object references which cause a StackOverflowException if\n     * not handled properly. s. LANG-606\n     ",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 69)",
        "(line 1088,col 9)-(line 1088,col 66)",
        "(line 1089,col 9)-(line 1089,col 37)",
        "(line 1090,col 9)-(line 1090,col 37)",
        "(line 1092,col 9)-(line 1092,col 69)",
        "(line 1093,col 9)-(line 1093,col 66)",
        "(line 1094,col 9)-(line 1094,col 37)",
        "(line 1095,col 9)-(line 1095,col 37)",
        "(line 1097,col 9)-(line 1097,col 69)",
        "(line 1098,col 9)-(line 1098,col 66)",
        "(line 1099,col 9)-(line 1099,col 37)",
        "(line 1100,col 9)-(line 1100,col 37)",
        "(line 1102,col 9)-(line 1102,col 34)",
        "(line 1103,col 9)-(line 1103,col 48)",
        "(line 1104,col 9)-(line 1104,col 35)",
        "(line 1105,col 9)-(line 1105,col 48)",
        "(line 1106,col 9)-(line 1106,col 35)",
        "(line 1107,col 9)-(line 1107,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestObjectReference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1110,
      "end_line": 1128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 1111,
      "end_line": 1112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "one"
      ],
      "begin_line": 1113,
      "end_line": 1114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.TestObjectReference(int)",
      "begin_line": 1116,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1117,col 13)-(line 1117,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.setObjectReference(org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference)",
      "begin_line": 1120,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 13)-(line 1121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.EqualsBuilderTest.TestObjectReference.equals(java.lang.Object)",
      "begin_line": 1124,
      "end_line": 1127,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 13)-(line 1126,col 61)"
      ]
    }
  ]
}