{
  "filepath": "/tmp/Compress-20b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase()",
      "begin_line": 54,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.AbstractTestCase.AbstractTestCase(java.lang.String)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 27)",
        "(line 64,col 9)-(line 64,col 40)",
        "(line 65,col 9)-(line 65,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 70,col 19)",
        "(line 71,col 9)-(line 71,col 18)",
        "(line 72,col 9)-(line 72,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 75,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 76)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 92,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 96,col 9)-(line 96,col 31)",
        "(line 97,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 103,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)",
        "(line 105,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 27)",
        "(line 118,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ON_WINDOWS"
      ],
      "begin_line": 123,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tryHardToDelete(java.io.File)",
      "begin_line": 135,
      "end_line": 148,
      "comment": "\n     * Accommodate Windows bug encountered in both Sun and IBM JDKs.\n     * Others possible. If the delete does not work, call System.gc(),\n     * wait a little and try again.\n     *\n     * @return whether deletion was successful\n     * @since Stolen from FileUtils in Ant 1.8.0\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 174,
      "end_line": 211,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     *\n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 39)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     *\n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 70)",
        "(line 224,col 9)-(line 224,col 35)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 35)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 263,
      "end_line": 283,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     *\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 39)",
        "(line 265,col 9)-(line 265,col 35)",
        "(line 266,col 9)-(line 266,col 46)",
        "(line 267,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 294,
      "end_line": 304,
      "comment": "\n     * Checks if an archive contains all expected files.\n     *\n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 60)",
        "(line 297,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 327,
      "end_line": 376,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @param cleanUp Cleans up resources if true\n     * @return returns the created result file if cleanUp \u003d false, or null otherwise\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 42)",
        "(line 330,col 9)-(line 330,col 30)",
        "(line 332,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     *\n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 394,
      "end_line": 406,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 39)",
        "(line 396,col 9)-(line 396,col 30)",
        "(line 397,col 9)-(line 397,col 67)",
        "(line 398,col 9)-(line 398,col 31)",
        "(line 399,col 9)-(line 399,col 61)",
        "(line 400,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.closeQuietly(java.io.Closeable)",
      "begin_line": 408,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 409,col 9)-(line 415,col 9)"
      ]
    }
  ]
}