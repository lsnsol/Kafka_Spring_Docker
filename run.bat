echo off
cls

echo ****************************************
echo   Running Kafka Services of SpringBoot
echo ****************************************
echo,
echo,
cd Spring
docker compose -f docker-compose.yaml up -d
echo,
echo,

@REM echo ***************************
@REM echo  Running Airflow Services
@REM echo ***************************
@REM echo,
@REM echo,
@REM cd ../Airflow
@REM docker compose -f docker-compose.yaml up -d
@REM echo,
@REM echo,

echo **************************
echo   Service Running Status
echo **************************
echo,
echo,
docker ps
echo,
echo,

echo ******************************
echo   Running SpringBoot Service
echo ******************************
echo,
echo,

mvnw.cmd spring-boot:run

echo,
echo,
cd..
pause