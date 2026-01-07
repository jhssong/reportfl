{
  "filepath": "/tmp/Lang-3b/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 1084,
      "comment": "\n * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseStr"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.after()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * All tests should leave the registry empty. \n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx1()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx2()",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 75)",
        "(line 59,col 9)-(line 59,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx3()",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 81)",
        "(line 65,col 9)-(line 65,col 62)",
        "(line 66,col 9)-(line 66,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testGetSetDefault()",
      "begin_line": 69,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSetDefaultEx()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBlank()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionInteger()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Test wrapper for int primitive.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharacter()",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * Test wrapper for char primitive.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 47)",
        "(line 104,col 9)-(line 104,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBoolean()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * Test wrapper for char boolean.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 18)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 99)",
        "(line 115,col 9)-(line 115,col 26)",
        "(line 116,col 9)-(line 116,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toBaseString(java.lang.Object)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Create the same toString() as Object.toString().\n     * @param o the object to create the string for.\n     * @return a String in the Object.toString format.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.assertReflectionArray(java.lang.String, java.lang.Object)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 75)",
        "(line 149,col 9)-(line 149,col 81)",
        "(line 150,col 9)-(line 150,col 87)",
        "(line 151,col 9)-(line 151,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectArray()",
      "begin_line": 154,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 73)",
        "(line 157,col 9)-(line 157,col 56)",
        "(line 158,col 9)-(line 158,col 96)",
        "(line 159,col 9)-(line 159,col 21)",
        "(line 160,col 9)-(line 160,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArray()",
      "begin_line": 163,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)",
        "(line 166,col 9)-(line 166,col 56)",
        "(line 167,col 9)-(line 167,col 90)",
        "(line 168,col 9)-(line 168,col 21)",
        "(line 169,col 9)-(line 169,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArray()",
      "begin_line": 172,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 48)",
        "(line 175,col 9)-(line 175,col 56)",
        "(line 176,col 9)-(line 176,col 90)",
        "(line 177,col 9)-(line 177,col 21)",
        "(line 178,col 9)-(line 178,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionShortArray()",
      "begin_line": 181,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 52)",
        "(line 184,col 9)-(line 184,col 56)",
        "(line 185,col 9)-(line 185,col 90)",
        "(line 186,col 9)-(line 186,col 21)",
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionyteArray()",
      "begin_line": 190,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 50)",
        "(line 193,col 9)-(line 193,col 56)",
        "(line 194,col 9)-(line 194,col 90)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 196,col 9)-(line 196,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArray()",
      "begin_line": 199,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 57)",
        "(line 202,col 9)-(line 202,col 56)",
        "(line 203,col 9)-(line 203,col 89)",
        "(line 204,col 9)-(line 204,col 21)",
        "(line 205,col 9)-(line 205,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArray()",
      "begin_line": 208,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 69)",
        "(line 211,col 9)-(line 211,col 56)",
        "(line 212,col 9)-(line 212,col 105)",
        "(line 213,col 9)-(line 213,col 21)",
        "(line 214,col 9)-(line 214,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArray()",
      "begin_line": 217,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 71)",
        "(line 220,col 9)-(line 220,col 56)",
        "(line 221,col 9)-(line 221,col 105)",
        "(line 222,col 9)-(line 222,col 21)",
        "(line 223,col 9)-(line 223,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArray()",
      "begin_line": 226,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 63)",
        "(line 229,col 9)-(line 229,col 56)",
        "(line 230,col 9)-(line 230,col 98)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 232,col 9)-(line 232,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArrayArray()",
      "begin_line": 237,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 84)",
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 241,col 108)",
        "(line 242,col 9)-(line 242,col 21)",
        "(line 243,col 9)-(line 243,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArrayArray()",
      "begin_line": 247,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 64)",
        "(line 250,col 9)-(line 250,col 56)",
        "(line 251,col 9)-(line 251,col 98)",
        "(line 252,col 9)-(line 252,col 21)",
        "(line 253,col 9)-(line 253,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArrayArray()",
      "begin_line": 256,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 62)",
        "(line 259,col 9)-(line 259,col 56)",
        "(line 260,col 9)-(line 260,col 98)",
        "(line 261,col 9)-(line 261,col 21)",
        "(line 262,col 9)-(line 262,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionhortArrayArray()",
      "begin_line": 265,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 66)",
        "(line 268,col 9)-(line 268,col 56)",
        "(line 269,col 9)-(line 269,col 98)",
        "(line 270,col 9)-(line 270,col 21)",
        "(line 271,col 9)-(line 271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionByteArrayArray()",
      "begin_line": 274,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 64)",
        "(line 277,col 9)-(line 277,col 56)",
        "(line 278,col 9)-(line 278,col 98)",
        "(line 279,col 9)-(line 279,col 21)",
        "(line 280,col 9)-(line 280,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArrayArray()",
      "begin_line": 283,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 70)",
        "(line 286,col 9)-(line 286,col 56)",
        "(line 287,col 9)-(line 287,col 98)",
        "(line 288,col 9)-(line 288,col 21)",
        "(line 289,col 9)-(line 289,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArrayArray()",
      "begin_line": 292,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 85)",
        "(line 295,col 9)-(line 295,col 56)",
        "(line 296,col 9)-(line 296,col 108)",
        "(line 297,col 9)-(line 297,col 21)",
        "(line 298,col 9)-(line 298,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArrayArray()",
      "begin_line": 301,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 81)",
        "(line 304,col 9)-(line 304,col 56)",
        "(line 305,col 9)-(line 305,col 109)",
        "(line 306,col 9)-(line 306,col 109)",
        "(line 307,col 9)-(line 307,col 21)",
        "(line 308,col 9)-(line 308,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchyArrayList()",
      "begin_line": 312,
      "end_line": 313,
      "comment": " Reflection hierarchy tests",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchy()",
      "begin_line": 338,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 74)",
        "(line 341,col 9)-(line 341,col 50)",
        "(line 342,col 9)-(line 342,col 83)",
        "(line 343,col 9)-(line 343,col 89)",
        "(line 344,col 9)-(line 344,col 96)",
        "(line 345,col 9)-(line 345,col 108)",
        "(line 346,col 9)-(line 346,col 102)",
        "(line 347,col 9)-(line 347,col 110)",
        "(line 348,col 9)-(line 348,col 126)",
        "(line 350,col 9)-(line 350,col 74)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 87)",
        "(line 353,col 9)-(line 353,col 87)",
        "(line 354,col 9)-(line 354,col 93)",
        "(line 355,col 9)-(line 355,col 100)",
        "(line 356,col 9)-(line 356,col 125)",
        "(line 357,col 9)-(line 357,col 106)",
        "(line 358,col 9)-(line 358,col 114)",
        "(line 359,col 9)-(line 359,col 130)",
        "(line 360,col 9)-(line 360,col 126)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 363,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 364,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientA"
      ],
      "begin_line": 366,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureB",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestFixtureA"
      ],
      "begin_line": 370,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 371,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientB"
      ],
      "begin_line": 373,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInnerClassReflection()",
      "begin_line": 377,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 40)",
        "(line 380,col 9)-(line 380,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Outer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 383,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inner"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Inner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 385,
      "end_line": 390,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.Inner.toString()",
      "begin_line": 386,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 17)-(line 388,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.toString()",
      "begin_line": 391,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 13)-(line 393,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycle()",
      "begin_line": 402,
      "end_line": 409,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 47)",
        "(line 405,col 9)-(line 405,col 29)",
        "(line 406,col 9)-(line 408,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycleLevel2()",
      "begin_line": 414,
      "end_line": 426,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 47)",
        "(line 417,col 9)-(line 417,col 53)",
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 422,col 57)",
        "(line 423,col 9)-(line 425,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayArrayCycle()",
      "begin_line": 428,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 52)",
        "(line 431,col 9)-(line 431,col 32)",
        "(line 432,col 9)-(line 432,col 32)",
        "(line 433,col 9)-(line 433,col 32)",
        "(line 434,col 9)-(line 434,col 32)",
        "(line 435,col 9)-(line 435,col 64)",
        "(line 436,col 9)-(line 447,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 453,
      "end_line": 460,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleA.toString()",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 13)-(line 458,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 465,
      "end_line": 472,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleB.toString()",
      "begin_line": 468,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 477,
      "end_line": 491,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "o"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture()",
      "begin_line": 480,
      "end_line": 481,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture(java.lang.Object)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.toString()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceVarReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 493,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 494,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.SelfInstanceVarReflectionTestFixture()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.toString()",
      "begin_line": 501,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceTwoVarsReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 507,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 508,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "otherType"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.SelfInstanceTwoVarsReflectionTestFixture()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.getOtherType()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.toString()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 13)-(line 522,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionObjectCycle()",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n     * Test an Object pointing to itself, the simplest test.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 85)",
        "(line 535,col 9)-(line 535,col 26)",
        "(line 536,col 9)-(line 536,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceVarReflectionObjectCycle()",
      "begin_line": 544,
      "end_line": 548,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 101)",
        "(line 547,col 9)-(line 547,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceTwoVarsReflectionObjectCycle()",
      "begin_line": 556,
      "end_line": 560,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.  This test was\n     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 109)",
        "(line 559,col 9)-(line 559,col 161)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectCycle()",
      "begin_line": 568,
      "end_line": 577,
      "comment": "\n     * Test Objects pointing to each other.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 66)",
        "(line 571,col 9)-(line 571,col 66)",
        "(line 572,col 9)-(line 572,col 16)",
        "(line 573,col 9)-(line 573,col 16)",
        "(line 574,col 9)-(line 576,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayAndObjectCycle()",
      "begin_line": 585,
      "end_line": 605,
      "comment": "\n     * Test a nasty combination of arrays and Objects pointing to each other.\n     * objects[0] -\u003e SimpleReflectionTestFixture[ o -\u003e objects ]\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 47)",
        "(line 588,col 9)-(line 588,col 92)",
        "(line 589,col 9)-(line 589,col 28)",
        "(line 590,col 9)-(line 598,col 57)",
        "(line 599,col 9)-(line 604,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.validateNullToStringStyleRegistry()",
      "begin_line": 607,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 73)",
        "(line 609,col 9)-(line 609,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendSuper()",
      "begin_line": 613,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 105)",
        "(line 616,col 9)-(line 616,col 117)",
        "(line 618,col 9)-(line 618,col 133)",
        "(line 619,col 9)-(line 619,col 146)",
        "(line 620,col 9)-(line 620,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToString()",
      "begin_line": 623,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 108)",
        "(line 626,col 9)-(line 626,col 120)",
        "(line 628,col 9)-(line 628,col 136)",
        "(line 629,col 9)-(line 629,col 149)",
        "(line 630,col 9)-(line 630,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObject()",
      "begin_line": 633,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 46)",
        "(line 636,col 9)-(line 636,col 46)",
        "(line 637,col 9)-(line 637,col 103)",
        "(line 638,col 9)-(line 638,col 87)",
        "(line 639,col 9)-(line 639,col 110)",
        "(line 640,col 9)-(line 640,col 94)",
        "(line 641,col 9)-(line 641,col 114)",
        "(line 642,col 9)-(line 642,col 109)",
        "(line 643,col 9)-(line 643,col 129)",
        "(line 644,col 9)-(line 644,col 122)",
        "(line 645,col 9)-(line 645,col 135)",
        "(line 646,col 9)-(line 646,col 128)",
        "(line 647,col 9)-(line 647,col 128)",
        "(line 648,col 9)-(line 648,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectBuild()",
      "begin_line": 651,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 46)",
        "(line 654,col 9)-(line 654,col 46)",
        "(line 655,col 9)-(line 655,col 100)",
        "(line 656,col 9)-(line 656,col 84)",
        "(line 657,col 9)-(line 657,col 107)",
        "(line 658,col 9)-(line 658,col 91)",
        "(line 659,col 9)-(line 659,col 111)",
        "(line 660,col 9)-(line 660,col 106)",
        "(line 661,col 9)-(line 661,col 126)",
        "(line 662,col 9)-(line 662,col 119)",
        "(line 663,col 9)-(line 663,col 132)",
        "(line 664,col 9)-(line 664,col 125)",
        "(line 665,col 9)-(line 665,col 125)",
        "(line 666,col 9)-(line 666,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLong()",
      "begin_line": 669,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 87)",
        "(line 672,col 9)-(line 672,col 94)",
        "(line 673,col 9)-(line 673,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInt()",
      "begin_line": 676,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 92)",
        "(line 680,col 9)-(line 680,col 99)",
        "(line 681,col 9)-(line 681,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShort()",
      "begin_line": 684,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 94)",
        "(line 687,col 9)-(line 687,col 101)",
        "(line 688,col 9)-(line 688,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testChar()",
      "begin_line": 691,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 94)",
        "(line 694,col 9)-(line 694,col 101)",
        "(line 695,col 9)-(line 695,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByte()",
      "begin_line": 698,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 93)",
        "(line 701,col 9)-(line 701,col 100)",
        "(line 702,col 9)-(line 702,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDouble()",
      "begin_line": 705,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 99)",
        "(line 709,col 9)-(line 709,col 106)",
        "(line 710,col 9)-(line 710,col 138)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloat()",
      "begin_line": 713,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 98)",
        "(line 716,col 9)-(line 716,col 105)",
        "(line 717,col 9)-(line 717,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBoolean()",
      "begin_line": 720,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 92)",
        "(line 723,col 9)-(line 723,col 99)",
        "(line 724,col 9)-(line 724,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectArray()",
      "begin_line": 728,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 69)",
        "(line 731,col 9)-(line 731,col 105)",
        "(line 732,col 9)-(line 732,col 114)",
        "(line 733,col 9)-(line 733,col 21)",
        "(line 734,col 9)-(line 734,col 95)",
        "(line 735,col 9)-(line 735,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArray()",
      "begin_line": 738,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 48)",
        "(line 741,col 9)-(line 741,col 99)",
        "(line 742,col 9)-(line 742,col 108)",
        "(line 743,col 9)-(line 743,col 21)",
        "(line 744,col 9)-(line 744,col 95)",
        "(line 745,col 9)-(line 745,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArray()",
      "begin_line": 748,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 46)",
        "(line 751,col 9)-(line 751,col 99)",
        "(line 752,col 9)-(line 752,col 108)",
        "(line 753,col 9)-(line 753,col 21)",
        "(line 754,col 9)-(line 754,col 95)",
        "(line 755,col 9)-(line 755,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArray()",
      "begin_line": 758,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 50)",
        "(line 761,col 9)-(line 761,col 99)",
        "(line 762,col 9)-(line 762,col 108)",
        "(line 763,col 9)-(line 763,col 21)",
        "(line 764,col 9)-(line 764,col 95)",
        "(line 765,col 9)-(line 765,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArray()",
      "begin_line": 768,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 48)",
        "(line 771,col 9)-(line 771,col 99)",
        "(line 772,col 9)-(line 772,col 108)",
        "(line 773,col 9)-(line 773,col 21)",
        "(line 774,col 9)-(line 774,col 95)",
        "(line 775,col 9)-(line 775,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArray()",
      "begin_line": 778,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 55)",
        "(line 781,col 9)-(line 781,col 98)",
        "(line 782,col 9)-(line 782,col 107)",
        "(line 783,col 9)-(line 783,col 21)",
        "(line 784,col 9)-(line 784,col 95)",
        "(line 785,col 9)-(line 785,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArray()",
      "begin_line": 788,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 67)",
        "(line 791,col 9)-(line 791,col 114)",
        "(line 792,col 9)-(line 792,col 123)",
        "(line 793,col 9)-(line 793,col 21)",
        "(line 794,col 9)-(line 794,col 95)",
        "(line 795,col 9)-(line 795,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArray()",
      "begin_line": 798,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 69)",
        "(line 801,col 9)-(line 801,col 114)",
        "(line 802,col 9)-(line 802,col 123)",
        "(line 803,col 9)-(line 803,col 21)",
        "(line 804,col 9)-(line 804,col 95)",
        "(line 805,col 9)-(line 805,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArray()",
      "begin_line": 808,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 61)",
        "(line 811,col 9)-(line 811,col 107)",
        "(line 812,col 9)-(line 812,col 116)",
        "(line 813,col 9)-(line 813,col 21)",
        "(line 814,col 9)-(line 814,col 95)",
        "(line 815,col 9)-(line 815,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArrayArray()",
      "begin_line": 818,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 58)",
        "(line 821,col 9)-(line 821,col 107)",
        "(line 822,col 9)-(line 822,col 116)",
        "(line 823,col 9)-(line 823,col 21)",
        "(line 824,col 9)-(line 824,col 95)",
        "(line 825,col 9)-(line 825,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArrayArray()",
      "begin_line": 828,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 56)",
        "(line 831,col 9)-(line 831,col 107)",
        "(line 832,col 9)-(line 832,col 116)",
        "(line 833,col 9)-(line 833,col 21)",
        "(line 834,col 9)-(line 834,col 95)",
        "(line 835,col 9)-(line 835,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArrayArray()",
      "begin_line": 838,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 60)",
        "(line 841,col 9)-(line 841,col 107)",
        "(line 842,col 9)-(line 842,col 116)",
        "(line 843,col 9)-(line 843,col 21)",
        "(line 844,col 9)-(line 844,col 95)",
        "(line 845,col 9)-(line 845,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArrayArray()",
      "begin_line": 848,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 58)",
        "(line 851,col 9)-(line 851,col 107)",
        "(line 852,col 9)-(line 852,col 116)",
        "(line 853,col 9)-(line 853,col 21)",
        "(line 854,col 9)-(line 854,col 95)",
        "(line 855,col 9)-(line 855,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArrayArray()",
      "begin_line": 858,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 64)",
        "(line 861,col 9)-(line 861,col 107)",
        "(line 862,col 9)-(line 862,col 116)",
        "(line 863,col 9)-(line 863,col 21)",
        "(line 864,col 9)-(line 864,col 95)",
        "(line 865,col 9)-(line 865,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArrayArray()",
      "begin_line": 868,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 79)",
        "(line 871,col 9)-(line 871,col 117)",
        "(line 872,col 9)-(line 872,col 126)",
        "(line 873,col 9)-(line 873,col 21)",
        "(line 874,col 9)-(line 874,col 95)",
        "(line 875,col 9)-(line 875,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArrayArray()",
      "begin_line": 878,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 78)",
        "(line 881,col 9)-(line 881,col 117)",
        "(line 882,col 9)-(line 882,col 126)",
        "(line 883,col 9)-(line 883,col 21)",
        "(line 884,col 9)-(line 884,col 95)",
        "(line 885,col 9)-(line 885,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArrayArray()",
      "begin_line": 888,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 75)",
        "(line 891,col 9)-(line 891,col 118)",
        "(line 892,col 9)-(line 892,col 127)",
        "(line 893,col 9)-(line 893,col 21)",
        "(line 894,col 9)-(line 894,col 95)",
        "(line 895,col 9)-(line 895,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectCycle()",
      "begin_line": 898,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 48)",
        "(line 901,col 9)-(line 901,col 48)",
        "(line 902,col 9)-(line 902,col 18)",
        "(line 903,col 9)-(line 903,col 18)",
        "(line 905,col 9)-(line 905,col 103)",
        "(line 906,col 9)-(line 906,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectCycle",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 909,
      "end_line": 916,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 910,
      "end_line": 910,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ObjectCycle.toString()",
      "begin_line": 912,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 914,col 13)-(line 914,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionStatics()",
      "begin_line": 918,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 104)",
        "(line 921,col 9)-(line 923,col 121)",
        "(line 924,col 9)-(line 926,col 120)",
        "(line 927,col 9)-(line 929,col 98)",
        "(line 930,col 9)-(line 932,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionStatics()",
      "begin_line": 938,
      "end_line": 953,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 92)",
        "(line 941,col 9)-(line 943,col 115)",
        "(line 944,col 9)-(line 946,col 114)",
        "(line 947,col 9)-(line 949,col 92)",
        "(line 950,col 9)-(line 952,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInheritedReflectionStatics()",
      "begin_line": 958,
      "end_line": 973,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 110)",
        "(line 961,col 9)-(line 963,col 124)",
        "(line 964,col 9)-(line 966,col 121)",
        "(line 967,col 9)-(line 969,col 98)",
        "(line 970,col 9)-(line 972,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toStringWithStatics(T, org.apache.commons.lang3.builder.ToStringStyle, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a suitable\n     * \u003ccode\u003etoString\u003c/code\u003e value which includes static fields.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run\n     * under a security manager, if the permissions are not set up correctly.\n     * It is also not as efficient as testing explicitly. \u003c/p\u003e\n     *\n     * \u003cp\u003eTransient fields are not output.\u003c/p\u003e\n     *\n     * \u003cp\u003eSuperclass fields will be appended up to and including the specified superclass.\n     * A null superclass is treated as \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\u003c/p\u003e\n     *\n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_valid()",
      "begin_line": 1007,
      "end_line": 1013,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 47)",
        "(line 1010,col 9)-(line 1010,col 82)",
        "(line 1011,col 9)-(line 1011,col 40)",
        "(line 1012,col 9)-(line 1012,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_invalid()",
      "begin_line": 1018,
      "end_line": 1027,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 47)",
        "(line 1021,col 9)-(line 1021,col 82)",
        "(line 1022,col 9)-(line 1026,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1032,
      "end_line": 1041,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 1034,
      "end_line": 1034,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientString"
      ],
      "begin_line": 1035,
      "end_line": 1035,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientInt"
      ],
      "begin_line": 1036,
      "end_line": 1036,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceString"
      ],
      "begin_line": 1037,
      "end_line": 1037,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceInt"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientString"
      ],
      "begin_line": 1039,
      "end_line": 1039,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientInt"
      ],
      "begin_line": 1040,
      "end_line": 1040,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1046,
      "end_line": 1049,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 1047,
      "end_line": 1047,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 1048,
      "end_line": 1048,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InheritedReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionStaticFieldsFixture"
      ],
      "begin_line": 1054,
      "end_line": 1057,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString2"
      ],
      "begin_line": 1055,
      "end_line": 1055,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt2"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionNull()",
      "begin_line": 1059,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineTestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1068,
      "end_line": 1074,
      "comment": "\n     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.\n     * See issue LANG-372.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 1069,
      "end_line": 1069,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.MultiLineTestObject.toString()",
      "begin_line": 1070,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 13)-(line 1072,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToStringUsingMultiLineStyle()",
      "begin_line": 1076,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 66)",
        "(line 1079,col 9)-(line 1080,col 74)",
        "(line 1081,col 9)-(line 1081,col 74)"
      ]
    }
  ]
}