{
  "filepath": "/tmp/Lang-38b/src/test/org/apache/commons/lang3/concurrent/BackgroundInitializerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BackgroundInitializerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 27,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.checkInitialize(org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl)",
      "begin_line": 34,
      "end_line": 43,
      "comment": "\n     * Helper method for checking whether the initialize() method was correctly\n     * called. start() must already have been invoked.\n     *\n     * @param init the initializer to test\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 42,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitialize()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Tests whether initialize() is invoked.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 81)",
        "(line 50,col 9)-(line 50,col 21)",
        "(line 51,col 9)-(line 51,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorBeforeStart()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Tries to obtain the executor before start(). It should not have been\n     * initialized yet.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 81)",
        "(line 60,col 9)-(line 60,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorExternal()",
      "begin_line": 66,
      "end_line": 77,
      "comment": "\n     * Tests whether an external executor is correctly detected.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 67)",
        "(line 68,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorTemp()",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\n     * Tests getActiveExecutor() for a temporary executor.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 81)",
        "(line 84,col 9)-(line 84,col 21)",
        "(line 85,col 9)-(line 85,col 70)",
        "(line 86,col 9)-(line 86,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitializeTempExecutor()",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n     * Tests the execution of the background task if a temporary executor has to\n     * be created.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 81)",
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 30)",
        "(line 97,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutor()",
      "begin_line": 105,
      "end_line": 119,
      "comment": "\n     * Tests whether an external executor can be set using the\n     * setExternalExecutor() method.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 63)",
        "(line 107,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutorAfterStart()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Tests that setting an executor after start() causes an exception.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 81)",
        "(line 126,col 9)-(line 126,col 21)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testStartMultipleTimes()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Tests invoking start() multiple times. Only the first invocation should\n     * have an effect.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 81)",
        "(line 141,col 9)-(line 141,col 61)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetBeforeStart()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "\n     * Tests calling get() before start(). This should cause an exception.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 81)",
        "(line 153,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetRuntimeException()",
      "begin_line": 165,
      "end_line": 176,
      "comment": "\n     * Tests the get() method if background processing causes a runtime\n     * exception.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 81)",
        "(line 167,col 9)-(line 167,col 54)",
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetCheckedException()",
      "begin_line": 182,
      "end_line": 193,
      "comment": "\n     * Tests the get() method if background processing causes a checked\n     * exception.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 81)",
        "(line 184,col 9)-(line 184,col 39)",
        "(line 185,col 9)-(line 185,col 21)",
        "(line 186,col 9)-(line 186,col 21)",
        "(line 187,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetInterruptedException()",
      "begin_line": 198,
      "end_line": 227,
      "comment": "\n     * Tests the get() method if waiting for the initialization is interrupted.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 67)",
        "(line 200,col 9)-(line 201,col 22)",
        "(line 202,col 9)-(line 202,col 60)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 204,col 21)",
        "(line 205,col 9)-(line 205,col 102)",
        "(line 206,col 9)-(line 220,col 10)",
        "(line 221,col 9)-(line 221,col 26)",
        "(line 222,col 9)-(line 222,col 30)",
        "(line 223,col 9)-(line 223,col 23)",
        "(line 224,col 9)-(line 224,col 27)",
        "(line 225,col 9)-(line 225,col 69)",
        "(line 226,col 9)-(line 226,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.Anonymous-30500c63-7ba4-47e3-ae3c-32bfe0bc1709.run()",
      "begin_line": 207,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 209,col 17)-(line 218,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedFalse()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Tests isStarted() before start() was called.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 81)",
        "(line 234,col 9)-(line 234,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedTrue()",
      "begin_line": 240,
      "end_line": 244,
      "comment": "\n     * Tests isStarted() after start().\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 81)",
        "(line 242,col 9)-(line 242,col 21)",
        "(line 243,col 9)-(line 243,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedAfterGet()",
      "begin_line": 249,
      "end_line": 254,
      "comment": "\n     * Tests isStarted() after the background task has finished.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 81)",
        "(line 251,col 9)-(line 251,col 21)",
        "(line 252,col 9)-(line 252,col 30)",
        "(line 253,col 9)-(line 253,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackgroundInitializerTestImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.BackgroundInitializer\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 260,
      "end_line": 293,
      "comment": "\n     * A concrete implementation of BackgroundInitializer. It also overloads\n     * some methods that simplify testing.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ex"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": " An exception to be thrown by initialize(). "
    },
    {
      "type": "field",
      "varNames": [
        "shouldSleep"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " A flag whether the background task should sleep a while. "
    },
    {
      "type": "field",
      "varNames": [
        "initializeCalls"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " The number of invocations of initialize(). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.BackgroundInitializerTestImpl()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.BackgroundInitializerTestImpl(java.util.concurrent.ExecutorService)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.BackgroundInitializerTest.BackgroundInitializerTestImpl.initialize()",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n         * Records this invocation. Optionally throws an exception or sleeps a\n         * while.\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 287,col 13)",
        "(line 288,col 13)-(line 290,col 13)",
        "(line 291,col 13)-(line 291,col 37)"
      ]
    }
  ]
}