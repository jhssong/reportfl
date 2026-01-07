{
  "filepath": "/tmp/Lang-36b/src/test/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 60,
      "end_line": 607,
      "comment": "\n * Tests {@link org.apache.commons.lang3.exception.ExceptionUtils}.\n * \n * \u003ch3\u003eNotes\u003c/h3\u003e\n * \u003cp\u003e\n * Make sure this exception code does not depend on Java 1.4 nested exceptions. SVN revision 38990 does not compile with\n * Java 1.3.1.\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003eCompiled with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.3.1_15\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.4.2_12\u003c/li\u003e\n * \u003cli\u003eTested with Sun Java 1.5.0_08\u003c/li\u003e\n * \u003cli\u003eAll of the above on Windows XP SP2 + patches.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * Gary Gregory; August 16, 2006.\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:steven@caswell.name\"\u003eSteven Caswell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nested"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withCause"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withoutCause"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jdkNoCause"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selfCause"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cyclicCause"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionUtilsTest(java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 73,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 53)",
        "(line 76,col 9)-(line 76,col 53)",
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 78,col 48)",
        "(line 79,col 9)-(line 79,col 49)",
        "(line 80,col 9)-(line 80,col 38)",
        "(line 81,col 9)-(line 81,col 60)",
        "(line 82,col 9)-(line 82,col 57)",
        "(line 83,col 9)-(line 83,col 22)",
        "(line 84,col 9)-(line 84,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.tearDown()",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 28)",
        "(line 90,col 9)-(line 90,col 22)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 92,col 9)-(line 92,col 26)",
        "(line 93,col 9)-(line 93,col 25)",
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithoutCause()",
      "begin_line": 98,
      "end_line": 104,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithCause()",
      "begin_line": 106,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 122,col 79)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 70)",
        "(line 125,col 9)-(line 125,col 83)",
        "(line 126,col 9)-(line 126,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testCauseMethodNameOps()",
      "begin_line": 131,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 135,col 9)-(line 135,col 48)",
        "(line 136,col 9)-(line 136,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testCauseMethodNameOps(java.lang.String)",
      "begin_line": 139,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 154,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 64)",
        "(line 157,col 9)-(line 157,col 66)",
        "(line 158,col 9)-(line 158,col 63)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 81)",
        "(line 162,col 9)-(line 162,col 126)",
        "(line 163,col 9)-(line 163,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 166,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 62)",
        "(line 168,col 9)-(line 168,col 71)",
        "(line 171,col 9)-(line 171,col 69)",
        "(line 172,col 9)-(line 172,col 76)",
        "(line 173,col 9)-(line 173,col 82)",
        "(line 174,col 9)-(line 174,col 90)",
        "(line 177,col 9)-(line 177,col 70)",
        "(line 178,col 9)-(line 178,col 79)",
        "(line 179,col 9)-(line 179,col 85)",
        "(line 180,col 9)-(line 180,col 91)",
        "(line 181,col 9)-(line 181,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 184,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 60)",
        "(line 186,col 9)-(line 186,col 68)",
        "(line 187,col 9)-(line 187,col 70)",
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 66)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 191,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testSetCause()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 54)",
        "(line 196,col 9)-(line 196,col 89)",
        "(line 197,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testSetCauseToNull()",
      "begin_line": 205,
      "end_line": 211,
      "comment": "\n     * Tests overriding a cause to \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 65)",
        "(line 207,col 9)-(line 207,col 85)",
        "(line 208,col 9)-(line 208,col 51)",
        "(line 209,col 9)-(line 209,col 62)",
        "(line 210,col 9)-(line 210,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIsThrowableNested()",
      "begin_line": 214,
      "end_line": 220,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIsNestedThrowable_Throwable()",
      "begin_line": 222,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 81)",
        "(line 224,col 9)-(line 224,col 109)",
        "(line 225,col 9)-(line 225,col 93)",
        "(line 226,col 9)-(line 226,col 72)",
        "(line 227,col 9)-(line 227,col 69)",
        "(line 228,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 238,
      "end_line": 246,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 64)",
        "(line 240,col 9)-(line 240,col 72)",
        "(line 241,col 9)-(line 241,col 66)",
        "(line 242,col 9)-(line 242,col 69)",
        "(line 243,col 9)-(line 243,col 70)",
        "(line 244,col 9)-(line 244,col 69)",
        "(line 245,col 9)-(line 245,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 76)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 259,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 70)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 263,col 9)-(line 263,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 266,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 73)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 45)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 274,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 74)",
        "(line 276,col 9)-(line 276,col 43)",
        "(line 277,col 9)-(line 277,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_selfCause()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 73)",
        "(line 282,col 9)-(line 282,col 43)",
        "(line 283,col 9)-(line 283,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 286,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 75)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 47)",
        "(line 290,col 9)-(line 290,col 58)",
        "(line 291,col 9)-(line 291,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 295,
      "end_line": 298,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 67)",
        "(line 297,col 9)-(line 297,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 300,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 75)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 306,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 69)",
        "(line 308,col 9)-(line 308,col 43)",
        "(line 309,col 9)-(line 309,col 46)",
        "(line 310,col 9)-(line 310,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 313,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 72)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 316,col 49)",
        "(line 317,col 9)-(line 317,col 46)",
        "(line 318,col 9)-(line 318,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 321,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 73)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_selfCause()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 72)",
        "(line 329,col 9)-(line 329,col 43)",
        "(line 330,col 9)-(line 330,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 333,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 43)",
        "(line 336,col 9)-(line 336,col 51)",
        "(line 337,col 9)-(line 337,col 62)",
        "(line 338,col 9)-(line 338,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 342,
      "end_line": 362,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 70)",
        "(line 344,col 9)-(line 344,col 89)",
        "(line 346,col 9)-(line 346,col 78)",
        "(line 347,col 9)-(line 347,col 98)",
        "(line 348,col 9)-(line 348,col 97)",
        "(line 349,col 9)-(line 349,col 100)",
        "(line 351,col 9)-(line 351,col 72)",
        "(line 352,col 9)-(line 352,col 92)",
        "(line 353,col 9)-(line 353,col 90)",
        "(line 354,col 9)-(line 354,col 94)",
        "(line 356,col 9)-(line 356,col 75)",
        "(line 357,col 9)-(line 357,col 94)",
        "(line 358,col 9)-(line 358,col 93)",
        "(line 359,col 9)-(line 359,col 97)",
        "(line 361,col 9)-(line 361,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 364,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 73)",
        "(line 366,col 9)-(line 366,col 92)",
        "(line 368,col 9)-(line 368,col 78)",
        "(line 369,col 9)-(line 369,col 101)",
        "(line 370,col 9)-(line 370,col 100)",
        "(line 371,col 9)-(line 371,col 103)",
        "(line 373,col 9)-(line 373,col 75)",
        "(line 374,col 9)-(line 374,col 95)",
        "(line 375,col 9)-(line 375,col 93)",
        "(line 376,col 9)-(line 376,col 97)",
        "(line 378,col 9)-(line 378,col 75)",
        "(line 379,col 9)-(line 379,col 97)",
        "(line 380,col 9)-(line 380,col 96)",
        "(line 381,col 9)-(line 381,col 100)",
        "(line 383,col 9)-(line 383,col 98)",
        "(line 384,col 9)-(line 384,col 97)",
        "(line 385,col 9)-(line 385,col 98)",
        "(line 386,col 9)-(line 386,col 98)",
        "(line 388,col 9)-(line 388,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 392,
      "end_line": 412,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 65)",
        "(line 394,col 9)-(line 394,col 84)",
        "(line 396,col 9)-(line 396,col 73)",
        "(line 397,col 9)-(line 397,col 93)",
        "(line 398,col 9)-(line 398,col 92)",
        "(line 399,col 9)-(line 399,col 95)",
        "(line 401,col 9)-(line 401,col 67)",
        "(line 402,col 9)-(line 402,col 87)",
        "(line 403,col 9)-(line 403,col 85)",
        "(line 404,col 9)-(line 404,col 89)",
        "(line 406,col 9)-(line 406,col 70)",
        "(line 407,col 9)-(line 407,col 89)",
        "(line 408,col 9)-(line 408,col 88)",
        "(line 409,col 9)-(line 409,col 92)",
        "(line 411,col 9)-(line 411,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 414,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 68)",
        "(line 416,col 9)-(line 416,col 87)",
        "(line 418,col 9)-(line 418,col 73)",
        "(line 419,col 9)-(line 419,col 96)",
        "(line 420,col 9)-(line 420,col 95)",
        "(line 421,col 9)-(line 421,col 98)",
        "(line 423,col 9)-(line 423,col 70)",
        "(line 424,col 9)-(line 424,col 90)",
        "(line 425,col 9)-(line 425,col 88)",
        "(line 426,col 9)-(line 426,col 92)",
        "(line 428,col 9)-(line 428,col 70)",
        "(line 429,col 9)-(line 429,col 92)",
        "(line 430,col 9)-(line 430,col 91)",
        "(line 431,col 9)-(line 431,col 95)",
        "(line 433,col 9)-(line 433,col 93)",
        "(line 434,col 9)-(line 434,col 92)",
        "(line 435,col 9)-(line 435,col 93)",
        "(line 436,col 9)-(line 436,col 93)",
        "(line 438,col 9)-(line 438,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 442,
      "end_line": 446,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 448,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 68)",
        "(line 450,col 9)-(line 450,col 74)",
        "(line 451,col 9)-(line 451,col 76)",
        "(line 452,col 9)-(line 452,col 49)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 46)",
        "(line 462,col 9)-(line 462,col 57)",
        "(line 463,col 9)-(line 463,col 81)",
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 465,col 76)",
        "(line 467,col 9)-(line 467,col 46)",
        "(line 468,col 9)-(line 468,col 84)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 473,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 53)",
        "(line 475,col 9)-(line 475,col 74)",
        "(line 476,col 9)-(line 476,col 79)",
        "(line 477,col 9)-(line 477,col 53)",
        "(line 479,col 9)-(line 479,col 40)",
        "(line 480,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 40)",
        "(line 487,col 9)-(line 487,col 57)",
        "(line 488,col 9)-(line 488,col 84)",
        "(line 489,col 9)-(line 489,col 46)",
        "(line 490,col 9)-(line 490,col 76)",
        "(line 492,col 9)-(line 492,col 40)",
        "(line 493,col 9)-(line 493,col 87)",
        "(line 494,col 9)-(line 494,col 39)",
        "(line 495,col 9)-(line 495,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 499,
      "end_line": 522,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 76)",
        "(line 502,col 9)-(line 502,col 57)",
        "(line 503,col 9)-(line 503,col 79)",
        "(line 504,col 9)-(line 504,col 30)",
        "(line 505,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 34)",
        "(line 513,col 9)-(line 513,col 73)",
        "(line 514,col 9)-(line 514,col 22)",
        "(line 515,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 524,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 532,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 28)",
        "(line 534,col 9)-(line 534,col 56)",
        "(line 536,col 9)-(line 536,col 50)",
        "(line 537,col 9)-(line 537,col 86)",
        "(line 539,col 9)-(line 539,col 51)",
        "(line 540,col 9)-(line 540,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 543,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 28)",
        "(line 545,col 9)-(line 545,col 65)",
        "(line 547,col 9)-(line 547,col 50)",
        "(line 548,col 9)-(line 548,col 95)",
        "(line 550,col 9)-(line 550,col 51)",
        "(line 551,col 9)-(line 551,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 560,
      "end_line": 581,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 561,
      "end_line": 561,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 23)",
        "(line 565,col 13)-(line 565,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 569,col 13)-(line 569,col 20)",
        "(line 570,col 13)-(line 570,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 573,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 578,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 13)-(line 579,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 588,
      "end_line": 592,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 589,
      "end_line": 591,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NestableRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 596,
      "end_line": 600,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableRuntimeException.NestableRuntimeException()",
      "begin_line": 597,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 597,col 45)-(line 597,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableRuntimeException.NestableRuntimeException(java.lang.Throwable)",
      "begin_line": 598,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 599,col 56)-(line 599,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NestableException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 601,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 602,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 603,col 38)-(line 603,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 604,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 604,col 49)-(line 604,col 57)"
      ]
    }
  ]
}