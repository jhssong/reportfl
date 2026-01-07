{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 33,
      "end_line": 159,
      "comment": "\n * An entry in an ARJ archive.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "localFileHeader"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.ArjArchiveEntry()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.ArjArchiveEntry(org.apache.commons.compress.archivers.arj.LocalFileHeader)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getName()",
      "begin_line": 49,
      "end_line": 56,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getSize()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.isDirectory()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " True if the entry refers to a directory.\n     *\n     * @return True if the entry refers to a directory\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getLastModifiedDate()",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * The last modified date of the entry.\n     *\n     * \u003cp\u003eNote the interpretation of time is different depending on\n     * the HostOS that has created the archive.  While an OS that is\n     * {@link #isHostOsUnix considered to be Unix} stores time in a\n     * timezone independent manner, other platforms only use the local\n     * time.  I.e. if an archive has been created at midnight UTC on a\n     * machine in timezone UTC this method will return midnight\n     * regardless of timezone if the archive has been created on a\n     * non-Unix system and a time taking the current timezone into\n     * account if the archive has beeen created on Unix.\u003c/p\u003e\n     *\n     * @return the last modified date\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 92,col 84)",
        "(line 93,col 9)-(line 93,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getMode()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * File mode of this entry.\n     *\n     * \u003cp\u003eThe format depends on the host os that created the entry.\u003c/p\u003e\n     *\n     * @return the file mode\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getUnixMode()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * File mode of this entry as Unix stat value.\n     *\n     * \u003cp\u003eWill only be non-zero of the host os was UNIX.\n     *\n     * @return the Unix mode\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getHostOs()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * The operating system the archive has been created on.\n     * @see HostOs\n     * @return the host OS code\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.isHostOsUnix()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Is the operating system the archive has been created on one\n     * that is considered a UNIX OS by arj?\n     * @return whether the operating system the archive has been\n     * created on is considered a UNIX OS by arj\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getMethod()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HostOs",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 144,
      "end_line": 157,
      "comment": "\n     * The known values for HostOs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOS"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIMOS"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNIX"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AMIGA"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAC_OS"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_2"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APPLE_GS"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ATARI_ST"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEXT"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAX_VMS"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WIN95"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WIN32"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    }
  ]
}