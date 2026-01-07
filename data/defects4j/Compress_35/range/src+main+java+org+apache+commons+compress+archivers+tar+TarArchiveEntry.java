{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 116,
      "end_line": 1131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "preserveLeadingSlashes"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Whether to enforce leading slashes on the name "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "checkSumOK"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " If the header checksum is reasonably correct. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 188,
      "end_line": 197,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 58)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 219,
      "end_line": 232,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 15)",
        "(line 222,col 9)-(line 222,col 61)",
        "(line 224,col 9)-(line 224,col 63)",
        "(line 225,col 9)-(line 225,col 43)",
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 65)",
        "(line 229,col 9)-(line 229,col 51)",
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte, boolean)",
      "begin_line": 254,
      "end_line": 261,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 256,col 33)",
        "(line 257,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 281,
      "end_line": 304,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 67)",
        "(line 283,col 9)-(line 283,col 25)",
        "(line 285,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 63)",
        "(line 303,col 9)-(line 303,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 15)",
        "(line 315,col 9)-(line 315,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 328,
      "end_line": 332,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 15)",
        "(line 331,col 9)-(line 331,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 358,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\n     * Set this entry\u0027s link name.\n     *\n     * @param link the link name to use.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 436,
      "end_line": 439,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @deprecated use #getLongUserId instead as user ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongUserId()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(long)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 477,
      "end_line": 480,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     * @deprecated use #getLongGroupId instead as group ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongGroupId()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(long)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 26)",
        "(line 555,col 9)-(line 555,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 564,
      "end_line": 567,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 30)",
        "(line 566,col 9)-(line 566,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * Get this entry\u0027s checksum status.\n     *\n     * @return if the header checksum is reasonably correct\n     * @see TarUtils#verifyCheckSum(byte[])\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 617,
      "end_line": 619,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 645,
      "end_line": 650,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\n     * Get this entry\u0027s major device number.\n     *\n     * @return This entry\u0027s major device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor(int)",
      "begin_line": 669,
      "end_line": 675,
      "comment": "\n     * Set this entry\u0027s major device number.\n     *\n     * @param devNo This entry\u0027s major device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n     * Get this entry\u0027s minor device number.\n     *\n     * @return This entry\u0027s minor device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor(int)",
      "begin_line": 694,
      "end_line": 700,
      "comment": "\n     * Set this entry\u0027s minor device number.\n     *\n     * @param devNo This entry\u0027s minor device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n     * Indicates in case of a sparse file if an extension sparse header\n     * follows.\n     *\n     * @return true if an extension sparse header follows.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n     * Indicate if this entry is a GNU sparse block\n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongLinkEntry()",
      "begin_line": 735,
      "end_line": 737,
      "comment": "\n     * Indicate if this entry is a GNU long linkname block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 756,
      "end_line": 759,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     *\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 758,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 777,
      "end_line": 791,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 799,
      "end_line": 807,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since 1.2\n     * @return whether this is a \"normal file\"\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since 1.2\n     * @return whether this is a symbolic link\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since 1.2\n     * @return whether this is a link entry\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since 1.2\n     * @return whether this is a character device\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since 1.2\n     * @return whether this is a block device\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since 1.2\n     * @return whether this is a FIFO entry\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 865,
      "end_line": 878,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 868,col 9)",
        "(line 870,col 9)-(line 870,col 36)",
        "(line 871,col 9)-(line 871,col 87)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 877,col 9)-(line 877,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 887,
      "end_line": 898,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 897,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 911,
      "end_line": 953,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param encoding encoding to use when writing the file name.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for numeric fields if their value doesn\u0027t fit in the\n     * maximum size of standard tar archives\n     * @since 1.4\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 23)",
        "(line 915,col 9)-(line 916,col 52)",
        "(line 917,col 9)-(line 917,col 80)",
        "(line 918,col 9)-(line 919,col 49)",
        "(line 920,col 9)-(line 921,col 49)",
        "(line 922,col 9)-(line 922,col 80)",
        "(line 923,col 9)-(line 924,col 49)",
        "(line 926,col 9)-(line 926,col 30)",
        "(line 928,col 9)-(line 930,col 9)",
        "(line 932,col 9)-(line 932,col 36)",
        "(line 933,col 9)-(line 934,col 52)",
        "(line 935,col 9)-(line 935,col 75)",
        "(line 936,col 9)-(line 936,col 79)",
        "(line 937,col 9)-(line 938,col 52)",
        "(line 939,col 9)-(line 940,col 52)",
        "(line 941,col 9)-(line 942,col 49)",
        "(line 943,col 9)-(line 944,col 49)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 950,col 9)-(line 950,col 52)",
        "(line 952,col 9)-(line 952,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(long, byte[], int, int, boolean)",
      "begin_line": 955,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 957,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 965,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 974,
      "end_line": 985,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 984,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 997,
      "end_line": 1000,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields\n     * have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 1002,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 23)",
        "(line 1007,col 9)-(line 1008,col 68)",
        "(line 1009,col 9)-(line 1009,col 26)",
        "(line 1010,col 9)-(line 1010,col 74)",
        "(line 1011,col 9)-(line 1011,col 26)",
        "(line 1012,col 9)-(line 1012,col 75)",
        "(line 1013,col 9)-(line 1013,col 25)",
        "(line 1014,col 9)-(line 1014,col 76)",
        "(line 1015,col 9)-(line 1015,col 25)",
        "(line 1016,col 9)-(line 1016,col 68)",
        "(line 1017,col 9)-(line 1017,col 26)",
        "(line 1018,col 9)-(line 1018,col 74)",
        "(line 1019,col 9)-(line 1019,col 29)",
        "(line 1020,col 9)-(line 1020,col 53)",
        "(line 1021,col 9)-(line 1021,col 28)",
        "(line 1022,col 9)-(line 1022,col 36)",
        "(line 1023,col 9)-(line 1024,col 68)",
        "(line 1025,col 9)-(line 1025,col 26)",
        "(line 1026,col 9)-(line 1026,col 61)",
        "(line 1027,col 9)-(line 1027,col 27)",
        "(line 1028,col 9)-(line 1028,col 65)",
        "(line 1029,col 9)-(line 1029,col 29)",
        "(line 1030,col 9)-(line 1031,col 69)",
        "(line 1032,col 9)-(line 1032,col 27)",
        "(line 1033,col 9)-(line 1034,col 69)",
        "(line 1035,col 9)-(line 1035,col 27)",
        "(line 1036,col 9)-(line 1036,col 77)",
        "(line 1037,col 9)-(line 1037,col 25)",
        "(line 1038,col 9)-(line 1038,col 77)",
        "(line 1039,col 9)-(line 1039,col 25)",
        "(line 1041,col 9)-(line 1041,col 40)",
        "(line 1042,col 9)-(line 1070,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 1077,
      "end_line": 1114,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 82)",
        "(line 1081,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1105,col 61)",
        "(line 1110,col 9)-(line 1112,col 9)",
        "(line 1113,col 9)-(line 1113,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 1122,
      "end_line": 1130,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1129,col 17)"
      ]
    }
  ]
}