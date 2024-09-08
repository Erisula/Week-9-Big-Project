package projects.service;

import projects.dao.Project;
import projects.dao.ProjectDao;

public class ProjectsService {
private ProjectDao projectDao = new ProjectDao();
public Project addProject (Project project) {
	return projectDao.insertProject(project);
}
}

