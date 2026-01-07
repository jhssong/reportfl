{
  "filepath": "/tmp/Lang-33b/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1008,
      "comment": "\n * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.\n *\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:alex@apache.org\"\u003eAlex Chaffee\u003c/a\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseStr"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ToStringBuilderTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx1()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx2()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 75)",
        "(line 50,col 9)-(line 50,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx3()",
      "begin_line": 53,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 81)",
        "(line 55,col 9)-(line 55,col 51)",
        "(line 56,col 9)-(line 56,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testGetSetDefault()",
      "begin_line": 59,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSetDefaultEx()",
      "begin_line": 69,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBlank()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionInteger()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Test wrapper for int primitive.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharacter()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Test wrapper for char primitive.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBoolean()",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Test wrapper for char boolean.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 18)",
        "(line 103,col 9)-(line 103,col 25)",
        "(line 104,col 9)-(line 104,col 99)",
        "(line 105,col 9)-(line 105,col 26)",
        "(line 106,col 9)-(line 106,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toBaseString(java.lang.Object)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Create the same toString() as Object.toString().\n     * @param o the object to create the string for.\n     * @return a String in the Object.toString format.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.assertReflectionArray(java.lang.String, java.lang.Object)",
      "begin_line": 133,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 75)",
        "(line 139,col 9)-(line 139,col 81)",
        "(line 140,col 9)-(line 140,col 87)",
        "(line 141,col 9)-(line 141,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectArray()",
      "begin_line": 144,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 73)",
        "(line 146,col 9)-(line 146,col 50)",
        "(line 147,col 9)-(line 147,col 96)",
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 150,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArray()",
      "begin_line": 153,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 90)",
        "(line 157,col 9)-(line 157,col 21)",
        "(line 158,col 9)-(line 158,col 47)",
        "(line 159,col 9)-(line 159,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArray()",
      "begin_line": 162,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 90)",
        "(line 166,col 9)-(line 166,col 21)",
        "(line 167,col 9)-(line 167,col 47)",
        "(line 168,col 9)-(line 168,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionShortArray()",
      "begin_line": 171,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 52)",
        "(line 173,col 9)-(line 173,col 50)",
        "(line 174,col 9)-(line 174,col 90)",
        "(line 175,col 9)-(line 175,col 21)",
        "(line 176,col 9)-(line 176,col 47)",
        "(line 177,col 9)-(line 177,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionyteArray()",
      "begin_line": 180,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 50)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 90)",
        "(line 184,col 9)-(line 184,col 21)",
        "(line 185,col 9)-(line 185,col 47)",
        "(line 186,col 9)-(line 186,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArray()",
      "begin_line": 189,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 57)",
        "(line 191,col 9)-(line 191,col 50)",
        "(line 192,col 9)-(line 192,col 89)",
        "(line 193,col 9)-(line 193,col 21)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 195,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArray()",
      "begin_line": 198,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 69)",
        "(line 200,col 9)-(line 200,col 50)",
        "(line 201,col 9)-(line 201,col 105)",
        "(line 202,col 9)-(line 202,col 21)",
        "(line 203,col 9)-(line 203,col 47)",
        "(line 204,col 9)-(line 204,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArray()",
      "begin_line": 207,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 71)",
        "(line 209,col 9)-(line 209,col 50)",
        "(line 210,col 9)-(line 210,col 105)",
        "(line 211,col 9)-(line 211,col 21)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArray()",
      "begin_line": 216,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 63)",
        "(line 218,col 9)-(line 218,col 50)",
        "(line 219,col 9)-(line 219,col 98)",
        "(line 220,col 9)-(line 220,col 21)",
        "(line 221,col 9)-(line 221,col 47)",
        "(line 222,col 9)-(line 222,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArrayArray()",
      "begin_line": 227,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 84)",
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 230,col 108)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 233,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArrayArray()",
      "begin_line": 237,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 64)",
        "(line 239,col 9)-(line 239,col 50)",
        "(line 240,col 9)-(line 240,col 98)",
        "(line 241,col 9)-(line 241,col 21)",
        "(line 242,col 9)-(line 242,col 47)",
        "(line 243,col 9)-(line 243,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArrayArray()",
      "begin_line": 246,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 62)",
        "(line 248,col 9)-(line 248,col 50)",
        "(line 249,col 9)-(line 249,col 98)",
        "(line 250,col 9)-(line 250,col 21)",
        "(line 251,col 9)-(line 251,col 47)",
        "(line 252,col 9)-(line 252,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionhortArrayArray()",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 66)",
        "(line 257,col 9)-(line 257,col 50)",
        "(line 258,col 9)-(line 258,col 98)",
        "(line 259,col 9)-(line 259,col 21)",
        "(line 260,col 9)-(line 260,col 47)",
        "(line 261,col 9)-(line 261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionByteArrayArray()",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 64)",
        "(line 266,col 9)-(line 266,col 50)",
        "(line 267,col 9)-(line 267,col 98)",
        "(line 268,col 9)-(line 268,col 21)",
        "(line 269,col 9)-(line 269,col 47)",
        "(line 270,col 9)-(line 270,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArrayArray()",
      "begin_line": 273,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 70)",
        "(line 275,col 9)-(line 275,col 50)",
        "(line 276,col 9)-(line 276,col 98)",
        "(line 277,col 9)-(line 277,col 21)",
        "(line 278,col 9)-(line 278,col 47)",
        "(line 279,col 9)-(line 279,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArrayArray()",
      "begin_line": 282,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 85)",
        "(line 284,col 9)-(line 284,col 50)",
        "(line 285,col 9)-(line 285,col 108)",
        "(line 286,col 9)-(line 286,col 21)",
        "(line 287,col 9)-(line 287,col 47)",
        "(line 288,col 9)-(line 288,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArrayArray()",
      "begin_line": 291,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 81)",
        "(line 293,col 9)-(line 293,col 50)",
        "(line 294,col 9)-(line 294,col 109)",
        "(line 295,col 9)-(line 295,col 109)",
        "(line 296,col 9)-(line 296,col 21)",
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchyArrayList()",
      "begin_line": 303,
      "end_line": 303,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchy()",
      "begin_line": 313,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 68)",
        "(line 315,col 9)-(line 315,col 50)",
        "(line 316,col 9)-(line 316,col 83)",
        "(line 317,col 9)-(line 317,col 89)",
        "(line 318,col 9)-(line 318,col 96)",
        "(line 319,col 9)-(line 319,col 108)",
        "(line 320,col 9)-(line 320,col 102)",
        "(line 321,col 9)-(line 321,col 110)",
        "(line 322,col 9)-(line 322,col 126)",
        "(line 324,col 9)-(line 324,col 68)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 326,col 87)",
        "(line 327,col 9)-(line 327,col 87)",
        "(line 328,col 9)-(line 328,col 93)",
        "(line 329,col 9)-(line 329,col 100)",
        "(line 330,col 9)-(line 330,col 125)",
        "(line 331,col 9)-(line 331,col 106)",
        "(line 332,col 9)-(line 332,col 114)",
        "(line 333,col 9)-(line 333,col 130)",
        "(line 334,col 9)-(line 334,col 126)",
        "(line 335,col 9)-(line 335,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 338,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 339,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientA"
      ],
      "begin_line": 341,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureB",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestFixtureA"
      ],
      "begin_line": 345,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 346,
      "end_line": 347,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientB"
      ],
      "begin_line": 348,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInnerClassReflection()",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 34)",
        "(line 354,col 9)-(line 354,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Outer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 357,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inner"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Inner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 359,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.Inner.toString()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 17)-(line 362,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.toString()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycle()",
      "begin_line": 376,
      "end_line": 383,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 41)",
        "(line 378,col 9)-(line 378,col 29)",
        "(line 379,col 9)-(line 381,col 57)",
        "(line 382,col 9)-(line 382,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycleLevel2()",
      "begin_line": 388,
      "end_line": 400,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 47)",
        "(line 391,col 9)-(line 391,col 35)",
        "(line 392,col 9)-(line 392,col 35)",
        "(line 393,col 9)-(line 395,col 57)",
        "(line 396,col 9)-(line 398,col 63)",
        "(line 399,col 9)-(line 399,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayArrayCycle()",
      "begin_line": 402,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 46)",
        "(line 404,col 9)-(line 404,col 32)",
        "(line 405,col 9)-(line 405,col 32)",
        "(line 406,col 9)-(line 406,col 32)",
        "(line 407,col 9)-(line 407,col 32)",
        "(line 408,col 9)-(line 408,col 58)",
        "(line 409,col 9)-(line 420,col 57)",
        "(line 421,col 9)-(line 421,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 427,
      "end_line": 434,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleA.toString()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 439,
      "end_line": 446,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleB.toString()",
      "begin_line": 442,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 451,
      "end_line": 465,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "o"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture()",
      "begin_line": 454,
      "end_line": 455,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture(java.lang.Object)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.toString()",
      "begin_line": 461,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 463,col 13)-(line 463,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceVarReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 467,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 468,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.SelfInstanceVarReflectionTestFixture()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.toString()",
      "begin_line": 475,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceTwoVarsReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 481,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 482,
      "end_line": 483,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "otherType"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.SelfInstanceTwoVarsReflectionTestFixture()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.getOtherType()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.toString()",
      "begin_line": 494,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 496,col 13)-(line 496,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionObjectCycle()",
      "begin_line": 506,
      "end_line": 511,
      "comment": "\n     * Test an Object pointing to itself, the simplest test.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 79)",
        "(line 508,col 9)-(line 508,col 26)",
        "(line 509,col 9)-(line 509,col 109)",
        "(line 510,col 9)-(line 510,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceVarReflectionObjectCycle()",
      "begin_line": 518,
      "end_line": 522,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 95)",
        "(line 520,col 9)-(line 520,col 112)",
        "(line 521,col 9)-(line 521,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceTwoVarsReflectionObjectCycle()",
      "begin_line": 530,
      "end_line": 534,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.  This test was\n     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 103)",
        "(line 532,col 9)-(line 532,col 161)",
        "(line 533,col 9)-(line 533,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectCycle()",
      "begin_line": 542,
      "end_line": 551,
      "comment": "\n     * Test Objects pointing to each other.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 60)",
        "(line 544,col 9)-(line 544,col 60)",
        "(line 545,col 9)-(line 545,col 16)",
        "(line 546,col 9)-(line 546,col 16)",
        "(line 547,col 9)-(line 549,col 26)",
        "(line 550,col 9)-(line 550,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayAndObjectCycle()",
      "begin_line": 559,
      "end_line": 579,
      "comment": "\n     * Test a nasty combination of arrays and Objects pointing to each other.\n     * objects[0] -\u003e SimpleReflectionTestFixture[ o -\u003e objects ]\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 41)",
        "(line 561,col 9)-(line 561,col 86)",
        "(line 562,col 9)-(line 562,col 28)",
        "(line 563,col 9)-(line 571,col 57)",
        "(line 572,col 9)-(line 577,col 56)",
        "(line 578,col 9)-(line 578,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.validateNullToStringStyleRegistry()",
      "begin_line": 581,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 582,col 8)-(line 584,col 8)",
        "(line 586,col 9)-(line 586,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendSuper()",
      "begin_line": 590,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 105)",
        "(line 592,col 9)-(line 592,col 117)",
        "(line 594,col 9)-(line 594,col 133)",
        "(line 595,col 9)-(line 595,col 146)",
        "(line 596,col 9)-(line 596,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToString()",
      "begin_line": 599,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 108)",
        "(line 601,col 9)-(line 601,col 120)",
        "(line 603,col 9)-(line 603,col 136)",
        "(line 604,col 9)-(line 604,col 149)",
        "(line 605,col 9)-(line 605,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObject()",
      "begin_line": 608,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 36)",
        "(line 610,col 9)-(line 610,col 36)",
        "(line 611,col 9)-(line 611,col 103)",
        "(line 612,col 9)-(line 612,col 87)",
        "(line 613,col 9)-(line 613,col 110)",
        "(line 614,col 9)-(line 614,col 94)",
        "(line 615,col 9)-(line 615,col 114)",
        "(line 616,col 9)-(line 616,col 109)",
        "(line 617,col 9)-(line 617,col 129)",
        "(line 618,col 9)-(line 618,col 122)",
        "(line 619,col 9)-(line 619,col 135)",
        "(line 620,col 9)-(line 620,col 128)",
        "(line 621,col 9)-(line 621,col 128)",
        "(line 622,col 9)-(line 622,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLong()",
      "begin_line": 625,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 87)",
        "(line 627,col 9)-(line 627,col 94)",
        "(line 628,col 9)-(line 628,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInt()",
      "begin_line": 631,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 92)",
        "(line 634,col 9)-(line 634,col 99)",
        "(line 635,col 9)-(line 635,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShort()",
      "begin_line": 638,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 94)",
        "(line 640,col 9)-(line 640,col 101)",
        "(line 641,col 9)-(line 641,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testChar()",
      "begin_line": 644,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 94)",
        "(line 646,col 9)-(line 646,col 101)",
        "(line 647,col 9)-(line 647,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByte()",
      "begin_line": 650,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 93)",
        "(line 652,col 9)-(line 652,col 100)",
        "(line 653,col 9)-(line 653,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDouble()",
      "begin_line": 656,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 99)",
        "(line 659,col 9)-(line 659,col 106)",
        "(line 660,col 9)-(line 660,col 138)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloat()",
      "begin_line": 663,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 98)",
        "(line 665,col 9)-(line 665,col 105)",
        "(line 666,col 9)-(line 666,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBoolean()",
      "begin_line": 669,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 92)",
        "(line 671,col 9)-(line 671,col 99)",
        "(line 672,col 9)-(line 672,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectArray()",
      "begin_line": 676,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 69)",
        "(line 678,col 9)-(line 678,col 105)",
        "(line 679,col 9)-(line 679,col 114)",
        "(line 680,col 9)-(line 680,col 21)",
        "(line 681,col 9)-(line 681,col 95)",
        "(line 682,col 9)-(line 682,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArray()",
      "begin_line": 685,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 99)",
        "(line 688,col 9)-(line 688,col 108)",
        "(line 689,col 9)-(line 689,col 21)",
        "(line 690,col 9)-(line 690,col 95)",
        "(line 691,col 9)-(line 691,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArray()",
      "begin_line": 694,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 46)",
        "(line 696,col 9)-(line 696,col 99)",
        "(line 697,col 9)-(line 697,col 108)",
        "(line 698,col 9)-(line 698,col 21)",
        "(line 699,col 9)-(line 699,col 95)",
        "(line 700,col 9)-(line 700,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArray()",
      "begin_line": 703,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 50)",
        "(line 705,col 9)-(line 705,col 99)",
        "(line 706,col 9)-(line 706,col 108)",
        "(line 707,col 9)-(line 707,col 21)",
        "(line 708,col 9)-(line 708,col 95)",
        "(line 709,col 9)-(line 709,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArray()",
      "begin_line": 712,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 48)",
        "(line 714,col 9)-(line 714,col 99)",
        "(line 715,col 9)-(line 715,col 108)",
        "(line 716,col 9)-(line 716,col 21)",
        "(line 717,col 9)-(line 717,col 95)",
        "(line 718,col 9)-(line 718,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArray()",
      "begin_line": 721,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 55)",
        "(line 723,col 9)-(line 723,col 98)",
        "(line 724,col 9)-(line 724,col 107)",
        "(line 725,col 9)-(line 725,col 21)",
        "(line 726,col 9)-(line 726,col 95)",
        "(line 727,col 9)-(line 727,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArray()",
      "begin_line": 730,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 67)",
        "(line 732,col 9)-(line 732,col 114)",
        "(line 733,col 9)-(line 733,col 123)",
        "(line 734,col 9)-(line 734,col 21)",
        "(line 735,col 9)-(line 735,col 95)",
        "(line 736,col 9)-(line 736,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArray()",
      "begin_line": 739,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 69)",
        "(line 741,col 9)-(line 741,col 114)",
        "(line 742,col 9)-(line 742,col 123)",
        "(line 743,col 9)-(line 743,col 21)",
        "(line 744,col 9)-(line 744,col 95)",
        "(line 745,col 9)-(line 745,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArray()",
      "begin_line": 748,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 61)",
        "(line 750,col 9)-(line 750,col 107)",
        "(line 751,col 9)-(line 751,col 116)",
        "(line 752,col 9)-(line 752,col 21)",
        "(line 753,col 9)-(line 753,col 95)",
        "(line 754,col 9)-(line 754,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArrayArray()",
      "begin_line": 757,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 58)",
        "(line 759,col 9)-(line 759,col 107)",
        "(line 760,col 9)-(line 760,col 116)",
        "(line 761,col 9)-(line 761,col 21)",
        "(line 762,col 9)-(line 762,col 95)",
        "(line 763,col 9)-(line 763,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArrayArray()",
      "begin_line": 766,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 56)",
        "(line 768,col 9)-(line 768,col 107)",
        "(line 769,col 9)-(line 769,col 116)",
        "(line 770,col 9)-(line 770,col 21)",
        "(line 771,col 9)-(line 771,col 95)",
        "(line 772,col 9)-(line 772,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArrayArray()",
      "begin_line": 775,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 60)",
        "(line 777,col 9)-(line 777,col 107)",
        "(line 778,col 9)-(line 778,col 116)",
        "(line 779,col 9)-(line 779,col 21)",
        "(line 780,col 9)-(line 780,col 95)",
        "(line 781,col 9)-(line 781,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArrayArray()",
      "begin_line": 784,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 58)",
        "(line 786,col 9)-(line 786,col 107)",
        "(line 787,col 9)-(line 787,col 116)",
        "(line 788,col 9)-(line 788,col 21)",
        "(line 789,col 9)-(line 789,col 95)",
        "(line 790,col 9)-(line 790,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArrayArray()",
      "begin_line": 793,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 64)",
        "(line 795,col 9)-(line 795,col 107)",
        "(line 796,col 9)-(line 796,col 116)",
        "(line 797,col 9)-(line 797,col 21)",
        "(line 798,col 9)-(line 798,col 95)",
        "(line 799,col 9)-(line 799,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArrayArray()",
      "begin_line": 802,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 79)",
        "(line 804,col 9)-(line 804,col 117)",
        "(line 805,col 9)-(line 805,col 126)",
        "(line 806,col 9)-(line 806,col 21)",
        "(line 807,col 9)-(line 807,col 95)",
        "(line 808,col 9)-(line 808,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArrayArray()",
      "begin_line": 811,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 78)",
        "(line 813,col 9)-(line 813,col 117)",
        "(line 814,col 9)-(line 814,col 126)",
        "(line 815,col 9)-(line 815,col 21)",
        "(line 816,col 9)-(line 816,col 95)",
        "(line 817,col 9)-(line 817,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArrayArray()",
      "begin_line": 820,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 75)",
        "(line 822,col 9)-(line 822,col 118)",
        "(line 823,col 9)-(line 823,col 127)",
        "(line 824,col 9)-(line 824,col 21)",
        "(line 825,col 9)-(line 825,col 95)",
        "(line 826,col 9)-(line 826,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectCycle()",
      "begin_line": 829,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 42)",
        "(line 831,col 9)-(line 831,col 42)",
        "(line 832,col 9)-(line 832,col 18)",
        "(line 833,col 9)-(line 833,col 18)",
        "(line 835,col 9)-(line 835,col 97)",
        "(line 836,col 9)-(line 836,col 45)",
        "(line 837,col 9)-(line 837,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectCycle",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 840,
      "end_line": 847,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 841,
      "end_line": 841,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ObjectCycle.toString()",
      "begin_line": 843,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 13)-(line 845,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionStatics()",
      "begin_line": 849,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 98)",
        "(line 851,col 9)-(line 853,col 121)",
        "(line 854,col 9)-(line 856,col 120)",
        "(line 857,col 9)-(line 859,col 98)",
        "(line 860,col 9)-(line 862,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionStatics()",
      "begin_line": 868,
      "end_line": 882,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 86)",
        "(line 870,col 9)-(line 872,col 115)",
        "(line 873,col 9)-(line 875,col 114)",
        "(line 876,col 9)-(line 878,col 92)",
        "(line 879,col 9)-(line 881,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInheritedReflectionStatics()",
      "begin_line": 887,
      "end_line": 901,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 104)",
        "(line 889,col 9)-(line 891,col 124)",
        "(line 892,col 9)-(line 894,col 121)",
        "(line 895,col 9)-(line 897,col 98)",
        "(line 898,col 9)-(line 900,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toStringWithStatics(java.lang.Object, org.apache.commons.lang3.builder.ToStringStyle, java.lang.Class)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a suitable\n     * \u003ccode\u003etoString\u003c/code\u003e value which includes static fields.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run\n     * under a security manager, if the permissions are not set up correctly.\n     * It is also not as efficient as testing explicitly. \u003c/p\u003e\n     *\n     * \u003cp\u003eTransient fields are not output.\u003c/p\u003e\n     *\n     * \u003cp\u003eSuperclass fields will be appended up to and including the specified superclass.\n     * A null superclass is treated as \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\u003c/p\u003e\n     *\n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_valid()",
      "begin_line": 935,
      "end_line": 939,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 37)",
        "(line 937,col 9)-(line 937,col 76)",
        "(line 938,col 9)-(line 938,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_invalid()",
      "begin_line": 944,
      "end_line": 953,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 37)",
        "(line 946,col 9)-(line 946,col 76)",
        "(line 947,col 9)-(line 952,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 958,
      "end_line": 967,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientString"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientInt"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceString"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceInt"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientString"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientInt"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 972,
      "end_line": 975,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InheritedReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionStaticFieldsFixture"
      ],
      "begin_line": 980,
      "end_line": 983,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString2"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt2"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionNull()",
      "begin_line": 985,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineTestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 993,
      "end_line": 999,
      "comment": "\n     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.\n     * See issue LANG-372.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.MultiLineTestObject.toString()",
      "begin_line": 995,
      "end_line": 998,
      "comment": "",
      "child_ranges": [
        "(line 997,col 13)-(line 997,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToStringUsingMultiLineStyle()",
      "begin_line": 1001,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 60)",
        "(line 1003,col 9)-(line 1004,col 74)",
        "(line 1005,col 9)-(line 1005,col 74)"
      ]
    }
  ]
}