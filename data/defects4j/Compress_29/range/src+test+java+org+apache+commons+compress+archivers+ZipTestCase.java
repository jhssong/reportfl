{
  "filepath": "/tmp/Compress-29b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 44,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 50,
      "end_line": 108,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 53)",
        "(line 53,col 9)-(line 53,col 48)",
        "(line 54,col 9)-(line 54,col 48)",
        "(line 56,col 9)-(line 56,col 62)",
        "(line 57,col 9)-(line 57,col 38)",
        "(line 58,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 20)",
        "(line 76,col 9)-(line 76,col 51)",
        "(line 78,col 9)-(line 78,col 59)",
        "(line 79,col 9)-(line 79,col 37)",
        "(line 80,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 19)",
        "(line 103,col 9)-(line 103,col 40)",
        "(line 104,col 9)-(line 104,col 37)",
        "(line 105,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 106,col 32)",
        "(line 107,col 9)-(line 107,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 101)",
        "(line 118,col 9)-(line 118,col 73)",
        "(line 119,col 9)-(line 119,col 86)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 20)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 55)",
        "(line 132,col 9)-(line 132,col 52)",
        "(line 133,col 9)-(line 133,col 55)",
        "(line 134,col 9)-(line 134,col 28)",
        "(line 135,col 9)-(line 135,col 28)",
        "(line 136,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 148,
      "end_line": 160,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 56)",
        "(line 157,col 9)-(line 157,col 84)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 173,col 80)",
        "(line 174,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 199,
      "end_line": 231,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 71)",
        "(line 202,col 9)-(line 202,col 55)",
        "(line 204,col 9)-(line 204,col 58)",
        "(line 205,col 9)-(line 205,col 37)",
        "(line 206,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 19)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 230,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 233,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 42)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 238,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 268,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 44)",
        "(line 270,col 9)-(line 270,col 28)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 26)",
        "(line 273,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "first_payload"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "second_payload"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allFilesPredicate"
      ],
      "begin_line": 304,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.Anonymous-68c8cdf7-e430-4138-8211-4c1e91d06741.test(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawEntriesFromFile()",
      "begin_line": 310,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 44)",
        "(line 314,col 9)-(line 314,col 83)",
        "(line 316,col 9)-(line 316,col 63)",
        "(line 317,col 9)-(line 317,col 68)",
        "(line 318,col 9)-(line 318,col 41)",
        "(line 319,col 9)-(line 319,col 38)",
        "(line 321,col 9)-(line 321,col 63)",
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 42)",
        "(line 324,col 9)-(line 324,col 40)",
        "(line 326,col 9)-(line 326,col 38)",
        "(line 327,col 9)-(line 327,col 38)",
        "(line 328,col 9)-(line 328,col 78)",
        "(line 329,col 9)-(line 329,col 77)",
        "(line 330,col 9)-(line 330,col 52)",
        "(line 331,col 9)-(line 331,col 52)",
        "(line 332,col 9)-(line 332,col 21)",
        "(line 336,col 9)-(line 336,col 54)",
        "(line 337,col 9)-(line 337,col 20)",
        "(line 338,col 9)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testCopyRawZip64EntryFromFile()",
      "begin_line": 341,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 44)",
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 346,col 76)",
        "(line 347,col 9)-(line 347,col 43)",
        "(line 348,col 9)-(line 348,col 31)",
        "(line 349,col 9)-(line 349,col 21)",
        "(line 351,col 9)-(line 351,col 67)",
        "(line 352,col 9)-(line 352,col 68)",
        "(line 353,col 9)-(line 353,col 42)",
        "(line 354,col 9)-(line 354,col 38)",
        "(line 356,col 9)-(line 356,col 38)",
        "(line 357,col 9)-(line 357,col 78)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 43)",
        "(line 360,col 9)-(line 360,col 52)",
        "(line 361,col 9)-(line 361,col 21)",
        "(line 362,col 9)-(line 362,col 54)",
        "(line 363,col 9)-(line 363,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testUnixModeInAddRaw()",
      "begin_line": 365,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 44)",
        "(line 369,col 9)-(line 369,col 71)",
        "(line 370,col 9)-(line 370,col 68)",
        "(line 372,col 9)-(line 372,col 67)",
        "(line 373,col 9)-(line 373,col 39)",
        "(line 374,col 9)-(line 374,col 50)",
        "(line 375,col 9)-(line 375,col 89)",
        "(line 376,col 9)-(line 376,col 20)",
        "(line 378,col 9)-(line 378,col 38)",
        "(line 379,col 9)-(line 379,col 52)",
        "(line 380,col 9)-(line 380,col 47)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createReferenceFile(java.io.File, org.apache.commons.compress.archivers.zip.Zip64Mode, java.lang.String)",
      "begin_line": 384,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 72)",
        "(line 386,col 9)-(line 386,col 75)",
        "(line 387,col 9)-(line 387,col 33)",
        "(line 388,col 9)-(line 388,col 30)",
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 390,col 20)",
        "(line 391,col 9)-(line 391,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createFirstEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 394,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 60)",
        "(line 396,col 9)-(line 396,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createSecondEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 61)",
        "(line 401,col 9)-(line 401,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.assertSameFileContents(java.io.File, java.io.File)",
      "begin_line": 405,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 78)",
        "(line 407,col 9)-(line 407,col 53)",
        "(line 408,col 9)-(line 408,col 49)",
        "(line 409,col 9)-(line 409,col 44)",
        "(line 410,col 9)-(line 410,col 42)",
        "(line 412,col 9)-(line 412,col 88)",
        "(line 413,col 9)-(line 413,col 92)",
        "(line 415,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 25)",
        "(line 439,col 9)-(line 439,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.createArchiveEntry(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, java.lang.String)",
      "begin_line": 443,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 55)",
        "(line 446,col 9)-(line 446,col 32)",
        "(line 448,col 9)-(line 448,col 38)",
        "(line 449,col 9)-(line 449,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 452,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 44)",
        "(line 454,col 9)-(line 454,col 28)",
        "(line 455,col 9)-(line 455,col 42)",
        "(line 456,col 9)-(line 456,col 26)",
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 496,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 44)",
        "(line 498,col 9)-(line 498,col 28)",
        "(line 499,col 9)-(line 499,col 42)",
        "(line 500,col 9)-(line 500,col 26)",
        "(line 501,col 9)-(line 501,col 35)",
        "(line 502,col 9)-(line 539,col 9)"
      ]
    }
  ]
}