{
  "filepath": "/tmp/Compress-19b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 37,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 43,
      "end_line": 101,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 53)",
        "(line 46,col 9)-(line 46,col 48)",
        "(line 47,col 9)-(line 47,col 48)",
        "(line 49,col 9)-(line 49,col 62)",
        "(line 50,col 9)-(line 50,col 38)",
        "(line 51,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 20)",
        "(line 69,col 9)-(line 69,col 51)",
        "(line 71,col 9)-(line 71,col 59)",
        "(line 72,col 9)-(line 72,col 37)",
        "(line 73,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 19)",
        "(line 96,col 9)-(line 96,col 40)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 54)",
        "(line 99,col 9)-(line 99,col 32)",
        "(line 100,col 9)-(line 100,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)",
        "(line 109,col 9)-(line 109,col 58)",
        "(line 110,col 9)-(line 110,col 101)",
        "(line 111,col 9)-(line 111,col 73)",
        "(line 112,col 9)-(line 112,col 86)",
        "(line 113,col 9)-(line 113,col 30)",
        "(line 114,col 9)-(line 114,col 20)",
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 123,
      "end_line": 134,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 125,col 52)",
        "(line 126,col 9)-(line 126,col 55)",
        "(line 127,col 9)-(line 127,col 28)",
        "(line 128,col 9)-(line 128,col 28)",
        "(line 129,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 54)",
        "(line 143,col 9)-(line 143,col 68)",
        "(line 144,col 9)-(line 144,col 20)",
        "(line 146,col 9)-(line 146,col 56)",
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 159,
      "end_line": 176,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 162,col 80)",
        "(line 163,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 187,
      "end_line": 219,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 71)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 193,col 9)-(line 193,col 37)",
        "(line 194,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 19)",
        "(line 215,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 216,col 38)",
        "(line 217,col 9)-(line 217,col 38)",
        "(line 218,col 9)-(line 218,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 221,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 44)",
        "(line 223,col 9)-(line 223,col 28)",
        "(line 224,col 9)-(line 224,col 42)",
        "(line 225,col 9)-(line 225,col 26)",
        "(line 226,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 256,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 28)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 26)",
        "(line 261,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 291,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 28)",
        "(line 294,col 9)-(line 294,col 42)",
        "(line 295,col 9)-(line 295,col 26)",
        "(line 296,col 9)-(line 296,col 35)",
        "(line 297,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 335,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 44)",
        "(line 337,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 338,col 42)",
        "(line 339,col 9)-(line 339,col 26)",
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 378,col 9)"
      ]
    }
  ]
}