{
  "filepath": "/tmp/Compress-16b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 392,
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
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)",
        "(line 62,col 9)-(line 62,col 40)",
        "(line 63,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 47)",
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 18)",
        "(line 70,col 9)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 77,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 19)",
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 88,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ON_WINDOWS"
      ],
      "begin_line": 108,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tryHardToDelete(java.io.File)",
      "begin_line": 120,
      "end_line": 133,
      "comment": "\n     * Accommodate Windows bug encountered in both Sun and IBM JDKs.\n     * Others possible. If the delete does not work, call System.gc(),\n     * wait a little and try again.\n     *\n     * @return whether deletion was successful\n     * @since Stolen from FileUtils in Ant 1.8.0\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 159,
      "end_line": 196,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     * \n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 162,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 206,
      "end_line": 213,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     * \n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 70)",
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 55)",
        "(line 211,col 9)-(line 211,col 32)",
        "(line 212,col 9)-(line 212,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 221,
      "end_line": 239,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 35)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 225,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 248,
      "end_line": 268,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     * \n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 279,
      "end_line": 289,
      "comment": "\n     * Checks if an archive contains all expected files.\n     * \n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 60)",
        "(line 282,col 9)-(line 288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 312,
      "end_line": 361,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @param cleanUp Cleans up resources if true \n     * @return returns the created result file if cleanUp \u003d false, or null otherwise \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 42)",
        "(line 315,col 9)-(line 315,col 30)",
        "(line 317,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     * \n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 379,
      "end_line": 391,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 39)",
        "(line 381,col 9)-(line 381,col 30)",
        "(line 382,col 9)-(line 382,col 67)",
        "(line 383,col 9)-(line 383,col 31)",
        "(line 384,col 9)-(line 384,col 61)",
        "(line 385,col 9)-(line 390,col 9)"
      ]
    }
  ]
}