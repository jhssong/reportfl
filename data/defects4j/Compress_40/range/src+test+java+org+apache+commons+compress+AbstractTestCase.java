{
  "filepath": "/tmp/Compress-40b/src/test/java/org/apache/commons/compress/AbstractTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractTestCase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 406,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultDir"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " used to delete the archive in tearDown"
    },
    {
      "type": "field",
      "varNames": [
        "archiveList"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Lists the content of the archive as originally created"
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.setUp()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 40)",
        "(line 60,col 9)-(line 60,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.mkdir(java.lang.String)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 19)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getFile(java.lang.String)",
      "begin_line": 70,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 82)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tearDown()",
      "begin_line": 84,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 19)",
        "(line 87,col 9)-(line 87,col 25)",
        "(line 88,col 9)-(line 88,col 31)",
        "(line 89,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.rmdir(java.io.File)",
      "begin_line": 95,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 110,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ON_WINDOWS"
      ],
      "begin_line": 115,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.tryHardToDelete(java.io.File)",
      "begin_line": 126,
      "end_line": 139,
      "comment": "\n     * Accommodate Windows bug encountered in both Sun and IBM JDKs.\n     * Others possible. If the delete does not work, call System.gc(),\n     * wait a little and try again.\n     *\n     * @return whether deletion was successful\n     * @since Stolen from FileUtils in Ant 1.8.0\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createArchive(java.lang.String)",
      "begin_line": 165,
      "end_line": 202,
      "comment": "\n     * Creates an archive of textbased files in several directories. The\n     * archivername is the factory identifier for the archiver, for example zip,\n     * tar, cpio, jar, ar. The archive is created as a temp file.\n     *\n     * The archive contains the following files:\n     * \u003cul\u003e\n     * \u003cli\u003etestdata/test1.xml\u003c/li\u003e\n     * \u003cli\u003etestdata/test2.xml\u003c/li\u003e\n     * \u003cli\u003etest/test3.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test4.xml\u003c/li\u003e\n     * \u003cli\u003ebla/test5.xml\u003c/li\u003e\n     * \u003cli\u003ebla/blubber/test6.xml\u003c/li\u003e\n     * \u003cli\u003etest.txt\u003c/li\u003e\n     * \u003cli\u003esomething/bla\u003c/li\u003e\n     * \u003cli\u003etest with spaces.txt\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param archivename\n     *            the identifier of this archive\n     * @return the newly created file\n     * @throws Exception\n     *             in case something goes wrong\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 39)",
        "(line 167,col 9)-(line 167,col 35)",
        "(line 168,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.addArchiveEntry(org.apache.commons.compress.archivers.ArchiveOutputStream, java.lang.String, java.io.File)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * Add an entry to the archive, and keep track of the names in archiveList.\n     *\n     * @param out\n     * @param file1\n     * @throws IOException\n     * @throws FileNotFoundException\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 76)",
        "(line 215,col 9)-(line 215,col 35)",
        "(line 216,col 9)-(line 216,col 55)",
        "(line 217,col 9)-(line 217,col 32)",
        "(line 218,col 9)-(line 218,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createEmptyArchive(java.lang.String)",
      "begin_line": 227,
      "end_line": 245,
      "comment": "\n     * Create an empty archive.\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 39)",
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 40)",
        "(line 231,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createSingleEntryArchive(java.lang.String)",
      "begin_line": 254,
      "end_line": 274,
      "comment": "\n     * Create an archive with a single file \"test1.xml\".\n     *\n     * @param archivename\n     * @return the archive File\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 40)",
        "(line 258,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(java.io.File, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 285,
      "end_line": 292,
      "comment": "\n     * Checks if an archive contains all expected files.\n     *\n     * @param archive\n     *            the archive to check\n     * @param expected\n     *            a list with expected string filenames\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.checkArchiveContent(org.apache.commons.compress.archivers.ArchiveInputStream, java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 315,
      "end_line": 359,
      "comment": "\n     * Checks that an archive input stream can be read, and that the file data matches file sizes.\n     *\n     * @param in\n     * @param expected list of expected entries or {@code null} if no check of names desired\n     * @param cleanUp Cleans up resources if true\n     * @return returns the created result file if cleanUp \u003d false, or null otherwise\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 48)",
        "(line 318,col 9)-(line 318,col 30)",
        "(line 320,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Override this method to change what is to be compared in the List.\n     * For example, size + name instead of just name.\n     *\n     * @param entry\n     * @return returns the entry name\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDirAndFile()",
      "begin_line": 377,
      "end_line": 385,
      "comment": "\n     * Creates a temporary directory and a temporary file inside that\n     * directory, returns both of them (the directory is the first\n     * element of the two element array).\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 44)",
        "(line 379,col 9)-(line 379,col 73)",
        "(line 380,col 9)-(line 380,col 31)",
        "(line 381,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.createTempDir()",
      "begin_line": 387,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 45)",
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.closeQuietly(java.io.Closeable)",
      "begin_line": 393,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StreamWrapper",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 403,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.AbstractTestCase.StreamWrapper.wrap(java.io.InputStream)",
      "begin_line": 404,
      "end_line": 404,
      "comment": "",
      "child_ranges": []
    }
  ]
}