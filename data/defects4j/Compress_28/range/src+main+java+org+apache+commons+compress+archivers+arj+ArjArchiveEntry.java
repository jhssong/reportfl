{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/arj/ArjArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArjArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 33,
      "end_line": 147,
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
      "begin_line": 68,
      "end_line": 70,
      "comment": " True if the entry refers to a directory ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getLastModifiedDate()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * The last modified date of the entry.\n     *\n     * \u003cp\u003eNote the interpretation of time is different depending on\n     * the HostOS that has created the archive.  While an OS that is\n     * {@link #isHostOsUnix considered to be Unix} stores time in a\n     * timezone independent manner, other platforms only use the local\n     * time.  I.e. if an archive has been created at midnight UTC on a\n     * machine in timezone UTC this method will return midnight\n     * regardless of timezone if the archive has been created on a\n     * non-Unix system and a time taking the current timezone into\n     * account if the archive has beeen created on Unix.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 84)",
        "(line 88,col 9)-(line 88,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getMode()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * File mode of this entry.\n     *\n     * \u003cp\u003eThe format depends on the host os that created the entry.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getUnixMode()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * File mode of this entry as Unix stat value.\n     *\n     * \u003cp\u003eWill only be non-zero of the host os was UNIX.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getHostOs()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * The operating system the archive has been created on.\n     * @see HostOs\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.isHostOsUnix()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Is the operating system the archive has been created on one\n     * that is considered a UNIX OS by arj?\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.arj.ArjArchiveEntry.getMethod()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HostOs",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * The known values for HostOs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DOS"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIMOS"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNIX"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AMIGA"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAC_OS"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_2"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "APPLE_GS"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ATARI_ST"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEXT"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAX_VMS"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WIN95"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WIN32"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    }
  ]
}