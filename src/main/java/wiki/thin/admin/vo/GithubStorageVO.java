package wiki.thin.admin.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author Beldon
 */
@Data
public class GithubStorageVO {
    private Long id;

    private String name;

    private String description;

    private String token;

    private String owner;

    private String repo;

    private String branch;

    private String basePath;

    private Long fileCount;

    private String createdBy;

    private Date createdDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;
}