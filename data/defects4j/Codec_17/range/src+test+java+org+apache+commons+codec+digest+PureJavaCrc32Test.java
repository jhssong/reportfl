{
  "filepath": "/tmp/Codec-17b/src/test/java/org/apache/commons/codec/digest/PureJavaCrc32Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureJavaCrc32Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 398,
      "comment": "\r\n * Unit test to verify that the pure-Java CRC32 algorithm gives\r\n * the same results as the built-in implementation.\r\n *\r\n * Copied from Hadoop 2.6.3 (Renamed TestPureJavaCrc32 to PureJavaCrc32Test).\r\n * @since 1.11\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "theirs"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ours"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.testCorrectness()",
      "begin_line": 45,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 16)",
        "(line 49,col 5)-(line 49,col 23)",
        "(line 50,col 5)-(line 50,col 21)",
        "(line 51,col 5)-(line 51,col 16)",
        "(line 53,col 5)-(line 53,col 54)",
        "(line 55,col 5)-(line 55,col 58)",
        "(line 57,col 5)-(line 61,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.checkOnBytes(byte[], boolean)",
      "begin_line": 65,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 19)",
        "(line 67,col 5)-(line 67,col 17)",
        "(line 68,col 5)-(line 68,col 16)",
        "(line 70,col 5)-(line 74,col 5)",
        "(line 76,col 5)-(line 79,col 5)",
        "(line 81,col 5)-(line 81,col 19)",
        "(line 82,col 5)-(line 82,col 17)",
        "(line 84,col 5)-(line 84,col 40)",
        "(line 85,col 5)-(line 85,col 42)",
        "(line 86,col 5)-(line 89,col 5)",
        "(line 91,col 5)-(line 91,col 16)",
        "(line 93,col 5)-(line 97,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.checkSame()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Table",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 108,
      "end_line": 208,
      "comment": "\r\n   * Generate a table to perform checksums based on the same CRC-32 polynomial\r\n   * that java.util.zip.CRC32 uses.\r\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tables"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.Table.Table(int, int, long)",
      "begin_line": 111,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 34)",
        "(line 114,col 7)-(line 114,col 34)",
        "(line 115,col 7)-(line 117,col 7)",
        "(line 120,col 7)-(line 120,col 36)",
        "(line 121,col 7)-(line 132,col 7)",
        "(line 135,col 7)-(line 135,col 40)",
        "(line 136,col 7)-(line 142,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.Table.toStrings(java.lang.String)",
      "begin_line": 145,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 146,col 7)-(line 146,col 51)",
        "(line 147,col 7)-(line 158,col 7)",
        "(line 159,col 7)-(line 159,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.Table.toString()",
      "begin_line": 162,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 50)",
        "(line 166,col 7)-(line 167,col 64)",
        "(line 168,col 7)-(line 168,col 94)",
        "(line 170,col 7)-(line 173,col 7)",
        "(line 175,col 7)-(line 175,col 63)",
        "(line 176,col 7)-(line 179,col 7)",
        "(line 180,col 7)-(line 180,col 40)",
        "(line 181,col 7)-(line 181,col 24)",
        "(line 182,col 7)-(line 182,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.Table.main(java.lang.String[])",
      "begin_line": 186,
      "end_line": 207,
      "comment": " Generate CRC-32 lookup tables ",
      "child_ranges": [
        "(line 187,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 192,col 52)",
        "(line 194,col 7)-(line 194,col 16)",
        "(line 195,col 7)-(line 195,col 51)",
        "(line 196,col 7)-(line 196,col 36)",
        "(line 197,col 7)-(line 197,col 28)",
        "(line 200,col 7)-(line 201,col 60)",
        "(line 202,col 7)-(line 206,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 220,
      "end_line": 397,
      "comment": "\r\n   * Performance tests to compare performance of the Pure Java implementation\r\n   * to the built-in java.util.zip implementation. This can be run from the\r\n   * command line with:\r\n   *\r\n   *   java -cp path/to/test/classes:path/to/common/classes \\\r\n   *      \u0027org.apache.hadoop.util.TestPureJavaCrc32$PerformanceTest\u0027\r\n   *\r\n   * The output is in JIRA table format.\r\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_LEN"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " up to 32MB chunks"
    },
    {
      "type": "field",
      "varNames": [
        "BYTES_PER_SIZE"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zip"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CRCS"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.main(java.lang.String[])",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 233,col 7)-(line 233,col 40)",
        "(line 234,col 7)-(line 234,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printCell(java.lang.String, int, java.io.PrintStream)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 58)",
        "(line 239,col 7)-(line 239,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(java.util.List\u003cjava.lang.Class\u003c? extends java.util.zip.Checksum\u003e\u003e, java.io.PrintStream)",
      "begin_line": 242,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 45)",
        "(line 245,col 7)-(line 245,col 36)",
        "(line 248,col 7)-(line 248,col 77)",
        "(line 251,col 7)-(line 254,col 7)",
        "(line 257,col 7)-(line 259,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(java.util.List\u003cjava.lang.Class\u003c? extends java.util.zip.Checksum\u003e\u003e, byte[], int, java.io.PrintStream)",
      "begin_line": 262,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 44)",
        "(line 265,col 7)-(line 265,col 40)",
        "(line 266,col 7)-(line 266,col 38)",
        "(line 268,col 7)-(line 268,col 21)",
        "(line 269,col 7)-(line 269,col 37)",
        "(line 270,col 7)-(line 270,col 39)",
        "(line 271,col 7)-(line 278,col 7)",
        "(line 279,col 7)-(line 279,col 23)",
        "(line 281,col 7)-(line 313,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.doBench(java.lang.Class\u003c? extends java.util.zip.Checksum\u003e, int, byte[], int)",
      "begin_line": 316,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 320,col 54)",
        "(line 321,col 7)-(line 321,col 68)",
        "(line 323,col 7)-(line 346,col 7)",
        "(line 348,col 7)-(line 350,col 7)",
        "(line 351,col 7)-(line 353,col 7)",
        "(line 355,col 7)-(line 355,col 45)",
        "(line 356,col 7)-(line 356,col 35)",
        "(line 357,col 7)-(line 362,col 7)",
        "(line 363,col 7)-(line 363,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.Anonymous-46e78fde-1660-4bcd-b6e9-db8a60748904.run()",
      "begin_line": 333,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 335,col 15)-(line 335,col 48)",
        "(line 336,col 15)-(line 336,col 26)",
        "(line 337,col 15)-(line 339,col 15)",
        "(line 340,col 15)-(line 340,col 48)",
        "(line 341,col 15)-(line 341,col 61)",
        "(line 342,col 15)-(line 342,col 88)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BenchResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 366,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " CRC value "
    },
    {
      "type": "field",
      "varNames": [
        "mbps"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Speed (MB per second) "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.BenchResult.BenchResult(long, double)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 27)",
        "(line 374,col 9)-(line 374,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.PureJavaCrc32Test.PerformanceTest.printSystemProperties(java.io.PrintStream)",
      "begin_line": 378,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 379,col 7)-(line 391,col 8)",
        "(line 392,col 7)-(line 392,col 50)",
        "(line 393,col 7)-(line 395,col 7)"
      ]
    }
  ]
}