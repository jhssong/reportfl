{
  "filepath": "/tmp/Lang-13b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 1173,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "TestObject",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.lang3.builder.CompareToBuilderTest.TestObject\u003e"
      ],
      "begin_line": 36,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.TestObject(int)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 13)-(line 39,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.equals(java.lang.Object)",
      "begin_line": 41,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 43,col 13)-(line 45,col 13)",
        "(line 46,col 13)-(line 48,col 13)",
        "(line 49,col 13)-(line 49,col 44)",
        "(line 50,col 13)-(line 50,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.setA(int)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.getA()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject.compareTo(org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 65,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 13)-(line 68,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.TestSubObject(int, int)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 71,col 21)",
        "(line 72,col 13)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestSubObject.equals(java.lang.Object)",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 78,col 13)",
        "(line 79,col 13)-(line 81,col 13)",
        "(line 82,col 13)-(line 82,col 50)",
        "(line 83,col 13)-(line 83,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestTransientSubObject",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.builder.CompareToBuilderTest.TestObject"
      ],
      "begin_line": 87,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.TestTransientSubObject.TestTransientSubObject(int, int)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 21)",
        "(line 92,col 13)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare()",
      "begin_line": 96,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 42)",
        "(line 99,col 9)-(line 99,col 42)",
        "(line 100,col 9)-(line 100,col 68)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 19)",
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 104,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 118,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 42)",
        "(line 121,col 9)-(line 121,col 33)",
        "(line 122,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 133,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 54)",
        "(line 136,col 9)-(line 136,col 60)",
        "(line 138,col 9)-(line 138,col 24)",
        "(line 139,col 9)-(line 139,col 24)",
        "(line 140,col 9)-(line 140,col 24)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 60)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 36)",
        "(line 149,col 9)-(line 149,col 36)",
        "(line 150,col 9)-(line 150,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 153,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 51)",
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 45)",
        "(line 164,col 9)-(line 164,col 51)",
        "(line 166,col 9)-(line 166,col 45)",
        "(line 167,col 9)-(line 167,col 45)",
        "(line 168,col 9)-(line 168,col 45)",
        "(line 169,col 9)-(line 169,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 172,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 103)",
        "(line 174,col 9)-(line 174,col 103)",
        "(line 175,col 9)-(line 175,col 103)",
        "(line 177,col 9)-(line 177,col 102)",
        "(line 178,col 9)-(line 178,col 102)",
        "(line 179,col 9)-(line 179,col 102)",
        "(line 181,col 9)-(line 181,col 102)",
        "(line 182,col 9)-(line 182,col 102)",
        "(line 183,col 9)-(line 183,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 186,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 43)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 53)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 77)",
        "(line 196,col 9)-(line 196,col 80)",
        "(line 197,col 9)-(line 197,col 80)",
        "(line 198,col 9)-(line 198,col 77)",
        "(line 200,col 9)-(line 200,col 107)",
        "(line 201,col 9)-(line 201,col 107)",
        "(line 204,col 9)-(line 204,col 57)",
        "(line 206,col 9)-(line 206,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 218,
      "end_line": 236,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 146)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 137)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 252,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 42)",
        "(line 255,col 9)-(line 255,col 42)",
        "(line 256,col 9)-(line 256,col 93)",
        "(line 257,col 9)-(line 257,col 92)",
        "(line 258,col 9)-(line 258,col 92)",
        "(line 260,col 9)-(line 260,col 93)",
        "(line 261,col 9)-(line 261,col 93)",
        "(line 263,col 9)-(line 263,col 92)",
        "(line 264,col 9)-(line 264,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 267,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 42)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 78)",
        "(line 272,col 9)-(line 272,col 78)",
        "(line 273,col 9)-(line 273,col 19)",
        "(line 274,col 9)-(line 274,col 77)",
        "(line 275,col 9)-(line 275,col 77)",
        "(line 277,col 9)-(line 277,col 79)",
        "(line 278,col 9)-(line 278,col 100)",
        "(line 279,col 9)-(line 279,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 282,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 42)",
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 88)",
        "(line 287,col 9)-(line 287,col 88)",
        "(line 288,col 9)-(line 288,col 19)",
        "(line 289,col 9)-(line 289,col 81)",
        "(line 290,col 9)-(line 290,col 81)",
        "(line 292,col 9)-(line 292,col 83)",
        "(line 293,col 9)-(line 293,col 110)",
        "(line 294,col 9)-(line 294,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 297,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 33)",
        "(line 301,col 9)-(line 304,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 307,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 311,col 109)",
        "(line 312,col 9)-(line 312,col 109)",
        "(line 313,col 9)-(line 313,col 20)",
        "(line 314,col 9)-(line 314,col 109)",
        "(line 315,col 9)-(line 315,col 109)",
        "(line 316,col 9)-(line 316,col 21)",
        "(line 317,col 9)-(line 317,col 108)",
        "(line 318,col 9)-(line 318,col 108)",
        "(line 320,col 9)-(line 320,col 110)",
        "(line 321,col 9)-(line 321,col 131)",
        "(line 322,col 9)-(line 322,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 325,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 27)",
        "(line 328,col 9)-(line 328,col 27)",
        "(line 329,col 9)-(line 329,col 84)",
        "(line 330,col 9)-(line 330,col 84)",
        "(line 331,col 9)-(line 331,col 21)",
        "(line 332,col 9)-(line 332,col 83)",
        "(line 333,col 9)-(line 333,col 83)",
        "(line 335,col 9)-(line 335,col 85)",
        "(line 336,col 9)-(line 336,col 106)",
        "(line 337,col 9)-(line 337,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 340,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 21)",
        "(line 343,col 9)-(line 343,col 21)",
        "(line 344,col 9)-(line 344,col 78)",
        "(line 345,col 9)-(line 345,col 77)",
        "(line 346,col 9)-(line 346,col 77)",
        "(line 347,col 9)-(line 347,col 89)",
        "(line 348,col 9)-(line 348,col 89)",
        "(line 349,col 9)-(line 349,col 89)",
        "(line 350,col 9)-(line 350,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 353,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 19)",
        "(line 356,col 9)-(line 356,col 19)",
        "(line 357,col 9)-(line 357,col 78)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 77)",
        "(line 360,col 9)-(line 360,col 92)",
        "(line 361,col 9)-(line 361,col 92)",
        "(line 362,col 9)-(line 362,col 92)",
        "(line 363,col 9)-(line 363,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 366,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 21)",
        "(line 369,col 9)-(line 369,col 21)",
        "(line 370,col 9)-(line 370,col 78)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 373,col 90)",
        "(line 374,col 9)-(line 374,col 90)",
        "(line 375,col 9)-(line 375,col 90)",
        "(line 376,col 9)-(line 376,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 379,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 20)",
        "(line 382,col 9)-(line 382,col 20)",
        "(line 383,col 9)-(line 383,col 78)",
        "(line 384,col 9)-(line 384,col 77)",
        "(line 385,col 9)-(line 385,col 77)",
        "(line 386,col 9)-(line 386,col 94)",
        "(line 387,col 9)-(line 387,col 94)",
        "(line 388,col 9)-(line 388,col 94)",
        "(line 389,col 9)-(line 389,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 392,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 20)",
        "(line 395,col 9)-(line 395,col 20)",
        "(line 396,col 9)-(line 396,col 78)",
        "(line 397,col 9)-(line 397,col 77)",
        "(line 398,col 9)-(line 398,col 77)",
        "(line 399,col 9)-(line 399,col 89)",
        "(line 400,col 9)-(line 400,col 89)",
        "(line 401,col 9)-(line 401,col 89)",
        "(line 402,col 9)-(line 402,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 405,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 22)",
        "(line 408,col 9)-(line 408,col 22)",
        "(line 409,col 9)-(line 409,col 78)",
        "(line 410,col 9)-(line 410,col 77)",
        "(line 411,col 9)-(line 411,col 77)",
        "(line 412,col 9)-(line 412,col 91)",
        "(line 413,col 9)-(line 413,col 91)",
        "(line 414,col 9)-(line 414,col 91)",
        "(line 415,col 9)-(line 415,col 91)",
        "(line 416,col 9)-(line 416,col 94)",
        "(line 417,col 9)-(line 417,col 99)",
        "(line 418,col 9)-(line 418,col 113)",
        "(line 419,col 9)-(line 419,col 113)",
        "(line 420,col 9)-(line 420,col 85)",
        "(line 421,col 9)-(line 421,col 85)",
        "(line 422,col 9)-(line 422,col 80)",
        "(line 423,col 9)-(line 423,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 426,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 21)",
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 78)",
        "(line 431,col 9)-(line 431,col 77)",
        "(line 432,col 9)-(line 432,col 77)",
        "(line 433,col 9)-(line 433,col 90)",
        "(line 434,col 9)-(line 434,col 90)",
        "(line 435,col 9)-(line 435,col 90)",
        "(line 436,col 9)-(line 436,col 90)",
        "(line 437,col 9)-(line 437,col 92)",
        "(line 438,col 9)-(line 438,col 97)",
        "(line 439,col 9)-(line 439,col 111)",
        "(line 440,col 9)-(line 440,col 111)",
        "(line 441,col 9)-(line 441,col 84)",
        "(line 442,col 9)-(line 442,col 84)",
        "(line 443,col 9)-(line 443,col 80)",
        "(line 444,col 9)-(line 444,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 447,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 26)",
        "(line 450,col 9)-(line 450,col 27)",
        "(line 451,col 9)-(line 451,col 78)",
        "(line 452,col 9)-(line 452,col 78)",
        "(line 453,col 9)-(line 453,col 77)",
        "(line 454,col 9)-(line 454,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 457,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 46)",
        "(line 460,col 9)-(line 460,col 36)",
        "(line 461,col 9)-(line 461,col 36)",
        "(line 462,col 9)-(line 462,col 46)",
        "(line 463,col 9)-(line 463,col 36)",
        "(line 464,col 9)-(line 464,col 36)",
        "(line 465,col 9)-(line 465,col 46)",
        "(line 466,col 9)-(line 466,col 36)",
        "(line 467,col 9)-(line 467,col 36)",
        "(line 468,col 9)-(line 468,col 36)",
        "(line 470,col 9)-(line 470,col 82)",
        "(line 471,col 9)-(line 471,col 82)",
        "(line 472,col 9)-(line 472,col 81)",
        "(line 473,col 9)-(line 473,col 81)",
        "(line 475,col 9)-(line 475,col 36)",
        "(line 476,col 9)-(line 476,col 81)",
        "(line 477,col 9)-(line 477,col 81)",
        "(line 479,col 9)-(line 479,col 81)",
        "(line 480,col 9)-(line 480,col 104)",
        "(line 481,col 9)-(line 481,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 484,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 34)",
        "(line 487,col 9)-(line 487,col 21)",
        "(line 488,col 9)-(line 488,col 21)",
        "(line 489,col 9)-(line 489,col 34)",
        "(line 490,col 9)-(line 490,col 21)",
        "(line 491,col 9)-(line 491,col 21)",
        "(line 492,col 9)-(line 492,col 34)",
        "(line 493,col 9)-(line 493,col 21)",
        "(line 494,col 9)-(line 494,col 21)",
        "(line 495,col 9)-(line 495,col 21)",
        "(line 497,col 9)-(line 497,col 82)",
        "(line 498,col 9)-(line 498,col 82)",
        "(line 499,col 9)-(line 499,col 81)",
        "(line 500,col 9)-(line 500,col 81)",
        "(line 502,col 9)-(line 502,col 20)",
        "(line 503,col 9)-(line 503,col 81)",
        "(line 504,col 9)-(line 504,col 81)",
        "(line 506,col 9)-(line 506,col 81)",
        "(line 507,col 9)-(line 507,col 100)",
        "(line 508,col 9)-(line 508,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 511,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 32)",
        "(line 514,col 9)-(line 514,col 20)",
        "(line 515,col 9)-(line 515,col 20)",
        "(line 516,col 9)-(line 516,col 32)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 32)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 524,col 9)-(line 524,col 82)",
        "(line 525,col 9)-(line 525,col 82)",
        "(line 526,col 9)-(line 526,col 81)",
        "(line 527,col 9)-(line 527,col 81)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 81)",
        "(line 531,col 9)-(line 531,col 81)",
        "(line 533,col 9)-(line 533,col 81)",
        "(line 534,col 9)-(line 534,col 98)",
        "(line 535,col 9)-(line 535,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 538,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 36)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 543,col 36)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 36)",
        "(line 547,col 9)-(line 547,col 20)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 551,col 9)-(line 551,col 82)",
        "(line 552,col 9)-(line 552,col 82)",
        "(line 553,col 9)-(line 553,col 81)",
        "(line 554,col 9)-(line 554,col 81)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 81)",
        "(line 558,col 9)-(line 558,col 81)",
        "(line 560,col 9)-(line 560,col 81)",
        "(line 561,col 9)-(line 561,col 102)",
        "(line 562,col 9)-(line 562,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 565,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 34)",
        "(line 568,col 9)-(line 568,col 20)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 34)",
        "(line 571,col 9)-(line 571,col 20)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 34)",
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 578,col 9)-(line 578,col 82)",
        "(line 579,col 9)-(line 579,col 82)",
        "(line 580,col 9)-(line 580,col 81)",
        "(line 581,col 9)-(line 581,col 81)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 584,col 9)-(line 584,col 81)",
        "(line 585,col 9)-(line 585,col 81)",
        "(line 587,col 9)-(line 587,col 81)",
        "(line 588,col 9)-(line 588,col 100)",
        "(line 589,col 9)-(line 589,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 592,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 34)",
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 596,col 20)",
        "(line 597,col 9)-(line 597,col 34)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 20)",
        "(line 600,col 9)-(line 600,col 34)",
        "(line 601,col 9)-(line 601,col 20)",
        "(line 602,col 9)-(line 602,col 20)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 605,col 9)-(line 605,col 82)",
        "(line 606,col 9)-(line 606,col 82)",
        "(line 607,col 9)-(line 607,col 81)",
        "(line 608,col 9)-(line 608,col 81)",
        "(line 610,col 9)-(line 610,col 20)",
        "(line 611,col 9)-(line 611,col 81)",
        "(line 612,col 9)-(line 612,col 81)",
        "(line 614,col 9)-(line 614,col 81)",
        "(line 615,col 9)-(line 615,col 100)",
        "(line 616,col 9)-(line 616,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 619,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 38)",
        "(line 622,col 9)-(line 622,col 20)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 624,col 38)",
        "(line 625,col 9)-(line 625,col 20)",
        "(line 626,col 9)-(line 626,col 20)",
        "(line 627,col 9)-(line 627,col 38)",
        "(line 628,col 9)-(line 628,col 20)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 632,col 9)-(line 632,col 82)",
        "(line 633,col 9)-(line 633,col 82)",
        "(line 634,col 9)-(line 634,col 81)",
        "(line 635,col 9)-(line 635,col 81)",
        "(line 637,col 9)-(line 637,col 20)",
        "(line 638,col 9)-(line 638,col 81)",
        "(line 639,col 9)-(line 639,col 81)",
        "(line 641,col 9)-(line 641,col 81)",
        "(line 642,col 9)-(line 642,col 104)",
        "(line 643,col 9)-(line 643,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 646,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 36)",
        "(line 649,col 9)-(line 649,col 20)",
        "(line 650,col 9)-(line 650,col 20)",
        "(line 651,col 9)-(line 651,col 36)",
        "(line 652,col 9)-(line 652,col 20)",
        "(line 653,col 9)-(line 653,col 20)",
        "(line 654,col 9)-(line 654,col 36)",
        "(line 655,col 9)-(line 655,col 20)",
        "(line 656,col 9)-(line 656,col 20)",
        "(line 657,col 9)-(line 657,col 20)",
        "(line 659,col 9)-(line 659,col 82)",
        "(line 660,col 9)-(line 660,col 82)",
        "(line 661,col 9)-(line 661,col 81)",
        "(line 662,col 9)-(line 662,col 81)",
        "(line 664,col 9)-(line 664,col 20)",
        "(line 665,col 9)-(line 665,col 81)",
        "(line 666,col 9)-(line 666,col 81)",
        "(line 668,col 9)-(line 668,col 81)",
        "(line 669,col 9)-(line 669,col 102)",
        "(line 670,col 9)-(line 670,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 673,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 40)",
        "(line 676,col 9)-(line 676,col 23)",
        "(line 677,col 9)-(line 677,col 24)",
        "(line 678,col 9)-(line 678,col 40)",
        "(line 679,col 9)-(line 679,col 23)",
        "(line 680,col 9)-(line 680,col 24)",
        "(line 681,col 9)-(line 681,col 40)",
        "(line 682,col 9)-(line 682,col 23)",
        "(line 683,col 9)-(line 683,col 24)",
        "(line 684,col 9)-(line 684,col 23)",
        "(line 686,col 9)-(line 686,col 82)",
        "(line 687,col 9)-(line 687,col 82)",
        "(line 688,col 9)-(line 688,col 81)",
        "(line 689,col 9)-(line 689,col 81)",
        "(line 691,col 9)-(line 691,col 23)",
        "(line 692,col 9)-(line 692,col 81)",
        "(line 693,col 9)-(line 693,col 81)",
        "(line 695,col 9)-(line 695,col 81)",
        "(line 696,col 9)-(line 696,col 106)",
        "(line 697,col 9)-(line 697,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 700,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 41)",
        "(line 703,col 9)-(line 703,col 41)",
        "(line 704,col 9)-(line 704,col 41)",
        "(line 705,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 27)",
        "(line 713,col 9)-(line 713,col 27)",
        "(line 715,col 9)-(line 715,col 86)",
        "(line 716,col 9)-(line 716,col 86)",
        "(line 717,col 9)-(line 717,col 85)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 27)",
        "(line 720,col 9)-(line 720,col 85)",
        "(line 721,col 9)-(line 721,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 724,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 39)",
        "(line 727,col 9)-(line 727,col 39)",
        "(line 728,col 9)-(line 728,col 39)",
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 27)",
        "(line 737,col 9)-(line 737,col 27)",
        "(line 739,col 9)-(line 739,col 86)",
        "(line 740,col 9)-(line 740,col 86)",
        "(line 741,col 9)-(line 741,col 85)",
        "(line 742,col 9)-(line 742,col 85)",
        "(line 743,col 9)-(line 743,col 27)",
        "(line 744,col 9)-(line 744,col 85)",
        "(line 745,col 9)-(line 745,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 748,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 43)",
        "(line 751,col 9)-(line 751,col 43)",
        "(line 752,col 9)-(line 752,col 43)",
        "(line 753,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 27)",
        "(line 761,col 9)-(line 761,col 27)",
        "(line 763,col 9)-(line 763,col 86)",
        "(line 764,col 9)-(line 764,col 86)",
        "(line 765,col 9)-(line 765,col 85)",
        "(line 766,col 9)-(line 766,col 85)",
        "(line 767,col 9)-(line 767,col 27)",
        "(line 768,col 9)-(line 768,col 85)",
        "(line 769,col 9)-(line 769,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 772,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 41)",
        "(line 775,col 9)-(line 775,col 41)",
        "(line 776,col 9)-(line 776,col 41)",
        "(line 777,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 27)",
        "(line 785,col 9)-(line 785,col 27)",
        "(line 787,col 9)-(line 787,col 86)",
        "(line 788,col 9)-(line 788,col 86)",
        "(line 789,col 9)-(line 789,col 85)",
        "(line 790,col 9)-(line 790,col 85)",
        "(line 791,col 9)-(line 791,col 27)",
        "(line 792,col 9)-(line 792,col 85)",
        "(line 793,col 9)-(line 793,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 796,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 41)",
        "(line 799,col 9)-(line 799,col 41)",
        "(line 800,col 9)-(line 800,col 41)",
        "(line 801,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 27)",
        "(line 809,col 9)-(line 809,col 27)",
        "(line 811,col 9)-(line 811,col 86)",
        "(line 812,col 9)-(line 812,col 86)",
        "(line 813,col 9)-(line 813,col 85)",
        "(line 814,col 9)-(line 814,col 85)",
        "(line 815,col 9)-(line 815,col 27)",
        "(line 816,col 9)-(line 816,col 85)",
        "(line 817,col 9)-(line 817,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 820,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 43)",
        "(line 823,col 9)-(line 823,col 43)",
        "(line 824,col 9)-(line 824,col 43)",
        "(line 825,col 9)-(line 831,col 9)",
        "(line 832,col 9)-(line 832,col 27)",
        "(line 833,col 9)-(line 833,col 27)",
        "(line 835,col 9)-(line 835,col 86)",
        "(line 836,col 9)-(line 836,col 86)",
        "(line 837,col 9)-(line 837,col 85)",
        "(line 838,col 9)-(line 838,col 85)",
        "(line 839,col 9)-(line 839,col 27)",
        "(line 840,col 9)-(line 840,col 85)",
        "(line 841,col 9)-(line 841,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 844,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 45)",
        "(line 847,col 9)-(line 847,col 45)",
        "(line 848,col 9)-(line 848,col 45)",
        "(line 849,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 27)",
        "(line 857,col 9)-(line 857,col 27)",
        "(line 859,col 9)-(line 859,col 86)",
        "(line 860,col 9)-(line 860,col 86)",
        "(line 861,col 9)-(line 861,col 85)",
        "(line 862,col 9)-(line 862,col 85)",
        "(line 863,col 9)-(line 863,col 27)",
        "(line 864,col 9)-(line 864,col 85)",
        "(line 865,col 9)-(line 865,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 868,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 47)",
        "(line 871,col 9)-(line 871,col 47)",
        "(line 872,col 9)-(line 872,col 47)",
        "(line 873,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 29)",
        "(line 881,col 9)-(line 881,col 29)",
        "(line 883,col 9)-(line 883,col 86)",
        "(line 884,col 9)-(line 884,col 86)",
        "(line 885,col 9)-(line 885,col 85)",
        "(line 886,col 9)-(line 886,col 85)",
        "(line 887,col 9)-(line 887,col 28)",
        "(line 888,col 9)-(line 888,col 85)",
        "(line 889,col 9)-(line 889,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 892,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 40)",
        "(line 895,col 9)-(line 895,col 40)",
        "(line 896,col 9)-(line 896,col 40)",
        "(line 897,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 27)",
        "(line 908,col 9)-(line 908,col 27)",
        "(line 911,col 9)-(line 911,col 86)",
        "(line 912,col 9)-(line 912,col 86)",
        "(line 913,col 9)-(line 913,col 85)",
        "(line 914,col 9)-(line 914,col 85)",
        "(line 915,col 9)-(line 915,col 27)",
        "(line 916,col 9)-(line 916,col 85)",
        "(line 917,col 9)-(line 917,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 920,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 40)",
        "(line 923,col 9)-(line 923,col 40)",
        "(line 924,col 9)-(line 924,col 40)",
        "(line 925,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 36)",
        "(line 936,col 9)-(line 936,col 36)",
        "(line 937,col 9)-(line 937,col 86)",
        "(line 938,col 9)-(line 938,col 86)",
        "(line 939,col 9)-(line 939,col 85)",
        "(line 940,col 9)-(line 940,col 85)",
        "(line 941,col 9)-(line 941,col 38)",
        "(line 942,col 9)-(line 942,col 85)",
        "(line 943,col 9)-(line 943,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 946,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 48)",
        "(line 949,col 9)-(line 949,col 38)",
        "(line 950,col 9)-(line 950,col 38)",
        "(line 951,col 9)-(line 951,col 48)",
        "(line 952,col 9)-(line 952,col 38)",
        "(line 953,col 9)-(line 953,col 38)",
        "(line 954,col 9)-(line 954,col 48)",
        "(line 955,col 9)-(line 955,col 38)",
        "(line 956,col 9)-(line 956,col 38)",
        "(line 957,col 9)-(line 957,col 38)",
        "(line 959,col 9)-(line 959,col 29)",
        "(line 960,col 9)-(line 960,col 29)",
        "(line 961,col 9)-(line 961,col 29)",
        "(line 963,col 9)-(line 963,col 82)",
        "(line 964,col 9)-(line 964,col 82)",
        "(line 965,col 9)-(line 965,col 81)",
        "(line 966,col 9)-(line 966,col 81)",
        "(line 968,col 9)-(line 968,col 38)",
        "(line 969,col 9)-(line 969,col 81)",
        "(line 970,col 9)-(line 970,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 973,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 36)",
        "(line 976,col 9)-(line 976,col 23)",
        "(line 977,col 9)-(line 977,col 23)",
        "(line 978,col 9)-(line 978,col 36)",
        "(line 979,col 9)-(line 979,col 23)",
        "(line 980,col 9)-(line 980,col 23)",
        "(line 981,col 9)-(line 981,col 36)",
        "(line 982,col 9)-(line 982,col 23)",
        "(line 983,col 9)-(line 983,col 23)",
        "(line 984,col 9)-(line 984,col 23)",
        "(line 985,col 9)-(line 985,col 29)",
        "(line 986,col 9)-(line 986,col 29)",
        "(line 987,col 9)-(line 987,col 29)",
        "(line 988,col 9)-(line 988,col 82)",
        "(line 989,col 9)-(line 989,col 82)",
        "(line 990,col 9)-(line 990,col 81)",
        "(line 991,col 9)-(line 991,col 81)",
        "(line 993,col 9)-(line 993,col 22)",
        "(line 994,col 9)-(line 994,col 81)",
        "(line 995,col 9)-(line 995,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 998,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 34)",
        "(line 1001,col 9)-(line 1001,col 22)",
        "(line 1002,col 9)-(line 1002,col 22)",
        "(line 1003,col 9)-(line 1003,col 34)",
        "(line 1004,col 9)-(line 1004,col 22)",
        "(line 1005,col 9)-(line 1005,col 22)",
        "(line 1006,col 9)-(line 1006,col 34)",
        "(line 1007,col 9)-(line 1007,col 22)",
        "(line 1008,col 9)-(line 1008,col 22)",
        "(line 1009,col 9)-(line 1009,col 22)",
        "(line 1010,col 9)-(line 1010,col 29)",
        "(line 1011,col 9)-(line 1011,col 29)",
        "(line 1012,col 9)-(line 1012,col 29)",
        "(line 1013,col 9)-(line 1013,col 82)",
        "(line 1014,col 9)-(line 1014,col 82)",
        "(line 1015,col 9)-(line 1015,col 81)",
        "(line 1016,col 9)-(line 1016,col 81)",
        "(line 1018,col 9)-(line 1018,col 22)",
        "(line 1019,col 9)-(line 1019,col 81)",
        "(line 1020,col 9)-(line 1020,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 1023,
      "end_line": 1046,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 38)",
        "(line 1026,col 9)-(line 1026,col 22)",
        "(line 1027,col 9)-(line 1027,col 22)",
        "(line 1028,col 9)-(line 1028,col 38)",
        "(line 1029,col 9)-(line 1029,col 22)",
        "(line 1030,col 9)-(line 1030,col 22)",
        "(line 1031,col 9)-(line 1031,col 38)",
        "(line 1032,col 9)-(line 1032,col 22)",
        "(line 1033,col 9)-(line 1033,col 22)",
        "(line 1034,col 9)-(line 1034,col 22)",
        "(line 1035,col 9)-(line 1035,col 29)",
        "(line 1036,col 9)-(line 1036,col 29)",
        "(line 1037,col 9)-(line 1037,col 29)",
        "(line 1038,col 9)-(line 1038,col 82)",
        "(line 1039,col 9)-(line 1039,col 82)",
        "(line 1040,col 9)-(line 1040,col 81)",
        "(line 1041,col 9)-(line 1041,col 81)",
        "(line 1043,col 9)-(line 1043,col 22)",
        "(line 1044,col 9)-(line 1044,col 81)",
        "(line 1045,col 9)-(line 1045,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1048,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 36)",
        "(line 1051,col 9)-(line 1051,col 22)",
        "(line 1052,col 9)-(line 1052,col 22)",
        "(line 1053,col 9)-(line 1053,col 36)",
        "(line 1054,col 9)-(line 1054,col 22)",
        "(line 1055,col 9)-(line 1055,col 22)",
        "(line 1056,col 9)-(line 1056,col 36)",
        "(line 1057,col 9)-(line 1057,col 22)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 22)",
        "(line 1060,col 9)-(line 1060,col 29)",
        "(line 1061,col 9)-(line 1061,col 29)",
        "(line 1062,col 9)-(line 1062,col 29)",
        "(line 1063,col 9)-(line 1063,col 82)",
        "(line 1064,col 9)-(line 1064,col 82)",
        "(line 1065,col 9)-(line 1065,col 81)",
        "(line 1066,col 9)-(line 1066,col 81)",
        "(line 1068,col 9)-(line 1068,col 22)",
        "(line 1069,col 9)-(line 1069,col 81)",
        "(line 1070,col 9)-(line 1070,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1073,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 36)",
        "(line 1076,col 9)-(line 1076,col 22)",
        "(line 1077,col 9)-(line 1077,col 22)",
        "(line 1078,col 9)-(line 1078,col 36)",
        "(line 1079,col 9)-(line 1079,col 22)",
        "(line 1080,col 9)-(line 1080,col 22)",
        "(line 1081,col 9)-(line 1081,col 36)",
        "(line 1082,col 9)-(line 1082,col 22)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 22)",
        "(line 1085,col 9)-(line 1085,col 29)",
        "(line 1086,col 9)-(line 1086,col 29)",
        "(line 1087,col 9)-(line 1087,col 29)",
        "(line 1088,col 9)-(line 1088,col 82)",
        "(line 1089,col 9)-(line 1089,col 82)",
        "(line 1090,col 9)-(line 1090,col 81)",
        "(line 1091,col 9)-(line 1091,col 81)",
        "(line 1093,col 9)-(line 1093,col 22)",
        "(line 1094,col 9)-(line 1094,col 81)",
        "(line 1095,col 9)-(line 1095,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1098,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 40)",
        "(line 1101,col 9)-(line 1101,col 22)",
        "(line 1102,col 9)-(line 1102,col 22)",
        "(line 1103,col 9)-(line 1103,col 40)",
        "(line 1104,col 9)-(line 1104,col 22)",
        "(line 1105,col 9)-(line 1105,col 22)",
        "(line 1106,col 9)-(line 1106,col 40)",
        "(line 1107,col 9)-(line 1107,col 22)",
        "(line 1108,col 9)-(line 1108,col 22)",
        "(line 1109,col 9)-(line 1109,col 22)",
        "(line 1110,col 9)-(line 1110,col 29)",
        "(line 1111,col 9)-(line 1111,col 29)",
        "(line 1112,col 9)-(line 1112,col 29)",
        "(line 1113,col 9)-(line 1113,col 82)",
        "(line 1114,col 9)-(line 1114,col 82)",
        "(line 1115,col 9)-(line 1115,col 81)",
        "(line 1116,col 9)-(line 1116,col 81)",
        "(line 1118,col 9)-(line 1118,col 22)",
        "(line 1119,col 9)-(line 1119,col 81)",
        "(line 1120,col 9)-(line 1120,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1123,
      "end_line": 1146,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 38)",
        "(line 1126,col 9)-(line 1126,col 22)",
        "(line 1127,col 9)-(line 1127,col 22)",
        "(line 1128,col 9)-(line 1128,col 38)",
        "(line 1129,col 9)-(line 1129,col 22)",
        "(line 1130,col 9)-(line 1130,col 22)",
        "(line 1131,col 9)-(line 1131,col 38)",
        "(line 1132,col 9)-(line 1132,col 22)",
        "(line 1133,col 9)-(line 1133,col 22)",
        "(line 1134,col 9)-(line 1134,col 22)",
        "(line 1135,col 9)-(line 1135,col 29)",
        "(line 1136,col 9)-(line 1136,col 29)",
        "(line 1137,col 9)-(line 1137,col 29)",
        "(line 1138,col 9)-(line 1138,col 82)",
        "(line 1139,col 9)-(line 1139,col 82)",
        "(line 1140,col 9)-(line 1140,col 81)",
        "(line 1141,col 9)-(line 1141,col 81)",
        "(line 1143,col 9)-(line 1143,col 22)",
        "(line 1144,col 9)-(line 1144,col 81)",
        "(line 1145,col 9)-(line 1145,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1148,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 42)",
        "(line 1151,col 9)-(line 1151,col 25)",
        "(line 1152,col 9)-(line 1152,col 26)",
        "(line 1153,col 9)-(line 1153,col 42)",
        "(line 1154,col 9)-(line 1154,col 25)",
        "(line 1155,col 9)-(line 1155,col 26)",
        "(line 1156,col 9)-(line 1156,col 42)",
        "(line 1157,col 9)-(line 1157,col 25)",
        "(line 1158,col 9)-(line 1158,col 26)",
        "(line 1159,col 9)-(line 1159,col 25)",
        "(line 1160,col 9)-(line 1160,col 29)",
        "(line 1161,col 9)-(line 1161,col 29)",
        "(line 1162,col 9)-(line 1162,col 29)",
        "(line 1163,col 9)-(line 1163,col 82)",
        "(line 1164,col 9)-(line 1164,col 82)",
        "(line 1165,col 9)-(line 1165,col 81)",
        "(line 1166,col 9)-(line 1166,col 81)",
        "(line 1168,col 9)-(line 1168,col 25)",
        "(line 1169,col 9)-(line 1169,col 81)",
        "(line 1170,col 9)-(line 1170,col 81)"
      ]
    }
  ]
}