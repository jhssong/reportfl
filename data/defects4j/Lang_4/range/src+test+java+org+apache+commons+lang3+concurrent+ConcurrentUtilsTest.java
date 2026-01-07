{
  "filepath": "/tmp/Lang-4b/src/test/java/org/apache/commons/lang3/concurrent/ConcurrentUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 555,
      "comment": "\n * Test class for {@link ConcurrentUtils}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Tests creating a ConcurrentException with a runtime exception as cause.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Tests creating a ConcurrentException with an error as cause.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Tests creating a ConcurrentException with null as cause.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with a runtime as cause.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with an error as cause.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Tries to create a ConcurrentRuntimeException with null as cause.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Tests extractCause() for a null exception.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause()",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Tests extractCause() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError()",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n     * Tests extractCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "\n     * Tests extractCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 66)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked()",
      "begin_line": 137,
      "end_line": 143,
      "comment": "\n     * Tests extractCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 142,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Tests extractCauseUnchecked() for a null exception.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 159,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError()",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException()",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 66)",
        "(line 182,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked()",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Tests extractCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 51)",
        "(line 196,col 9)-(line 197,col 67)",
        "(line 198,col 9)-(line 198,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError()",
      "begin_line": 204,
      "end_line": 213,
      "comment": "\n     * Tests handleCause() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "\n     * Tests handleCause() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 66)",
        "(line 221,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n     * Tests handleCause() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 51)",
        "(line 235,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull()",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n     * Tests handleCause() for a null parameter or a null cause. In this case\n     * the method should do nothing. We can only test that no exception is\n     * thrown.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError()",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an error.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 53)",
        "(line 260,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException()",
      "begin_line": 271,
      "end_line": 280,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is an unchecked exception.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 66)",
        "(line 274,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked()",
      "begin_line": 285,
      "end_line": 294,
      "comment": "\n     * Tests handleCauseUnchecked() if the cause is a checked exception.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 51)",
        "(line 288,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * Tests handleCauseUnchecked() for a null parameter or a null cause. In\n     * this case the method should do nothing. We can only test that no\n     * exception is thrown.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 51)",
        "(line 304,col 9)-(line 305,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull()",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Tests initialize() for a null argument.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize()",
      "begin_line": 320,
      "end_line": 332,
      "comment": "\n     * Tests a successful initialize() operation.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 325,col 57)",
        "(line 326,col 9)-(line 326,col 43)",
        "(line 327,col 9)-(line 327,col 54)",
        "(line 328,col 9)-(line 328,col 30)",
        "(line 329,col 9)-(line 330,col 35)",
        "(line 331,col 9)-(line 331,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull()",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Tests initializeUnchecked() for a null argument.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked()",
      "begin_line": 345,
      "end_line": 357,
      "comment": "\n     * Tests a successful initializeUnchecked() operation.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 350,col 57)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 54)",
        "(line 353,col 9)-(line 353,col 30)",
        "(line 354,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 356,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx()",
      "begin_line": 362,
      "end_line": 378,
      "comment": "\n     * Tests whether exceptions are correctly handled by initializeUnchecked().\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 367,col 57)",
        "(line 368,col 9)-(line 368,col 48)",
        "(line 369,col 9)-(line 369,col 77)",
        "(line 370,col 9)-(line 370,col 30)",
        "(line 371,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer()",
      "begin_line": 384,
      "end_line": 395,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 49)",
        "(line 387,col 9)-(line 387,col 75)",
        "(line 388,col 9)-(line 388,col 34)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 390,col 9)-(line 390,col 60)",
        "(line 391,col 9)-(line 391,col 48)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 393,col 39)",
        "(line 394,col 9)-(line 394,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null()",
      "begin_line": 400,
      "end_line": 411,
      "comment": "\n     * Tests constant future.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 35)",
        "(line 403,col 9)-(line 403,col 75)",
        "(line 404,col 9)-(line 404,col 34)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 60)",
        "(line 407,col 9)-(line 407,col 48)",
        "(line 408,col 9)-(line 408,col 40)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyPresent()",
      "begin_line": 417,
      "end_line": 426,
      "comment": "\n     * Tests putIfAbsent() if the map contains the key in question.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 37)",
        "(line 420,col 9)-(line 420,col 33)",
        "(line 421,col 9)-(line 421,col 92)",
        "(line 422,col 9)-(line 422,col 28)",
        "(line 423,col 9)-(line 424,col 58)",
        "(line 425,col 9)-(line 425,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyNotPresent()",
      "begin_line": 431,
      "end_line": 439,
      "comment": "\n     * Tests putIfAbsent() if the map does not contain the key in question.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 37)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 435,col 92)",
        "(line 436,col 9)-(line 437,col 62)",
        "(line 438,col 9)-(line 438,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentNullMap()",
      "begin_line": 444,
      "end_line": 448,
      "comment": "\n     * Tests putIfAbsent() if a null map is passed in.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 447,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyPresent()",
      "begin_line": 453,
      "end_line": 468,
      "comment": "\n     * Tests createIfAbsent() if the key is found in the map.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 458,col 57)",
        "(line 459,col 9)-(line 459,col 30)",
        "(line 460,col 9)-(line 460,col 37)",
        "(line 461,col 9)-(line 461,col 33)",
        "(line 462,col 9)-(line 462,col 92)",
        "(line 463,col 9)-(line 463,col 28)",
        "(line 464,col 9)-(line 465,col 64)",
        "(line 466,col 9)-(line 466,col 64)",
        "(line 467,col 9)-(line 467,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyNotPresent()",
      "begin_line": 473,
      "end_line": 488,
      "comment": "\n     * Tests createIfAbsent() if the map does not contain the key in question.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 478,col 57)",
        "(line 479,col 9)-(line 479,col 37)",
        "(line 480,col 9)-(line 480,col 33)",
        "(line 481,col 9)-(line 481,col 53)",
        "(line 482,col 9)-(line 482,col 30)",
        "(line 483,col 9)-(line 483,col 92)",
        "(line 484,col 9)-(line 485,col 64)",
        "(line 486,col 9)-(line 486,col 64)",
        "(line 487,col 9)-(line 487,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullMap()",
      "begin_line": 493,
      "end_line": 503,
      "comment": "\n     * Tests createIfAbsent() if a null map is passed in.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 498,col 57)",
        "(line 499,col 9)-(line 499,col 30)",
        "(line 500,col 9)-(line 501,col 68)",
        "(line 502,col 9)-(line 502,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullInit()",
      "begin_line": 508,
      "end_line": 517,
      "comment": "\n     * Tests createIfAbsent() if a null initializer is passed in.\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 92)",
        "(line 511,col 9)-(line 511,col 37)",
        "(line 512,col 9)-(line 512,col 33)",
        "(line 513,col 9)-(line 513,col 28)",
        "(line 514,col 9)-(line 515,col 64)",
        "(line 516,col 9)-(line 516,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedSuccess()",
      "begin_line": 522,
      "end_line": 531,
      "comment": "\n     * Tests createIfAbsentUnchecked() if no exception is thrown.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 37)",
        "(line 525,col 9)-(line 525,col 33)",
        "(line 526,col 9)-(line 526,col 92)",
        "(line 527,col 9)-(line 529,col 66)",
        "(line 530,col 9)-(line 530,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedException()",
      "begin_line": 536,
      "end_line": 554,
      "comment": "\n     * Tests createIfAbsentUnchecked() if an exception is thrown.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 542,col 57)",
        "(line 543,col 9)-(line 543,col 45)",
        "(line 544,col 9)-(line 544,col 74)",
        "(line 545,col 9)-(line 545,col 30)",
        "(line 546,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 30)"
      ]
    }
  ]
}