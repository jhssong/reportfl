{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry",
        "org.apache.commons.compress.archivers.tar.TarConstants"
      ],
      "begin_line": 145,
      "end_line": 1258,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_TAR_ARCHIVE_ENTRIES"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "preserveLeadingSlashes"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Whether to enforce leading slashes on the name "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "checkSumOK"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " If the header checksum is reasonably correct. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "paxGNUSparse"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " is this entry a GNU sparse entry using one of the PAX formats? "
    },
    {
      "type": "field",
      "varNames": [
        "starSparse"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " is this entry a star sparse entry using the PAX header? "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 58)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 256,
      "end_line": 269,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 15)",
        "(line 259,col 9)-(line 259,col 61)",
        "(line 261,col 9)-(line 261,col 63)",
        "(line 262,col 9)-(line 262,col 49)",
        "(line 264,col 9)-(line 264,col 25)",
        "(line 265,col 9)-(line 265,col 65)",
        "(line 266,col 9)-(line 266,col 51)",
        "(line 267,col 9)-(line 267,col 64)",
        "(line 268,col 9)-(line 268,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte, boolean)",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 43)",
        "(line 293,col 9)-(line 293,col 33)",
        "(line 294,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 318,
      "end_line": 341,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 73)",
        "(line 320,col 9)-(line 320,col 25)",
        "(line 322,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 63)",
        "(line 340,col 9)-(line 340,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 15)",
        "(line 352,col 9)-(line 352,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 15)",
        "(line 368,col 9)-(line 368,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 389,
      "end_line": 395,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 424,
      "end_line": 427,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Set this entry\u0027s link name.\n     *\n     * @param link the link name to use.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 474,
      "end_line": 477,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @deprecated use #getLongUserId instead as user ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongUserId()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(long)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     * @deprecated use #getLongGroupId instead as group ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongGroupId()",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(long)",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 591,
      "end_line": 594,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 26)",
        "(line 593,col 9)-(line 593,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 602,
      "end_line": 605,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 30)",
        "(line 604,col 9)-(line 604,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 635,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK()",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\n     * Get this entry\u0027s checksum status.\n     *\n     * @return if the header checksum is reasonably correct\n     * @see TarUtils#verifyCheckSum(byte[])\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * \u003cp\u003eThis method is only useful for entries created from a {@code\n     * File} but not for entries read from an archive.\u003c/p\u003e\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 677,
      "end_line": 680,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 688,
      "end_line": 693,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor()",
      "begin_line": 701,
      "end_line": 703,
      "comment": "\n     * Get this entry\u0027s major device number.\n     *\n     * @return This entry\u0027s major device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor(int)",
      "begin_line": 712,
      "end_line": 718,
      "comment": "\n     * Set this entry\u0027s major device number.\n     *\n     * @param devNo This entry\u0027s major device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 717,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor()",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n     * Get this entry\u0027s minor device number.\n     *\n     * @return This entry\u0027s minor device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor(int)",
      "begin_line": 737,
      "end_line": 743,
      "comment": "\n     * Set this entry\u0027s minor device number.\n     *\n     * @param devNo This entry\u0027s minor device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 751,
      "end_line": 753,
      "comment": "\n     * Indicates in case of an oldgnu sparse file if an extension\n     * sparse header follows.\n     *\n     * @return true if an extension oldgnu sparse header follows.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * Indicate if this entry is a GNU sparse block.\n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isOldGNUSparse()",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * Indicate if this entry is a GNU or star sparse block using the\n     * oldgnu format.\n     *\n     * @return true if this is a sparse extension provided by GNU tar or star\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxGNUSparse()",
      "begin_line": 791,
      "end_line": 793,
      "comment": "\n     * Indicate if this entry is a GNU sparse block using one of the\n     * PAX formats.\n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isStarSparse()",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * Indicate if this entry is a star sparse block using PAX headers.\n     *\n     * @return true if this is a sparse extension provided by star\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongLinkEntry()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\n     * Indicate if this entry is a GNU long linkname block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 831,
      "end_line": 834,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     *\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 833,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 843,
      "end_line": 845,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 852,
      "end_line": 867,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 856,col 9)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 862,col 9)-(line 864,col 9)",
        "(line 866,col 9)-(line 866,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 875,
      "end_line": 883,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since 1.2\n     * @return whether this is a \"normal file\"\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 891,
      "end_line": 893,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since 1.2\n     * @return whether this is a symbolic link\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since 1.2\n     * @return whether this is a link entry\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 911,
      "end_line": 913,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since 1.2\n     * @return whether this is a character device\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since 1.2\n     * @return whether this is a block device\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 931,
      "end_line": 933,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since 1.2\n     * @return whether this is a FIFO entry\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSparse()",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\n     * Check whether this is a sparse entry.\n     *\n     * @return whether this is a sparse entry\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 954,
      "end_line": 970,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * \u003cp\u003eThis method is only useful for entries created from a {@code\n     * File} but not for entries read from an archive.\u003c/p\u003e\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 957,col 9)",
        "(line 959,col 9)-(line 959,col 42)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 74)",
        "(line 965,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 969,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 979,
      "end_line": 990,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 989,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 1003,
      "end_line": 1045,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param encoding encoding to use when writing the file name.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for numeric fields if their value doesn\u0027t fit in the\n     * maximum size of standard tar archives\n     * @since 1.4\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 23)",
        "(line 1007,col 9)-(line 1008,col 52)",
        "(line 1009,col 9)-(line 1009,col 80)",
        "(line 1010,col 9)-(line 1011,col 49)",
        "(line 1012,col 9)-(line 1013,col 49)",
        "(line 1014,col 9)-(line 1014,col 80)",
        "(line 1015,col 9)-(line 1016,col 49)",
        "(line 1018,col 9)-(line 1018,col 36)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1024,col 36)",
        "(line 1025,col 9)-(line 1026,col 52)",
        "(line 1027,col 9)-(line 1027,col 75)",
        "(line 1028,col 9)-(line 1028,col 79)",
        "(line 1029,col 9)-(line 1030,col 52)",
        "(line 1031,col 9)-(line 1032,col 52)",
        "(line 1033,col 9)-(line 1034,col 49)",
        "(line 1035,col 9)-(line 1036,col 49)",
        "(line 1038,col 9)-(line 1040,col 9)",
        "(line 1042,col 9)-(line 1042,col 58)",
        "(line 1044,col 9)-(line 1044,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(long, byte[], int, int, boolean)",
      "begin_line": 1047,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 9)-(line 1055,col 9)",
        "(line 1056,col 9)-(line 1057,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 1066,
      "end_line": 1077,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1076,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 1089,
      "end_line": 1092,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields\n     * have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 1094,
      "end_line": 1172,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 9)-(line 1097,col 23)",
        "(line 1099,col 9)-(line 1100,col 68)",
        "(line 1101,col 9)-(line 1101,col 26)",
        "(line 1102,col 9)-(line 1102,col 74)",
        "(line 1103,col 9)-(line 1103,col 26)",
        "(line 1104,col 9)-(line 1104,col 75)",
        "(line 1105,col 9)-(line 1105,col 25)",
        "(line 1106,col 9)-(line 1106,col 76)",
        "(line 1107,col 9)-(line 1107,col 25)",
        "(line 1108,col 9)-(line 1108,col 68)",
        "(line 1109,col 9)-(line 1109,col 26)",
        "(line 1110,col 9)-(line 1110,col 74)",
        "(line 1111,col 9)-(line 1111,col 29)",
        "(line 1112,col 9)-(line 1112,col 53)",
        "(line 1113,col 9)-(line 1113,col 28)",
        "(line 1114,col 9)-(line 1114,col 36)",
        "(line 1115,col 9)-(line 1116,col 68)",
        "(line 1117,col 9)-(line 1117,col 26)",
        "(line 1118,col 9)-(line 1118,col 61)",
        "(line 1119,col 9)-(line 1119,col 27)",
        "(line 1120,col 9)-(line 1120,col 65)",
        "(line 1121,col 9)-(line 1121,col 29)",
        "(line 1122,col 9)-(line 1123,col 69)",
        "(line 1124,col 9)-(line 1124,col 27)",
        "(line 1125,col 9)-(line 1126,col 69)",
        "(line 1127,col 9)-(line 1127,col 27)",
        "(line 1128,col 9)-(line 1128,col 77)",
        "(line 1129,col 9)-(line 1129,col 25)",
        "(line 1130,col 9)-(line 1130,col 77)",
        "(line 1131,col 9)-(line 1131,col 25)",
        "(line 1133,col 9)-(line 1133,col 46)",
        "(line 1134,col 9)-(line 1171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 1178,
      "end_line": 1215,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 88)",
        "(line 1182,col 9)-(line 1204,col 9)",
        "(line 1206,col 9)-(line 1206,col 61)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 1223,
      "end_line": 1235,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1234,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1237,
      "end_line": 1244,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 28)",
        "(line 1239,col 9)-(line 1239,col 68)",
        "(line 1240,col 9)-(line 1243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1246,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 28)",
        "(line 1248,col 9)-(line 1248,col 72)",
        "(line 1249,col 9)-(line 1249,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillStarSparseData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1252,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 26)",
        "(line 1254,col 9)-(line 1256,col 9)"
      ]
    }
  ]
}