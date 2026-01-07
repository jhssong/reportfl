{
  "filepath": "/tmp/Lang-15b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 1172,
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
      "end_line": 62,
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
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 13)-(line 57,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 64,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 13)-(line 70,col 21)",
        "(line 71,col 13)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 77,col 13)",
        "(line 78,col 13)-(line 80,col 13)",
        "(line 81,col 13)-(line 81,col 50)",
        "(line 82,col 13)-(line 82,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 86,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 21)",
        "(line 91,col 13)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 95,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)",
        "(line 98,col 9)-(line 98,col 42)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 100,col 9)-(line 100,col 68)",
        "(line 101,col 9)-(line 101,col 19)",
        "(line 102,col 9)-(line 102,col 67)",
        "(line 103,col 9)-(line 103,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 106,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 42)",
        "(line 109,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 117,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 42)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 124,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 132,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 135,col 60)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 24)",
        "(line 139,col 9)-(line 139,col 24)",
        "(line 141,col 9)-(line 141,col 36)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 60)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 152,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 51)",
        "(line 156,col 9)-(line 156,col 33)",
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 51)",
        "(line 165,col 9)-(line 165,col 45)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 171,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 103)",
        "(line 173,col 9)-(line 173,col 103)",
        "(line 174,col 9)-(line 174,col 103)",
        "(line 176,col 9)-(line 176,col 102)",
        "(line 177,col 9)-(line 177,col 102)",
        "(line 178,col 9)-(line 178,col 102)",
        "(line 180,col 9)-(line 180,col 102)",
        "(line 181,col 9)-(line 181,col 102)",
        "(line 182,col 9)-(line 182,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 185,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 53)",
        "(line 193,col 9)-(line 193,col 77)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 80)",
        "(line 196,col 9)-(line 196,col 80)",
        "(line 197,col 9)-(line 197,col 77)",
        "(line 199,col 9)-(line 199,col 107)",
        "(line 200,col 9)-(line 200,col 107)",
        "(line 203,col 9)-(line 203,col 57)",
        "(line 205,col 9)-(line 205,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 217,
      "end_line": 235,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 146)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 137)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 251,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 254,col 42)",
        "(line 255,col 9)-(line 255,col 93)",
        "(line 256,col 9)-(line 256,col 92)",
        "(line 257,col 9)-(line 257,col 92)",
        "(line 259,col 9)-(line 259,col 93)",
        "(line 260,col 9)-(line 260,col 93)",
        "(line 262,col 9)-(line 262,col 92)",
        "(line 263,col 9)-(line 263,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 266,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 42)",
        "(line 270,col 9)-(line 270,col 78)",
        "(line 271,col 9)-(line 271,col 78)",
        "(line 272,col 9)-(line 272,col 19)",
        "(line 273,col 9)-(line 273,col 77)",
        "(line 274,col 9)-(line 274,col 77)",
        "(line 276,col 9)-(line 276,col 79)",
        "(line 277,col 9)-(line 277,col 100)",
        "(line 278,col 9)-(line 278,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 281,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 42)",
        "(line 284,col 9)-(line 284,col 42)",
        "(line 285,col 9)-(line 285,col 71)",
        "(line 286,col 9)-(line 286,col 71)",
        "(line 287,col 9)-(line 287,col 19)",
        "(line 288,col 9)-(line 288,col 70)",
        "(line 289,col 9)-(line 289,col 70)",
        "(line 291,col 9)-(line 291,col 72)",
        "(line 292,col 9)-(line 292,col 93)",
        "(line 293,col 9)-(line 293,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 296,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 42)",
        "(line 299,col 9)-(line 299,col 33)",
        "(line 300,col 9)-(line 303,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 306,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 310,col 109)",
        "(line 311,col 9)-(line 311,col 109)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 313,col 9)-(line 313,col 109)",
        "(line 314,col 9)-(line 314,col 109)",
        "(line 315,col 9)-(line 315,col 21)",
        "(line 316,col 9)-(line 316,col 108)",
        "(line 317,col 9)-(line 317,col 108)",
        "(line 319,col 9)-(line 319,col 110)",
        "(line 320,col 9)-(line 320,col 131)",
        "(line 321,col 9)-(line 321,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 324,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 27)",
        "(line 328,col 9)-(line 328,col 84)",
        "(line 329,col 9)-(line 329,col 84)",
        "(line 330,col 9)-(line 330,col 21)",
        "(line 331,col 9)-(line 331,col 83)",
        "(line 332,col 9)-(line 332,col 83)",
        "(line 334,col 9)-(line 334,col 85)",
        "(line 335,col 9)-(line 335,col 106)",
        "(line 336,col 9)-(line 336,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 339,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 21)",
        "(line 342,col 9)-(line 342,col 21)",
        "(line 343,col 9)-(line 343,col 78)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 77)",
        "(line 346,col 9)-(line 346,col 89)",
        "(line 347,col 9)-(line 347,col 89)",
        "(line 348,col 9)-(line 348,col 89)",
        "(line 349,col 9)-(line 349,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 352,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 19)",
        "(line 355,col 9)-(line 355,col 19)",
        "(line 356,col 9)-(line 356,col 78)",
        "(line 357,col 9)-(line 357,col 77)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 92)",
        "(line 360,col 9)-(line 360,col 92)",
        "(line 361,col 9)-(line 361,col 92)",
        "(line 362,col 9)-(line 362,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 365,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 21)",
        "(line 368,col 9)-(line 368,col 21)",
        "(line 369,col 9)-(line 369,col 78)",
        "(line 370,col 9)-(line 370,col 77)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 372,col 90)",
        "(line 373,col 9)-(line 373,col 90)",
        "(line 374,col 9)-(line 374,col 90)",
        "(line 375,col 9)-(line 375,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 378,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 20)",
        "(line 381,col 9)-(line 381,col 20)",
        "(line 382,col 9)-(line 382,col 78)",
        "(line 383,col 9)-(line 383,col 77)",
        "(line 384,col 9)-(line 384,col 77)",
        "(line 385,col 9)-(line 385,col 94)",
        "(line 386,col 9)-(line 386,col 94)",
        "(line 387,col 9)-(line 387,col 94)",
        "(line 388,col 9)-(line 388,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 391,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 20)",
        "(line 394,col 9)-(line 394,col 20)",
        "(line 395,col 9)-(line 395,col 78)",
        "(line 396,col 9)-(line 396,col 77)",
        "(line 397,col 9)-(line 397,col 77)",
        "(line 398,col 9)-(line 398,col 89)",
        "(line 399,col 9)-(line 399,col 89)",
        "(line 400,col 9)-(line 400,col 89)",
        "(line 401,col 9)-(line 401,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 404,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 22)",
        "(line 407,col 9)-(line 407,col 22)",
        "(line 408,col 9)-(line 408,col 78)",
        "(line 409,col 9)-(line 409,col 77)",
        "(line 410,col 9)-(line 410,col 77)",
        "(line 411,col 9)-(line 411,col 91)",
        "(line 412,col 9)-(line 412,col 91)",
        "(line 413,col 9)-(line 413,col 91)",
        "(line 414,col 9)-(line 414,col 91)",
        "(line 415,col 9)-(line 415,col 94)",
        "(line 416,col 9)-(line 416,col 99)",
        "(line 417,col 9)-(line 417,col 113)",
        "(line 418,col 9)-(line 418,col 113)",
        "(line 419,col 9)-(line 419,col 85)",
        "(line 420,col 9)-(line 420,col 85)",
        "(line 421,col 9)-(line 421,col 80)",
        "(line 422,col 9)-(line 422,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 425,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 21)",
        "(line 428,col 9)-(line 428,col 21)",
        "(line 429,col 9)-(line 429,col 78)",
        "(line 430,col 9)-(line 430,col 77)",
        "(line 431,col 9)-(line 431,col 77)",
        "(line 432,col 9)-(line 432,col 90)",
        "(line 433,col 9)-(line 433,col 90)",
        "(line 434,col 9)-(line 434,col 90)",
        "(line 435,col 9)-(line 435,col 90)",
        "(line 436,col 9)-(line 436,col 92)",
        "(line 437,col 9)-(line 437,col 97)",
        "(line 438,col 9)-(line 438,col 111)",
        "(line 439,col 9)-(line 439,col 111)",
        "(line 440,col 9)-(line 440,col 84)",
        "(line 441,col 9)-(line 441,col 84)",
        "(line 442,col 9)-(line 442,col 80)",
        "(line 443,col 9)-(line 443,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 446,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 26)",
        "(line 449,col 9)-(line 449,col 27)",
        "(line 450,col 9)-(line 450,col 78)",
        "(line 451,col 9)-(line 451,col 78)",
        "(line 452,col 9)-(line 452,col 77)",
        "(line 453,col 9)-(line 453,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 456,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 46)",
        "(line 459,col 9)-(line 459,col 36)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 46)",
        "(line 462,col 9)-(line 462,col 36)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 46)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 36)",
        "(line 467,col 9)-(line 467,col 36)",
        "(line 469,col 9)-(line 469,col 82)",
        "(line 470,col 9)-(line 470,col 82)",
        "(line 471,col 9)-(line 471,col 81)",
        "(line 472,col 9)-(line 472,col 81)",
        "(line 474,col 9)-(line 474,col 36)",
        "(line 475,col 9)-(line 475,col 81)",
        "(line 476,col 9)-(line 476,col 81)",
        "(line 478,col 9)-(line 478,col 81)",
        "(line 479,col 9)-(line 479,col 104)",
        "(line 480,col 9)-(line 480,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 483,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 34)",
        "(line 486,col 9)-(line 486,col 21)",
        "(line 487,col 9)-(line 487,col 21)",
        "(line 488,col 9)-(line 488,col 34)",
        "(line 489,col 9)-(line 489,col 21)",
        "(line 490,col 9)-(line 490,col 21)",
        "(line 491,col 9)-(line 491,col 34)",
        "(line 492,col 9)-(line 492,col 21)",
        "(line 493,col 9)-(line 493,col 21)",
        "(line 494,col 9)-(line 494,col 21)",
        "(line 496,col 9)-(line 496,col 82)",
        "(line 497,col 9)-(line 497,col 82)",
        "(line 498,col 9)-(line 498,col 81)",
        "(line 499,col 9)-(line 499,col 81)",
        "(line 501,col 9)-(line 501,col 20)",
        "(line 502,col 9)-(line 502,col 81)",
        "(line 503,col 9)-(line 503,col 81)",
        "(line 505,col 9)-(line 505,col 81)",
        "(line 506,col 9)-(line 506,col 100)",
        "(line 507,col 9)-(line 507,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 510,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 32)",
        "(line 513,col 9)-(line 513,col 20)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 32)",
        "(line 516,col 9)-(line 516,col 20)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 32)",
        "(line 519,col 9)-(line 519,col 20)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 523,col 9)-(line 523,col 82)",
        "(line 524,col 9)-(line 524,col 82)",
        "(line 525,col 9)-(line 525,col 81)",
        "(line 526,col 9)-(line 526,col 81)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 81)",
        "(line 530,col 9)-(line 530,col 81)",
        "(line 532,col 9)-(line 532,col 81)",
        "(line 533,col 9)-(line 533,col 98)",
        "(line 534,col 9)-(line 534,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 537,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 36)",
        "(line 540,col 9)-(line 540,col 20)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 36)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 36)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 20)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 550,col 9)-(line 550,col 82)",
        "(line 551,col 9)-(line 551,col 82)",
        "(line 552,col 9)-(line 552,col 81)",
        "(line 553,col 9)-(line 553,col 81)",
        "(line 555,col 9)-(line 555,col 20)",
        "(line 556,col 9)-(line 556,col 81)",
        "(line 557,col 9)-(line 557,col 81)",
        "(line 559,col 9)-(line 559,col 81)",
        "(line 560,col 9)-(line 560,col 102)",
        "(line 561,col 9)-(line 561,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 564,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 34)",
        "(line 567,col 9)-(line 567,col 20)",
        "(line 568,col 9)-(line 568,col 20)",
        "(line 569,col 9)-(line 569,col 34)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 571,col 9)-(line 571,col 20)",
        "(line 572,col 9)-(line 572,col 34)",
        "(line 573,col 9)-(line 573,col 20)",
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 577,col 9)-(line 577,col 82)",
        "(line 578,col 9)-(line 578,col 82)",
        "(line 579,col 9)-(line 579,col 81)",
        "(line 580,col 9)-(line 580,col 81)",
        "(line 582,col 9)-(line 582,col 20)",
        "(line 583,col 9)-(line 583,col 81)",
        "(line 584,col 9)-(line 584,col 81)",
        "(line 586,col 9)-(line 586,col 81)",
        "(line 587,col 9)-(line 587,col 100)",
        "(line 588,col 9)-(line 588,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 591,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 34)",
        "(line 594,col 9)-(line 594,col 20)",
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 596,col 34)",
        "(line 597,col 9)-(line 597,col 20)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 34)",
        "(line 600,col 9)-(line 600,col 20)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 20)",
        "(line 604,col 9)-(line 604,col 82)",
        "(line 605,col 9)-(line 605,col 82)",
        "(line 606,col 9)-(line 606,col 81)",
        "(line 607,col 9)-(line 607,col 81)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 610,col 9)-(line 610,col 81)",
        "(line 611,col 9)-(line 611,col 81)",
        "(line 613,col 9)-(line 613,col 81)",
        "(line 614,col 9)-(line 614,col 100)",
        "(line 615,col 9)-(line 615,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 618,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 38)",
        "(line 621,col 9)-(line 621,col 20)",
        "(line 622,col 9)-(line 622,col 20)",
        "(line 623,col 9)-(line 623,col 38)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 20)",
        "(line 626,col 9)-(line 626,col 38)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 20)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 631,col 9)-(line 631,col 82)",
        "(line 632,col 9)-(line 632,col 82)",
        "(line 633,col 9)-(line 633,col 81)",
        "(line 634,col 9)-(line 634,col 81)",
        "(line 636,col 9)-(line 636,col 20)",
        "(line 637,col 9)-(line 637,col 81)",
        "(line 638,col 9)-(line 638,col 81)",
        "(line 640,col 9)-(line 640,col 81)",
        "(line 641,col 9)-(line 641,col 104)",
        "(line 642,col 9)-(line 642,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 645,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 36)",
        "(line 648,col 9)-(line 648,col 20)",
        "(line 649,col 9)-(line 649,col 20)",
        "(line 650,col 9)-(line 650,col 36)",
        "(line 651,col 9)-(line 651,col 20)",
        "(line 652,col 9)-(line 652,col 20)",
        "(line 653,col 9)-(line 653,col 36)",
        "(line 654,col 9)-(line 654,col 20)",
        "(line 655,col 9)-(line 655,col 20)",
        "(line 656,col 9)-(line 656,col 20)",
        "(line 658,col 9)-(line 658,col 82)",
        "(line 659,col 9)-(line 659,col 82)",
        "(line 660,col 9)-(line 660,col 81)",
        "(line 661,col 9)-(line 661,col 81)",
        "(line 663,col 9)-(line 663,col 20)",
        "(line 664,col 9)-(line 664,col 81)",
        "(line 665,col 9)-(line 665,col 81)",
        "(line 667,col 9)-(line 667,col 81)",
        "(line 668,col 9)-(line 668,col 102)",
        "(line 669,col 9)-(line 669,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 672,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 40)",
        "(line 675,col 9)-(line 675,col 23)",
        "(line 676,col 9)-(line 676,col 24)",
        "(line 677,col 9)-(line 677,col 40)",
        "(line 678,col 9)-(line 678,col 23)",
        "(line 679,col 9)-(line 679,col 24)",
        "(line 680,col 9)-(line 680,col 40)",
        "(line 681,col 9)-(line 681,col 23)",
        "(line 682,col 9)-(line 682,col 24)",
        "(line 683,col 9)-(line 683,col 23)",
        "(line 685,col 9)-(line 685,col 82)",
        "(line 686,col 9)-(line 686,col 82)",
        "(line 687,col 9)-(line 687,col 81)",
        "(line 688,col 9)-(line 688,col 81)",
        "(line 690,col 9)-(line 690,col 23)",
        "(line 691,col 9)-(line 691,col 81)",
        "(line 692,col 9)-(line 692,col 81)",
        "(line 694,col 9)-(line 694,col 81)",
        "(line 695,col 9)-(line 695,col 106)",
        "(line 696,col 9)-(line 696,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 699,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 41)",
        "(line 702,col 9)-(line 702,col 41)",
        "(line 703,col 9)-(line 703,col 41)",
        "(line 704,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 27)",
        "(line 712,col 9)-(line 712,col 27)",
        "(line 714,col 9)-(line 714,col 86)",
        "(line 715,col 9)-(line 715,col 86)",
        "(line 716,col 9)-(line 716,col 85)",
        "(line 717,col 9)-(line 717,col 85)",
        "(line 718,col 9)-(line 718,col 27)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 723,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 39)",
        "(line 726,col 9)-(line 726,col 39)",
        "(line 727,col 9)-(line 727,col 39)",
        "(line 728,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 27)",
        "(line 736,col 9)-(line 736,col 27)",
        "(line 738,col 9)-(line 738,col 86)",
        "(line 739,col 9)-(line 739,col 86)",
        "(line 740,col 9)-(line 740,col 85)",
        "(line 741,col 9)-(line 741,col 85)",
        "(line 742,col 9)-(line 742,col 27)",
        "(line 743,col 9)-(line 743,col 85)",
        "(line 744,col 9)-(line 744,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 747,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 43)",
        "(line 750,col 9)-(line 750,col 43)",
        "(line 751,col 9)-(line 751,col 43)",
        "(line 752,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 27)",
        "(line 760,col 9)-(line 760,col 27)",
        "(line 762,col 9)-(line 762,col 86)",
        "(line 763,col 9)-(line 763,col 86)",
        "(line 764,col 9)-(line 764,col 85)",
        "(line 765,col 9)-(line 765,col 85)",
        "(line 766,col 9)-(line 766,col 27)",
        "(line 767,col 9)-(line 767,col 85)",
        "(line 768,col 9)-(line 768,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 771,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 41)",
        "(line 774,col 9)-(line 774,col 41)",
        "(line 775,col 9)-(line 775,col 41)",
        "(line 776,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 27)",
        "(line 784,col 9)-(line 784,col 27)",
        "(line 786,col 9)-(line 786,col 86)",
        "(line 787,col 9)-(line 787,col 86)",
        "(line 788,col 9)-(line 788,col 85)",
        "(line 789,col 9)-(line 789,col 85)",
        "(line 790,col 9)-(line 790,col 27)",
        "(line 791,col 9)-(line 791,col 85)",
        "(line 792,col 9)-(line 792,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 795,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 41)",
        "(line 798,col 9)-(line 798,col 41)",
        "(line 799,col 9)-(line 799,col 41)",
        "(line 800,col 9)-(line 806,col 9)",
        "(line 807,col 9)-(line 807,col 27)",
        "(line 808,col 9)-(line 808,col 27)",
        "(line 810,col 9)-(line 810,col 86)",
        "(line 811,col 9)-(line 811,col 86)",
        "(line 812,col 9)-(line 812,col 85)",
        "(line 813,col 9)-(line 813,col 85)",
        "(line 814,col 9)-(line 814,col 27)",
        "(line 815,col 9)-(line 815,col 85)",
        "(line 816,col 9)-(line 816,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 819,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 43)",
        "(line 822,col 9)-(line 822,col 43)",
        "(line 823,col 9)-(line 823,col 43)",
        "(line 824,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 27)",
        "(line 832,col 9)-(line 832,col 27)",
        "(line 834,col 9)-(line 834,col 86)",
        "(line 835,col 9)-(line 835,col 86)",
        "(line 836,col 9)-(line 836,col 85)",
        "(line 837,col 9)-(line 837,col 85)",
        "(line 838,col 9)-(line 838,col 27)",
        "(line 839,col 9)-(line 839,col 85)",
        "(line 840,col 9)-(line 840,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 843,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 45)",
        "(line 846,col 9)-(line 846,col 45)",
        "(line 847,col 9)-(line 847,col 45)",
        "(line 848,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 855,col 27)",
        "(line 856,col 9)-(line 856,col 27)",
        "(line 858,col 9)-(line 858,col 86)",
        "(line 859,col 9)-(line 859,col 86)",
        "(line 860,col 9)-(line 860,col 85)",
        "(line 861,col 9)-(line 861,col 85)",
        "(line 862,col 9)-(line 862,col 27)",
        "(line 863,col 9)-(line 863,col 85)",
        "(line 864,col 9)-(line 864,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 867,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 47)",
        "(line 870,col 9)-(line 870,col 47)",
        "(line 871,col 9)-(line 871,col 47)",
        "(line 872,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 29)",
        "(line 880,col 9)-(line 880,col 29)",
        "(line 882,col 9)-(line 882,col 86)",
        "(line 883,col 9)-(line 883,col 86)",
        "(line 884,col 9)-(line 884,col 85)",
        "(line 885,col 9)-(line 885,col 85)",
        "(line 886,col 9)-(line 886,col 28)",
        "(line 887,col 9)-(line 887,col 85)",
        "(line 888,col 9)-(line 888,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 891,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 40)",
        "(line 894,col 9)-(line 894,col 40)",
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 27)",
        "(line 907,col 9)-(line 907,col 27)",
        "(line 910,col 9)-(line 910,col 86)",
        "(line 911,col 9)-(line 911,col 86)",
        "(line 912,col 9)-(line 912,col 85)",
        "(line 913,col 9)-(line 913,col 85)",
        "(line 914,col 9)-(line 914,col 27)",
        "(line 915,col 9)-(line 915,col 85)",
        "(line 916,col 9)-(line 916,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 919,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 40)",
        "(line 922,col 9)-(line 922,col 40)",
        "(line 923,col 9)-(line 923,col 40)",
        "(line 924,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 36)",
        "(line 935,col 9)-(line 935,col 36)",
        "(line 936,col 9)-(line 936,col 86)",
        "(line 937,col 9)-(line 937,col 86)",
        "(line 938,col 9)-(line 938,col 85)",
        "(line 939,col 9)-(line 939,col 85)",
        "(line 940,col 9)-(line 940,col 38)",
        "(line 941,col 9)-(line 941,col 85)",
        "(line 942,col 9)-(line 942,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 945,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 48)",
        "(line 948,col 9)-(line 948,col 38)",
        "(line 949,col 9)-(line 949,col 38)",
        "(line 950,col 9)-(line 950,col 48)",
        "(line 951,col 9)-(line 951,col 38)",
        "(line 952,col 9)-(line 952,col 38)",
        "(line 953,col 9)-(line 953,col 48)",
        "(line 954,col 9)-(line 954,col 38)",
        "(line 955,col 9)-(line 955,col 38)",
        "(line 956,col 9)-(line 956,col 38)",
        "(line 958,col 9)-(line 958,col 29)",
        "(line 959,col 9)-(line 959,col 29)",
        "(line 960,col 9)-(line 960,col 29)",
        "(line 962,col 9)-(line 962,col 82)",
        "(line 963,col 9)-(line 963,col 82)",
        "(line 964,col 9)-(line 964,col 81)",
        "(line 965,col 9)-(line 965,col 81)",
        "(line 967,col 9)-(line 967,col 38)",
        "(line 968,col 9)-(line 968,col 81)",
        "(line 969,col 9)-(line 969,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 972,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 36)",
        "(line 975,col 9)-(line 975,col 23)",
        "(line 976,col 9)-(line 976,col 23)",
        "(line 977,col 9)-(line 977,col 36)",
        "(line 978,col 9)-(line 978,col 23)",
        "(line 979,col 9)-(line 979,col 23)",
        "(line 980,col 9)-(line 980,col 36)",
        "(line 981,col 9)-(line 981,col 23)",
        "(line 982,col 9)-(line 982,col 23)",
        "(line 983,col 9)-(line 983,col 23)",
        "(line 984,col 9)-(line 984,col 29)",
        "(line 985,col 9)-(line 985,col 29)",
        "(line 986,col 9)-(line 986,col 29)",
        "(line 987,col 9)-(line 987,col 82)",
        "(line 988,col 9)-(line 988,col 82)",
        "(line 989,col 9)-(line 989,col 81)",
        "(line 990,col 9)-(line 990,col 81)",
        "(line 992,col 9)-(line 992,col 22)",
        "(line 993,col 9)-(line 993,col 81)",
        "(line 994,col 9)-(line 994,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 997,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 34)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 34)",
        "(line 1003,col 9)-(line 1003,col 22)",
        "(line 1004,col 9)-(line 1004,col 22)",
        "(line 1005,col 9)-(line 1005,col 34)",
        "(line 1006,col 9)-(line 1006,col 22)",
        "(line 1007,col 9)-(line 1007,col 22)",
        "(line 1008,col 9)-(line 1008,col 22)",
        "(line 1009,col 9)-(line 1009,col 29)",
        "(line 1010,col 9)-(line 1010,col 29)",
        "(line 1011,col 9)-(line 1011,col 29)",
        "(line 1012,col 9)-(line 1012,col 82)",
        "(line 1013,col 9)-(line 1013,col 82)",
        "(line 1014,col 9)-(line 1014,col 81)",
        "(line 1015,col 9)-(line 1015,col 81)",
        "(line 1017,col 9)-(line 1017,col 22)",
        "(line 1018,col 9)-(line 1018,col 81)",
        "(line 1019,col 9)-(line 1019,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 1022,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 38)",
        "(line 1025,col 9)-(line 1025,col 22)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 38)",
        "(line 1028,col 9)-(line 1028,col 22)",
        "(line 1029,col 9)-(line 1029,col 22)",
        "(line 1030,col 9)-(line 1030,col 38)",
        "(line 1031,col 9)-(line 1031,col 22)",
        "(line 1032,col 9)-(line 1032,col 22)",
        "(line 1033,col 9)-(line 1033,col 22)",
        "(line 1034,col 9)-(line 1034,col 29)",
        "(line 1035,col 9)-(line 1035,col 29)",
        "(line 1036,col 9)-(line 1036,col 29)",
        "(line 1037,col 9)-(line 1037,col 82)",
        "(line 1038,col 9)-(line 1038,col 82)",
        "(line 1039,col 9)-(line 1039,col 81)",
        "(line 1040,col 9)-(line 1040,col 81)",
        "(line 1042,col 9)-(line 1042,col 22)",
        "(line 1043,col 9)-(line 1043,col 81)",
        "(line 1044,col 9)-(line 1044,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1047,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 36)",
        "(line 1050,col 9)-(line 1050,col 22)",
        "(line 1051,col 9)-(line 1051,col 22)",
        "(line 1052,col 9)-(line 1052,col 36)",
        "(line 1053,col 9)-(line 1053,col 22)",
        "(line 1054,col 9)-(line 1054,col 22)",
        "(line 1055,col 9)-(line 1055,col 36)",
        "(line 1056,col 9)-(line 1056,col 22)",
        "(line 1057,col 9)-(line 1057,col 22)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 29)",
        "(line 1060,col 9)-(line 1060,col 29)",
        "(line 1061,col 9)-(line 1061,col 29)",
        "(line 1062,col 9)-(line 1062,col 82)",
        "(line 1063,col 9)-(line 1063,col 82)",
        "(line 1064,col 9)-(line 1064,col 81)",
        "(line 1065,col 9)-(line 1065,col 81)",
        "(line 1067,col 9)-(line 1067,col 22)",
        "(line 1068,col 9)-(line 1068,col 81)",
        "(line 1069,col 9)-(line 1069,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1072,
      "end_line": 1095,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 36)",
        "(line 1075,col 9)-(line 1075,col 22)",
        "(line 1076,col 9)-(line 1076,col 22)",
        "(line 1077,col 9)-(line 1077,col 36)",
        "(line 1078,col 9)-(line 1078,col 22)",
        "(line 1079,col 9)-(line 1079,col 22)",
        "(line 1080,col 9)-(line 1080,col 36)",
        "(line 1081,col 9)-(line 1081,col 22)",
        "(line 1082,col 9)-(line 1082,col 22)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 29)",
        "(line 1085,col 9)-(line 1085,col 29)",
        "(line 1086,col 9)-(line 1086,col 29)",
        "(line 1087,col 9)-(line 1087,col 82)",
        "(line 1088,col 9)-(line 1088,col 82)",
        "(line 1089,col 9)-(line 1089,col 81)",
        "(line 1090,col 9)-(line 1090,col 81)",
        "(line 1092,col 9)-(line 1092,col 22)",
        "(line 1093,col 9)-(line 1093,col 81)",
        "(line 1094,col 9)-(line 1094,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1097,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 40)",
        "(line 1100,col 9)-(line 1100,col 22)",
        "(line 1101,col 9)-(line 1101,col 22)",
        "(line 1102,col 9)-(line 1102,col 40)",
        "(line 1103,col 9)-(line 1103,col 22)",
        "(line 1104,col 9)-(line 1104,col 22)",
        "(line 1105,col 9)-(line 1105,col 40)",
        "(line 1106,col 9)-(line 1106,col 22)",
        "(line 1107,col 9)-(line 1107,col 22)",
        "(line 1108,col 9)-(line 1108,col 22)",
        "(line 1109,col 9)-(line 1109,col 29)",
        "(line 1110,col 9)-(line 1110,col 29)",
        "(line 1111,col 9)-(line 1111,col 29)",
        "(line 1112,col 9)-(line 1112,col 82)",
        "(line 1113,col 9)-(line 1113,col 82)",
        "(line 1114,col 9)-(line 1114,col 81)",
        "(line 1115,col 9)-(line 1115,col 81)",
        "(line 1117,col 9)-(line 1117,col 22)",
        "(line 1118,col 9)-(line 1118,col 81)",
        "(line 1119,col 9)-(line 1119,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1122,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 38)",
        "(line 1125,col 9)-(line 1125,col 22)",
        "(line 1126,col 9)-(line 1126,col 22)",
        "(line 1127,col 9)-(line 1127,col 38)",
        "(line 1128,col 9)-(line 1128,col 22)",
        "(line 1129,col 9)-(line 1129,col 22)",
        "(line 1130,col 9)-(line 1130,col 38)",
        "(line 1131,col 9)-(line 1131,col 22)",
        "(line 1132,col 9)-(line 1132,col 22)",
        "(line 1133,col 9)-(line 1133,col 22)",
        "(line 1134,col 9)-(line 1134,col 29)",
        "(line 1135,col 9)-(line 1135,col 29)",
        "(line 1136,col 9)-(line 1136,col 29)",
        "(line 1137,col 9)-(line 1137,col 82)",
        "(line 1138,col 9)-(line 1138,col 82)",
        "(line 1139,col 9)-(line 1139,col 81)",
        "(line 1140,col 9)-(line 1140,col 81)",
        "(line 1142,col 9)-(line 1142,col 22)",
        "(line 1143,col 9)-(line 1143,col 81)",
        "(line 1144,col 9)-(line 1144,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1147,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 42)",
        "(line 1150,col 9)-(line 1150,col 25)",
        "(line 1151,col 9)-(line 1151,col 26)",
        "(line 1152,col 9)-(line 1152,col 42)",
        "(line 1153,col 9)-(line 1153,col 25)",
        "(line 1154,col 9)-(line 1154,col 26)",
        "(line 1155,col 9)-(line 1155,col 42)",
        "(line 1156,col 9)-(line 1156,col 25)",
        "(line 1157,col 9)-(line 1157,col 26)",
        "(line 1158,col 9)-(line 1158,col 25)",
        "(line 1159,col 9)-(line 1159,col 29)",
        "(line 1160,col 9)-(line 1160,col 29)",
        "(line 1161,col 9)-(line 1161,col 29)",
        "(line 1162,col 9)-(line 1162,col 82)",
        "(line 1163,col 9)-(line 1163,col 82)",
        "(line 1164,col 9)-(line 1164,col 81)",
        "(line 1165,col 9)-(line 1165,col 81)",
        "(line 1167,col 9)-(line 1167,col 25)",
        "(line 1168,col 9)-(line 1168,col 81)",
        "(line 1169,col 9)-(line 1169,col 81)"
      ]
    }
  ]
}