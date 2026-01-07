{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 50,
      "end_line": 508,
      "comment": "\n * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionUtilsTest(java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 62,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 53)",
        "(line 66,col 9)-(line 66,col 51)",
        "(line 67,col 9)-(line 67,col 48)",
        "(line 68,col 9)-(line 68,col 60)",
        "(line 69,col 9)-(line 69,col 57)",
        "(line 70,col 9)-(line 70,col 22)",
        "(line 71,col 9)-(line 71,col 48)"
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
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 108,col 79)",
        "(line 109,col 9)-(line 109,col 37)",
        "(line 110,col 9)-(line 110,col 70)",
        "(line 111,col 9)-(line 111,col 83)",
        "(line 112,col 9)-(line 112,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 116,
      "end_line": 126,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 56)",
        "(line 119,col 9)-(line 119,col 64)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 121,col 63)",
        "(line 122,col 9)-(line 122,col 62)",
        "(line 123,col 9)-(line 123,col 81)",
        "(line 124,col 9)-(line 124,col 126)",
        "(line 125,col 9)-(line 125,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 128,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 62)",
        "(line 131,col 9)-(line 131,col 71)",
        "(line 134,col 9)-(line 134,col 69)",
        "(line 135,col 9)-(line 135,col 76)",
        "(line 136,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 137,col 90)",
        "(line 140,col 9)-(line 140,col 70)",
        "(line 141,col 9)-(line 141,col 79)",
        "(line 142,col 9)-(line 142,col 85)",
        "(line 143,col 9)-(line 143,col 91)",
        "(line 144,col 9)-(line 144,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 147,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 60)",
        "(line 149,col 9)-(line 149,col 68)",
        "(line 150,col 9)-(line 150,col 70)",
        "(line 151,col 9)-(line 151,col 73)",
        "(line 152,col 9)-(line 152,col 66)",
        "(line 153,col 9)-(line 153,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 64)",
        "(line 159,col 9)-(line 159,col 72)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 69)",
        "(line 162,col 9)-(line 162,col 70)",
        "(line 163,col 9)-(line 163,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 76)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 174,col 9)-(line 174,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 177,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 179,col 43)",
        "(line 180,col 9)-(line 180,col 42)",
        "(line 181,col 9)-(line 181,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 184,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 73)",
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 192,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 74)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 195,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 75)",
        "(line 200,col 9)-(line 200,col 43)",
        "(line 201,col 9)-(line 201,col 47)",
        "(line 202,col 9)-(line 202,col 58)",
        "(line 203,col 9)-(line 203,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 67)",
        "(line 209,col 9)-(line 209,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 212,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 75)",
        "(line 214,col 9)-(line 214,col 43)",
        "(line 215,col 9)-(line 215,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 69)",
        "(line 220,col 9)-(line 220,col 43)",
        "(line 221,col 9)-(line 221,col 46)",
        "(line 222,col 9)-(line 222,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 225,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 72)",
        "(line 227,col 9)-(line 227,col 43)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 233,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 73)",
        "(line 235,col 9)-(line 235,col 43)",
        "(line 236,col 9)-(line 236,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 239,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 74)",
        "(line 241,col 9)-(line 241,col 43)",
        "(line 242,col 9)-(line 242,col 51)",
        "(line 243,col 9)-(line 243,col 62)",
        "(line 244,col 9)-(line 244,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 248,
      "end_line": 268,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 70)",
        "(line 250,col 9)-(line 250,col 89)",
        "(line 252,col 9)-(line 252,col 78)",
        "(line 253,col 9)-(line 253,col 98)",
        "(line 254,col 9)-(line 254,col 97)",
        "(line 255,col 9)-(line 255,col 100)",
        "(line 257,col 9)-(line 257,col 72)",
        "(line 258,col 9)-(line 258,col 92)",
        "(line 259,col 9)-(line 259,col 90)",
        "(line 260,col 9)-(line 260,col 94)",
        "(line 262,col 9)-(line 262,col 75)",
        "(line 263,col 9)-(line 263,col 94)",
        "(line 264,col 9)-(line 264,col 93)",
        "(line 265,col 9)-(line 265,col 97)",
        "(line 267,col 9)-(line 267,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 270,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 73)",
        "(line 272,col 9)-(line 272,col 92)",
        "(line 274,col 9)-(line 274,col 78)",
        "(line 275,col 9)-(line 275,col 101)",
        "(line 276,col 9)-(line 276,col 100)",
        "(line 277,col 9)-(line 277,col 103)",
        "(line 279,col 9)-(line 279,col 75)",
        "(line 280,col 9)-(line 280,col 95)",
        "(line 281,col 9)-(line 281,col 93)",
        "(line 282,col 9)-(line 282,col 97)",
        "(line 284,col 9)-(line 284,col 75)",
        "(line 285,col 9)-(line 285,col 97)",
        "(line 286,col 9)-(line 286,col 96)",
        "(line 287,col 9)-(line 287,col 100)",
        "(line 289,col 9)-(line 289,col 98)",
        "(line 290,col 9)-(line 290,col 97)",
        "(line 291,col 9)-(line 291,col 98)",
        "(line 292,col 9)-(line 292,col 98)",
        "(line 294,col 9)-(line 294,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 298,
      "end_line": 318,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 65)",
        "(line 300,col 9)-(line 300,col 84)",
        "(line 302,col 9)-(line 302,col 73)",
        "(line 303,col 9)-(line 303,col 93)",
        "(line 304,col 9)-(line 304,col 92)",
        "(line 305,col 9)-(line 305,col 95)",
        "(line 307,col 9)-(line 307,col 67)",
        "(line 308,col 9)-(line 308,col 87)",
        "(line 309,col 9)-(line 309,col 85)",
        "(line 310,col 9)-(line 310,col 89)",
        "(line 312,col 9)-(line 312,col 70)",
        "(line 313,col 9)-(line 313,col 89)",
        "(line 314,col 9)-(line 314,col 88)",
        "(line 315,col 9)-(line 315,col 92)",
        "(line 317,col 9)-(line 317,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 320,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 68)",
        "(line 322,col 9)-(line 322,col 87)",
        "(line 324,col 9)-(line 324,col 73)",
        "(line 325,col 9)-(line 325,col 96)",
        "(line 326,col 9)-(line 326,col 95)",
        "(line 327,col 9)-(line 327,col 98)",
        "(line 329,col 9)-(line 329,col 70)",
        "(line 330,col 9)-(line 330,col 90)",
        "(line 331,col 9)-(line 331,col 88)",
        "(line 332,col 9)-(line 332,col 92)",
        "(line 334,col 9)-(line 334,col 70)",
        "(line 335,col 9)-(line 335,col 92)",
        "(line 336,col 9)-(line 336,col 91)",
        "(line 337,col 9)-(line 337,col 95)",
        "(line 339,col 9)-(line 339,col 93)",
        "(line 340,col 9)-(line 340,col 92)",
        "(line 341,col 9)-(line 341,col 93)",
        "(line 342,col 9)-(line 342,col 93)",
        "(line 344,col 9)-(line 344,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 348,
      "end_line": 352,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 354,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 68)",
        "(line 356,col 9)-(line 356,col 74)",
        "(line 357,col 9)-(line 357,col 76)",
        "(line 358,col 9)-(line 358,col 49)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 361,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 46)",
        "(line 368,col 9)-(line 368,col 57)",
        "(line 369,col 9)-(line 369,col 81)",
        "(line 370,col 9)-(line 370,col 43)",
        "(line 371,col 9)-(line 371,col 76)",
        "(line 373,col 9)-(line 373,col 46)",
        "(line 374,col 9)-(line 374,col 84)",
        "(line 375,col 9)-(line 375,col 36)",
        "(line 376,col 9)-(line 376,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 379,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 381,col 74)",
        "(line 382,col 9)-(line 382,col 79)",
        "(line 383,col 9)-(line 383,col 53)",
        "(line 385,col 9)-(line 385,col 40)",
        "(line 386,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 393,col 57)",
        "(line 394,col 9)-(line 394,col 84)",
        "(line 395,col 9)-(line 395,col 46)",
        "(line 396,col 9)-(line 396,col 76)",
        "(line 398,col 9)-(line 398,col 40)",
        "(line 399,col 9)-(line 399,col 87)",
        "(line 400,col 9)-(line 400,col 39)",
        "(line 401,col 9)-(line 401,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 405,
      "end_line": 428,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 76)",
        "(line 408,col 9)-(line 408,col 57)",
        "(line 409,col 9)-(line 409,col 79)",
        "(line 410,col 9)-(line 410,col 30)",
        "(line 411,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 34)",
        "(line 419,col 9)-(line 419,col 73)",
        "(line 420,col 9)-(line 420,col 22)",
        "(line 421,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 430,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 438,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 28)",
        "(line 440,col 9)-(line 440,col 56)",
        "(line 442,col 9)-(line 442,col 50)",
        "(line 443,col 9)-(line 443,col 86)",
        "(line 445,col 9)-(line 445,col 51)",
        "(line 446,col 9)-(line 446,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 449,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 28)",
        "(line 451,col 9)-(line 451,col 65)",
        "(line 453,col 9)-(line 453,col 50)",
        "(line 454,col 9)-(line 454,col 95)",
        "(line 456,col 9)-(line 456,col 51)",
        "(line 457,col 9)-(line 457,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 466,
      "end_line": 487,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 469,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 470,col 13)-(line 470,col 23)",
        "(line 471,col 13)-(line 471,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 475,col 13)-(line 475,col 20)",
        "(line 476,col 13)-(line 476,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 479,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 481,col 13)-(line 481,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 485,col 13)-(line 485,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 494,
      "end_line": 498,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 495,
      "end_line": 497,
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
      "begin_line": 502,
      "end_line": 506,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 503,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 504,col 38)-(line 504,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 505,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 505,col 49)-(line 505,col 57)"
      ]
    }
  ]
}