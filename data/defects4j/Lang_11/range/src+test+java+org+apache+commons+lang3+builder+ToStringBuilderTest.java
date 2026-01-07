{
  "filepath": "/tmp/Lang-11b/src/test/java/org/apache/commons/lang3/builder/ToStringBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ToStringBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 1089,
      "comment": "\n * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseStr"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.after()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * All tests should leave the registry empty. \n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx1()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx2()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 75)",
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx3()",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 81)",
        "(line 67,col 9)-(line 67,col 62)",
        "(line 68,col 9)-(line 68,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testGetSetDefault()",
      "begin_line": 71,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSetDefaultEx()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBlank()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionInteger()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Test wrapper for int primitive.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharacter()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "\n     * Test wrapper for char primitive.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 106,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBoolean()",
      "begin_line": 112,
      "end_line": 119,
      "comment": "\n     * Test wrapper for char boolean.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 18)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 99)",
        "(line 117,col 9)-(line 117,col 26)",
        "(line 118,col 9)-(line 118,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toBaseString(java.lang.Object)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Create the same toString() as Object.toString().\n     * @param o the object to create the string for.\n     * @return a String in the Object.toString format.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.assertReflectionArray(java.lang.String, java.lang.Object)",
      "begin_line": 145,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 151,col 9)-(line 151,col 81)",
        "(line 152,col 9)-(line 152,col 87)",
        "(line 153,col 9)-(line 153,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectArray()",
      "begin_line": 156,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 73)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 96)",
        "(line 161,col 9)-(line 161,col 21)",
        "(line 162,col 9)-(line 162,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArray()",
      "begin_line": 165,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 50)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 169,col 90)",
        "(line 170,col 9)-(line 170,col 21)",
        "(line 171,col 9)-(line 171,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArray()",
      "begin_line": 174,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 48)",
        "(line 177,col 9)-(line 177,col 50)",
        "(line 178,col 9)-(line 178,col 90)",
        "(line 179,col 9)-(line 179,col 21)",
        "(line 180,col 9)-(line 180,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionShortArray()",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 90)",
        "(line 188,col 9)-(line 188,col 21)",
        "(line 189,col 9)-(line 189,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionyteArray()",
      "begin_line": 192,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 90)",
        "(line 197,col 9)-(line 197,col 21)",
        "(line 198,col 9)-(line 198,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArray()",
      "begin_line": 201,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 57)",
        "(line 204,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 205,col 89)",
        "(line 206,col 9)-(line 206,col 21)",
        "(line 207,col 9)-(line 207,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArray()",
      "begin_line": 210,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 69)",
        "(line 213,col 9)-(line 213,col 50)",
        "(line 214,col 9)-(line 214,col 105)",
        "(line 215,col 9)-(line 215,col 21)",
        "(line 216,col 9)-(line 216,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArray()",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 71)",
        "(line 222,col 9)-(line 222,col 50)",
        "(line 223,col 9)-(line 223,col 105)",
        "(line 224,col 9)-(line 224,col 21)",
        "(line 225,col 9)-(line 225,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArray()",
      "begin_line": 228,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 63)",
        "(line 231,col 9)-(line 231,col 50)",
        "(line 232,col 9)-(line 232,col 98)",
        "(line 233,col 9)-(line 233,col 21)",
        "(line 234,col 9)-(line 234,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArrayArray()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 84)",
        "(line 242,col 9)-(line 242,col 50)",
        "(line 243,col 9)-(line 243,col 108)",
        "(line 244,col 9)-(line 244,col 21)",
        "(line 245,col 9)-(line 245,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArrayArray()",
      "begin_line": 249,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 64)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 253,col 9)-(line 253,col 98)",
        "(line 254,col 9)-(line 254,col 21)",
        "(line 255,col 9)-(line 255,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArrayArray()",
      "begin_line": 258,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 50)",
        "(line 262,col 9)-(line 262,col 98)",
        "(line 263,col 9)-(line 263,col 21)",
        "(line 264,col 9)-(line 264,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionhortArrayArray()",
      "begin_line": 267,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 66)",
        "(line 270,col 9)-(line 270,col 50)",
        "(line 271,col 9)-(line 271,col 98)",
        "(line 272,col 9)-(line 272,col 21)",
        "(line 273,col 9)-(line 273,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionByteArrayArray()",
      "begin_line": 276,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 64)",
        "(line 279,col 9)-(line 279,col 50)",
        "(line 280,col 9)-(line 280,col 98)",
        "(line 281,col 9)-(line 281,col 21)",
        "(line 282,col 9)-(line 282,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArrayArray()",
      "begin_line": 285,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 70)",
        "(line 288,col 9)-(line 288,col 50)",
        "(line 289,col 9)-(line 289,col 98)",
        "(line 290,col 9)-(line 290,col 21)",
        "(line 291,col 9)-(line 291,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArrayArray()",
      "begin_line": 294,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 85)",
        "(line 297,col 9)-(line 297,col 50)",
        "(line 298,col 9)-(line 298,col 108)",
        "(line 299,col 9)-(line 299,col 21)",
        "(line 300,col 9)-(line 300,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArrayArray()",
      "begin_line": 303,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 81)",
        "(line 306,col 9)-(line 306,col 50)",
        "(line 307,col 9)-(line 307,col 109)",
        "(line 308,col 9)-(line 308,col 109)",
        "(line 309,col 9)-(line 309,col 21)",
        "(line 310,col 9)-(line 310,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchyArrayList()",
      "begin_line": 314,
      "end_line": 315,
      "comment": " Reflection hierarchy tests",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchy()",
      "begin_line": 340,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 68)",
        "(line 343,col 9)-(line 343,col 50)",
        "(line 344,col 9)-(line 344,col 83)",
        "(line 345,col 9)-(line 345,col 89)",
        "(line 346,col 9)-(line 346,col 96)",
        "(line 347,col 9)-(line 347,col 108)",
        "(line 348,col 9)-(line 348,col 102)",
        "(line 349,col 9)-(line 349,col 110)",
        "(line 350,col 9)-(line 350,col 126)",
        "(line 352,col 9)-(line 352,col 68)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 354,col 9)-(line 354,col 87)",
        "(line 355,col 9)-(line 355,col 87)",
        "(line 356,col 9)-(line 356,col 93)",
        "(line 357,col 9)-(line 357,col 100)",
        "(line 358,col 9)-(line 358,col 125)",
        "(line 359,col 9)-(line 359,col 106)",
        "(line 360,col 9)-(line 360,col 114)",
        "(line 361,col 9)-(line 361,col 130)",
        "(line 362,col 9)-(line 362,col 126)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 365,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 366,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientA"
      ],
      "begin_line": 368,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestFixtureB",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestFixtureA"
      ],
      "begin_line": 372,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 373,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientB"
      ],
      "begin_line": 375,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInnerClassReflection()",
      "begin_line": 379,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 34)",
        "(line 382,col 9)-(line 382,col 108)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Outer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 385,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inner"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Inner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 387,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.Inner.toString()",
      "begin_line": 388,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 17)-(line 390,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.Outer.toString()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycle()",
      "begin_line": 404,
      "end_line": 411,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 41)",
        "(line 407,col 9)-(line 407,col 29)",
        "(line 408,col 9)-(line 410,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycleLevel2()",
      "begin_line": 416,
      "end_line": 428,
      "comment": "\n     * Test an array element pointing to its container.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 41)",
        "(line 419,col 9)-(line 419,col 47)",
        "(line 420,col 9)-(line 420,col 35)",
        "(line 421,col 9)-(line 421,col 35)",
        "(line 422,col 9)-(line 424,col 57)",
        "(line 425,col 9)-(line 427,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayArrayCycle()",
      "begin_line": 430,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 46)",
        "(line 433,col 9)-(line 433,col 32)",
        "(line 434,col 9)-(line 434,col 32)",
        "(line 435,col 9)-(line 435,col 32)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 437,col 58)",
        "(line 438,col 9)-(line 449,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleA",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 455,
      "end_line": 462,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleA.toString()",
      "begin_line": 458,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionTestCycleB",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 467,
      "end_line": 474,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ReflectionTestCycleB.toString()",
      "begin_line": 470,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 479,
      "end_line": 493,
      "comment": "\n     * A reflection test fixture.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "o"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture()",
      "begin_line": 482,
      "end_line": 483,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.SimpleReflectionTestFixture(java.lang.Object)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 13)-(line 486,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionTestFixture.toString()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 491,col 13)-(line 491,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceVarReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 495,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 496,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.SelfInstanceVarReflectionTestFixture()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 13)-(line 500,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceVarReflectionTestFixture.toString()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 505,col 13)-(line 505,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SelfInstanceTwoVarsReflectionTestFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 509,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeIsSelf"
      ],
      "begin_line": 510,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "otherType"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.SelfInstanceTwoVarsReflectionTestFixture()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 13)-(line 515,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.getOtherType()",
      "begin_line": 518,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture.toString()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionObjectCycle()",
      "begin_line": 534,
      "end_line": 539,
      "comment": "\n     * Test an Object pointing to itself, the simplest test.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 79)",
        "(line 537,col 9)-(line 537,col 26)",
        "(line 538,col 9)-(line 538,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceVarReflectionObjectCycle()",
      "begin_line": 546,
      "end_line": 550,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 95)",
        "(line 549,col 9)-(line 549,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceTwoVarsReflectionObjectCycle()",
      "begin_line": 558,
      "end_line": 562,
      "comment": "\n     * Test a class that defines an ivar pointing to itself.  This test was\n     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 103)",
        "(line 561,col 9)-(line 561,col 161)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectCycle()",
      "begin_line": 570,
      "end_line": 579,
      "comment": "\n     * Test Objects pointing to each other.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 60)",
        "(line 573,col 9)-(line 573,col 60)",
        "(line 574,col 9)-(line 574,col 16)",
        "(line 575,col 9)-(line 575,col 16)",
        "(line 576,col 9)-(line 578,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayAndObjectCycle()",
      "begin_line": 587,
      "end_line": 607,
      "comment": "\n     * Test a nasty combination of arrays and Objects pointing to each other.\n     * objects[0] -\u003e SimpleReflectionTestFixture[ o -\u003e objects ]\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 41)",
        "(line 590,col 9)-(line 590,col 86)",
        "(line 591,col 9)-(line 591,col 28)",
        "(line 592,col 9)-(line 600,col 57)",
        "(line 601,col 9)-(line 606,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.validateNullToStringStyleRegistry()",
      "begin_line": 609,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 73)",
        "(line 611,col 9)-(line 611,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendSuper()",
      "begin_line": 615,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 105)",
        "(line 618,col 9)-(line 618,col 117)",
        "(line 620,col 9)-(line 620,col 133)",
        "(line 621,col 9)-(line 621,col 146)",
        "(line 622,col 9)-(line 622,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToString()",
      "begin_line": 625,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 108)",
        "(line 628,col 9)-(line 628,col 120)",
        "(line 630,col 9)-(line 630,col 136)",
        "(line 631,col 9)-(line 631,col 149)",
        "(line 632,col 9)-(line 632,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObject()",
      "begin_line": 635,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 40)",
        "(line 638,col 9)-(line 638,col 40)",
        "(line 639,col 9)-(line 639,col 103)",
        "(line 640,col 9)-(line 640,col 87)",
        "(line 641,col 9)-(line 641,col 110)",
        "(line 642,col 9)-(line 642,col 94)",
        "(line 643,col 9)-(line 643,col 114)",
        "(line 644,col 9)-(line 644,col 109)",
        "(line 645,col 9)-(line 645,col 129)",
        "(line 646,col 9)-(line 646,col 122)",
        "(line 647,col 9)-(line 647,col 135)",
        "(line 648,col 9)-(line 648,col 128)",
        "(line 649,col 9)-(line 649,col 128)",
        "(line 650,col 9)-(line 650,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectBuild()",
      "begin_line": 653,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 40)",
        "(line 656,col 9)-(line 656,col 40)",
        "(line 657,col 9)-(line 657,col 100)",
        "(line 658,col 9)-(line 658,col 84)",
        "(line 659,col 9)-(line 659,col 107)",
        "(line 660,col 9)-(line 660,col 91)",
        "(line 661,col 9)-(line 661,col 111)",
        "(line 662,col 9)-(line 662,col 106)",
        "(line 663,col 9)-(line 663,col 126)",
        "(line 664,col 9)-(line 664,col 119)",
        "(line 665,col 9)-(line 665,col 132)",
        "(line 666,col 9)-(line 666,col 125)",
        "(line 667,col 9)-(line 667,col 125)",
        "(line 668,col 9)-(line 668,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLong()",
      "begin_line": 671,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 87)",
        "(line 674,col 9)-(line 674,col 94)",
        "(line 675,col 9)-(line 675,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInt()",
      "begin_line": 678,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 92)",
        "(line 682,col 9)-(line 682,col 99)",
        "(line 683,col 9)-(line 683,col 124)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShort()",
      "begin_line": 686,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 94)",
        "(line 689,col 9)-(line 689,col 101)",
        "(line 690,col 9)-(line 690,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testChar()",
      "begin_line": 693,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 94)",
        "(line 696,col 9)-(line 696,col 101)",
        "(line 697,col 9)-(line 697,col 128)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByte()",
      "begin_line": 700,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 93)",
        "(line 703,col 9)-(line 703,col 100)",
        "(line 704,col 9)-(line 704,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDouble()",
      "begin_line": 707,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 99)",
        "(line 711,col 9)-(line 711,col 106)",
        "(line 712,col 9)-(line 712,col 138)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloat()",
      "begin_line": 715,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 98)",
        "(line 718,col 9)-(line 718,col 105)",
        "(line 719,col 9)-(line 719,col 136)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBoolean()",
      "begin_line": 722,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 92)",
        "(line 725,col 9)-(line 725,col 99)",
        "(line 726,col 9)-(line 726,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectArray()",
      "begin_line": 730,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 69)",
        "(line 733,col 9)-(line 733,col 105)",
        "(line 734,col 9)-(line 734,col 114)",
        "(line 735,col 9)-(line 735,col 21)",
        "(line 736,col 9)-(line 736,col 95)",
        "(line 737,col 9)-(line 737,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArray()",
      "begin_line": 740,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 48)",
        "(line 743,col 9)-(line 743,col 99)",
        "(line 744,col 9)-(line 744,col 108)",
        "(line 745,col 9)-(line 745,col 21)",
        "(line 746,col 9)-(line 746,col 95)",
        "(line 747,col 9)-(line 747,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArray()",
      "begin_line": 750,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 46)",
        "(line 753,col 9)-(line 753,col 99)",
        "(line 754,col 9)-(line 754,col 108)",
        "(line 755,col 9)-(line 755,col 21)",
        "(line 756,col 9)-(line 756,col 95)",
        "(line 757,col 9)-(line 757,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArray()",
      "begin_line": 760,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 50)",
        "(line 763,col 9)-(line 763,col 99)",
        "(line 764,col 9)-(line 764,col 108)",
        "(line 765,col 9)-(line 765,col 21)",
        "(line 766,col 9)-(line 766,col 95)",
        "(line 767,col 9)-(line 767,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArray()",
      "begin_line": 770,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 48)",
        "(line 773,col 9)-(line 773,col 99)",
        "(line 774,col 9)-(line 774,col 108)",
        "(line 775,col 9)-(line 775,col 21)",
        "(line 776,col 9)-(line 776,col 95)",
        "(line 777,col 9)-(line 777,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArray()",
      "begin_line": 780,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 55)",
        "(line 783,col 9)-(line 783,col 98)",
        "(line 784,col 9)-(line 784,col 107)",
        "(line 785,col 9)-(line 785,col 21)",
        "(line 786,col 9)-(line 786,col 95)",
        "(line 787,col 9)-(line 787,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArray()",
      "begin_line": 790,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 67)",
        "(line 793,col 9)-(line 793,col 114)",
        "(line 794,col 9)-(line 794,col 123)",
        "(line 795,col 9)-(line 795,col 21)",
        "(line 796,col 9)-(line 796,col 95)",
        "(line 797,col 9)-(line 797,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArray()",
      "begin_line": 800,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 69)",
        "(line 803,col 9)-(line 803,col 114)",
        "(line 804,col 9)-(line 804,col 123)",
        "(line 805,col 9)-(line 805,col 21)",
        "(line 806,col 9)-(line 806,col 95)",
        "(line 807,col 9)-(line 807,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArray()",
      "begin_line": 810,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 61)",
        "(line 813,col 9)-(line 813,col 107)",
        "(line 814,col 9)-(line 814,col 116)",
        "(line 815,col 9)-(line 815,col 21)",
        "(line 816,col 9)-(line 816,col 95)",
        "(line 817,col 9)-(line 817,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArrayArray()",
      "begin_line": 820,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 58)",
        "(line 823,col 9)-(line 823,col 107)",
        "(line 824,col 9)-(line 824,col 116)",
        "(line 825,col 9)-(line 825,col 21)",
        "(line 826,col 9)-(line 826,col 95)",
        "(line 827,col 9)-(line 827,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArrayArray()",
      "begin_line": 830,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 56)",
        "(line 833,col 9)-(line 833,col 107)",
        "(line 834,col 9)-(line 834,col 116)",
        "(line 835,col 9)-(line 835,col 21)",
        "(line 836,col 9)-(line 836,col 95)",
        "(line 837,col 9)-(line 837,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArrayArray()",
      "begin_line": 840,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 60)",
        "(line 843,col 9)-(line 843,col 107)",
        "(line 844,col 9)-(line 844,col 116)",
        "(line 845,col 9)-(line 845,col 21)",
        "(line 846,col 9)-(line 846,col 95)",
        "(line 847,col 9)-(line 847,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArrayArray()",
      "begin_line": 850,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 58)",
        "(line 853,col 9)-(line 853,col 107)",
        "(line 854,col 9)-(line 854,col 116)",
        "(line 855,col 9)-(line 855,col 21)",
        "(line 856,col 9)-(line 856,col 95)",
        "(line 857,col 9)-(line 857,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArrayArray()",
      "begin_line": 860,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 64)",
        "(line 863,col 9)-(line 863,col 107)",
        "(line 864,col 9)-(line 864,col 116)",
        "(line 865,col 9)-(line 865,col 21)",
        "(line 866,col 9)-(line 866,col 95)",
        "(line 867,col 9)-(line 867,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArrayArray()",
      "begin_line": 870,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 79)",
        "(line 873,col 9)-(line 873,col 117)",
        "(line 874,col 9)-(line 874,col 126)",
        "(line 875,col 9)-(line 875,col 21)",
        "(line 876,col 9)-(line 876,col 95)",
        "(line 877,col 9)-(line 877,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArrayArray()",
      "begin_line": 880,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 78)",
        "(line 883,col 9)-(line 883,col 117)",
        "(line 884,col 9)-(line 884,col 126)",
        "(line 885,col 9)-(line 885,col 21)",
        "(line 886,col 9)-(line 886,col 95)",
        "(line 887,col 9)-(line 887,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArrayArray()",
      "begin_line": 890,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 75)",
        "(line 893,col 9)-(line 893,col 118)",
        "(line 894,col 9)-(line 894,col 127)",
        "(line 895,col 9)-(line 895,col 21)",
        "(line 896,col 9)-(line 896,col 95)",
        "(line 897,col 9)-(line 897,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectCycle()",
      "begin_line": 900,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 42)",
        "(line 903,col 9)-(line 903,col 42)",
        "(line 904,col 9)-(line 904,col 18)",
        "(line 905,col 9)-(line 905,col 18)",
        "(line 907,col 9)-(line 907,col 97)",
        "(line 908,col 9)-(line 908,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ObjectCycle",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 911,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "obj"
      ],
      "begin_line": 912,
      "end_line": 912,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.ObjectCycle.toString()",
      "begin_line": 914,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 916,col 13)-(line 916,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionStatics()",
      "begin_line": 920,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 98)",
        "(line 923,col 9)-(line 925,col 121)",
        "(line 926,col 9)-(line 928,col 120)",
        "(line 929,col 9)-(line 931,col 98)",
        "(line 932,col 9)-(line 934,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionStatics()",
      "begin_line": 940,
      "end_line": 955,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 86)",
        "(line 943,col 9)-(line 945,col 115)",
        "(line 946,col 9)-(line 948,col 114)",
        "(line 949,col 9)-(line 951,col 92)",
        "(line 952,col 9)-(line 954,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testInheritedReflectionStatics()",
      "begin_line": 960,
      "end_line": 975,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 104)",
        "(line 963,col 9)-(line 965,col 124)",
        "(line 966,col 9)-(line 968,col 121)",
        "(line 969,col 9)-(line 971,col 98)",
        "(line 972,col 9)-(line 974,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.toStringWithStatics(T, org.apache.commons.lang3.builder.ToStringStyle, java.lang.Class\u003c? super T\u003e)",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\n     * \u003cp\u003eThis method uses reflection to build a suitable\n     * \u003ccode\u003etoString\u003c/code\u003e value which includes static fields.\u003c/p\u003e\n     *\n     * \u003cp\u003eIt uses \u003ccode\u003eAccessibleObject.setAccessible\u003c/code\u003e to gain access to private\n     * fields. This means that it will throw a security exception if run\n     * under a security manager, if the permissions are not set up correctly.\n     * It is also not as efficient as testing explicitly. \u003c/p\u003e\n     *\n     * \u003cp\u003eTransient fields are not output.\u003c/p\u003e\n     *\n     * \u003cp\u003eSuperclass fields will be appended up to and including the specified superclass.\n     * A null superclass is treated as \u003ccode\u003ejava.lang.Object\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the style is \u003ccode\u003enull\u003c/code\u003e, the default\n     * \u003ccode\u003eToStringStyle\u003c/code\u003e is used.\u003c/p\u003e\n     *\n     * @param object  the Object to be output\n     * @param style  the style of the \u003ccode\u003etoString\u003c/code\u003e to create,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param reflectUpToClass  the superclass to reflect up to (inclusive),\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the String result\n     * @throws IllegalArgumentException if the Object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_valid()",
      "begin_line": 1009,
      "end_line": 1015,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 41)",
        "(line 1012,col 9)-(line 1012,col 76)",
        "(line 1013,col 9)-(line 1013,col 40)",
        "(line 1014,col 9)-(line 1014,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_invalid()",
      "begin_line": 1020,
      "end_line": 1032,
      "comment": "\n     * Tests ReflectionToStringBuilder setUpToClass().\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 41)",
        "(line 1023,col 9)-(line 1023,col 76)",
        "(line 1024,col 9)-(line 1031,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1037,
      "end_line": 1046,
      "comment": "\n     * Tests ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 1039,
      "end_line": 1039,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientString"
      ],
      "begin_line": 1040,
      "end_line": 1040,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticTransientInt"
      ],
      "begin_line": 1041,
      "end_line": 1041,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceString"
      ],
      "begin_line": 1042,
      "end_line": 1042,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "instanceInt"
      ],
      "begin_line": 1043,
      "end_line": 1043,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientString"
      ],
      "begin_line": 1044,
      "end_line": 1044,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transientInt"
      ],
      "begin_line": 1045,
      "end_line": 1045,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SimpleReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1051,
      "end_line": 1054,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString"
      ],
      "begin_line": 1052,
      "end_line": 1052,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt"
      ],
      "begin_line": 1053,
      "end_line": 1053,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "InheritedReflectionStaticFieldsFixture",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.ToStringBuilderTest.SimpleReflectionStaticFieldsFixture"
      ],
      "begin_line": 1059,
      "end_line": 1062,
      "comment": "\n     * Test fixture for ReflectionToStringBuilder.toString() for statics.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "staticString2"
      ],
      "begin_line": 1060,
      "end_line": 1060,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticInt2"
      ],
      "begin_line": 1061,
      "end_line": 1061,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionNull()",
      "begin_line": 1064,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MultiLineTestObject",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1073,
      "end_line": 1079,
      "comment": "\n     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.\n     * See issue LANG-372.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "i"
      ],
      "begin_line": 1074,
      "end_line": 1074,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.MultiLineTestObject.toString()",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 13)-(line 1077,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToStringUsingMultiLineStyle()",
      "begin_line": 1081,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 60)",
        "(line 1084,col 9)-(line 1085,col 74)",
        "(line 1086,col 9)-(line 1086,col 74)"
      ]
    }
  ]
}