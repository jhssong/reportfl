{
  "filepath": "/tmp/Lang-4b/src/test/java/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 532,
      "comment": "\n * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 61,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 51)",
        "(line 66,col 9)-(line 66,col 48)",
        "(line 67,col 9)-(line 67,col 66)",
        "(line 68,col 9)-(line 68,col 63)",
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 70,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.tearDown()",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 26)",
        "(line 80,col 9)-(line 80,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithoutCause()",
      "begin_line": 84,
      "end_line": 90,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 85,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithCause()",
      "begin_line": 92,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 85)",
        "(line 110,col 9)-(line 110,col 37)",
        "(line 111,col 9)-(line 111,col 62)",
        "(line 112,col 9)-(line 112,col 75)",
        "(line 113,col 9)-(line 113,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 117,
      "end_line": 128,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 56)",
        "(line 121,col 9)-(line 121,col 64)",
        "(line 122,col 9)-(line 122,col 66)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 124,col 62)",
        "(line 125,col 9)-(line 125,col 81)",
        "(line 126,col 9)-(line 126,col 126)",
        "(line 127,col 9)-(line 127,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 130,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 62)",
        "(line 134,col 9)-(line 134,col 71)",
        "(line 137,col 9)-(line 137,col 69)",
        "(line 138,col 9)-(line 138,col 76)",
        "(line 139,col 9)-(line 139,col 82)",
        "(line 140,col 9)-(line 140,col 90)",
        "(line 143,col 9)-(line 143,col 70)",
        "(line 144,col 9)-(line 144,col 79)",
        "(line 145,col 9)-(line 145,col 85)",
        "(line 146,col 9)-(line 146,col 91)",
        "(line 147,col 9)-(line 147,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 150,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 60)",
        "(line 153,col 9)-(line 153,col 68)",
        "(line 154,col 9)-(line 154,col 70)",
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 161,
      "end_line": 169,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 64)",
        "(line 164,col 9)-(line 164,col 72)",
        "(line 165,col 9)-(line 165,col 66)",
        "(line 166,col 9)-(line 166,col 69)",
        "(line 167,col 9)-(line 167,col 70)",
        "(line 168,col 9)-(line 168,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 177,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 82)",
        "(line 180,col 9)-(line 180,col 43)",
        "(line 181,col 9)-(line 181,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 184,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 76)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 192,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 79)",
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 197,col 9)-(line 197,col 42)",
        "(line 198,col 9)-(line 198,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 80)",
        "(line 204,col 9)-(line 204,col 43)",
        "(line 205,col 9)-(line 205,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 208,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 81)",
        "(line 211,col 9)-(line 211,col 43)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 58)",
        "(line 214,col 9)-(line 214,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 218,
      "end_line": 222,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 73)",
        "(line 221,col 9)-(line 221,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 224,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 81)",
        "(line 227,col 9)-(line 227,col 43)",
        "(line 228,col 9)-(line 228,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 231,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 75)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 235,col 46)",
        "(line 236,col 9)-(line 236,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 239,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 78)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 245,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 248,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 79)",
        "(line 251,col 9)-(line 251,col 43)",
        "(line 252,col 9)-(line 252,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 80)",
        "(line 258,col 9)-(line 258,col 43)",
        "(line 259,col 9)-(line 259,col 51)",
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 265,
      "end_line": 286,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 70)",
        "(line 268,col 9)-(line 268,col 89)",
        "(line 270,col 9)-(line 270,col 78)",
        "(line 271,col 9)-(line 271,col 98)",
        "(line 272,col 9)-(line 272,col 97)",
        "(line 273,col 9)-(line 273,col 100)",
        "(line 275,col 9)-(line 275,col 72)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 277,col 9)-(line 277,col 90)",
        "(line 278,col 9)-(line 278,col 94)",
        "(line 280,col 9)-(line 280,col 75)",
        "(line 281,col 9)-(line 281,col 94)",
        "(line 282,col 9)-(line 282,col 93)",
        "(line 283,col 9)-(line 283,col 97)",
        "(line 285,col 9)-(line 285,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 288,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 73)",
        "(line 291,col 9)-(line 291,col 92)",
        "(line 293,col 9)-(line 293,col 78)",
        "(line 294,col 9)-(line 294,col 101)",
        "(line 295,col 9)-(line 295,col 100)",
        "(line 296,col 9)-(line 296,col 103)",
        "(line 298,col 9)-(line 298,col 75)",
        "(line 299,col 9)-(line 299,col 95)",
        "(line 300,col 9)-(line 300,col 93)",
        "(line 301,col 9)-(line 301,col 97)",
        "(line 303,col 9)-(line 303,col 75)",
        "(line 304,col 9)-(line 304,col 97)",
        "(line 305,col 9)-(line 305,col 96)",
        "(line 306,col 9)-(line 306,col 100)",
        "(line 308,col 9)-(line 308,col 98)",
        "(line 309,col 9)-(line 309,col 97)",
        "(line 310,col 9)-(line 310,col 98)",
        "(line 311,col 9)-(line 311,col 98)",
        "(line 313,col 9)-(line 313,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 317,
      "end_line": 338,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 65)",
        "(line 320,col 9)-(line 320,col 84)",
        "(line 322,col 9)-(line 322,col 73)",
        "(line 323,col 9)-(line 323,col 93)",
        "(line 324,col 9)-(line 324,col 92)",
        "(line 325,col 9)-(line 325,col 95)",
        "(line 327,col 9)-(line 327,col 67)",
        "(line 328,col 9)-(line 328,col 87)",
        "(line 329,col 9)-(line 329,col 85)",
        "(line 330,col 9)-(line 330,col 89)",
        "(line 332,col 9)-(line 332,col 70)",
        "(line 333,col 9)-(line 333,col 89)",
        "(line 334,col 9)-(line 334,col 88)",
        "(line 335,col 9)-(line 335,col 92)",
        "(line 337,col 9)-(line 337,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 340,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 68)",
        "(line 343,col 9)-(line 343,col 87)",
        "(line 345,col 9)-(line 345,col 73)",
        "(line 346,col 9)-(line 346,col 96)",
        "(line 347,col 9)-(line 347,col 95)",
        "(line 348,col 9)-(line 348,col 98)",
        "(line 350,col 9)-(line 350,col 70)",
        "(line 351,col 9)-(line 351,col 90)",
        "(line 352,col 9)-(line 352,col 88)",
        "(line 353,col 9)-(line 353,col 92)",
        "(line 355,col 9)-(line 355,col 70)",
        "(line 356,col 9)-(line 356,col 92)",
        "(line 357,col 9)-(line 357,col 91)",
        "(line 358,col 9)-(line 358,col 95)",
        "(line 360,col 9)-(line 360,col 93)",
        "(line 361,col 9)-(line 361,col 92)",
        "(line 362,col 9)-(line 362,col 93)",
        "(line 363,col 9)-(line 363,col 93)",
        "(line 365,col 9)-(line 365,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 369,
      "end_line": 374,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 376,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 68)",
        "(line 379,col 9)-(line 379,col 74)",
        "(line 380,col 9)-(line 380,col 76)",
        "(line 381,col 9)-(line 381,col 49)",
        "(line 383,col 9)-(line 383,col 46)",
        "(line 384,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 46)",
        "(line 391,col 9)-(line 391,col 63)",
        "(line 392,col 9)-(line 392,col 81)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 394,col 76)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 397,col 84)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 402,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 53)",
        "(line 405,col 9)-(line 405,col 74)",
        "(line 406,col 9)-(line 406,col 79)",
        "(line 407,col 9)-(line 407,col 53)",
        "(line 409,col 9)-(line 409,col 40)",
        "(line 410,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 40)",
        "(line 417,col 9)-(line 417,col 63)",
        "(line 418,col 9)-(line 418,col 84)",
        "(line 419,col 9)-(line 419,col 46)",
        "(line 420,col 9)-(line 420,col 76)",
        "(line 422,col 9)-(line 422,col 40)",
        "(line 423,col 9)-(line 423,col 87)",
        "(line 424,col 9)-(line 424,col 39)",
        "(line 425,col 9)-(line 425,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 429,
      "end_line": 453,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 76)",
        "(line 433,col 9)-(line 433,col 63)",
        "(line 434,col 9)-(line 434,col 79)",
        "(line 435,col 9)-(line 435,col 30)",
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 26)",
        "(line 444,col 9)-(line 444,col 73)",
        "(line 445,col 9)-(line 445,col 22)",
        "(line 446,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 460,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 28)",
        "(line 463,col 9)-(line 463,col 56)",
        "(line 465,col 9)-(line 465,col 50)",
        "(line 466,col 9)-(line 466,col 86)",
        "(line 468,col 9)-(line 468,col 51)",
        "(line 469,col 9)-(line 469,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 472,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 28)",
        "(line 475,col 9)-(line 475,col 65)",
        "(line 477,col 9)-(line 477,col 50)",
        "(line 478,col 9)-(line 478,col 95)",
        "(line 480,col 9)-(line 480,col 51)",
        "(line 481,col 9)-(line 481,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 490,
      "end_line": 511,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 494,col 13)-(line 494,col 23)",
        "(line 495,col 13)-(line 495,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 20)",
        "(line 500,col 13)-(line 500,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 505,col 13)-(line 505,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 508,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 509,col 13)-(line 509,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 518,
      "end_line": 522,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NestableException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 526,
      "end_line": 530,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 527,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 528,col 38)-(line 528,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 529,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 529,col 55)-(line 529,col 63)"
      ]
    }
  ]
}