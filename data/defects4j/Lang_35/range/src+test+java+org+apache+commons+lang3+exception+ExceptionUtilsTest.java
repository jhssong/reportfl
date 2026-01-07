{
  "filepath": "/tmp/Lang-35b/src/test/java/org/apache/commons/lang3/exception/ExceptionUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 60,
      "end_line": 516,
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
        "cyclicCause"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionUtilsTest(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.setUp()",
      "begin_line": 72,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 53)",
        "(line 75,col 9)-(line 75,col 53)",
        "(line 76,col 9)-(line 76,col 51)",
        "(line 77,col 9)-(line 77,col 48)",
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 79,col 57)",
        "(line 80,col 9)-(line 80,col 22)",
        "(line 81,col 9)-(line 81,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.tearDown()",
      "begin_line": 84,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 28)",
        "(line 87,col 9)-(line 87,col 22)",
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 26)",
        "(line 90,col 9)-(line 90,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithoutCause()",
      "begin_line": 94,
      "end_line": 100,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 95,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.createExceptionWithCause()",
      "begin_line": 102,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testConstructor()",
      "begin_line": 116,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 118,col 79)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 70)",
        "(line 121,col 9)-(line 121,col 83)",
        "(line 122,col 9)-(line 122,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_Throwable()",
      "begin_line": 126,
      "end_line": 135,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 64)",
        "(line 129,col 9)-(line 129,col 66)",
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 131,col 62)",
        "(line 132,col 9)-(line 132,col 81)",
        "(line 133,col 9)-(line 133,col 126)",
        "(line 134,col 9)-(line 134,col 126)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetCause_ThrowableArray()",
      "begin_line": 137,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 62)",
        "(line 139,col 9)-(line 139,col 71)",
        "(line 142,col 9)-(line 142,col 69)",
        "(line 143,col 9)-(line 143,col 76)",
        "(line 144,col 9)-(line 144,col 82)",
        "(line 145,col 9)-(line 145,col 90)",
        "(line 148,col 9)-(line 148,col 70)",
        "(line 149,col 9)-(line 149,col 79)",
        "(line 150,col 9)-(line 150,col 85)",
        "(line 151,col 9)-(line 151,col 91)",
        "(line 152,col 9)-(line 152,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCause_Throwable()",
      "begin_line": 155,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 60)",
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 70)",
        "(line 159,col 9)-(line 159,col 73)",
        "(line 160,col 9)-(line 160,col 66)",
        "(line 161,col 9)-(line 161,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableCount_Throwable()",
      "begin_line": 165,
      "end_line": 172,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 167,col 72)",
        "(line 168,col 9)-(line 168,col 66)",
        "(line 169,col 9)-(line 169,col 69)",
        "(line 170,col 9)-(line 170,col 70)",
        "(line 171,col 9)-(line 171,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_null()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withoutCause()",
      "begin_line": 179,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 76)",
        "(line 181,col 9)-(line 181,col 43)",
        "(line 182,col 9)-(line 182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_nested()",
      "begin_line": 185,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 70)",
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_withCause()",
      "begin_line": 192,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 73)",
        "(line 194,col 9)-(line 194,col 43)",
        "(line 195,col 9)-(line 195,col 45)",
        "(line 196,col 9)-(line 196,col 42)",
        "(line 197,col 9)-(line 197,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_jdkNoCause()",
      "begin_line": 200,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 74)",
        "(line 202,col 9)-(line 202,col 43)",
        "(line 203,col 9)-(line 203,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowables_Throwable_recursiveCause()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 75)",
        "(line 208,col 9)-(line 208,col 43)",
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 211,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_null()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 67)",
        "(line 217,col 9)-(line 217,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withoutCause()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 75)",
        "(line 222,col 9)-(line 222,col 43)",
        "(line 223,col 9)-(line 223,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_nested()",
      "begin_line": 226,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 69)",
        "(line 228,col 9)-(line 228,col 43)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 230,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_withCause()",
      "begin_line": 233,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 72)",
        "(line 235,col 9)-(line 235,col 43)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 238,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_jdkNoCause()",
      "begin_line": 241,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 73)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 244,col 9)-(line 244,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetThrowableList_Throwable_recursiveCause()",
      "begin_line": 247,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 74)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 51)",
        "(line 251,col 9)-(line 251,col 62)",
        "(line 252,col 9)-(line 252,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClass()",
      "begin_line": 256,
      "end_line": 276,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 70)",
        "(line 258,col 9)-(line 258,col 89)",
        "(line 260,col 9)-(line 260,col 78)",
        "(line 261,col 9)-(line 261,col 98)",
        "(line 262,col 9)-(line 262,col 97)",
        "(line 263,col 9)-(line 263,col 100)",
        "(line 265,col 9)-(line 265,col 72)",
        "(line 266,col 9)-(line 266,col 92)",
        "(line 267,col 9)-(line 267,col 90)",
        "(line 268,col 9)-(line 268,col 94)",
        "(line 270,col 9)-(line 270,col 75)",
        "(line 271,col 9)-(line 271,col 94)",
        "(line 272,col 9)-(line 272,col 93)",
        "(line 273,col 9)-(line 273,col 97)",
        "(line 275,col 9)-(line 275,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOf_ThrowableClassInt()",
      "begin_line": 278,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 280,col 92)",
        "(line 282,col 9)-(line 282,col 78)",
        "(line 283,col 9)-(line 283,col 101)",
        "(line 284,col 9)-(line 284,col 100)",
        "(line 285,col 9)-(line 285,col 103)",
        "(line 287,col 9)-(line 287,col 75)",
        "(line 288,col 9)-(line 288,col 95)",
        "(line 289,col 9)-(line 289,col 93)",
        "(line 290,col 9)-(line 290,col 97)",
        "(line 292,col 9)-(line 292,col 75)",
        "(line 293,col 9)-(line 293,col 97)",
        "(line 294,col 9)-(line 294,col 96)",
        "(line 295,col 9)-(line 295,col 100)",
        "(line 297,col 9)-(line 297,col 98)",
        "(line 298,col 9)-(line 298,col 97)",
        "(line 299,col 9)-(line 299,col 98)",
        "(line 300,col 9)-(line 300,col 98)",
        "(line 302,col 9)-(line 302,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClass()",
      "begin_line": 306,
      "end_line": 326,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 65)",
        "(line 308,col 9)-(line 308,col 84)",
        "(line 310,col 9)-(line 310,col 73)",
        "(line 311,col 9)-(line 311,col 93)",
        "(line 312,col 9)-(line 312,col 92)",
        "(line 313,col 9)-(line 313,col 95)",
        "(line 315,col 9)-(line 315,col 67)",
        "(line 316,col 9)-(line 316,col 87)",
        "(line 317,col 9)-(line 317,col 85)",
        "(line 318,col 9)-(line 318,col 89)",
        "(line 320,col 9)-(line 320,col 70)",
        "(line 321,col 9)-(line 321,col 89)",
        "(line 322,col 9)-(line 322,col 88)",
        "(line 323,col 9)-(line 323,col 92)",
        "(line 325,col 9)-(line 325,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testIndexOfType_ThrowableClassInt()",
      "begin_line": 328,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 68)",
        "(line 330,col 9)-(line 330,col 87)",
        "(line 332,col 9)-(line 332,col 73)",
        "(line 333,col 9)-(line 333,col 96)",
        "(line 334,col 9)-(line 334,col 95)",
        "(line 335,col 9)-(line 335,col 98)",
        "(line 337,col 9)-(line 337,col 70)",
        "(line 338,col 9)-(line 338,col 90)",
        "(line 339,col 9)-(line 339,col 88)",
        "(line 340,col 9)-(line 340,col 92)",
        "(line 342,col 9)-(line 342,col 70)",
        "(line 343,col 9)-(line 343,col 92)",
        "(line 344,col 9)-(line 344,col 91)",
        "(line 345,col 9)-(line 345,col 95)",
        "(line 347,col 9)-(line 347,col 93)",
        "(line 348,col 9)-(line 348,col 92)",
        "(line 349,col 9)-(line 349,col 93)",
        "(line 350,col 9)-(line 350,col 93)",
        "(line 352,col 9)-(line 352,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_Throwable()",
      "begin_line": 356,
      "end_line": 360,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableStream()",
      "begin_line": 362,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 68)",
        "(line 364,col 9)-(line 364,col 74)",
        "(line 365,col 9)-(line 365,col 76)",
        "(line 366,col 9)-(line 366,col 49)",
        "(line 368,col 9)-(line 368,col 46)",
        "(line 369,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 46)",
        "(line 376,col 9)-(line 376,col 57)",
        "(line 377,col 9)-(line 377,col 81)",
        "(line 378,col 9)-(line 378,col 43)",
        "(line 379,col 9)-(line 379,col 76)",
        "(line 381,col 9)-(line 381,col 46)",
        "(line 382,col 9)-(line 382,col 84)",
        "(line 383,col 9)-(line 383,col 36)",
        "(line 384,col 9)-(line 384,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testPrintRootCauseStackTrace_ThrowableWriter()",
      "begin_line": 387,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 53)",
        "(line 389,col 9)-(line 389,col 74)",
        "(line 390,col 9)-(line 390,col 79)",
        "(line 391,col 9)-(line 391,col 53)",
        "(line 393,col 9)-(line 393,col 40)",
        "(line 394,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 40)",
        "(line 401,col 9)-(line 401,col 57)",
        "(line 402,col 9)-(line 402,col 84)",
        "(line 403,col 9)-(line 403,col 46)",
        "(line 404,col 9)-(line 404,col 76)",
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 407,col 87)",
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testGetRootCauseStackTrace_Throwable()",
      "begin_line": 413,
      "end_line": 436,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 76)",
        "(line 416,col 9)-(line 416,col 57)",
        "(line 417,col 9)-(line 417,col 79)",
        "(line 418,col 9)-(line 418,col 30)",
        "(line 419,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 34)",
        "(line 427,col 9)-(line 427,col 73)",
        "(line 428,col 9)-(line 428,col 22)",
        "(line 429,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.testRemoveCommonFrames_ListList()",
      "begin_line": 438,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getMessage_Throwable()",
      "begin_line": 446,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 28)",
        "(line 448,col 9)-(line 448,col 56)",
        "(line 450,col 9)-(line 450,col 50)",
        "(line 451,col 9)-(line 451,col 86)",
        "(line 453,col 9)-(line 453,col 51)",
        "(line 454,col 9)-(line 454,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.test_getRootCauseMessage_Throwable()",
      "begin_line": 457,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 28)",
        "(line 459,col 9)-(line 459,col 65)",
        "(line 461,col 9)-(line 461,col 50)",
        "(line 462,col 9)-(line 462,col 95)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 474,
      "end_line": 495,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which matches the full signature (e.g. has a return value\n     * of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cause"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.String, java.lang.Throwable)",
      "begin_line": 477,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 478,col 13)-(line 478,col 23)",
        "(line 479,col 13)-(line 479,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.ExceptionWithCause(java.lang.Throwable)",
      "begin_line": 482,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 483,col 13)-(line 483,col 20)",
        "(line 484,col 13)-(line 484,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.getCause()",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 489,col 13)-(line 489,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithCause.setCause(java.lang.Throwable)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 13)-(line 493,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExceptionWithoutCause",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 502,
      "end_line": 506,
      "comment": "\n     * Provides a method with a well known chained/nested exception\n     * name which does not match the full signature (e.g. lacks a\n     * return value of \u003ccode\u003eThrowable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.ExceptionWithoutCause.getTargetException()",
      "begin_line": 503,
      "end_line": 505,
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
      "begin_line": 510,
      "end_line": 514,
      "comment": " prior to a rewrite of this test class. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException()",
      "begin_line": 511,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 512,col 38)-(line 512,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ExceptionUtilsTest.NestableException.NestableException(java.lang.Throwable)",
      "begin_line": 513,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 513,col 49)-(line 513,col 57)"
      ]
    }
  ]
}