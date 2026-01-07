{
  "filepath": "/tmp/Lang-20b/src/test/java/org/apache/commons/lang3/concurrent/TimedSemaphoreTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimedSemaphoreTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 480,
      "comment": "\n * Test class for TimedSemaphore.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PERIOD"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Constant for the time period. "
    },
    {
      "type": "field",
      "varNames": [
        "UNIT"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Constant for the time unit. "
    },
    {
      "type": "field",
      "varNames": [
        "LIMIT"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Constant for the default limit. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInit()",
      "begin_line": 52,
      "end_line": 69,
      "comment": "\n     * Tests creating a new instance.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 60)",
        "(line 56,col 9)-(line 56,col 33)",
        "(line 57,col 9)-(line 58,col 23)",
        "(line 59,col 9)-(line 59,col 33)",
        "(line 60,col 9)-(line 60,col 79)",
        "(line 61,col 9)-(line 61,col 68)",
        "(line 62,col 9)-(line 62,col 62)",
        "(line 63,col 9)-(line 64,col 45)",
        "(line 65,col 9)-(line 66,col 50)",
        "(line 67,col 9)-(line 67,col 64)",
        "(line 68,col 9)-(line 68,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitInvalidPeriod()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Tries to create an instance with a negative period. This should cause an\n     * exception.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitDefaultService()",
      "begin_line": 84,
      "end_line": 95,
      "comment": "\n     * Tests whether a default executor service is created if no service is\n     * provided.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 75)",
        "(line 87,col 9)-(line 88,col 38)",
        "(line 89,col 9)-(line 90,col 72)",
        "(line 91,col 9)-(line 92,col 70)",
        "(line 93,col 9)-(line 93,col 59)",
        "(line 94,col 9)-(line 94,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testStartTimer()",
      "begin_line": 100,
      "end_line": 116,
      "comment": "\n     * Tests starting the timer.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 29)",
        "(line 104,col 9)-(line 104,col 59)",
        "(line 105,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 106,col 29)",
        "(line 107,col 9)-(line 107,col 30)",
        "(line 108,col 9)-(line 108,col 22)",
        "(line 109,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownOwnExecutor()",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Tests the shutdown() method if the executor belongs to the semaphore. In\n     * this case it has to be shut down.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 75)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 126,col 9)-(line 126,col 59)",
        "(line 127,col 9)-(line 128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorNoTask()",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     * Tests the shutdown() method for a shared executor service before a task\n     * was started. This should do pretty much nothing.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 138,col 60)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 140,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 29)",
        "(line 143,col 9)-(line 143,col 59)",
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.prepareStartTimer(java.util.concurrent.ScheduledExecutorService, java.util.concurrent.ScheduledFuture\u003c?\u003e)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\n     * Prepares an executor service mock to expect the start of the timer.\n     *\n     * @param service the mock\n     * @param future the future\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 69)",
        "(line 157,col 9)-(line 157,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorTask()",
      "begin_line": 164,
      "end_line": 178,
      "comment": "\n     * Tests the shutdown() method for a shared executor after the task was\n     * started. In this case the task must be canceled.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 60)",
        "(line 168,col 9)-(line 168,col 79)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 87)",
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 173,col 37)",
        "(line 174,col 9)-(line 174,col 28)",
        "(line 175,col 9)-(line 175,col 29)",
        "(line 176,col 9)-(line 176,col 59)",
        "(line 177,col 9)-(line 177,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownMultipleTimes()",
      "begin_line": 183,
      "end_line": 198,
      "comment": "\n     * Tests multiple invocations of the shutdown() method.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 186,col 60)",
        "(line 187,col 9)-(line 187,col 79)",
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 87)",
        "(line 190,col 9)-(line 190,col 41)",
        "(line 191,col 9)-(line 192,col 37)",
        "(line 193,col 9)-(line 193,col 28)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireLimit()",
      "begin_line": 203,
      "end_line": 232,
      "comment": "\n     * Tests the acquire() method if a limit is set.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 206,col 60)",
        "(line 207,col 9)-(line 207,col 79)",
        "(line 208,col 9)-(line 208,col 43)",
        "(line 209,col 9)-(line 209,col 41)",
        "(line 210,col 9)-(line 210,col 29)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 212,col 9)-(line 212,col 80)",
        "(line 213,col 9)-(line 214,col 27)",
        "(line 215,col 9)-(line 215,col 38)",
        "(line 218,col 9)-(line 218,col 18)",
        "(line 219,col 9)-(line 219,col 22)",
        "(line 221,col 9)-(line 222,col 36)",
        "(line 225,col 9)-(line 225,col 32)",
        "(line 226,col 9)-(line 226,col 17)",
        "(line 227,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 230,col 45)",
        "(line 231,col 9)-(line 231,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultipleThreads()",
      "begin_line": 240,
      "end_line": 268,
      "comment": "\n     * Tests the acquire() method if more threads are involved than the limit.\n     * This method starts a number of threads that all invoke the semaphore. The\n     * semaphore\u0027s limit is set to 1, so in each period only a single thread can\n     * acquire the semaphore.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 243,col 60)",
        "(line 244,col 9)-(line 244,col 79)",
        "(line 245,col 9)-(line 245,col 43)",
        "(line 246,col 9)-(line 246,col 41)",
        "(line 247,col 9)-(line 248,col 33)",
        "(line 249,col 9)-(line 249,col 48)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 63)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireNoLimit()",
      "begin_line": 275,
      "end_line": 290,
      "comment": "\n     * Tests the acquire() method if no limit is set. A test thread is started\n     * that calls the semaphore a large number of times. Even if the semaphore\u0027s\n     * period does not end, the thread should never block.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 60)",
        "(line 279,col 9)-(line 279,col 79)",
        "(line 280,col 9)-(line 280,col 43)",
        "(line 281,col 9)-(line 281,col 41)",
        "(line 282,col 9)-(line 283,col 55)",
        "(line 284,col 9)-(line 284,col 31)",
        "(line 285,col 9)-(line 285,col 57)",
        "(line 286,col 9)-(line 286,col 80)",
        "(line 287,col 9)-(line 287,col 18)",
        "(line 288,col 9)-(line 288,col 22)",
        "(line 289,col 9)-(line 289,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testPassAfterShutdown()",
      "begin_line": 295,
      "end_line": 300,
      "comment": "\n     * Tries to call acquire() after shutdown(). This should cause an exception.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 75)",
        "(line 298,col 9)-(line 298,col 29)",
        "(line 299,col 9)-(line 299,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultiplePeriods()",
      "begin_line": 308,
      "end_line": 320,
      "comment": "\n     * Tests a bigger number of invocations that span multiple periods. The\n     * period is set to a very short time. A background thread calls the\n     * semaphore a large number of times. While it runs at last one end of a\n     * period should be reached.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 31)",
        "(line 311,col 9)-(line 312,col 55)",
        "(line 313,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 57)",
        "(line 315,col 9)-(line 315,col 80)",
        "(line 316,col 9)-(line 316,col 18)",
        "(line 317,col 9)-(line 317,col 22)",
        "(line 318,col 9)-(line 318,col 29)",
        "(line 319,col 9)-(line 319,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAverageCallsPerPeriod()",
      "begin_line": 325,
      "end_line": 344,
      "comment": "\n     * Tests the methods for statistics.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 328,col 60)",
        "(line 329,col 9)-(line 329,col 79)",
        "(line 330,col 9)-(line 330,col 43)",
        "(line 331,col 9)-(line 331,col 41)",
        "(line 332,col 9)-(line 333,col 23)",
        "(line 334,col 9)-(line 334,col 28)",
        "(line 335,col 9)-(line 335,col 32)",
        "(line 336,col 9)-(line 337,col 51)",
        "(line 338,col 9)-(line 338,col 28)",
        "(line 339,col 9)-(line 339,col 28)",
        "(line 340,col 9)-(line 340,col 32)",
        "(line 341,col 9)-(line 342,col 51)",
        "(line 343,col 9)-(line 343,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAvailablePermits()",
      "begin_line": 349,
      "end_line": 367,
      "comment": "\n     * Tests whether the available non-blocking calls can be queried.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 352,col 60)",
        "(line 353,col 9)-(line 353,col 79)",
        "(line 354,col 9)-(line 354,col 43)",
        "(line 355,col 9)-(line 355,col 41)",
        "(line 356,col 9)-(line 357,col 23)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 32)",
        "(line 364,col 9)-(line 365,col 40)",
        "(line 366,col 9)-(line 366,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TimedSemaphoreTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.TimedSemaphore"
      ],
      "begin_line": 373,
      "end_line": 433,
      "comment": "\n     * A specialized implementation of {@code TimedSemaphore} that is easier to\n     * test.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "schedFuture"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " A mock scheduled future. "
    },
    {
      "type": "field",
      "varNames": [
        "latch"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " A latch for synchronizing with the main thread. "
    },
    {
      "type": "field",
      "varNames": [
        "periodEnds"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Counter for the endOfPeriod() invocations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.TimedSemaphoreTestImpl(long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 13)-(line 385,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.TimedSemaphoreTestImpl(java.util.concurrent.ScheduledExecutorService, long, java.util.concurrent.TimeUnit, int)",
      "begin_line": 388,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 390,col 13)-(line 390,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.getPeriodEnds()",
      "begin_line": 398,
      "end_line": 402,
      "comment": "\n         * Returns the number of invocations of the endOfPeriod() method.\n         *\n         * @return the endOfPeriod() invocations\n         ",
      "child_ranges": [
        "(line 399,col 13)-(line 401,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.acquire()",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n         * Invokes the latch if one is set.\n         ",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 28)",
        "(line 410,col 13)-(line 412,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.endOfPeriod()",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n         * Counts the number of invocations.\n         ",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 32)",
        "(line 421,col 13)-(line 423,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.TimedSemaphoreTestImpl.startTimer()",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n         * Either returns the mock future or calls the super method.\n         ",
      "child_ranges": [
        "(line 431,col 13)-(line 431,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SemaphoreThread",
      "is_interface": false,
      "parent_types": [
        "java.lang.Thread"
      ],
      "begin_line": 440,
      "end_line": 479,
      "comment": "\n     * A test thread class that will be used by tests for triggering the\n     * semaphore. The thread calls the semaphore a configurable number of times.\n     * When this is done, it can notify the main thread.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "semaphore"
      ],
      "begin_line": 442,
      "end_line": 442,
      "comment": " The semaphore. "
    },
    {
      "type": "field",
      "varNames": [
        "latch"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": " A latch for communication with the main thread. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 448,
      "end_line": 448,
      "comment": " The number of acquire() calls. "
    },
    {
      "type": "field",
      "varNames": [
        "latchCount"
      ],
      "begin_line": 451,
      "end_line": 451,
      "comment": " The number of invocations of the latch. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.SemaphoreThread.SemaphoreThread(org.apache.commons.lang3.concurrent.TimedSemaphore, java.util.concurrent.CountDownLatch, int, int)",
      "begin_line": 453,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 26)",
        "(line 455,col 13)-(line 455,col 22)",
        "(line 456,col 13)-(line 456,col 22)",
        "(line 457,col 13)-(line 457,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.TimedSemaphoreTest.SemaphoreThread.run()",
      "begin_line": 465,
      "end_line": 478,
      "comment": "\n         * Calls acquire() on the semaphore for the specified number of times.\n         * Optionally the latch will also be triggered to synchronize with the\n         * main test thread.\n         ",
      "child_ranges": [
        "(line 467,col 13)-(line 477,col 13)"
      ]
    }
  ]
}