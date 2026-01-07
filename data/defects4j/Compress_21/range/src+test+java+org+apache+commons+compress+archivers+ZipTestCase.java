{
  "filepath": "/tmp/Compress-21b/src/test/java/org/apache/commons/compress/archivers/ZipTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipTestCase",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 38,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipArchiveCreation()",
      "begin_line": 44,
      "end_line": 102,
      "comment": "\n     * Archives 2 files and unarchives it again. If the file length of result\n     * and source is the same, it looks like the operations have worked\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 53)",
        "(line 47,col 9)-(line 47,col 48)",
        "(line 48,col 9)-(line 48,col 48)",
        "(line 50,col 9)-(line 50,col 62)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 20)",
        "(line 70,col 9)-(line 70,col 51)",
        "(line 72,col 9)-(line 72,col 59)",
        "(line 73,col 9)-(line 73,col 37)",
        "(line 74,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 19)",
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 37)",
        "(line 99,col 9)-(line 99,col 54)",
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testZipUnarchive()",
      "begin_line": 108,
      "end_line": 117,
      "comment": "\n     * Simple unarchive test. Asserts nothing.\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 46)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 111,col 9)-(line 111,col 101)",
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 86)",
        "(line 114,col 9)-(line 114,col 30)",
        "(line 115,col 9)-(line 115,col 20)",
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipsPK00Prefix()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n     * Test case for \n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-208\"\n     * \u003eCOMPRESS-208\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 55)",
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 28)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSupportedCompressionMethod()",
      "begin_line": 142,
      "end_line": 154,
      "comment": "\n     * Test case for\n     * \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     * \u003eCOMPRESS-93\u003c/a\u003e.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 56)",
        "(line 150,col 9)-(line 150,col 56)",
        "(line 151,col 9)-(line 151,col 84)",
        "(line 152,col 9)-(line 152,col 50)",
        "(line 153,col 9)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testSkipEntryWithUnsupportedCompressionMethod()",
      "begin_line": 164,
      "end_line": 182,
      "comment": "\n     * Test case for being able to skip an entry in an \n     * {@link ZipArchiveInputStream} even if the compression method of that\n     * entry is unsupported.\n     *\n     * @see \u003ca href\u003d\"https://issues.apache.org/jira/browse/COMPRESS-93\"\n     *        \u003eCOMPRESS-93\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 80)",
        "(line 168,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testListAllFilesWithNestedArchive()",
      "begin_line": 193,
      "end_line": 225,
      "comment": "\n     * Checks if all entries from a nested archive can be read.\n     * The archive: OSX_ArchiveWithNestedArchive.zip contains:\n     * NestedArchiv.zip and test.xml3.\n     * \n     * The nested archive:  NestedArchive.zip contains test1.xml and test2.xml\n     * \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 71)",
        "(line 196,col 9)-(line 196,col 55)",
        "(line 198,col 9)-(line 198,col 58)",
        "(line 199,col 9)-(line 199,col 37)",
        "(line 200,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 19)",
        "(line 221,col 9)-(line 221,col 45)",
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 224,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testDirectoryEntryFromFile()",
      "begin_line": 227,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 44)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 231,col 26)",
        "(line 232,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitDirectoryEntry()",
      "begin_line": 262,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 44)",
        "(line 264,col 9)-(line 264,col 28)",
        "(line 265,col 9)-(line 265,col 42)",
        "(line 266,col 9)-(line 266,col 26)",
        "(line 267,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testFileEntryFromFile()",
      "begin_line": 297,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 299,col 28)",
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 26)",
        "(line 302,col 9)-(line 302,col 35)",
        "(line 303,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ZipTestCase.testExplicitFileEntry()",
      "begin_line": 341,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 28)",
        "(line 344,col 9)-(line 344,col 42)",
        "(line 345,col 9)-(line 345,col 26)",
        "(line 346,col 9)-(line 346,col 35)",
        "(line 347,col 9)-(line 384,col 9)"
      ]
    }
  ]
}