{
  "filepath": "/tmp/Compress-3b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 40)",
        "(line 62,col 9)-(line 62,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 19)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 76,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 19)",
        "(line 78,col 9)-(line 78,col 25)",
        "(line 79,col 9)-(line 79,col 31)",
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 88,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 131,
      "end_line": 166,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     * \n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 39)",
        "(line 133,col 9)-(line 133,col 35)",
        "(line 134,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     * \n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 179,col 35)",
        "(line 180,col 9)-(line 180,col 55)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 191,
      "end_line": 207,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 39)",
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 216,
      "end_line": 234,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     * \n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 39)",
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List)",
      "begin_line": 245,
      "end_line": 255,
      "comment": "\n     * Checks if an archive contains all expected files.\n     * \n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 60)",
        "(line 248,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List, boolean)",
      "begin_line": 278,
      "end_line": 326,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @param cleanUp Cleans up resources if true \n     * @return returns the created result file if cleanUp \u003d false, or null otherwise \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 60)",
        "(line 281,col 9)-(line 281,col 24)",
        "(line 282,col 9)-(line 282,col 23)",
        "(line 284,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     * \n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 31)"
      ]
    }
  ]
}