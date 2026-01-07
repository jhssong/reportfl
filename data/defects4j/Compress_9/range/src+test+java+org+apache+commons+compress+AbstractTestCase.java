{
  "filepath": "/tmp/Compress-9b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 60,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 27)",
        "(line 63,col 9)-(line 63,col 40)",
        "(line 64,col 9)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 67,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 19)",
        "(line 70,col 9)-(line 70,col 18)",
        "(line 71,col 9)-(line 71,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 78,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 19)",
        "(line 81,col 9)-(line 81,col 25)",
        "(line 82,col 9)-(line 82,col 31)",
        "(line 83,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 89,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 30)",
        "(line 91,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ON_WINDOWS"
      ],
      "begin_line": 109,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tryHardToDelete(java.io.File)",
      "begin_line": 121,
      "end_line": 134,
      "comment": "\n     * Accommodate Windows bug encountered in both Sun and IBM JDKs.\n     * Others possible. If the delete does not work, call System.gc(),\n     * wait a little and try again.\n     *\n     * @return whether deletion was successful\n     * @since Stolen from FileUtils in Ant 1.8.0\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 160,
      "end_line": 197,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     * \n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 207,
      "end_line": 214,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     * \n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 70)",
        "(line 210,col 9)-(line 210,col 35)",
        "(line 211,col 9)-(line 211,col 55)",
        "(line 212,col 9)-(line 212,col 32)",
        "(line 213,col 9)-(line 213,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 222,
      "end_line": 240,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 39)",
        "(line 224,col 9)-(line 224,col 35)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 249,
      "end_line": 269,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     * \n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 39)",
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 46)",
        "(line 253,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 280,
      "end_line": 290,
      "comment": "\n     * Checks if an archive contains all expected files.\n     * \n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 60)",
        "(line 283,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 313,
      "end_line": 363,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     * \n     * @param in\n     * @param expected list of expected entries or \u003ccode\u003enull\u003c/code\u003e if no check of names desired\n     * @param cleanUp Cleans up resources if true \n     * @return returns the created result file if cleanUp \u003d false, or null otherwise \n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 42)",
        "(line 316,col 9)-(line 316,col 30)",
        "(line 318,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     * \n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 381,
      "end_line": 393,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 39)",
        "(line 383,col 9)-(line 383,col 30)",
        "(line 384,col 9)-(line 384,col 67)",
        "(line 385,col 9)-(line 385,col 31)",
        "(line 386,col 9)-(line 386,col 61)",
        "(line 387,col 9)-(line 392,col 9)"
      ]
    }
  ]
}