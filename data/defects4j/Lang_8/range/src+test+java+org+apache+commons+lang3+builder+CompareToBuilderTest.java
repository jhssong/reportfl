{
  "filepath": "/tmp/Lang-8b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 1167,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.lang3.builder.CompareToBuilderTest.TestObject\u003e"
      ],
      "begin_line": 35,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 13)-(line 38,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 40,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 42,col 13)-(line 44,col 13)",
        "(line 45,col 13)-(line 47,col 13)",
        "(line 48,col 13)-(line 48,col 44)",
        "(line 49,col 13)-(line 49,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.hashCode()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 13)-(line 62,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 70,
      "end_line": 90,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 13)-(line 73,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 79,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 83,col 13)",
        "(line 84,col 13)-(line 86,col 13)",
        "(line 87,col 13)-(line 87,col 50)",
        "(line 88,col 13)-(line 88,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 92,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 93,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 21)",
        "(line 97,col 13)-(line 97,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 101,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 104,col 42)",
        "(line 105,col 9)-(line 105,col 68)",
        "(line 106,col 9)-(line 106,col 68)",
        "(line 107,col 9)-(line 107,col 19)",
        "(line 108,col 9)-(line 108,col 67)",
        "(line 109,col 9)-(line 109,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 118,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 122,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 130,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 54)",
        "(line 133,col 9)-(line 133,col 60)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 36)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 60)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 36)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 150,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 51)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 51)",
        "(line 163,col 9)-(line 163,col 45)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 165,col 45)",
        "(line 166,col 9)-(line 166,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 169,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 103)",
        "(line 171,col 9)-(line 171,col 103)",
        "(line 172,col 9)-(line 172,col 103)",
        "(line 174,col 9)-(line 174,col 102)",
        "(line 175,col 9)-(line 175,col 102)",
        "(line 176,col 9)-(line 176,col 102)",
        "(line 178,col 9)-(line 178,col 102)",
        "(line 179,col 9)-(line 179,col 102)",
        "(line 180,col 9)-(line 180,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 183,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 43)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 191,col 9)-(line 191,col 77)",
        "(line 192,col 9)-(line 192,col 77)",
        "(line 193,col 9)-(line 193,col 80)",
        "(line 194,col 9)-(line 194,col 80)",
        "(line 195,col 9)-(line 195,col 77)",
        "(line 197,col 9)-(line 197,col 107)",
        "(line 198,col 9)-(line 198,col 107)",
        "(line 201,col 9)-(line 201,col 57)",
        "(line 203,col 9)-(line 203,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 215,
      "end_line": 233,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 146)",
        "(line 221,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 232,col 9)-(line 232,col 137)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 249,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 42)",
        "(line 252,col 9)-(line 252,col 42)",
        "(line 253,col 9)-(line 253,col 93)",
        "(line 254,col 9)-(line 254,col 92)",
        "(line 255,col 9)-(line 255,col 92)",
        "(line 257,col 9)-(line 257,col 93)",
        "(line 258,col 9)-(line 258,col 93)",
        "(line 260,col 9)-(line 260,col 92)",
        "(line 261,col 9)-(line 261,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 264,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 268,col 78)",
        "(line 269,col 9)-(line 269,col 78)",
        "(line 270,col 9)-(line 270,col 19)",
        "(line 271,col 9)-(line 271,col 77)",
        "(line 272,col 9)-(line 272,col 77)",
        "(line 274,col 9)-(line 274,col 79)",
        "(line 275,col 9)-(line 275,col 100)",
        "(line 276,col 9)-(line 276,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 279,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 88)",
        "(line 284,col 9)-(line 284,col 88)",
        "(line 285,col 9)-(line 285,col 19)",
        "(line 286,col 9)-(line 286,col 81)",
        "(line 287,col 9)-(line 287,col 81)",
        "(line 289,col 9)-(line 289,col 83)",
        "(line 290,col 9)-(line 290,col 110)",
        "(line 291,col 9)-(line 291,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 33)",
        "(line 298,col 9)-(line 298,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 301,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 27)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 109)",
        "(line 306,col 9)-(line 306,col 109)",
        "(line 307,col 9)-(line 307,col 20)",
        "(line 308,col 9)-(line 308,col 109)",
        "(line 309,col 9)-(line 309,col 109)",
        "(line 310,col 9)-(line 310,col 21)",
        "(line 311,col 9)-(line 311,col 108)",
        "(line 312,col 9)-(line 312,col 108)",
        "(line 314,col 9)-(line 314,col 110)",
        "(line 315,col 9)-(line 315,col 131)",
        "(line 316,col 9)-(line 316,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 319,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 27)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 323,col 84)",
        "(line 324,col 9)-(line 324,col 84)",
        "(line 325,col 9)-(line 325,col 21)",
        "(line 326,col 9)-(line 326,col 83)",
        "(line 327,col 9)-(line 327,col 83)",
        "(line 329,col 9)-(line 329,col 85)",
        "(line 330,col 9)-(line 330,col 106)",
        "(line 331,col 9)-(line 331,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 334,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 21)",
        "(line 337,col 9)-(line 337,col 21)",
        "(line 338,col 9)-(line 338,col 78)",
        "(line 339,col 9)-(line 339,col 77)",
        "(line 340,col 9)-(line 340,col 77)",
        "(line 341,col 9)-(line 341,col 89)",
        "(line 342,col 9)-(line 342,col 89)",
        "(line 343,col 9)-(line 343,col 89)",
        "(line 344,col 9)-(line 344,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 347,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 19)",
        "(line 350,col 9)-(line 350,col 19)",
        "(line 351,col 9)-(line 351,col 78)",
        "(line 352,col 9)-(line 352,col 77)",
        "(line 353,col 9)-(line 353,col 77)",
        "(line 354,col 9)-(line 354,col 92)",
        "(line 355,col 9)-(line 355,col 92)",
        "(line 356,col 9)-(line 356,col 92)",
        "(line 357,col 9)-(line 357,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 360,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 21)",
        "(line 363,col 9)-(line 363,col 21)",
        "(line 364,col 9)-(line 364,col 78)",
        "(line 365,col 9)-(line 365,col 77)",
        "(line 366,col 9)-(line 366,col 77)",
        "(line 367,col 9)-(line 367,col 90)",
        "(line 368,col 9)-(line 368,col 90)",
        "(line 369,col 9)-(line 369,col 90)",
        "(line 370,col 9)-(line 370,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 373,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 20)",
        "(line 376,col 9)-(line 376,col 20)",
        "(line 377,col 9)-(line 377,col 78)",
        "(line 378,col 9)-(line 378,col 77)",
        "(line 379,col 9)-(line 379,col 77)",
        "(line 380,col 9)-(line 380,col 94)",
        "(line 381,col 9)-(line 381,col 94)",
        "(line 382,col 9)-(line 382,col 94)",
        "(line 383,col 9)-(line 383,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 386,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 20)",
        "(line 389,col 9)-(line 389,col 20)",
        "(line 390,col 9)-(line 390,col 78)",
        "(line 391,col 9)-(line 391,col 77)",
        "(line 392,col 9)-(line 392,col 77)",
        "(line 393,col 9)-(line 393,col 89)",
        "(line 394,col 9)-(line 394,col 89)",
        "(line 395,col 9)-(line 395,col 89)",
        "(line 396,col 9)-(line 396,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 399,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 22)",
        "(line 402,col 9)-(line 402,col 22)",
        "(line 403,col 9)-(line 403,col 78)",
        "(line 404,col 9)-(line 404,col 77)",
        "(line 405,col 9)-(line 405,col 77)",
        "(line 406,col 9)-(line 406,col 91)",
        "(line 407,col 9)-(line 407,col 91)",
        "(line 408,col 9)-(line 408,col 91)",
        "(line 409,col 9)-(line 409,col 91)",
        "(line 410,col 9)-(line 410,col 94)",
        "(line 411,col 9)-(line 411,col 99)",
        "(line 412,col 9)-(line 412,col 113)",
        "(line 413,col 9)-(line 413,col 113)",
        "(line 414,col 9)-(line 414,col 85)",
        "(line 415,col 9)-(line 415,col 85)",
        "(line 416,col 9)-(line 416,col 80)",
        "(line 417,col 9)-(line 417,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 420,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 21)",
        "(line 423,col 9)-(line 423,col 21)",
        "(line 424,col 9)-(line 424,col 78)",
        "(line 425,col 9)-(line 425,col 77)",
        "(line 426,col 9)-(line 426,col 77)",
        "(line 427,col 9)-(line 427,col 90)",
        "(line 428,col 9)-(line 428,col 90)",
        "(line 429,col 9)-(line 429,col 90)",
        "(line 430,col 9)-(line 430,col 90)",
        "(line 431,col 9)-(line 431,col 92)",
        "(line 432,col 9)-(line 432,col 97)",
        "(line 433,col 9)-(line 433,col 111)",
        "(line 434,col 9)-(line 434,col 111)",
        "(line 435,col 9)-(line 435,col 84)",
        "(line 436,col 9)-(line 436,col 84)",
        "(line 437,col 9)-(line 437,col 80)",
        "(line 438,col 9)-(line 438,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 441,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 26)",
        "(line 444,col 9)-(line 444,col 27)",
        "(line 445,col 9)-(line 445,col 78)",
        "(line 446,col 9)-(line 446,col 78)",
        "(line 447,col 9)-(line 447,col 77)",
        "(line 448,col 9)-(line 448,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 451,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 46)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 46)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 458,col 9)-(line 458,col 36)",
        "(line 459,col 9)-(line 459,col 46)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 36)",
        "(line 462,col 9)-(line 462,col 36)",
        "(line 464,col 9)-(line 464,col 82)",
        "(line 465,col 9)-(line 465,col 82)",
        "(line 466,col 9)-(line 466,col 81)",
        "(line 467,col 9)-(line 467,col 81)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 81)",
        "(line 471,col 9)-(line 471,col 81)",
        "(line 473,col 9)-(line 473,col 81)",
        "(line 474,col 9)-(line 474,col 104)",
        "(line 475,col 9)-(line 475,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 478,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 34)",
        "(line 481,col 9)-(line 481,col 21)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 483,col 9)-(line 483,col 34)",
        "(line 484,col 9)-(line 484,col 21)",
        "(line 485,col 9)-(line 485,col 21)",
        "(line 486,col 9)-(line 486,col 34)",
        "(line 487,col 9)-(line 487,col 21)",
        "(line 488,col 9)-(line 488,col 21)",
        "(line 489,col 9)-(line 489,col 21)",
        "(line 491,col 9)-(line 491,col 82)",
        "(line 492,col 9)-(line 492,col 82)",
        "(line 493,col 9)-(line 493,col 81)",
        "(line 494,col 9)-(line 494,col 81)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 497,col 9)-(line 497,col 81)",
        "(line 498,col 9)-(line 498,col 81)",
        "(line 500,col 9)-(line 500,col 81)",
        "(line 501,col 9)-(line 501,col 100)",
        "(line 502,col 9)-(line 502,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 505,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 32)",
        "(line 508,col 9)-(line 508,col 20)",
        "(line 509,col 9)-(line 509,col 20)",
        "(line 510,col 9)-(line 510,col 32)",
        "(line 511,col 9)-(line 511,col 20)",
        "(line 512,col 9)-(line 512,col 20)",
        "(line 513,col 9)-(line 513,col 32)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 518,col 9)-(line 518,col 82)",
        "(line 519,col 9)-(line 519,col 82)",
        "(line 520,col 9)-(line 520,col 81)",
        "(line 521,col 9)-(line 521,col 81)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 81)",
        "(line 525,col 9)-(line 525,col 81)",
        "(line 527,col 9)-(line 527,col 81)",
        "(line 528,col 9)-(line 528,col 98)",
        "(line 529,col 9)-(line 529,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 532,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 36)",
        "(line 535,col 9)-(line 535,col 20)",
        "(line 536,col 9)-(line 536,col 20)",
        "(line 537,col 9)-(line 537,col 36)",
        "(line 538,col 9)-(line 538,col 20)",
        "(line 539,col 9)-(line 539,col 20)",
        "(line 540,col 9)-(line 540,col 36)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 545,col 9)-(line 545,col 82)",
        "(line 546,col 9)-(line 546,col 82)",
        "(line 547,col 9)-(line 547,col 81)",
        "(line 548,col 9)-(line 548,col 81)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 81)",
        "(line 552,col 9)-(line 552,col 81)",
        "(line 554,col 9)-(line 554,col 81)",
        "(line 555,col 9)-(line 555,col 102)",
        "(line 556,col 9)-(line 556,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 559,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 34)",
        "(line 562,col 9)-(line 562,col 20)",
        "(line 563,col 9)-(line 563,col 20)",
        "(line 564,col 9)-(line 564,col 34)",
        "(line 565,col 9)-(line 565,col 20)",
        "(line 566,col 9)-(line 566,col 20)",
        "(line 567,col 9)-(line 567,col 34)",
        "(line 568,col 9)-(line 568,col 20)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 572,col 9)-(line 572,col 82)",
        "(line 573,col 9)-(line 573,col 82)",
        "(line 574,col 9)-(line 574,col 81)",
        "(line 575,col 9)-(line 575,col 81)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 81)",
        "(line 579,col 9)-(line 579,col 81)",
        "(line 581,col 9)-(line 581,col 81)",
        "(line 582,col 9)-(line 582,col 100)",
        "(line 583,col 9)-(line 583,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 586,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 34)",
        "(line 589,col 9)-(line 589,col 20)",
        "(line 590,col 9)-(line 590,col 20)",
        "(line 591,col 9)-(line 591,col 34)",
        "(line 592,col 9)-(line 592,col 20)",
        "(line 593,col 9)-(line 593,col 20)",
        "(line 594,col 9)-(line 594,col 34)",
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 596,col 20)",
        "(line 597,col 9)-(line 597,col 20)",
        "(line 599,col 9)-(line 599,col 82)",
        "(line 600,col 9)-(line 600,col 82)",
        "(line 601,col 9)-(line 601,col 81)",
        "(line 602,col 9)-(line 602,col 81)",
        "(line 604,col 9)-(line 604,col 20)",
        "(line 605,col 9)-(line 605,col 81)",
        "(line 606,col 9)-(line 606,col 81)",
        "(line 608,col 9)-(line 608,col 81)",
        "(line 609,col 9)-(line 609,col 100)",
        "(line 610,col 9)-(line 610,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 613,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 38)",
        "(line 616,col 9)-(line 616,col 20)",
        "(line 617,col 9)-(line 617,col 20)",
        "(line 618,col 9)-(line 618,col 38)",
        "(line 619,col 9)-(line 619,col 20)",
        "(line 620,col 9)-(line 620,col 20)",
        "(line 621,col 9)-(line 621,col 38)",
        "(line 622,col 9)-(line 622,col 20)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 626,col 9)-(line 626,col 82)",
        "(line 627,col 9)-(line 627,col 82)",
        "(line 628,col 9)-(line 628,col 81)",
        "(line 629,col 9)-(line 629,col 81)",
        "(line 631,col 9)-(line 631,col 20)",
        "(line 632,col 9)-(line 632,col 81)",
        "(line 633,col 9)-(line 633,col 81)",
        "(line 635,col 9)-(line 635,col 81)",
        "(line 636,col 9)-(line 636,col 104)",
        "(line 637,col 9)-(line 637,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 640,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 36)",
        "(line 643,col 9)-(line 643,col 20)",
        "(line 644,col 9)-(line 644,col 20)",
        "(line 645,col 9)-(line 645,col 36)",
        "(line 646,col 9)-(line 646,col 20)",
        "(line 647,col 9)-(line 647,col 20)",
        "(line 648,col 9)-(line 648,col 36)",
        "(line 649,col 9)-(line 649,col 20)",
        "(line 650,col 9)-(line 650,col 20)",
        "(line 651,col 9)-(line 651,col 20)",
        "(line 653,col 9)-(line 653,col 82)",
        "(line 654,col 9)-(line 654,col 82)",
        "(line 655,col 9)-(line 655,col 81)",
        "(line 656,col 9)-(line 656,col 81)",
        "(line 658,col 9)-(line 658,col 20)",
        "(line 659,col 9)-(line 659,col 81)",
        "(line 660,col 9)-(line 660,col 81)",
        "(line 662,col 9)-(line 662,col 81)",
        "(line 663,col 9)-(line 663,col 102)",
        "(line 664,col 9)-(line 664,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 667,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 40)",
        "(line 670,col 9)-(line 670,col 23)",
        "(line 671,col 9)-(line 671,col 24)",
        "(line 672,col 9)-(line 672,col 40)",
        "(line 673,col 9)-(line 673,col 23)",
        "(line 674,col 9)-(line 674,col 24)",
        "(line 675,col 9)-(line 675,col 40)",
        "(line 676,col 9)-(line 676,col 23)",
        "(line 677,col 9)-(line 677,col 24)",
        "(line 678,col 9)-(line 678,col 23)",
        "(line 680,col 9)-(line 680,col 82)",
        "(line 681,col 9)-(line 681,col 82)",
        "(line 682,col 9)-(line 682,col 81)",
        "(line 683,col 9)-(line 683,col 81)",
        "(line 685,col 9)-(line 685,col 23)",
        "(line 686,col 9)-(line 686,col 81)",
        "(line 687,col 9)-(line 687,col 81)",
        "(line 689,col 9)-(line 689,col 81)",
        "(line 690,col 9)-(line 690,col 106)",
        "(line 691,col 9)-(line 691,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 694,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 41)",
        "(line 697,col 9)-(line 697,col 41)",
        "(line 698,col 9)-(line 698,col 41)",
        "(line 699,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 27)",
        "(line 707,col 9)-(line 707,col 27)",
        "(line 709,col 9)-(line 709,col 86)",
        "(line 710,col 9)-(line 710,col 86)",
        "(line 711,col 9)-(line 711,col 85)",
        "(line 712,col 9)-(line 712,col 85)",
        "(line 713,col 9)-(line 713,col 27)",
        "(line 714,col 9)-(line 714,col 85)",
        "(line 715,col 9)-(line 715,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 718,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 39)",
        "(line 721,col 9)-(line 721,col 39)",
        "(line 722,col 9)-(line 722,col 39)",
        "(line 723,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 27)",
        "(line 731,col 9)-(line 731,col 27)",
        "(line 733,col 9)-(line 733,col 86)",
        "(line 734,col 9)-(line 734,col 86)",
        "(line 735,col 9)-(line 735,col 85)",
        "(line 736,col 9)-(line 736,col 85)",
        "(line 737,col 9)-(line 737,col 27)",
        "(line 738,col 9)-(line 738,col 85)",
        "(line 739,col 9)-(line 739,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 742,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 43)",
        "(line 745,col 9)-(line 745,col 43)",
        "(line 746,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 27)",
        "(line 755,col 9)-(line 755,col 27)",
        "(line 757,col 9)-(line 757,col 86)",
        "(line 758,col 9)-(line 758,col 86)",
        "(line 759,col 9)-(line 759,col 85)",
        "(line 760,col 9)-(line 760,col 85)",
        "(line 761,col 9)-(line 761,col 27)",
        "(line 762,col 9)-(line 762,col 85)",
        "(line 763,col 9)-(line 763,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 766,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 41)",
        "(line 769,col 9)-(line 769,col 41)",
        "(line 770,col 9)-(line 770,col 41)",
        "(line 771,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 27)",
        "(line 779,col 9)-(line 779,col 27)",
        "(line 781,col 9)-(line 781,col 86)",
        "(line 782,col 9)-(line 782,col 86)",
        "(line 783,col 9)-(line 783,col 85)",
        "(line 784,col 9)-(line 784,col 85)",
        "(line 785,col 9)-(line 785,col 27)",
        "(line 786,col 9)-(line 786,col 85)",
        "(line 787,col 9)-(line 787,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 790,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 41)",
        "(line 793,col 9)-(line 793,col 41)",
        "(line 794,col 9)-(line 794,col 41)",
        "(line 795,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 27)",
        "(line 803,col 9)-(line 803,col 27)",
        "(line 805,col 9)-(line 805,col 86)",
        "(line 806,col 9)-(line 806,col 86)",
        "(line 807,col 9)-(line 807,col 85)",
        "(line 808,col 9)-(line 808,col 85)",
        "(line 809,col 9)-(line 809,col 27)",
        "(line 810,col 9)-(line 810,col 85)",
        "(line 811,col 9)-(line 811,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 814,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 43)",
        "(line 817,col 9)-(line 817,col 43)",
        "(line 818,col 9)-(line 818,col 43)",
        "(line 819,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 27)",
        "(line 827,col 9)-(line 827,col 27)",
        "(line 829,col 9)-(line 829,col 86)",
        "(line 830,col 9)-(line 830,col 86)",
        "(line 831,col 9)-(line 831,col 85)",
        "(line 832,col 9)-(line 832,col 85)",
        "(line 833,col 9)-(line 833,col 27)",
        "(line 834,col 9)-(line 834,col 85)",
        "(line 835,col 9)-(line 835,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 838,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 45)",
        "(line 841,col 9)-(line 841,col 45)",
        "(line 842,col 9)-(line 842,col 45)",
        "(line 843,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 27)",
        "(line 851,col 9)-(line 851,col 27)",
        "(line 853,col 9)-(line 853,col 86)",
        "(line 854,col 9)-(line 854,col 86)",
        "(line 855,col 9)-(line 855,col 85)",
        "(line 856,col 9)-(line 856,col 85)",
        "(line 857,col 9)-(line 857,col 27)",
        "(line 858,col 9)-(line 858,col 85)",
        "(line 859,col 9)-(line 859,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 862,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 865,col 47)",
        "(line 866,col 9)-(line 866,col 47)",
        "(line 867,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 29)",
        "(line 875,col 9)-(line 875,col 29)",
        "(line 877,col 9)-(line 877,col 86)",
        "(line 878,col 9)-(line 878,col 86)",
        "(line 879,col 9)-(line 879,col 85)",
        "(line 880,col 9)-(line 880,col 85)",
        "(line 881,col 9)-(line 881,col 28)",
        "(line 882,col 9)-(line 882,col 85)",
        "(line 883,col 9)-(line 883,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 886,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 40)",
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 890,col 40)",
        "(line 891,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 27)",
        "(line 902,col 9)-(line 902,col 27)",
        "(line 905,col 9)-(line 905,col 86)",
        "(line 906,col 9)-(line 906,col 86)",
        "(line 907,col 9)-(line 907,col 85)",
        "(line 908,col 9)-(line 908,col 85)",
        "(line 909,col 9)-(line 909,col 27)",
        "(line 910,col 9)-(line 910,col 85)",
        "(line 911,col 9)-(line 911,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 914,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 40)",
        "(line 917,col 9)-(line 917,col 40)",
        "(line 918,col 9)-(line 918,col 40)",
        "(line 919,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 929,col 36)",
        "(line 930,col 9)-(line 930,col 36)",
        "(line 931,col 9)-(line 931,col 86)",
        "(line 932,col 9)-(line 932,col 86)",
        "(line 933,col 9)-(line 933,col 85)",
        "(line 934,col 9)-(line 934,col 85)",
        "(line 935,col 9)-(line 935,col 38)",
        "(line 936,col 9)-(line 936,col 85)",
        "(line 937,col 9)-(line 937,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 940,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 48)",
        "(line 943,col 9)-(line 943,col 38)",
        "(line 944,col 9)-(line 944,col 38)",
        "(line 945,col 9)-(line 945,col 48)",
        "(line 946,col 9)-(line 946,col 38)",
        "(line 947,col 9)-(line 947,col 38)",
        "(line 948,col 9)-(line 948,col 48)",
        "(line 949,col 9)-(line 949,col 38)",
        "(line 950,col 9)-(line 950,col 38)",
        "(line 951,col 9)-(line 951,col 38)",
        "(line 953,col 9)-(line 953,col 29)",
        "(line 954,col 9)-(line 954,col 29)",
        "(line 955,col 9)-(line 955,col 29)",
        "(line 957,col 9)-(line 957,col 82)",
        "(line 958,col 9)-(line 958,col 82)",
        "(line 959,col 9)-(line 959,col 81)",
        "(line 960,col 9)-(line 960,col 81)",
        "(line 962,col 9)-(line 962,col 38)",
        "(line 963,col 9)-(line 963,col 81)",
        "(line 964,col 9)-(line 964,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 967,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 36)",
        "(line 970,col 9)-(line 970,col 23)",
        "(line 971,col 9)-(line 971,col 23)",
        "(line 972,col 9)-(line 972,col 36)",
        "(line 973,col 9)-(line 973,col 23)",
        "(line 974,col 9)-(line 974,col 23)",
        "(line 975,col 9)-(line 975,col 36)",
        "(line 976,col 9)-(line 976,col 23)",
        "(line 977,col 9)-(line 977,col 23)",
        "(line 978,col 9)-(line 978,col 23)",
        "(line 979,col 9)-(line 979,col 29)",
        "(line 980,col 9)-(line 980,col 29)",
        "(line 981,col 9)-(line 981,col 29)",
        "(line 982,col 9)-(line 982,col 82)",
        "(line 983,col 9)-(line 983,col 82)",
        "(line 984,col 9)-(line 984,col 81)",
        "(line 985,col 9)-(line 985,col 81)",
        "(line 987,col 9)-(line 987,col 22)",
        "(line 988,col 9)-(line 988,col 81)",
        "(line 989,col 9)-(line 989,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 992,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 34)",
        "(line 995,col 9)-(line 995,col 22)",
        "(line 996,col 9)-(line 996,col 22)",
        "(line 997,col 9)-(line 997,col 34)",
        "(line 998,col 9)-(line 998,col 22)",
        "(line 999,col 9)-(line 999,col 22)",
        "(line 1000,col 9)-(line 1000,col 34)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 22)",
        "(line 1004,col 9)-(line 1004,col 29)",
        "(line 1005,col 9)-(line 1005,col 29)",
        "(line 1006,col 9)-(line 1006,col 29)",
        "(line 1007,col 9)-(line 1007,col 82)",
        "(line 1008,col 9)-(line 1008,col 82)",
        "(line 1009,col 9)-(line 1009,col 81)",
        "(line 1010,col 9)-(line 1010,col 81)",
        "(line 1012,col 9)-(line 1012,col 22)",
        "(line 1013,col 9)-(line 1013,col 81)",
        "(line 1014,col 9)-(line 1014,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 1017,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 38)",
        "(line 1020,col 9)-(line 1020,col 22)",
        "(line 1021,col 9)-(line 1021,col 22)",
        "(line 1022,col 9)-(line 1022,col 38)",
        "(line 1023,col 9)-(line 1023,col 22)",
        "(line 1024,col 9)-(line 1024,col 22)",
        "(line 1025,col 9)-(line 1025,col 38)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 22)",
        "(line 1028,col 9)-(line 1028,col 22)",
        "(line 1029,col 9)-(line 1029,col 29)",
        "(line 1030,col 9)-(line 1030,col 29)",
        "(line 1031,col 9)-(line 1031,col 29)",
        "(line 1032,col 9)-(line 1032,col 82)",
        "(line 1033,col 9)-(line 1033,col 82)",
        "(line 1034,col 9)-(line 1034,col 81)",
        "(line 1035,col 9)-(line 1035,col 81)",
        "(line 1037,col 9)-(line 1037,col 22)",
        "(line 1038,col 9)-(line 1038,col 81)",
        "(line 1039,col 9)-(line 1039,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1042,
      "end_line": 1065,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 36)",
        "(line 1045,col 9)-(line 1045,col 22)",
        "(line 1046,col 9)-(line 1046,col 22)",
        "(line 1047,col 9)-(line 1047,col 36)",
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 22)",
        "(line 1050,col 9)-(line 1050,col 36)",
        "(line 1051,col 9)-(line 1051,col 22)",
        "(line 1052,col 9)-(line 1052,col 22)",
        "(line 1053,col 9)-(line 1053,col 22)",
        "(line 1054,col 9)-(line 1054,col 29)",
        "(line 1055,col 9)-(line 1055,col 29)",
        "(line 1056,col 9)-(line 1056,col 29)",
        "(line 1057,col 9)-(line 1057,col 82)",
        "(line 1058,col 9)-(line 1058,col 82)",
        "(line 1059,col 9)-(line 1059,col 81)",
        "(line 1060,col 9)-(line 1060,col 81)",
        "(line 1062,col 9)-(line 1062,col 22)",
        "(line 1063,col 9)-(line 1063,col 81)",
        "(line 1064,col 9)-(line 1064,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1067,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 9)-(line 1069,col 36)",
        "(line 1070,col 9)-(line 1070,col 22)",
        "(line 1071,col 9)-(line 1071,col 22)",
        "(line 1072,col 9)-(line 1072,col 36)",
        "(line 1073,col 9)-(line 1073,col 22)",
        "(line 1074,col 9)-(line 1074,col 22)",
        "(line 1075,col 9)-(line 1075,col 36)",
        "(line 1076,col 9)-(line 1076,col 22)",
        "(line 1077,col 9)-(line 1077,col 22)",
        "(line 1078,col 9)-(line 1078,col 22)",
        "(line 1079,col 9)-(line 1079,col 29)",
        "(line 1080,col 9)-(line 1080,col 29)",
        "(line 1081,col 9)-(line 1081,col 29)",
        "(line 1082,col 9)-(line 1082,col 82)",
        "(line 1083,col 9)-(line 1083,col 82)",
        "(line 1084,col 9)-(line 1084,col 81)",
        "(line 1085,col 9)-(line 1085,col 81)",
        "(line 1087,col 9)-(line 1087,col 22)",
        "(line 1088,col 9)-(line 1088,col 81)",
        "(line 1089,col 9)-(line 1089,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1092,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 40)",
        "(line 1095,col 9)-(line 1095,col 22)",
        "(line 1096,col 9)-(line 1096,col 22)",
        "(line 1097,col 9)-(line 1097,col 40)",
        "(line 1098,col 9)-(line 1098,col 22)",
        "(line 1099,col 9)-(line 1099,col 22)",
        "(line 1100,col 9)-(line 1100,col 40)",
        "(line 1101,col 9)-(line 1101,col 22)",
        "(line 1102,col 9)-(line 1102,col 22)",
        "(line 1103,col 9)-(line 1103,col 22)",
        "(line 1104,col 9)-(line 1104,col 29)",
        "(line 1105,col 9)-(line 1105,col 29)",
        "(line 1106,col 9)-(line 1106,col 29)",
        "(line 1107,col 9)-(line 1107,col 82)",
        "(line 1108,col 9)-(line 1108,col 82)",
        "(line 1109,col 9)-(line 1109,col 81)",
        "(line 1110,col 9)-(line 1110,col 81)",
        "(line 1112,col 9)-(line 1112,col 22)",
        "(line 1113,col 9)-(line 1113,col 81)",
        "(line 1114,col 9)-(line 1114,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1117,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 38)",
        "(line 1120,col 9)-(line 1120,col 22)",
        "(line 1121,col 9)-(line 1121,col 22)",
        "(line 1122,col 9)-(line 1122,col 38)",
        "(line 1123,col 9)-(line 1123,col 22)",
        "(line 1124,col 9)-(line 1124,col 22)",
        "(line 1125,col 9)-(line 1125,col 38)",
        "(line 1126,col 9)-(line 1126,col 22)",
        "(line 1127,col 9)-(line 1127,col 22)",
        "(line 1128,col 9)-(line 1128,col 22)",
        "(line 1129,col 9)-(line 1129,col 29)",
        "(line 1130,col 9)-(line 1130,col 29)",
        "(line 1131,col 9)-(line 1131,col 29)",
        "(line 1132,col 9)-(line 1132,col 82)",
        "(line 1133,col 9)-(line 1133,col 82)",
        "(line 1134,col 9)-(line 1134,col 81)",
        "(line 1135,col 9)-(line 1135,col 81)",
        "(line 1137,col 9)-(line 1137,col 22)",
        "(line 1138,col 9)-(line 1138,col 81)",
        "(line 1139,col 9)-(line 1139,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1142,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 42)",
        "(line 1145,col 9)-(line 1145,col 25)",
        "(line 1146,col 9)-(line 1146,col 26)",
        "(line 1147,col 9)-(line 1147,col 42)",
        "(line 1148,col 9)-(line 1148,col 25)",
        "(line 1149,col 9)-(line 1149,col 26)",
        "(line 1150,col 9)-(line 1150,col 42)",
        "(line 1151,col 9)-(line 1151,col 25)",
        "(line 1152,col 9)-(line 1152,col 26)",
        "(line 1153,col 9)-(line 1153,col 25)",
        "(line 1154,col 9)-(line 1154,col 29)",
        "(line 1155,col 9)-(line 1155,col 29)",
        "(line 1156,col 9)-(line 1156,col 29)",
        "(line 1157,col 9)-(line 1157,col 82)",
        "(line 1158,col 9)-(line 1158,col 82)",
        "(line 1159,col 9)-(line 1159,col 81)",
        "(line 1160,col 9)-(line 1160,col 81)",
        "(line 1162,col 9)-(line 1162,col 25)",
        "(line 1163,col 9)-(line 1163,col 81)",
        "(line 1164,col 9)-(line 1164,col 81)"
      ]
    }
  ]
}