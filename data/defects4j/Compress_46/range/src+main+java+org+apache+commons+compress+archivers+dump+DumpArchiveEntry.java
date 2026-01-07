{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/dump/DumpArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DumpArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 181,
      "end_line": 842,
      "comment": "\n * This class represents an entry in a Dump archive. It consists\n * of the entry\u0027s header, the entry\u0027s File and any extended attributes.\n * \u003cp\u003e\n * DumpEntries that are created from the header bytes read from\n * an archive are instantiated with the DumpArchiveEntry( byte[] )\n * constructor. These entries will be used when extracting from\n * or listing the contents of an archive. These entries have their\n * header filled in using the header bytes. They also set the File\n * to null, since they reference an archive entry not a file.\n * \u003cp\u003e\n * DumpEntries can also be constructed from nothing but a name.\n * This allows the programmer to construct the entry by hand, for\n * instance when only an InputStream is available for writing to\n * the archive, and the header information is constructed from\n * other information. In this case the header fields are set to\n * defaults and the File is set to null.\n *\n * \u003cp\u003e\n * The C structure for a Dump Entry\u0027s header is:\n * \u003cpre\u003e\n * #define TP_BSIZE    1024          // size of each file block\n * #define NTREC       10            // number of blocks to write at once\n * #define HIGHDENSITYTREC 32        // number of blocks to write on high-density tapes\n * #define TP_NINDIR   (TP_BSIZE/2)  // number if indirect inodes in record\n * #define TP_NINOS    (TP_NINDIR / sizeof (int32_t))\n * #define LBLSIZE     16\n * #define NAMELEN     64\n *\n * #define OFS_MAGIC     (int)60011  // old format magic value\n * #define NFS_MAGIC     (int)60012  // new format magic value\n * #define FS_UFS2_MAGIC (int)0x19540119\n * #define CHECKSUM      (int)84446  // constant used in checksum algorithm\n *\n * struct  s_spcl {\n *   int32_t c_type;             // record type (see below)\n *   int32_t \u003cb\u003ec_date\u003c/b\u003e;             // date of this dump\n *   int32_t \u003cb\u003ec_ddate\u003c/b\u003e;            // date of previous dump\n *   int32_t c_volume;           // dump volume number\n *   u_int32_t c_tapea;          // logical block of this record\n *   dump_ino_t c_ino;           // number of inode\n *   int32_t \u003cb\u003ec_magic\u003c/b\u003e;            // magic number (see above)\n *   int32_t c_checksum;         // record checksum\n * #ifdef  __linux__\n *   struct  new_bsd_inode c_dinode;\n * #else\n * #ifdef sunos\n *   struct  new_bsd_inode c_dinode;\n * #else\n *   struct  dinode  c_dinode;   // ownership and mode of inode\n * #endif\n * #endif\n *   int32_t c_count;            // number of valid c_addr entries\n *   union u_data c_data;        // see above\n *   char    \u003cb\u003ec_label[LBLSIZE]\u003c/b\u003e;   // dump label\n *   int32_t \u003cb\u003ec_level\u003c/b\u003e;            // level of this dump\n *   char    \u003cb\u003ec_filesys[NAMELEN]\u003c/b\u003e; // name of dumpped file system\n *   char    \u003cb\u003ec_dev[NAMELEN]\u003c/b\u003e;     // name of dumpped device\n *   char    \u003cb\u003ec_host[NAMELEN]\u003c/b\u003e;    // name of dumpped host\n *   int32_t c_flags;            // additional information (see below)\n *   int32_t c_firstrec;         // first record on volume\n *   int32_t c_ntrec;            // blocksize on volume\n *   int32_t c_extattributes;    // additional inode info (see below)\n *   int32_t c_spare[30];        // reserved for future uses\n * } s_spcl;\n *\n * //\n * // flag values\n * //\n * #define DR_NEWHEADER     0x0001  // new format tape header\n * #define DR_NEWINODEFMT   0x0002  // new format inodes on tape\n * #define DR_COMPRESSED    0x0080  // dump tape is compressed\n * #define DR_METAONLY      0x0100  // only the metadata of the inode has been dumped\n * #define DR_INODEINFO     0x0002  // [SIC] TS_END header contains c_inos information\n * #define DR_EXTATTRIBUTES 0x8000\n *\n * //\n * // extattributes inode info\n * //\n * #define EXT_REGULAR         0\n * #define EXT_MACOSFNDRINFO   1\n * #define EXT_MACOSRESFORK    2\n * #define EXT_XATTR           3\n *\n * // used for EA on tape\n * #define EXT2_GOOD_OLD_INODE_SIZE    128\n * #define EXT2_XATTR_MAGIC        0xEA020000  // block EA\n * #define EXT2_XATTR_MAGIC2       0xEA020001  // in inode EA\n * \u003c/pre\u003e\n * \u003cp\u003e\n * The fields in \u003cb\u003ebold\u003c/b\u003e are the same for all blocks. (This permitted\n * multiple dumps to be written to a single tape.)\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure for the inode (file) information is:\n * \u003cpre\u003e\n * struct bsdtimeval {           //  **** alpha-*-linux is deviant\n *   __u32   tv_sec;\n *   __u32   tv_usec;\n * };\n *\n * #define NDADDR      12\n * #define NIADDR       3\n *\n * //\n * // This is the new (4.4) BSD inode structure\n * // copied from the FreeBSD 2.0 \u0026lt;ufs/ufs/dinode.h\u0026gt; include file\n * //\n * struct new_bsd_inode {\n *   __u16       di_mode;           // file type, standard Unix permissions\n *   __s16       di_nlink;          // number of hard links to file.\n *   union {\n *      __u16       oldids[2];\n *      __u32       inumber;\n *   }           di_u;\n *   u_quad_t    di_size;           // file size\n *   struct bsdtimeval   di_atime;  // time file was last accessed\n *   struct bsdtimeval   di_mtime;  // time file was last modified\n *   struct bsdtimeval   di_ctime;  // time file was created\n *   __u32       di_db[NDADDR];\n *   __u32       di_ib[NIADDR];\n *   __u32       di_flags;          //\n *   __s32       di_blocks;         // number of disk blocks\n *   __s32       di_gen;            // generation number\n *   __u32       di_uid;            // user id (see /etc/passwd)\n *   __u32       di_gid;            // group id (see /etc/group)\n *   __s32       di_spare[2];       // unused\n * };\n * \u003c/pre\u003e\n * \u003cp\u003e\n * It is important to note that the header DOES NOT have the name of the\n * file. It can\u0027t since hard links mean that you may have multiple filenames\n * for a single physical file. You must read the contents of the directory\n * entries to learn the mapping(s) from filename to inode.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * The C structure that indicates if a specific block is a real block\n * that contains data or is a sparse block that is not persisted to the\n * disk is:\u003c/p\u003e\n * \u003cpre\u003e\n * #define TP_BSIZE    1024\n * #define TP_NINDIR   (TP_BSIZE/2)\n *\n * union u_data {\n *   char    s_addrs[TP_NINDIR]; // 1 \u003d\u0026gt; data; 0 \u003d\u0026gt; hole in inode\n *   int32_t s_inos[TP_NINOS];   // table of first inode on each volume\n * } u_data;\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "permissions"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "atime"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtime"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Currently unused\n     "
    },
    {
      "type": "field",
      "varNames": [
        "header"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " this information is available from standard index."
    },
    {
      "type": "field",
      "varNames": [
        "simpleName"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " this information is available from QFA index"
    },
    {
      "type": "field",
      "varNames": [
        "offset"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nlink"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ctime"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generation"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDeleted"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry()",
      "begin_line": 214,
      "end_line": 215,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Constructor taking only filename.\n     * @param name pathname\n     * @param simpleName actual filename.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 22)",
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.DumpArchiveEntry(java.lang.String, java.lang.String, int, org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n     * Constructor taking name, inode and type.\n     *\n     * @param name the name\n     * @param simpleName the simple name\n     * @param ino the ino\n     * @param type the type\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 22)",
        "(line 238,col 9)-(line 238,col 22)",
        "(line 239,col 9)-(line 239,col 37)",
        "(line 240,col 9)-(line 240,col 23)",
        "(line 241,col 9)-(line 241,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSimpleName()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the path of the entry.\n     * @return the path of the entry.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSimpleName(java.lang.String)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Sets the path of the entry.\n     * @param simpleName the simple name\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getIno()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns the ino of the entry.\n     * @return the ino\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getNlink()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Return the number of hard links to the entry.\n     * @return the number of hard links\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setNlink(int)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Set the number of hard links.\n     * @param nlink the number of hard links\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getCreationTime()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Get file creation time.\n     * @return the creation time\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setCreationTime(java.util.Date)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Set the file creation time.\n     * @param ctime the creation time\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGeneration()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Return the generation of the file.\n     * @return the generation\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGeneration(int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Set the generation of the file.\n     * @param generation the generation\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDeleted()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Has this file been deleted? (On valid on incremental dumps.)\n     * @return whether the file has been deleted\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setDeleted(boolean)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Set whether this file has been deleted.\n     * @param isDeleted whether the file has been deleted\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOffset()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Return the offset within the archive\n     * @return the offset\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setOffset(long)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Set the offset within the archive.\n     * @param offset the offset\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getVolume()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Return the tape volume where this file is located.\n     * @return the volume\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setVolume(int)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * Set the tape volume.\n     * @param volume the volume\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderType()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Return the type of the tape segment header.\n     * @return the segment header\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderCount()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Return the number of records in this segment.\n     * @return the number of records\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getHeaderHoles()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Return the number of sparse records in this segment.\n     * @return the number of sparse records\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSparseRecord(int)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * Is this a sparse record?\n     * @param idx index of the record to check\n     * @return whether this is a sparse record\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.hashCode()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.equals(java.lang.Object)",
      "begin_line": 402,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 58)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 421,col 9)-(line 424,col 9)",
        "(line 426,col 9)-(line 426,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.toString()",
      "begin_line": 429,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(byte[])",
      "begin_line": 440,
      "end_line": 502,
      "comment": "\n     * Populate the dump archive entry and tape segment header with\n     * the contents of the buffer.\n     *\n     * @param buffer buffer to read content from\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 62)",
        "(line 442,col 9)-(line 442,col 54)",
        "(line 444,col 9)-(line 445,col 32)",
        "(line 450,col 9)-(line 450,col 62)",
        "(line 452,col 9)-(line 452,col 71)",
        "(line 456,col 9)-(line 456,col 60)",
        "(line 459,col 9)-(line 459,col 51)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 464,col 9)-(line 464,col 60)",
        "(line 466,col 9)-(line 466,col 61)",
        "(line 468,col 9)-(line 469,col 59)",
        "(line 470,col 9)-(line 470,col 41)",
        "(line 471,col 9)-(line 472,col 59)",
        "(line 473,col 9)-(line 473,col 47)",
        "(line 474,col 9)-(line 475,col 59)",
        "(line 476,col 9)-(line 476,col 24)",
        "(line 482,col 9)-(line 482,col 66)",
        "(line 483,col 9)-(line 483,col 64)",
        "(line 484,col 9)-(line 484,col 65)",
        "(line 486,col 9)-(line 486,col 62)",
        "(line 488,col 9)-(line 488,col 25)",
        "(line 490,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 496,col 60)",
        "(line 498,col 9)-(line 498,col 42)",
        "(line 501,col 9)-(line 501,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.update(byte[])",
      "begin_line": 507,
      "end_line": 520,
      "comment": "\n     * Update entry with information from next tape segment header.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 62)",
        "(line 509,col 9)-(line 509,col 62)",
        "(line 511,col 9)-(line 511,col 25)",
        "(line 513,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TapeSegmentHeader",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 526,
      "end_line": 561,
      "comment": "\n     * Archive entry as stored on tape. There is one TSH for (at most)\n     * every 512k in the file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ino"
      ],
      "begin_line": 529,
      "end_line": 529,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "holes"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdata"
      ],
      "begin_line": 532,
      "end_line": 532,
      "comment": " map of any \u0027holes\u0027"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getType()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getVolume()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getIno()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.setIno(int)",
      "begin_line": 546,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 13)-(line 547,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCount()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getHoles()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 13)-(line 555,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TapeSegmentHeader.getCdata(int)",
      "begin_line": 558,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 13)-(line 559,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getName()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "\n     * Returns the name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getOriginalName()",
      "begin_line": 576,
      "end_line": 578,
      "comment": "\n     * Returns the unmodified name of the entry.\n     * @return the name of the entry.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setName(java.lang.String)",
      "begin_line": 584,
      "end_line": 595,
      "comment": "\n     * Sets the name of the entry.\n     * @param name the name\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 33)",
        "(line 586,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getLastModifiedDate()",
      "begin_line": 601,
      "end_line": 604,
      "comment": "\n     * The last modified date.\n     * @return the last modified date\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isDirectory()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "\n     * Is this a directory?\n     * @return whether this is a directory\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFile()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Is this a regular file?\n     * @return whether this is a regular file\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isSocket()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Is this a network device?\n     * @return whether this is a socket\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isChrDev()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * Is this a character device?\n     * @return whether this is a character device\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isBlkDev()",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Is this a block device?\n     * @return whether this is a block device\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.isFifo()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * Is this a fifo/pipe?\n     * @return whether this is a fifo\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getType()",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * Get the type of the entry.\n     * @return the type\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setType(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE)",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Set the type of the entry.\n     * @param type the type\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getMode()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Return the access permissions on the entry.\n     * @return the access permissions\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setMode(int)",
      "begin_line": 683,
      "end_line": 686,
      "comment": "\n     * Set the access permissions on the entry.\n     * @param mode the access permissions\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 33)",
        "(line 685,col 9)-(line 685,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getPermissions()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n     * Returns the permissions on the entry.\n     * @return the permissions\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getSize()",
      "begin_line": 700,
      "end_line": 703,
      "comment": "\n     * Returns the size of the entry.\n     * @return the size\n     ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getEntrySize()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n     * Returns the size of the entry as read from the archive.\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setSize(long)",
      "begin_line": 716,
      "end_line": 718,
      "comment": "\n     * Set the size of the entry.\n     * @param size the size\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Set the time the file was last modified.\n     * @param mtime the last modified time\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getAccessTime()",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n     * Returns the time the file was last accessed.\n     * @return the access time\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setAccessTime(java.util.Date)",
      "begin_line": 740,
      "end_line": 742,
      "comment": "\n     * Set the time the file was last accessed.\n     * @param atime the access time\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getUserId()",
      "begin_line": 748,
      "end_line": 750,
      "comment": "\n     * Return the user id.\n     * @return the user id\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setUserId(int)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Set the user id.\n     * @param uid the user id\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.getGroupId()",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * Return the group id\n     * @return the group id\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.setGroupId(int)",
      "begin_line": 772,
      "end_line": 774,
      "comment": "\n     * Set the group id.\n     * @param gid the group id\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.TYPE(int)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 790,col 13)-(line 790,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(int)",
      "begin_line": 793,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 794,col 13)-(line 794,col 32)",
        "(line 796,col 13)-(line 800,col 13)",
        "(line 802,col 13)-(line 802,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 820,
      "end_line": 820,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.PERMISSION(int)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 13)-(line 823,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(int)",
      "begin_line": 826,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 827,col 13)-(line 827,col 56)",
        "(line 829,col 13)-(line 833,col 13)",
        "(line 835,col 13)-(line 837,col 13)",
        "(line 839,col 13)-(line 839,col 39)"
      ]
    }
  ]
}