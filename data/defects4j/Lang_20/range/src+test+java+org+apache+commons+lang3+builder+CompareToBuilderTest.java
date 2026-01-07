{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/builder/CompareToBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompareToBuilderTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 1125,
      "comment": "\n * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.CompareToBuilderTest(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 20)"
      ]
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
        "(line 50,col 13)-(line 50,col 32)"
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
        "(line 61,col 13)-(line 61,col 59)"
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
        "(line 83,col 13)-(line 83,col 51)"
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
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 42)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 122,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields()",
      "begin_line": 129,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 54)",
        "(line 131,col 9)-(line 131,col 60)",
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 24)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 60)",
        "(line 142,col 9)-(line 142,col 36)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 144,col 9)-(line 144,col 36)",
        "(line 145,col 9)-(line 145,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients()",
      "begin_line": 148,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 51)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 33)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 156,col 45)",
        "(line 157,col 9)-(line 157,col 45)",
        "(line 158,col 9)-(line 158,col 51)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 161,col 45)",
        "(line 162,col 9)-(line 162,col 45)",
        "(line 163,col 9)-(line 163,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertXYZCompareOrder(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 166,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 103)",
        "(line 168,col 9)-(line 168,col 103)",
        "(line 169,col 9)-(line 169,col 103)",
        "(line 171,col 9)-(line 171,col 102)",
        "(line 172,col 9)-(line 172,col 102)",
        "(line 173,col 9)-(line 173,col 102)",
        "(line 175,col 9)-(line 175,col 102)",
        "(line 176,col 9)-(line 176,col 102)",
        "(line 177,col 9)-(line 177,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare(boolean, java.lang.String[])",
      "begin_line": 180,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 182,col 43)",
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 188,col 9)-(line 188,col 77)",
        "(line 189,col 9)-(line 189,col 77)",
        "(line 190,col 9)-(line 190,col 80)",
        "(line 191,col 9)-(line 191,col 80)",
        "(line 192,col 9)-(line 192,col 77)",
        "(line 194,col 9)-(line 194,col 107)",
        "(line 195,col 9)-(line 195,col 107)",
        "(line 198,col 9)-(line 198,col 57)",
        "(line 200,col 9)-(line 200,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.assertReflectionCompareContract(java.lang.Object, java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 212,
      "end_line": 230,
      "comment": "\n     * See \"Effective Java\" under \"Consider Implementing Comparable\".\n     *  \n     * @param x an object to compare \n     * @param y an object to compare\n     * @param z an object to compare\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 146)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 140)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.reflectionCompareSignum(java.lang.Object, java.lang.Object, boolean, java.lang.String[])",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns the signum of the result of comparing x and y with\n     * \u003ccode\u003eCompareToBuilder.reflectionCompare\u003c/code\u003e\n     * \n     * @param lhs The \"left-hand-side\" of the comparison.\n     * @param rhs The \"right-hand-side\" of the comparison.\n     * @param testTransients Whether to include transients in the comparison\n     * @param excludeFields fields to exclude\n     * @return int The signum\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper()",
      "begin_line": 246,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 42)",
        "(line 248,col 9)-(line 248,col 42)",
        "(line 249,col 9)-(line 249,col 93)",
        "(line 250,col 9)-(line 250,col 92)",
        "(line 251,col 9)-(line 251,col 92)",
        "(line 253,col 9)-(line 253,col 93)",
        "(line 254,col 9)-(line 254,col 93)",
        "(line 256,col 9)-(line 256,col 92)",
        "(line 257,col 9)-(line 257,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObject()",
      "begin_line": 260,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 42)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 263,col 9)-(line 263,col 78)",
        "(line 264,col 9)-(line 264,col 78)",
        "(line 265,col 9)-(line 265,col 19)",
        "(line 266,col 9)-(line 266,col 77)",
        "(line 267,col 9)-(line 267,col 77)",
        "(line 269,col 9)-(line 269,col 79)",
        "(line 270,col 9)-(line 270,col 100)",
        "(line 271,col 9)-(line 271,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild()",
      "begin_line": 274,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 42)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 71)",
        "(line 278,col 9)-(line 278,col 71)",
        "(line 279,col 9)-(line 279,col 19)",
        "(line 280,col 9)-(line 280,col 70)",
        "(line 281,col 9)-(line 281,col 70)",
        "(line 283,col 9)-(line 283,col 72)",
        "(line 284,col 9)-(line 284,col 93)",
        "(line 285,col 9)-(line 285,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2()",
      "begin_line": 288,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 42)",
        "(line 290,col 9)-(line 290,col 33)",
        "(line 291,col 9)-(line 294,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator()",
      "begin_line": 297,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 299,col 27)",
        "(line 300,col 9)-(line 300,col 109)",
        "(line 301,col 9)-(line 301,col 109)",
        "(line 302,col 9)-(line 302,col 20)",
        "(line 303,col 9)-(line 303,col 109)",
        "(line 304,col 9)-(line 304,col 109)",
        "(line 305,col 9)-(line 305,col 21)",
        "(line 306,col 9)-(line 306,col 108)",
        "(line 307,col 9)-(line 307,col 108)",
        "(line 309,col 9)-(line 309,col 110)",
        "(line 310,col 9)-(line 310,col 131)",
        "(line 311,col 9)-(line 311,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull()",
      "begin_line": 314,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 27)",
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 317,col 84)",
        "(line 318,col 9)-(line 318,col 84)",
        "(line 319,col 9)-(line 319,col 21)",
        "(line 320,col 9)-(line 320,col 83)",
        "(line 321,col 9)-(line 321,col 83)",
        "(line 323,col 9)-(line 323,col 85)",
        "(line 324,col 9)-(line 324,col 106)",
        "(line 325,col 9)-(line 325,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLong()",
      "begin_line": 328,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 21)",
        "(line 330,col 9)-(line 330,col 21)",
        "(line 331,col 9)-(line 331,col 78)",
        "(line 332,col 9)-(line 332,col 77)",
        "(line 333,col 9)-(line 333,col 77)",
        "(line 334,col 9)-(line 334,col 89)",
        "(line 335,col 9)-(line 335,col 89)",
        "(line 336,col 9)-(line 336,col 89)",
        "(line 337,col 9)-(line 337,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testInt()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 19)",
        "(line 342,col 9)-(line 342,col 19)",
        "(line 343,col 9)-(line 343,col 78)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 77)",
        "(line 346,col 9)-(line 346,col 92)",
        "(line 347,col 9)-(line 347,col 92)",
        "(line 348,col 9)-(line 348,col 92)",
        "(line 349,col 9)-(line 349,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShort()",
      "begin_line": 352,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 21)",
        "(line 354,col 9)-(line 354,col 21)",
        "(line 355,col 9)-(line 355,col 78)",
        "(line 356,col 9)-(line 356,col 77)",
        "(line 357,col 9)-(line 357,col 77)",
        "(line 358,col 9)-(line 358,col 90)",
        "(line 359,col 9)-(line 359,col 90)",
        "(line 360,col 9)-(line 360,col 90)",
        "(line 361,col 9)-(line 361,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testChar()",
      "begin_line": 364,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 20)",
        "(line 366,col 9)-(line 366,col 20)",
        "(line 367,col 9)-(line 367,col 78)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 77)",
        "(line 370,col 9)-(line 370,col 94)",
        "(line 371,col 9)-(line 371,col 94)",
        "(line 372,col 9)-(line 372,col 94)",
        "(line 373,col 9)-(line 373,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByte()",
      "begin_line": 376,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 20)",
        "(line 378,col 9)-(line 378,col 20)",
        "(line 379,col 9)-(line 379,col 78)",
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 77)",
        "(line 382,col 9)-(line 382,col 89)",
        "(line 383,col 9)-(line 383,col 89)",
        "(line 384,col 9)-(line 384,col 89)",
        "(line 385,col 9)-(line 385,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble()",
      "begin_line": 388,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 22)",
        "(line 390,col 9)-(line 390,col 22)",
        "(line 391,col 9)-(line 391,col 78)",
        "(line 392,col 9)-(line 392,col 77)",
        "(line 393,col 9)-(line 393,col 77)",
        "(line 394,col 9)-(line 394,col 91)",
        "(line 395,col 9)-(line 395,col 91)",
        "(line 396,col 9)-(line 396,col 91)",
        "(line 397,col 9)-(line 397,col 91)",
        "(line 398,col 9)-(line 398,col 94)",
        "(line 399,col 9)-(line 399,col 99)",
        "(line 400,col 9)-(line 400,col 113)",
        "(line 401,col 9)-(line 401,col 113)",
        "(line 402,col 9)-(line 402,col 85)",
        "(line 403,col 9)-(line 403,col 85)",
        "(line 404,col 9)-(line 404,col 80)",
        "(line 405,col 9)-(line 405,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat()",
      "begin_line": 408,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 21)",
        "(line 410,col 9)-(line 410,col 21)",
        "(line 411,col 9)-(line 411,col 78)",
        "(line 412,col 9)-(line 412,col 77)",
        "(line 413,col 9)-(line 413,col 77)",
        "(line 414,col 9)-(line 414,col 90)",
        "(line 415,col 9)-(line 415,col 90)",
        "(line 416,col 9)-(line 416,col 90)",
        "(line 417,col 9)-(line 417,col 90)",
        "(line 418,col 9)-(line 418,col 92)",
        "(line 419,col 9)-(line 419,col 97)",
        "(line 420,col 9)-(line 420,col 111)",
        "(line 421,col 9)-(line 421,col 111)",
        "(line 422,col 9)-(line 422,col 84)",
        "(line 423,col 9)-(line 423,col 84)",
        "(line 424,col 9)-(line 424,col 80)",
        "(line 425,col 9)-(line 425,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean()",
      "begin_line": 428,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 26)",
        "(line 430,col 9)-(line 430,col 27)",
        "(line 431,col 9)-(line 431,col 78)",
        "(line 432,col 9)-(line 432,col 78)",
        "(line 433,col 9)-(line 433,col 77)",
        "(line 434,col 9)-(line 434,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray()",
      "begin_line": 437,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 46)",
        "(line 439,col 9)-(line 439,col 36)",
        "(line 440,col 9)-(line 440,col 36)",
        "(line 441,col 9)-(line 441,col 46)",
        "(line 442,col 9)-(line 442,col 36)",
        "(line 443,col 9)-(line 443,col 36)",
        "(line 444,col 9)-(line 444,col 46)",
        "(line 445,col 9)-(line 445,col 36)",
        "(line 446,col 9)-(line 446,col 36)",
        "(line 447,col 9)-(line 447,col 36)",
        "(line 449,col 9)-(line 449,col 82)",
        "(line 450,col 9)-(line 450,col 82)",
        "(line 451,col 9)-(line 451,col 81)",
        "(line 452,col 9)-(line 452,col 81)",
        "(line 454,col 9)-(line 454,col 36)",
        "(line 455,col 9)-(line 455,col 81)",
        "(line 456,col 9)-(line 456,col 81)",
        "(line 458,col 9)-(line 458,col 81)",
        "(line 459,col 9)-(line 459,col 104)",
        "(line 460,col 9)-(line 460,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray()",
      "begin_line": 463,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 34)",
        "(line 465,col 9)-(line 465,col 21)",
        "(line 466,col 9)-(line 466,col 21)",
        "(line 467,col 9)-(line 467,col 34)",
        "(line 468,col 9)-(line 468,col 21)",
        "(line 469,col 9)-(line 469,col 21)",
        "(line 470,col 9)-(line 470,col 34)",
        "(line 471,col 9)-(line 471,col 21)",
        "(line 472,col 9)-(line 472,col 21)",
        "(line 473,col 9)-(line 473,col 21)",
        "(line 475,col 9)-(line 475,col 82)",
        "(line 476,col 9)-(line 476,col 82)",
        "(line 477,col 9)-(line 477,col 81)",
        "(line 478,col 9)-(line 478,col 81)",
        "(line 480,col 9)-(line 480,col 20)",
        "(line 481,col 9)-(line 481,col 81)",
        "(line 482,col 9)-(line 482,col 81)",
        "(line 484,col 9)-(line 484,col 81)",
        "(line 485,col 9)-(line 485,col 100)",
        "(line 486,col 9)-(line 486,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray()",
      "begin_line": 489,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 20)",
        "(line 492,col 9)-(line 492,col 20)",
        "(line 493,col 9)-(line 493,col 32)",
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 32)",
        "(line 497,col 9)-(line 497,col 20)",
        "(line 498,col 9)-(line 498,col 20)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 501,col 9)-(line 501,col 82)",
        "(line 502,col 9)-(line 502,col 82)",
        "(line 503,col 9)-(line 503,col 81)",
        "(line 504,col 9)-(line 504,col 81)",
        "(line 506,col 9)-(line 506,col 20)",
        "(line 507,col 9)-(line 507,col 81)",
        "(line 508,col 9)-(line 508,col 81)",
        "(line 510,col 9)-(line 510,col 81)",
        "(line 511,col 9)-(line 511,col 98)",
        "(line 512,col 9)-(line 512,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray()",
      "begin_line": 515,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 36)",
        "(line 517,col 9)-(line 517,col 20)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 36)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 20)",
        "(line 522,col 9)-(line 522,col 36)",
        "(line 523,col 9)-(line 523,col 20)",
        "(line 524,col 9)-(line 524,col 20)",
        "(line 525,col 9)-(line 525,col 20)",
        "(line 527,col 9)-(line 527,col 82)",
        "(line 528,col 9)-(line 528,col 82)",
        "(line 529,col 9)-(line 529,col 81)",
        "(line 530,col 9)-(line 530,col 81)",
        "(line 532,col 9)-(line 532,col 20)",
        "(line 533,col 9)-(line 533,col 81)",
        "(line 534,col 9)-(line 534,col 81)",
        "(line 536,col 9)-(line 536,col 81)",
        "(line 537,col 9)-(line 537,col 102)",
        "(line 538,col 9)-(line 538,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray()",
      "begin_line": 541,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 34)",
        "(line 543,col 9)-(line 543,col 20)",
        "(line 544,col 9)-(line 544,col 20)",
        "(line 545,col 9)-(line 545,col 34)",
        "(line 546,col 9)-(line 546,col 20)",
        "(line 547,col 9)-(line 547,col 20)",
        "(line 548,col 9)-(line 548,col 34)",
        "(line 549,col 9)-(line 549,col 20)",
        "(line 550,col 9)-(line 550,col 20)",
        "(line 551,col 9)-(line 551,col 20)",
        "(line 553,col 9)-(line 553,col 82)",
        "(line 554,col 9)-(line 554,col 82)",
        "(line 555,col 9)-(line 555,col 81)",
        "(line 556,col 9)-(line 556,col 81)",
        "(line 558,col 9)-(line 558,col 20)",
        "(line 559,col 9)-(line 559,col 81)",
        "(line 560,col 9)-(line 560,col 81)",
        "(line 562,col 9)-(line 562,col 81)",
        "(line 563,col 9)-(line 563,col 100)",
        "(line 564,col 9)-(line 564,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray()",
      "begin_line": 567,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 34)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 20)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 573,col 9)-(line 573,col 20)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 579,col 9)-(line 579,col 82)",
        "(line 580,col 9)-(line 580,col 82)",
        "(line 581,col 9)-(line 581,col 81)",
        "(line 582,col 9)-(line 582,col 81)",
        "(line 584,col 9)-(line 584,col 20)",
        "(line 585,col 9)-(line 585,col 81)",
        "(line 586,col 9)-(line 586,col 81)",
        "(line 588,col 9)-(line 588,col 81)",
        "(line 589,col 9)-(line 589,col 100)",
        "(line 590,col 9)-(line 590,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray()",
      "begin_line": 593,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 38)",
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 596,col 20)",
        "(line 597,col 9)-(line 597,col 38)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 20)",
        "(line 600,col 9)-(line 600,col 38)",
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
        "(line 615,col 9)-(line 615,col 104)",
        "(line 616,col 9)-(line 616,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray()",
      "begin_line": 619,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 36)",
        "(line 621,col 9)-(line 621,col 20)",
        "(line 622,col 9)-(line 622,col 20)",
        "(line 623,col 9)-(line 623,col 36)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 20)",
        "(line 626,col 9)-(line 626,col 36)",
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
        "(line 641,col 9)-(line 641,col 102)",
        "(line 642,col 9)-(line 642,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray()",
      "begin_line": 645,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 40)",
        "(line 647,col 9)-(line 647,col 23)",
        "(line 648,col 9)-(line 648,col 24)",
        "(line 649,col 9)-(line 649,col 40)",
        "(line 650,col 9)-(line 650,col 23)",
        "(line 651,col 9)-(line 651,col 24)",
        "(line 652,col 9)-(line 652,col 40)",
        "(line 653,col 9)-(line 653,col 23)",
        "(line 654,col 9)-(line 654,col 24)",
        "(line 655,col 9)-(line 655,col 23)",
        "(line 657,col 9)-(line 657,col 82)",
        "(line 658,col 9)-(line 658,col 82)",
        "(line 659,col 9)-(line 659,col 81)",
        "(line 660,col 9)-(line 660,col 81)",
        "(line 662,col 9)-(line 662,col 23)",
        "(line 663,col 9)-(line 663,col 81)",
        "(line 664,col 9)-(line 664,col 81)",
        "(line 666,col 9)-(line 666,col 81)",
        "(line 667,col 9)-(line 667,col 106)",
        "(line 668,col 9)-(line 668,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray()",
      "begin_line": 671,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 41)",
        "(line 673,col 9)-(line 673,col 41)",
        "(line 674,col 9)-(line 674,col 41)",
        "(line 675,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 27)",
        "(line 683,col 9)-(line 683,col 27)",
        "(line 685,col 9)-(line 685,col 86)",
        "(line 686,col 9)-(line 686,col 86)",
        "(line 687,col 9)-(line 687,col 85)",
        "(line 688,col 9)-(line 688,col 85)",
        "(line 689,col 9)-(line 689,col 27)",
        "(line 690,col 9)-(line 690,col 85)",
        "(line 691,col 9)-(line 691,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray()",
      "begin_line": 694,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 39)",
        "(line 696,col 9)-(line 696,col 39)",
        "(line 697,col 9)-(line 697,col 39)",
        "(line 698,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 27)",
        "(line 706,col 9)-(line 706,col 27)",
        "(line 708,col 9)-(line 708,col 86)",
        "(line 709,col 9)-(line 709,col 86)",
        "(line 710,col 9)-(line 710,col 85)",
        "(line 711,col 9)-(line 711,col 85)",
        "(line 712,col 9)-(line 712,col 27)",
        "(line 713,col 9)-(line 713,col 85)",
        "(line 714,col 9)-(line 714,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray()",
      "begin_line": 717,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 43)",
        "(line 719,col 9)-(line 719,col 43)",
        "(line 720,col 9)-(line 720,col 43)",
        "(line 721,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 27)",
        "(line 729,col 9)-(line 729,col 27)",
        "(line 731,col 9)-(line 731,col 86)",
        "(line 732,col 9)-(line 732,col 86)",
        "(line 733,col 9)-(line 733,col 85)",
        "(line 734,col 9)-(line 734,col 85)",
        "(line 735,col 9)-(line 735,col 27)",
        "(line 736,col 9)-(line 736,col 85)",
        "(line 737,col 9)-(line 737,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray()",
      "begin_line": 740,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 41)",
        "(line 742,col 9)-(line 742,col 41)",
        "(line 743,col 9)-(line 743,col 41)",
        "(line 744,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 27)",
        "(line 752,col 9)-(line 752,col 27)",
        "(line 754,col 9)-(line 754,col 86)",
        "(line 755,col 9)-(line 755,col 86)",
        "(line 756,col 9)-(line 756,col 85)",
        "(line 757,col 9)-(line 757,col 85)",
        "(line 758,col 9)-(line 758,col 27)",
        "(line 759,col 9)-(line 759,col 85)",
        "(line 760,col 9)-(line 760,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray()",
      "begin_line": 763,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 41)",
        "(line 765,col 9)-(line 765,col 41)",
        "(line 766,col 9)-(line 766,col 41)",
        "(line 767,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 27)",
        "(line 775,col 9)-(line 775,col 27)",
        "(line 777,col 9)-(line 777,col 86)",
        "(line 778,col 9)-(line 778,col 86)",
        "(line 779,col 9)-(line 779,col 85)",
        "(line 780,col 9)-(line 780,col 85)",
        "(line 781,col 9)-(line 781,col 27)",
        "(line 782,col 9)-(line 782,col 85)",
        "(line 783,col 9)-(line 783,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray()",
      "begin_line": 786,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 43)",
        "(line 788,col 9)-(line 788,col 43)",
        "(line 789,col 9)-(line 789,col 43)",
        "(line 790,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 27)",
        "(line 798,col 9)-(line 798,col 27)",
        "(line 800,col 9)-(line 800,col 86)",
        "(line 801,col 9)-(line 801,col 86)",
        "(line 802,col 9)-(line 802,col 85)",
        "(line 803,col 9)-(line 803,col 85)",
        "(line 804,col 9)-(line 804,col 27)",
        "(line 805,col 9)-(line 805,col 85)",
        "(line 806,col 9)-(line 806,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray()",
      "begin_line": 809,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 45)",
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 27)",
        "(line 821,col 9)-(line 821,col 27)",
        "(line 823,col 9)-(line 823,col 86)",
        "(line 824,col 9)-(line 824,col 86)",
        "(line 825,col 9)-(line 825,col 85)",
        "(line 826,col 9)-(line 826,col 85)",
        "(line 827,col 9)-(line 827,col 27)",
        "(line 828,col 9)-(line 828,col 85)",
        "(line 829,col 9)-(line 829,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray()",
      "begin_line": 832,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 47)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 835,col 47)",
        "(line 836,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 29)",
        "(line 844,col 9)-(line 844,col 29)",
        "(line 846,col 9)-(line 846,col 86)",
        "(line 847,col 9)-(line 847,col 86)",
        "(line 848,col 9)-(line 848,col 85)",
        "(line 849,col 9)-(line 849,col 85)",
        "(line 850,col 9)-(line 850,col 28)",
        "(line 851,col 9)-(line 851,col 85)",
        "(line 852,col 9)-(line 852,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray()",
      "begin_line": 855,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 40)",
        "(line 857,col 9)-(line 857,col 40)",
        "(line 858,col 9)-(line 858,col 40)",
        "(line 859,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 27)",
        "(line 870,col 9)-(line 870,col 27)",
        "(line 873,col 9)-(line 873,col 86)",
        "(line 874,col 9)-(line 874,col 86)",
        "(line 875,col 9)-(line 875,col 85)",
        "(line 876,col 9)-(line 876,col 85)",
        "(line 877,col 9)-(line 877,col 27)",
        "(line 878,col 9)-(line 878,col 85)",
        "(line 879,col 9)-(line 879,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray()",
      "begin_line": 882,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 40)",
        "(line 884,col 9)-(line 884,col 40)",
        "(line 885,col 9)-(line 885,col 40)",
        "(line 886,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 36)",
        "(line 897,col 9)-(line 897,col 36)",
        "(line 898,col 9)-(line 898,col 86)",
        "(line 899,col 9)-(line 899,col 86)",
        "(line 900,col 9)-(line 900,col 85)",
        "(line 901,col 9)-(line 901,col 85)",
        "(line 902,col 9)-(line 902,col 38)",
        "(line 903,col 9)-(line 903,col 85)",
        "(line 904,col 9)-(line 904,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject()",
      "begin_line": 907,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 48)",
        "(line 909,col 9)-(line 909,col 38)",
        "(line 910,col 9)-(line 910,col 38)",
        "(line 911,col 9)-(line 911,col 48)",
        "(line 912,col 9)-(line 912,col 38)",
        "(line 913,col 9)-(line 913,col 38)",
        "(line 914,col 9)-(line 914,col 48)",
        "(line 915,col 9)-(line 915,col 38)",
        "(line 916,col 9)-(line 916,col 38)",
        "(line 917,col 9)-(line 917,col 38)",
        "(line 919,col 9)-(line 919,col 29)",
        "(line 920,col 9)-(line 920,col 29)",
        "(line 921,col 9)-(line 921,col 29)",
        "(line 923,col 9)-(line 923,col 82)",
        "(line 924,col 9)-(line 924,col 82)",
        "(line 925,col 9)-(line 925,col 81)",
        "(line 926,col 9)-(line 926,col 81)",
        "(line 928,col 9)-(line 928,col 38)",
        "(line 929,col 9)-(line 929,col 81)",
        "(line 930,col 9)-(line 930,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject()",
      "begin_line": 933,
      "end_line": 955,
      "comment": "",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 36)",
        "(line 935,col 9)-(line 935,col 23)",
        "(line 936,col 9)-(line 936,col 23)",
        "(line 937,col 9)-(line 937,col 36)",
        "(line 938,col 9)-(line 938,col 23)",
        "(line 939,col 9)-(line 939,col 23)",
        "(line 940,col 9)-(line 940,col 36)",
        "(line 941,col 9)-(line 941,col 23)",
        "(line 942,col 9)-(line 942,col 23)",
        "(line 943,col 9)-(line 943,col 23)",
        "(line 944,col 9)-(line 944,col 29)",
        "(line 945,col 9)-(line 945,col 29)",
        "(line 946,col 9)-(line 946,col 29)",
        "(line 947,col 9)-(line 947,col 82)",
        "(line 948,col 9)-(line 948,col 82)",
        "(line 949,col 9)-(line 949,col 81)",
        "(line 950,col 9)-(line 950,col 81)",
        "(line 952,col 9)-(line 952,col 22)",
        "(line 953,col 9)-(line 953,col 81)",
        "(line 954,col 9)-(line 954,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject()",
      "begin_line": 957,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 958,col 9)-(line 958,col 34)",
        "(line 959,col 9)-(line 959,col 22)",
        "(line 960,col 9)-(line 960,col 22)",
        "(line 961,col 9)-(line 961,col 34)",
        "(line 962,col 9)-(line 962,col 22)",
        "(line 963,col 9)-(line 963,col 22)",
        "(line 964,col 9)-(line 964,col 34)",
        "(line 965,col 9)-(line 965,col 22)",
        "(line 966,col 9)-(line 966,col 22)",
        "(line 967,col 9)-(line 967,col 22)",
        "(line 968,col 9)-(line 968,col 29)",
        "(line 969,col 9)-(line 969,col 29)",
        "(line 970,col 9)-(line 970,col 29)",
        "(line 971,col 9)-(line 971,col 82)",
        "(line 972,col 9)-(line 972,col 82)",
        "(line 973,col 9)-(line 973,col 81)",
        "(line 974,col 9)-(line 974,col 81)",
        "(line 976,col 9)-(line 976,col 22)",
        "(line 977,col 9)-(line 977,col 81)",
        "(line 978,col 9)-(line 978,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject()",
      "begin_line": 981,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 38)",
        "(line 983,col 9)-(line 983,col 22)",
        "(line 984,col 9)-(line 984,col 22)",
        "(line 985,col 9)-(line 985,col 38)",
        "(line 986,col 9)-(line 986,col 22)",
        "(line 987,col 9)-(line 987,col 22)",
        "(line 988,col 9)-(line 988,col 38)",
        "(line 989,col 9)-(line 989,col 22)",
        "(line 990,col 9)-(line 990,col 22)",
        "(line 991,col 9)-(line 991,col 22)",
        "(line 992,col 9)-(line 992,col 29)",
        "(line 993,col 9)-(line 993,col 29)",
        "(line 994,col 9)-(line 994,col 29)",
        "(line 995,col 9)-(line 995,col 82)",
        "(line 996,col 9)-(line 996,col 82)",
        "(line 997,col 9)-(line 997,col 81)",
        "(line 998,col 9)-(line 998,col 81)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 81)",
        "(line 1002,col 9)-(line 1002,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject()",
      "begin_line": 1005,
      "end_line": 1027,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 36)",
        "(line 1007,col 9)-(line 1007,col 22)",
        "(line 1008,col 9)-(line 1008,col 22)",
        "(line 1009,col 9)-(line 1009,col 36)",
        "(line 1010,col 9)-(line 1010,col 22)",
        "(line 1011,col 9)-(line 1011,col 22)",
        "(line 1012,col 9)-(line 1012,col 36)",
        "(line 1013,col 9)-(line 1013,col 22)",
        "(line 1014,col 9)-(line 1014,col 22)",
        "(line 1015,col 9)-(line 1015,col 22)",
        "(line 1016,col 9)-(line 1016,col 29)",
        "(line 1017,col 9)-(line 1017,col 29)",
        "(line 1018,col 9)-(line 1018,col 29)",
        "(line 1019,col 9)-(line 1019,col 82)",
        "(line 1020,col 9)-(line 1020,col 82)",
        "(line 1021,col 9)-(line 1021,col 81)",
        "(line 1022,col 9)-(line 1022,col 81)",
        "(line 1024,col 9)-(line 1024,col 22)",
        "(line 1025,col 9)-(line 1025,col 81)",
        "(line 1026,col 9)-(line 1026,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject()",
      "begin_line": 1029,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 36)",
        "(line 1031,col 9)-(line 1031,col 22)",
        "(line 1032,col 9)-(line 1032,col 22)",
        "(line 1033,col 9)-(line 1033,col 36)",
        "(line 1034,col 9)-(line 1034,col 22)",
        "(line 1035,col 9)-(line 1035,col 22)",
        "(line 1036,col 9)-(line 1036,col 36)",
        "(line 1037,col 9)-(line 1037,col 22)",
        "(line 1038,col 9)-(line 1038,col 22)",
        "(line 1039,col 9)-(line 1039,col 22)",
        "(line 1040,col 9)-(line 1040,col 29)",
        "(line 1041,col 9)-(line 1041,col 29)",
        "(line 1042,col 9)-(line 1042,col 29)",
        "(line 1043,col 9)-(line 1043,col 82)",
        "(line 1044,col 9)-(line 1044,col 82)",
        "(line 1045,col 9)-(line 1045,col 81)",
        "(line 1046,col 9)-(line 1046,col 81)",
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 81)",
        "(line 1050,col 9)-(line 1050,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject()",
      "begin_line": 1053,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 40)",
        "(line 1055,col 9)-(line 1055,col 22)",
        "(line 1056,col 9)-(line 1056,col 22)",
        "(line 1057,col 9)-(line 1057,col 40)",
        "(line 1058,col 9)-(line 1058,col 22)",
        "(line 1059,col 9)-(line 1059,col 22)",
        "(line 1060,col 9)-(line 1060,col 40)",
        "(line 1061,col 9)-(line 1061,col 22)",
        "(line 1062,col 9)-(line 1062,col 22)",
        "(line 1063,col 9)-(line 1063,col 22)",
        "(line 1064,col 9)-(line 1064,col 29)",
        "(line 1065,col 9)-(line 1065,col 29)",
        "(line 1066,col 9)-(line 1066,col 29)",
        "(line 1067,col 9)-(line 1067,col 82)",
        "(line 1068,col 9)-(line 1068,col 82)",
        "(line 1069,col 9)-(line 1069,col 81)",
        "(line 1070,col 9)-(line 1070,col 81)",
        "(line 1072,col 9)-(line 1072,col 22)",
        "(line 1073,col 9)-(line 1073,col 81)",
        "(line 1074,col 9)-(line 1074,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject()",
      "begin_line": 1077,
      "end_line": 1099,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 38)",
        "(line 1079,col 9)-(line 1079,col 22)",
        "(line 1080,col 9)-(line 1080,col 22)",
        "(line 1081,col 9)-(line 1081,col 38)",
        "(line 1082,col 9)-(line 1082,col 22)",
        "(line 1083,col 9)-(line 1083,col 22)",
        "(line 1084,col 9)-(line 1084,col 38)",
        "(line 1085,col 9)-(line 1085,col 22)",
        "(line 1086,col 9)-(line 1086,col 22)",
        "(line 1087,col 9)-(line 1087,col 22)",
        "(line 1088,col 9)-(line 1088,col 29)",
        "(line 1089,col 9)-(line 1089,col 29)",
        "(line 1090,col 9)-(line 1090,col 29)",
        "(line 1091,col 9)-(line 1091,col 82)",
        "(line 1092,col 9)-(line 1092,col 82)",
        "(line 1093,col 9)-(line 1093,col 81)",
        "(line 1094,col 9)-(line 1094,col 81)",
        "(line 1096,col 9)-(line 1096,col 22)",
        "(line 1097,col 9)-(line 1097,col 81)",
        "(line 1098,col 9)-(line 1098,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject()",
      "begin_line": 1101,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1102,col 9)-(line 1102,col 42)",
        "(line 1103,col 9)-(line 1103,col 25)",
        "(line 1104,col 9)-(line 1104,col 26)",
        "(line 1105,col 9)-(line 1105,col 42)",
        "(line 1106,col 9)-(line 1106,col 25)",
        "(line 1107,col 9)-(line 1107,col 26)",
        "(line 1108,col 9)-(line 1108,col 42)",
        "(line 1109,col 9)-(line 1109,col 25)",
        "(line 1110,col 9)-(line 1110,col 26)",
        "(line 1111,col 9)-(line 1111,col 25)",
        "(line 1112,col 9)-(line 1112,col 29)",
        "(line 1113,col 9)-(line 1113,col 29)",
        "(line 1114,col 9)-(line 1114,col 29)",
        "(line 1115,col 9)-(line 1115,col 82)",
        "(line 1116,col 9)-(line 1116,col 82)",
        "(line 1117,col 9)-(line 1117,col 81)",
        "(line 1118,col 9)-(line 1118,col 81)",
        "(line 1120,col 9)-(line 1120,col 25)",
        "(line 1121,col 9)-(line 1121,col 81)",
        "(line 1122,col 9)-(line 1122,col 81)"
      ]
    }
  ]
}